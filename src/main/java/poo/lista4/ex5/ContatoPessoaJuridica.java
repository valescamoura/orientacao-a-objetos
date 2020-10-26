package poo.lista4.ex5;

public class ContatoPessoaJuridica extends Contato{
    private String razaoSocial;
    private String cnpj;
    private double faturamento;

    public ContatoPessoaJuridica(String razaoSocial, String cnpj, double faturamento, String telefone, String endereco){
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.faturamento = faturamento;
        this.telefone = telefone;
        this.endereco = endereco;
        this.tipo = "juridica";
    }
    
    @Override
    public String getID() {
        return cnpj;
    }

    @Override
    public String getNome() {
        return razaoSocial;
    }

    @Override
    public void imprimirContato(){
        System.out.println("Razão Social: "+ razaoSocial);
        super.imprimirContato();
        System.out.println("CNPJ: "+ cnpj);
        System.out.println("Faturamento: "+ faturamento);
    }
}
