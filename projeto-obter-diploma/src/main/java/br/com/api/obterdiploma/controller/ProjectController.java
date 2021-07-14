package br.com.api.obterdiploma.controller;

import br.com.api.obterdiploma.dto.ProjectDTO;
import br.com.api.obterdiploma.entity.Aluno;
import br.com.api.obterdiploma.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*

É necessário desenvolver uma API que receba um aluno que contenha o seu "nome",
e todas as disciplinas aprovadas com "nome" e "nota", é necessário calcular a média
das notas obtidas ao longo do curso e gerar o diploma com uma “mensagem”,
“média” e “aluno”.
Se a média do aluno for superior a 9, deve ser reconhecido com um parabéns.

 */

@RestController
public class ProjectController{

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/geraDiploma")
    public ProjectDTO endPoint(@RequestBody Aluno aluno) {
        return projectService.geraDiploma(aluno);
    }
}