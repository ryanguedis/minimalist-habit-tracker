package com.ryan.minimalist_habit_tracker.Repository;

import com.ryan.minimalist_habit_tracker.Model.HabitRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitRecordRepository extends JpaRepository<HabitRecord, Long> {
}
