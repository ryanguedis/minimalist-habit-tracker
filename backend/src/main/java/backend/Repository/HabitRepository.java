package com.ryan.minimalist_habit_tracker.Repository;

import com.ryan.minimalist_habit_tracker.Model.Habit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitRepository extends JpaRepository<Habit, Long> {
}
