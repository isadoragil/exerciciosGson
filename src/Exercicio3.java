import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Exercicio3 {
    public static void main(String[] args) {
        String json = "{\"Titulo\":\"Harry Potter\",\"Autor\":\"J. K. Rowling\",\"Editora\":{\"nome\":\"Arqueiro\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        LivroGson livroGson = gson.fromJson(json, LivroGson.class);
        Livro livro = new Livro(livroGson);
        System.out.println(livro);
    }
}
