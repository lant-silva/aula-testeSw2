package br.fateczl.edu.sigvs.ti_model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import model.Biblioteca;
import model.Livro;

@SpringBootTest
public class Req01CadastrarLivro {
    Biblioteca biblioteca;
    
    @Test
    public void ct01CadastrarLivroComSucesso(){
        biblioteca = new Biblioteca();
        Livro livro = new Livro ("Engenharia de Software", "Pressman");
        biblioteca.save(livro);
        assertEquals(1, biblioteca.size());
    }
}
