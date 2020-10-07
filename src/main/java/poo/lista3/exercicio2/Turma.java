package poo.lista3.exercicio2;

public class Turma {
    private String horariosDasAulas;
    private Professor professor;
    private Aluno[] alunos = new Aluno[100];
    private double[] mediaDosAlunos = new double[100];

    public Turma(String horarioDasAulas, Professor professor){
        this.horariosDasAulas = horarioDasAulas;
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public double[] getMediaDosAlunos() {
        return mediaDosAlunos;
    }

    public void calculaMediaDeUmAluno(Aluno aluno){}

    public void calculaMediaDaTurma(){}

    public void obterHorarioDaAula(){}
}
