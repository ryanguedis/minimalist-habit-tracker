package backend.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_habit")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Habit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate date = LocalDate.now();

    @OneToMany(mappedBy = "habit")
    private List<HabitRecord> habitRecord;

    private Integer habitStreak = 0;

    private Long totalChecked = 0L;

}
