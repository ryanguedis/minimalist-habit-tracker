package backend.Controller;

import backend.Model.HabitRecord;
import backend.Service.HabitRecordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/records")
public class HabitRecordController {

    private final HabitRecordService service;

    public HabitRecordController(HabitRecordService service) {
        this.service = service;
    }

    @GetMapping("/{habitId}")
    public ResponseEntity<HabitRecord> createOrGet(@PathVariable Long habitId) {
        HabitRecord createOrGet = service.createOrGet(habitId);
        return ResponseEntity.ok(createOrGet);
    }

    @PatchMapping("/{id}/check")
    public ResponseEntity<HabitRecord> check(@PathVariable Long id) {
        HabitRecord recordChecked = service.check(id);
        return ResponseEntity.ok(recordChecked);
    }

    @PatchMapping("/{id}/uncheck")
    public ResponseEntity<HabitRecord> uncheck(@PathVariable Long id) {
        HabitRecord recordUnchecked = service.uncheck(id);
        return ResponseEntity.ok(recordUnchecked);
    }
}
