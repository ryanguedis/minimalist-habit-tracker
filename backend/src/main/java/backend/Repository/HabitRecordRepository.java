package backend.Repository;

import backend.Model.HabitRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.Optional;

public interface HabitRecordRepository extends JpaRepository<HabitRecord, Long> {

    Optional<HabitRecord> findByHabitIdAndDate(Long habitId, LocalDate date);

}

