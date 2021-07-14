package br.com.api.obterdiploma.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {

    private String nome;
    private List<Disciplina> disciplinas;

}
