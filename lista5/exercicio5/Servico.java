package poo.lista5.exercicio5;

public class Servico implements Recebivel{
    private String descricao;
    private int horas;
    private double precoHora;

    Servico(String descricao, int horas, double precoHora){
        this.descricao = descricao;
        this.horas = horas;
        this.precoHora = precoHora;
    }

    @Override
    public double totalizarReceita() {
        return precoHora*horas;
    }   

    @Override
    public void imprimirRecebivel() {
        System.out.println("Descrição do Serviço: "+descricao);
        System.out.println("Horas: "+horas);
        System.out.println("Preço/hora: "+precoHora);
        System.out.println(".....................................");    
    }
}
