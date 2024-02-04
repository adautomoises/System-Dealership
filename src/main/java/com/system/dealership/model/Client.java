package com.system.dealership.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull
    private String name;

    @Email
    @NotNull
    private String email;

    @NotNull
    private String phoneNumber;

    @NotNull
    private String cnh;

    @NotNull
    private String rg;

    @CPF
    @NotNull
    private String cpf;

    @NotNull
    private String state;

    @NotNull
    private String city;
}
