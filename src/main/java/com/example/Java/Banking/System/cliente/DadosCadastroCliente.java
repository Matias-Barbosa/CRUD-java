package com.example.Java.Banking.System.cliente;

import com.example.Java.Banking.System.endereco.DadosEndereco;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public record DadosCadastroCliente(String nome, String email, Integer idade, @JsonFormat(pattern = "dd/MM/yyyy")
LocalDate dataNascimento, TipoConta tipoConta, DadosEndereco endereco) {
}
