package ru.joker.spring.SpringRestApp.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class PersonDTO {

    @NotEmpty(message = "Name should not be empty!")
    @Size(min = 2, max = 30, message = "Name size between 2 and 30 chars!")
    private String name;

    @Min(value = 0, message = "Value should be greater than 0!")
    private int age;

    @NotEmpty(message = "Email should not be empty!")
    @Email
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
