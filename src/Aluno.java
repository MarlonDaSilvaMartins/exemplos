public class Aluno extends Pessoa{
    public Aluno(String nome, int idade, String cidade,String matricula) {//construtor com cidade
        super(nome,idade,cidade);
        this.matricula = matricula;
    }

    public Aluno(String nome, int idade, String matricula) {//construtor sem cidade
        super(nome,idade);
        this.matricula = matricula;
    }

    enum Materia {//tipo de dado que representa um grupo de constantes
        SI("Sistemas de informação", "8 Semestres"),
        ADS("Analise e desenvolvimento de sistemas", "4 Semestres");

        private final String nome;
        private final String duracao;

        Materia(String nome, String duracao) {
            this.nome = nome;
            this.duracao = duracao;
        }
    }
    public String matricula;

    @Override
    public void imprimeDados(){
        System.out.println("Nome: "+super.getNome());
        System.out.println("Idade: "+super.idade);
        System.out.println("Cidade: "+super.cidade);
        System.out.println("Matricula: "+matricula);
        String m = ""+matricula.charAt(4) + matricula.charAt(5);
        if(m.equals("09")){
            System.out.println("Curso: "+Materia.SI.nome);
            System.out.println("Duração: "+Materia.SI.duracao);
        }else if(m.equals("10")){
            System.out.println("Curso: "+Materia.ADS.nome);
            System.out.println("Duração: "+Materia.ADS.duracao);
        }
    }
}
