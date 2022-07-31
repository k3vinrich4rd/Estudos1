package livro;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.nome = "Capit�es De Areia";
        livro1.autor = "Jorge amado";
        livro1.anoDeLancamento = 1937;
        livro1.quantidadeDePaginas = 342;
        livro1.genero = "Romance e fic��o";
        livro1.editora = "Jos� Olympio";
        livro1.isbn = 13.9788535914061;

        Livraria livroLivraria = new Livraria();
        livroLivraria.nome = "Revolu��o dos bichos";
        livroLivraria.autor = "George Orwell";
        livroLivraria.anoDeLancamento = 1945;
        livroLivraria.quantidadeDePaginas = 112;
        livroLivraria.genero = "S�tira Politica";
        livroLivraria.editora = "Aleph";
        livroLivraria.preco = 9.90;
        livroLivraria.isbn = 658.6029651;

        LivroBiblioteca livroBiblioteca = new LivroBiblioteca();
        livroBiblioteca.nome = "As vantagens de ser invis�vel";
        livroBiblioteca.autor = "Stephen Chbosky";
        livroBiblioteca.anoDeLancamento = 1999;
        livroBiblioteca.quantidadeDePaginas = 224;
        livroBiblioteca.genero = "Romance e Fic��o Juvenil";
        livroBiblioteca.editora = "Rocco";
        livroBiblioteca.emprestado = true;
        livroBiblioteca.dataEntrega = new Date();
        livroBiblioteca.emprestadoA = "Kevin Richard";

    }

}
