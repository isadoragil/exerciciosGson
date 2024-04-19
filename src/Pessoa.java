public class Pessoa {
    private String nome;
    private int idade;
    private String cidade;

    public Pessoa(PessoaGson pessoaGson) {
        this.nome = pessoaGson.nome();
        this.idade = Integer.valueOf(pessoaGson.idade().substring(0,2));
        this.cidade = pessoaGson.cidade();
    }

    @Override
    public String toString() {
        return "Pessoa - nome: " + nome + ", idade: " + idade + ", cidade: " + cidade;
    }
}
