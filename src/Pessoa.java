abstract class Pessoa {
    public Pessoa(){
    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    private String nome;//apenas a classe tem acesso
    protected int idade;//pacote e herança tem acesso
    public static String cidade;//todos tem acesso

    public String getNome() {
        return nome;
    }//getter

    public void setNome(String nome) {
        this.nome = nome;
    }//setter

    public abstract void imprimeDados();//metodo sem corpo
}

