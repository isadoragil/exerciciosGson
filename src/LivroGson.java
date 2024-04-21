public record LivroGson(String titulo, String autor, Editora editora) {
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Editora: " + editora.nome() + ", Publicação: " + editora.cidade();
    }
}
