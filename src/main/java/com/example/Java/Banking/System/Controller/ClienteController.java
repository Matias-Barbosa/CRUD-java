package com.example.Java.Banking.System.Controller;


import com.example.Java.Banking.System.cliente.Cliente;
import com.example.Java.Banking.System.cliente.ClienteRepository;
import com.example.Java.Banking.System.cliente.DadosCadastroCliente;
import com.example.Java.Banking.System.endereco.Endereco;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroCliente dados) {
        repository.save(new Cliente(dados));
    }

}
