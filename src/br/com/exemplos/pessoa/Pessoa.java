package br.com.exemplos.pessoa;

abstract class Pessoa {//classe final nao pode ter filho
    /*
     * classe abstrata
     * NAO suporta heranças multiplas
     * pode conter metodos concretos ou metodos abstratos
     * pode conter atributos
     * contem construtor
     *
     * classes abstratas servem para prover uma base para que as classes que “herdem” desta não precisem se preocupar
     * com o comportamento padrão, apenas com suas características e comportamentos pessoais
     */
    /*
    * construtor
    * metodo com o mesmo nome que a classe, responsavel por criar o objeto em memoria
    */
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

    //default nao funciona por herança, apenas por pacote
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

