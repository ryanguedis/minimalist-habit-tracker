package com.ryan.minimalist_habit_tracker.Service;

import com.ryan.minimalist_habit_tracker.Repository.HabitRecordRepository;
import org.springframework.stereotype.Service;

@Service
public class HabitRecordService {

    private final HabitRecordRepository repository;

    public HabitRecordService(HabitRecordRepository repository) {
        this.repository = repository;
    }

    // Create
    // ReadAll
    // Check

}
