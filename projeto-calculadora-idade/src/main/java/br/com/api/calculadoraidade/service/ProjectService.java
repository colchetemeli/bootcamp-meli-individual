package br.com.api.calculadoraidade.service;

import br.com.api.calculadoraidade.dto.ProjectDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class ProjectService {

    public ProjectDTO calculaIdade(int day, int month, int year) {
        return new ProjectDTO(Period.between(LocalDate.of(year, month, day), LocalDate.now()).getYears());
    }

}
