package poo.lista4.ex5;

public class Contato{
    protected String telefone;
    protected String endereco;
    protected String tipo;

    //imprime o contato
    public void imprimirContato(){
        System.out.println("Telefone: "+ telefone);
        System.out.println("Endereço: "+ endereco);
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return "";
    }

    public String getID() {
        return "";
    }
}


