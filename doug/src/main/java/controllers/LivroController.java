package controllers;

import entities.Autor;
import entities.Livro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/livros")
public class LivroController {

    @GetMapping
    public List<Livro> getObjects(){
        Autor autor1 = new Autor("Liev Tolstoi", "russo");
        Autor autor2 = new Autor("Lima Barreto", "brasileiro");

        Livro livro1 = new Livro(12468L, "Guerra e Paz", 1865, autor1);
        Livro livro2 = new Livro(17543L, "Os Bruzudangas", 1922, autor2);

        List<Livro> list = Arrays.asList(livro1, livro2);

        return list;
    }
}
