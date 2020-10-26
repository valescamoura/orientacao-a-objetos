package poo.lista4.ex6;

import java.util.ArrayList;

public class Pais{
    private String nome;
    private String capital;
    private double dimensaoEmKM2;
    private ArrayList<Pais> fronteira = new ArrayList<Pais>();

    Pais(String nome, String capital, double dimensaoEmKM2){
        this.nome = nome;
        this.capital = capital;
        this.dimensaoEmKM2 = dimensaoEmKM2;
    }

    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public double getDimensaoEmKM2() {
        return dimensaoEmKM2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setDimensao(double dimensao) {
        this.dimensaoEmKM2 = dimensao;
    }

    /** Método que permite verificar se dois países são iguais. 
     * Dois países são iguais se tiverem o mesmo nome e a mesma capital.
     * @param outroPais
     * @return boolean
     */
    public boolean equals(Pais outroPais){
        boolean iguais = false;
        if(this.nome == outroPais.nome && this.capital == outroPais.capital){
            iguais = true;
        }
        return iguais;   
    }

    
    /** Método que define quais outros países fazem fronteira 
     * (Note que um país não pode fazer fronteira com ele mesmo)
     * @param paisesVizinhos
     */
    public void setFronteira(ArrayList<Pais> paisesVizinhos){
        for(Pais pais: paisesVizinhos){
            if(!equals(pais)) fronteira.add(pais);
        }
    }

    
    /** 
     * @return ArrayList<Pais>
     */
    public ArrayList<Pais> getFronteira(){
        return this.fronteira;
    }

    /**método que recebe um outro país como parâmetro e 
     * retorna uma lista de vizinhos comuns aos dois países.
     * @param outroPais
     * @return ArrayList<Pais>
     */
    public ArrayList<Pais> vizinhosEmComumTo(Pais outroPais){
        ArrayList<Pais> vizinhosComuns = new ArrayList<Pais>();
        for(Pais vizinho: this.fronteira){
            if(outroPais.fronteira.contains(vizinho)) vizinhosComuns.add(vizinho);
        }
        return vizinhosComuns;
    }

    public void imprimirPais(){
        System.out.println("Nome: "+nome);
        System.out.println("Capital: "+capital);
        System.out.println("Dimensão em quilômetros quadrados: "+dimensaoEmKM2);
        System.out.println();
    }
}

