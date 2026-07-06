package backend.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "tb_record")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HabitRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date = LocalDate.now();

    private boolean checked;

    @ManyToOne
    @JoinColumn(name = "habit_id")
    private Habit habit;

}
