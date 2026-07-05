package com.ryan.minimalist_habit_tracker.Service;

import com.ryan.minimalist_habit_tracker.Model.Habit;
import com.ryan.minimalist_habit_tracker.Repository.HabitRepository;
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

    // Read

    // ReadAll
    public List<Habit> readAll() {
        List<Habit> habits = repository.findAll();
        return habits;
    }

    // Update
    public Habit uptade(Habit habit, Long id) {
        Optional<Habit> optHabit = repository.findById(id);
        if (optHabit.isPresent()) {
            Habit habitUpdated = habit;
            habit.setId(id);
            return repository.save(habitUpdated);
        }
        return null;
    }

    // Delete
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
