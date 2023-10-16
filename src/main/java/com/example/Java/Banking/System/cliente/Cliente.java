package com.example.Java.Banking.System.cliente;

import com.example.Java.Banking.System.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "clientes")
@Entity(name = "Cliente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private Integer idade;
    private LocalDate dataNascimento;

    @Enumerated(EnumType.STRING)
    private TipoConta tipoConta;

    @Embedded
    private Endereco endereco;

    private Boolean ativo;

    public Cliente(DadosCadastroCliente dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.email = dados.email();
        this.idade = dados.idade();
        this.dataNascimento = dados.dataNascimento();
        this.tipoConta = dados.tipoConta();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInformacoes(DadosAtualizacaoCliente dados) {
        if(dados.nome() != null) {
            this.nome = dados.nome();
        }
        if(dados.email() != null) {
            this.email = dados.email();
        }
        if(dados.endereco() != null) {
            this.endereco.atualizarInformacoes(dados.endereco());
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
