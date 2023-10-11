package com.example.Java.Banking.System.cliente;

import com.example.Java.Banking.System.endereco.DadosEndereco;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public record DadosCadastroCliente(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotNull
        Integer idade,
        @NotNull
        @JsonFormat(pattern = "dd/MM/yyyy")
        LocalDate dataNascimento,
        @NotNull
        TipoConta tipoConta,
        @NotNull
        @Valid
        DadosEndereco endereco) {
}
