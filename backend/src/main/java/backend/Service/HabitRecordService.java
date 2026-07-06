package backend.Service;

import backend.Model.Habit;
import backend.Model.HabitRecord;
import backend.Repository.HabitRecordRepository;
import backend.Repository.HabitRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
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

    // ReadAll
    public List<HabitRecord> readAll() {
        return repository.findAll();
    }

    // Check
    public HabitRecord check(Long id) {
        Optional<HabitRecord> record = repository.findById(id);
        if (record.isPresent()) {
            if (!record.get().isChecked()) {
                HabitRecord checked = record.get();
                checked.setChecked(true);
                return repository.save(checked);
            }
            return null;
        }
        return null;
    }

}
