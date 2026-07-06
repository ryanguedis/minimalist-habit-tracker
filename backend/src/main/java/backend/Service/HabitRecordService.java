package backend.Service;

import backend.Model.Habit;
import backend.Model.HabitRecord;
import backend.Repository.HabitRecordRepository;
import backend.Repository.HabitRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.Optional;

@Service
public class HabitRecordService {

    private final HabitRecordRepository repository;
    private final HabitRepository habitRepository;

    public HabitRecordService(HabitRecordRepository repository, HabitRepository habitRepository) {
        this.repository = repository;
        this.habitRepository = habitRepository;
    }

    // Create
    public HabitRecord createOrGet(Long habitId) {
        LocalDate today = LocalDate.now();

        Optional<HabitRecord> record = repository.findByHabitIdAndDate(habitId, today);

        if (record.isPresent()) {
            return record.get();
        }

        Optional<Habit> habit = habitRepository.findById(habitId);
        if (habit.isPresent()) {
            HabitRecord newRecord = new HabitRecord();
            newRecord.setHabit(habit.get());
            newRecord.setDate(today);
            newRecord.setChecked(false);

            return repository.save(newRecord);
        }
        return null;
    }

    // Check
    public HabitRecord check(Long id) {
        LocalDate today = LocalDate.now();

        Optional<HabitRecord> record = repository.findById(id);
        if (record.isPresent() && record.get().getDate().equals(today)) {
            if (!record.get().isChecked()) {
                HabitRecord checked = record.get();
                checked.setChecked(true);
                Habit habit = checked.getHabit();
                habit.setTotalChecked(habit.getTotalChecked() + 1);

                LocalDate yesterday = checked.getDate().minusDays(1);

                Optional<HabitRecord> calcStreak = repository.findByHabitIdAndDate(habit.getId(), yesterday);
                if (calcStreak.isPresent() && calcStreak.get().isChecked()) {
                    habit.setHabitStreak(habit.getHabitStreak() + 1);
                } else {
                    habit.setHabitStreak(1);
                }

                habitRepository.save(habit);
                return repository.save(checked);
            }
            return record.get();
        }
        return null;
    }

    // Uncheck
    public HabitRecord uncheck(Long id) {
        LocalDate today = LocalDate.now();

        Optional<HabitRecord> record = repository.findById(id);
        if (record.isPresent() && record.get().getDate().equals(today)) {
            if (record.get().isChecked()) {
                HabitRecord checked = record.get();
                checked.setChecked(false);
                Habit habit = checked.getHabit();
                habit.setTotalChecked(Math.max(0, habit.getTotalChecked() - 1));
                habit.setHabitStreak(Math.max(0, habit.getHabitStreak() - 1));

                habitRepository.save(habit);
                return repository.save(checked);
            }
            return record.get();
        }
        return null;
    }
}
