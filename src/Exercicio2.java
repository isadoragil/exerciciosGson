import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Exercicio2 {
    public static void main(String[] args) {
        String json = "{\"Nome\":\"Isadora\",\"Cidade\":\"Maringá\",\"profissao\":\"Engenheira\"}";

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setLenient().create();

        PessoaGson pessoaGson = gson.fromJson(json, PessoaGson.class);
        //Pessoa pessoa = new Pessoa(pessoaGson);
        System.out.println(pessoaGson);
    }
}
