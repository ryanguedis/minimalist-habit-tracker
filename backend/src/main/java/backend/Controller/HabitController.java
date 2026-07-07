package backend.Controller;

import backend.Model.Habit;
import backend.Model.HabitRecord;
import backend.Service.HabitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/habit")
public class HabitController {

    private final HabitService service;

    public HabitController(HabitService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Habit> create(@RequestBody Habit habit) {
        Habit habitSaved = service.create(habit);
        return ResponseEntity.ok(habitSaved);
    }

    @GetMapping("/records/{id}")
    public ResponseEntity<List<HabitRecord>> readRecord(@PathVariable Long id) {
        List<HabitRecord> readRecord = service.readRecords(id);
        return ResponseEntity.ok(readRecord);
    }

    @GetMapping
    public ResponseEntity<List<Habit>> readAll() {
        List<Habit> habits = service.readAll();
        return ResponseEntity.ok(habits);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Habit> updateName(@RequestBody String name, @PathVariable Long id) {
        Habit habitUpdated = service.uptadeName(name, id);
        return ResponseEntity.ok(habitUpdated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
