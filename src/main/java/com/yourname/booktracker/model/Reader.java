package com.yourname.booktracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Reader {
    @Id
    private String phoneNumber; // Уникальный идентификатор (номер телефона)

    private String firstName;

    private String lastName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private LocalDate birthDate;
}
