package entities;

public class Livro {
    private Long isbn;
    private String titulo;
    private int ano;
    private Autor autor;

    public Livro(){

    }
    public Livro(Long isbn, String titulo, int ano, Autor autor){
        this.isbn = isbn;
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
    }
    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
