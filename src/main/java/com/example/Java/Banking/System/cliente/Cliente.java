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

}
