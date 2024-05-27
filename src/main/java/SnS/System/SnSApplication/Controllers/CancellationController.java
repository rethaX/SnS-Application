package SnS.System.SnSApplication.Controllers;

import SnS.System.SnSApplication.Entity.Cancellation;
import SnS.System.SnSApplication.Services.CancellationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cancellations")

public class CancellationController {

    @Autowired
    private CancellationService cancellationService;

    @GetMapping
    public List<Cancellation> getAllCancellations() {
        return cancellationService.getAllCancellations();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cancellation> getCancellationById(@PathVariable Long id) {
        Cancellation cancellation = cancellationService.getCancellationById(id);
        if (cancellation == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cancellation);
    }

    @PostMapping
    public Cancellation createCancellation(@RequestBody Cancellation cancellation) {
        return cancellationService.createCancellation(cancellation);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cancellation> updateCancellation(@PathVariable Long id, @RequestBody Cancellation cancellationDetails) {
        Cancellation updatedCancellation = cancellationService.updateCancellation(id, cancellationDetails);
        if (updatedCancellation == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedCancellation);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCancellation(@PathVariable Long id) {
        cancellationService.deleteCancellation(id);
        return ResponseEntity.noContent().build();
    }
}
