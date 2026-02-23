package ie.atu.sem2lab4.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

//Getters and setters
@Getter
@Setter
public class Product {
    private long id;

    @NotBlank(message = "Product name is required") // A check and error message if string name is left blank
    private String name;

    @Positive(message="Price must be greater than zero") // A check and error message if double price is lower than or equal to 0
    private Double price;
}
