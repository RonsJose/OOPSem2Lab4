package ie.atu.sem2lab4.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

//Setters and getters from lombok
@Getter
@Setter
public class Exercise {

    @NotBlank(message ="Exercise name cannot be blank") // Making sure that name isnt blank and if it is send an error message
    private String name;

    @Positive(message = "Weight must be greater than 0")// Making sure that weight isnt 0 or less and sending an error message
    private float weight;

    @Positive(message = "Reps must be greater than 0") // Check for reps being greater than 0 and the error message
    private int reps;

    @Positive(message = "Sets must be greater than 0") // Check for sets being greater than 0 and the errorn message
    private int sets;

}
