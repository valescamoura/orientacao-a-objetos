package poo.lista3.exercicio2;

public class Professor {
    private String nome;
    private int matricula;
    private double salario = 0.0;
    private String email;
    private String cpf;
    private String[] disciplinasMinistradas = new String[10];

    public Professor(String nome, int matricula, String email, String cpf, double salario){
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getMatricula() {
        return matricula;
    }

    public String[] getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public String getEmail() {
        return email;
    }

    public double getSalario() {
        return salario;
    }

    public void addDisciplinaMinistrada(Disciplina disciplina){}
}
