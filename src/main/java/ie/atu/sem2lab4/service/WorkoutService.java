package ie.atu.sem2lab4.service;

import ie.atu.sem2lab4.model.Workout;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkoutService {
    private final List<Workout> workouts = new ArrayList<>(); //List to store all workouts
    private long idCounter = 1;

    public Workout createWorkout(Workout workout) { //Method to add new workout
        workout.setId(idCounter++);
        workouts.add(workout);
        return workout;
    }

    public List<Workout> getAllWorkouts() {
        return workouts;
    } //Method to return all workouts from list
}
