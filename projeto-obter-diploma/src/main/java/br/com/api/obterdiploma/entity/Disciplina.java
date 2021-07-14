package br.com.api.obterdiploma.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Disciplina {

    private String nome;
    private Double nota;

}
