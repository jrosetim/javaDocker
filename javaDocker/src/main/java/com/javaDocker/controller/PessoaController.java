package com.javaDocker.controller;

import com.javaDocker.DTO.PessoaDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    PessoaDto pessoaDto;

    @GetMapping("/getAll")
    public PessoaDto getPessoa(){
        pessoaDto = new PessoaDto();
        pessoaDto.setNome("Teste");
        pessoaDto.setCnpjcpf("05589483988");

        return pessoaDto;
    }

}
