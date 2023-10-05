package com.example.Java.Banking.System.Controller;


import com.example.Java.Banking.System.Controller.Model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping(value = "/cadastrar")
    public String criaCliente(Cliente cliente) {
        return "Hello cliente!";
    }

}
