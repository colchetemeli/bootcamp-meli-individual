package br.com.api.obterdiploma.dto;

import br.com.api.obterdiploma.entity.Aluno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDTO  {

    private String message;
    private Double media;
    private Aluno aluno;

    public ProjectDTO(Double media, Aluno aluno) {
        this.media = media;
        this.aluno = aluno;
        if (media>9) {
            this.message="Meus parabéns você tirou mais que 9!";
        }else{
            this.message="";
        }
    }
}
