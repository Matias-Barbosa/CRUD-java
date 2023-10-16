package com.example.Java.Banking.System.cliente;

public record DadosListagemCliente(Long Id, String nome, String email, TipoConta tipoConta) {

    public DadosListagemCliente(Cliente cliente) {
        this(cliente.getId(), cliente.getNome(), cliente.getEmail(), cliente.getTipoConta());
    }
}
