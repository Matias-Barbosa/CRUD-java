package com.example.Java.Banking.System.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @PostMapping
    public void cadastraCliente(@RequestBody String json) {
        System.out.println(json);

    }

}
