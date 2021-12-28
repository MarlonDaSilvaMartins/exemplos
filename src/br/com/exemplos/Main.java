package br.com.exemplos;


import br.com.exemplos.pessoa.Aluno;

public class Main {
    public static void main(String[] args){
        Aluno a1 = new Aluno("Marlon",22, "Porto Alegre","18221059");
        System.out.println("Aluno1");
        a1.imprimeDados();
        a1.setNome("Marcelo");
        System.out.println("Novo nome: "+a1.getNome());
        //Pessoa p = new br.com.exemplos.pessoa.Aluno();
        Aluno a2 = new Aluno("Carlos", 26,"19230913");
        System.out.println("\nAluno2");
        a2.imprimeDados();

        a2.cidade = "Alvorada";
        System.out.println("Nova cidade: "+a1.cidade);

        final int t = 10;
        //t = 11;
    }
}

