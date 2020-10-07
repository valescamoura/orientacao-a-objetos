package poo.lista3.exercicio2;

public class Disciplina {
    private String descricao;
    private String ementa;
    private Disciplina[] preRequisitos = new Disciplina[10];
    private Professor coordenador;
    private Turma[] turmas = new Turma[10];

    public Disciplina(String descricao, String ementa, Disciplina[] preRequisitos, Professor coordenador, Turma[] turmas){
        this.descricao = descricao;
        this.ementa = ementa;
        this.preRequisitos = preRequisitos;
        this.coordenador = coordenador;
        this.turmas = turmas;
    }

    public void setTurmas(Turma[] turmas) {
        this.turmas = turmas;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEmenta() {
        return ementa;
    }
    
    public Disciplina[] getPreRequisitos() {
        return preRequisitos;
    }

    public Turma[] getTurmas() {
        return turmas;
    }
    public void descricaoDaEmenta(){}

    public void especificarPreRequisitosDaDisciplina(Disciplina preRequisito){}
}
