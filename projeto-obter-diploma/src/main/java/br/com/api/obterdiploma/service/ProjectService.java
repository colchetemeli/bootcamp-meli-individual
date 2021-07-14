package br.com.api.obterdiploma.service;

import br.com.api.obterdiploma.dto.ProjectDTO;
import br.com.api.obterdiploma.entity.Aluno;
import br.com.api.obterdiploma.entity.Disciplina;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService {

    public ProjectDTO geraDiploma(Aluno aluno) {

        Double media = aluno.getDisciplinas().stream()
                .mapToDouble(Disciplina::getNota)
                .average().orElseThrow(RuntimeException::new);

        return new ProjectDTO(media, aluno);
    }

}
