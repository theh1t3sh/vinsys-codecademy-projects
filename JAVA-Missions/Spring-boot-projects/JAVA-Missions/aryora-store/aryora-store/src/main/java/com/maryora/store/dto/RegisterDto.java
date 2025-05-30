package com.aayora.store.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterDto {
    @NotEmpty
    @Size(min = 3, message = "Username should have at least 3 characters")
    private String username;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @Size(min = 6, message = "Password should have at least 6 characters")
    private String password;

    @NotEmpty
    private String role;
}