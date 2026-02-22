package ie.atu.sem2lab4.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private long id;

    @NotBlank(message = "Product name is required")
    private String name;

    @Positive(message="Price must be greater than zero")
    private Double price;
}
