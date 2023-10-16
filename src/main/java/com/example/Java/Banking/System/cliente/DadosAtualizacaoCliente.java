package com.example.Java.Banking.System.cliente;

import com.example.Java.Banking.System.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCliente(
        @NotNull
        Long id,
        String nome,
        String email,
        DadosEndereco endereco) {
}
