package poo.lista3.exercicio2;

public class Aluno {
    private String nome;
    private int matricula;
    private double cr = 0.0;
    private String email;
    private String cpf;
    private String[] disciplinasCursadas = new String[100];
    private double[] mediasNasDisciplinasCursadas = new double[100]; //médias associadas ao vetor disciplinas cursadas 
    private String[] disciplinasEmCurso = new String[100];
    private String curso;


    public Aluno(String nome, int matricula, String email, String cpf, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.cpf = cpf;
        this.curso = curso;
    }

    public String getCpf() {
        return cpf;
    }

    public double getCr() {
        return cr;
    }

    public String getCurso() {
        return curso;
    }

    public String[] getDisciplinasCursadas() {
        return disciplinasCursadas;
    }
    
    public String getEmail() {
        return email;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double[] getMediasNasDisciplinasCursadas() {
        return mediasNasDisciplinasCursadas;
    }

    public void estudar(Disciplina disciplina){}

    public void fazerProva(Disciplina disciplina){}

    public void exibirHistorico(){}

    public void calcularCr(){}
}
