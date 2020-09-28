public class Lampada {
    private int estado; // 1, lampada acesa; 0, lampada apagada; -1, lampada meia-luz

    boolean estaLigada(){
        if(estado != 0) return true;
        else return false;
    }
    
    void acender(){
        estado = 1;
    }

    void apagar(){
        estado = 0;
    }

    void meiaLuz(){
        estado = -1;
    }

    void mostrarEstado(){
        if(estado == 1) System.out.println("A lâmpada está acesa.");
        else if(estado == 0) System.out.println("A lâmpada está desligada.");
        else System.out.println("A lâmpada está em meia-luz.");
    }
}
