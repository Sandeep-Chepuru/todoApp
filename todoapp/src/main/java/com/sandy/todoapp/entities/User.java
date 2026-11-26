package com.sandy.todoapp.entities;


import com.sandy.todoapp.enums.Subscriptions;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class User {

    @Id
    @Pattern(
            regexp = "^[a-zA-Z0-9\\.-]{8,}$",
            message = "The user name can have alpha numeric, period(.), hyphen(-)"
    )
    private String userName;
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@$\\.,\\*]).{8,}",
            message = "The password should have alphanumeric with special character of size atleast 8 characters "

    )
    @NotBlank(message = "Password should not be blank")
    private String password;
    @Email(message = "Invalid Email format")
    @NotBlank(message = "Email should not be blank")
    private String email;
    @Min(
            value = 18,
            message = "Age can not be below 18"
    )
    @Max(
            value = 120,
            message = "Given age is inappropriate"
    )
    private Integer age;
    private String about;
    @Lob
    private byte[] profileImage;
    private String imageType;
    @Enumerated(EnumType.STRING)
    private Subscriptions subscriptions = Subscriptions.FREE;

}
