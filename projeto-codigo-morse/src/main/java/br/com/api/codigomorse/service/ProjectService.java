package br.com.api.codigomorse.service;

import br.com.api.codigomorse.dto.ProjectDTO;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProjectService {

    /*@Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }*/

    public ProjectDTO translateMorseCode(String morseCode) {

        String[] englishAlphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                ",", ".", "?"};

        String[] morseAlphabet = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.."};

        String englishPhrase = "";

        String[] morseCodeLetters;

        morseCodeLetters = morseCode.split(" ");

        for (int i = 0; i < morseCodeLetters.length; i++) {
            for (int j = 0; j < morseAlphabet.length; j++) {
                if (morseCodeLetters[i].equals(morseAlphabet[j])) {
                    englishPhrase += " " + englishAlphabet[j];
                }
            }
        }

        return new ProjectDTO(englishPhrase.toUpperCase(Locale.ROOT));
    }

}
