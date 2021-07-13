package br.com.api.codigomorse.controller;

import br.com.api.codigomorse.dto.ProjectDTO;
import br.com.api.codigomorse.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*

O Código Morse codifica cada caractere como uma sequência de "pontos" e "travessões".
Por exemplo, a letra A é codificada como · -,
a letra Q é codificada como −− · -,
e o dígito 1 é codificado como · −−−−.
O código Morse não faz distinção entre maiúsculas e minúsculas, tradicionalmente são usadas letras maiúsculas.
Quando a mensagem é escrita em código Morse, um único espaço é usado para separar os códigos de caracteres e
3 espaços são usados para separar as palavras.
Desenvolva uma API que receba um Código Morse e retorne sua tradução.

Exemplos:
.... --- .-.. .- OLA
-- . .-. -.-. .- -.. --- .-.. .. -... .-. . MERCADO LIVRE
... .--. .-. .. -. --. SPRING

 */

@RestController
@RequestMapping("/traduz")
public class ProjectController{

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/morse/{morseCode}")
    public ProjectDTO getFollowedPosts(@PathVariable String morseCode) {
        return projectService.translateMorseCode(morseCode);
    }
}