package poo.lista3.exercicio3.ex6;

public class Lampada {
    private int estado; // 1, lampada acesa; 0, lampada apagada; -1, lampada meia-luz

    public boolean estaLigada(){
        if(estado != 0) return true;
        else return false;
    }
    
    public void acender(){
        estado = 1;
    }

    public void apagar(){
        estado = 0;
    }

    public void meiaLuz(){
        estado = -1;
    }

    public void mostrarEstado(){
        if(estado == 1) System.out.println("A lâmpada está acesa.");
        else if(estado == 0) System.out.println("A lâmpada está desligada.");
        else System.out.println("A lâmpada está em meia-luz.");
    }
}
