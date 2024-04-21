public class Livro {
    private String titulo;
    private String autor;
    private String editora;

    public Livro(LivroGson livroGson) {
        this.titulo = livroGson.titulo();
        this.autor = livroGson.autor();
        this.editora = livroGson.editora();
    }

    @Override
    public String toString() {
        return "Título: " + titulo +
                ", Autor: " + autor +
                ", Editora: " + editora;
    }
}
