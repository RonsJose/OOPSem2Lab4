package ie.atu.sem2lab4.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//Getters and setters from lombok
@Getter
@Setter
public class Workout {
    private long id;

    @NotBlank(message="Workout name is required")// A check and error message for when workout name is left blank
    private String name;

    @NotBlank(message = "Workout date is required") // A check and error message for when data is left blank
    private String date;

    @NotEmpty(message="Exercises cannot be empty")// A check and error message for when exercise list is empty
    @Valid // Checks for validation
    private List<Exercise> exercises;
}
