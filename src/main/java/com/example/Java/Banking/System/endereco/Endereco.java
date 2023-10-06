package com.example.Java.Banking.System.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String bairro;
    private String cep;
    private String cidade;
    private String complemento;
    private String numero;
}