package br.com.api.calculadoraidade.controller;

import br.com.api.calculadoraidade.dto.ProjectDTO;
import br.com.api.calculadoraidade.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProjectController{

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/{day}/{month}/{year}")
    public ProjectDTO endPoint(@PathVariable int day, @PathVariable int month, @PathVariable int year) {
        return projectService.calculaIdade(day,month,year);
    }
}