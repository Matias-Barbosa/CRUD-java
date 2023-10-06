package com.example.Java.Banking.System.Controller;


import com.example.Java.Banking.System.cliente.DadosCadastroCliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @PostMapping //Quando se tem uma requisicao PostMapping com url clientes, o spring irá chamar a função logo abaixo (cadastrar)
    public void cadastrar(@RequestBody DadosCadastroCliente dados) {
        System.out.println(dados);

    }

}
