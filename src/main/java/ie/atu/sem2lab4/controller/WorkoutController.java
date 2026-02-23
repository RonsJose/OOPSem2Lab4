package ie.atu.sem2lab4.controller;

import ie.atu.sem2lab4.model.Workout;
import ie.atu.sem2lab4.service.WorkoutService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workouts") // Endpoint
public class WorkoutController {
    private final WorkoutService service; // New instance of service

    public WorkoutController(WorkoutService service) {
        this.service = service;
    }

    @PostMapping //Post request for adding workouts
    public ResponseEntity<Workout> createWorkout(
            @Valid @RequestBody Workout workout){//Does validation and looks for information in the body of the request

        Workout newWorkout = service.createWorkout(workout); //New instance of workout and adding to the list in service
        return ResponseEntity.status(HttpStatus.CREATED).body(newWorkout);
    }

    @GetMapping//Get request of getting list of workouts
    public ResponseEntity<List<Workout>> getAllWorkouts() {
        return ResponseEntity.ok(service.getAllWorkouts());
    }
}
