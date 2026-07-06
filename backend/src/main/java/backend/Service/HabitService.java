package backend.Service;

import backend.Model.Habit;
import backend.Model.HabitRecord;
import backend.Repository.HabitRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HabitService {

    private final HabitRepository repository;

    public HabitService(HabitRepository repository) {
        this.repository = repository;
    }

    // Create
    public Habit create(Habit habit) {
        return repository.save(habit);
    }

    // ReadRecords
    public List<HabitRecord> readRecords(Long id) {
        Optional<Habit> habit = repository.findById(id);
        if (habit.isPresent()) {
            return habit.get().getHabitRecord();
        }
        return null;
    }

    // ReadAll
    public List<Habit> readAll() {
        return repository.findAll();
    }

    // Update
    public Habit uptadeName(String name, Long id) {
        Optional<Habit> optHabit = repository.findById(id);
        if (optHabit.isPresent()) {
            Habit updated = optHabit.get();
            updated.setName(name);
            return repository.save(updated);
        }
        return null;
    }

    // Delete
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
