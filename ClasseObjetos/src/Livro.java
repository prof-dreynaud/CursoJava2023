public class Livro {

    String titulo;
    String autor;

    void exibirInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }

    public static void main(String[] args) throws Exception {

        Livro meuLivro = new Livro();

        meuLivro.titulo = "Java para Iniciantes";

        meuLivro.autor = "Luan";

        meuLivro.exibirInfo();
        
    }
}
