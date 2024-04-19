import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Exercicio1 {
    public static void main(String[] args) {
        String json = "{\"Nome\":\"Isadora\",\"Idade\":\"20 anos\",\"Cidade\":\"Maringá\"}";

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        PessoaGson pessoaGson = gson.fromJson(json, PessoaGson.class);
        Pessoa pessoa = new Pessoa(pessoaGson);
        System.out.println(pessoa);
    }
}
