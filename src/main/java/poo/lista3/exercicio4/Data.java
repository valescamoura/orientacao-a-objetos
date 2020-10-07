package poo.lista3.exercicio4;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private int diasDecorridos;
    private String nomeDoMes;
    private int modo;

    private String[] nomeDosMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    private int[] qtdDias = {31,28,31,30,31,30,31,31,30,31,30,31};

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diasDecorridos = contarDiasDecorridos(dia, mes, ano);
        this.nomeDoMes = obterNomeDoMes(this.mes);
        this.modo = 1;
    }

    public Data(String nomeDoMes, int dia, int ano){
        this.dia = dia;
        this.mes = obterMes(nomeDoMes);
        this.ano = ano;
        this.diasDecorridos = contarDiasDecorridos(dia, this.mes, ano);
        this.nomeDoMes = nomeDoMes;
        this.modo = 2;
    }

    public Data(int diasDecorridos, int ano){
        this.dia = obterDia(diasDecorridos, ano);
        this.mes = obterMes(diasDecorridos, ano);
        this.ano = ano;
        this.diasDecorridos = diasDecorridos;
        this.nomeDoMes = obterNomeDoMes(this.mes);
        this.modo = 3;
    }

    private void imprimir(int dia, int mes, int ano){
        if(dia < 10) {
            System.out.print("0"+dia);
            if(mes < 10) System.out.print("/0"+mes);
            else System.out.print("/"+mes);
        }
        else{
            System.out.print(dia);
            if(mes < 10) System.out.print("/0"+mes);
            else System.out.print("/"+mes);
        }
        System.out.println("/"+ano);
    }

    private void imprimir(String nomeDoMes, int dia, int ano){
        System.out.print(nomeDoMes + " ");

        if(dia < 10) System.out.print("0"+dia);
        else System.out.print(dia);

        System.out.println(", "+ano);
    }

    private void imprimir(int diasDecorridos, int ano){
        if(diasDecorridos < 10) System.out.print("00" + diasDecorridos);
        else if(diasDecorridos < 100) System.out.print("0" + diasDecorridos);
        else System.out.print(diasDecorridos);

        System.out.println(" "+ano);
    }

    public void imprimirFormatado(){
        if(this.modo == 1) imprimir(this.dia, this.mes, this.ano);
        else if(this.modo == 2) imprimir(this.nomeDoMes, this.dia, this.ano);
        else imprimir(this.diasDecorridos, this.ano);
    }

    public void imprimirEmTresFormas(){
        imprimir(this.dia, this.mes, this.ano);
        imprimir(this.nomeDoMes, this.dia, this.ano);
        imprimir(this.diasDecorridos, this.ano);
        System.out.println("");
    }

    private int obterDia(int dd, int a){
        int i = 0;
        if(isAnoBissexto(a)) qtdDias[1] = 29;

        while(dd > 0){
            if(dd > qtdDias[i]) dd-= qtdDias[i];
            else return dd;
            i++;
        }
        return 0; 
    }

    private int obterMes(int dd, int a){
        int i = 0;
        if(isAnoBissexto(a)) qtdDias[1] = 29;

        while(dd > 0){
            if(dd > qtdDias[i]) dd-= qtdDias[i];
            else return i+1;
            i++;
        }
        return 0; 
    }
    
    private int obterMes(String nomeMes){
        for(int i = 0; i < 12; i++){
            if(nomeMes.equals(nomeDosMeses[i])) return i+1;
        }
        return 0; 
    }

    private String obterNomeDoMes(int m){
        for(int i = 0; i < 12; i++){
            if(m == (i+1)) return nomeDosMeses[i];
        }
        return ""; 
    }

    private int contarDiasDecorridos(int d, int m, int a){
        int dias = d;
        if (isAnoBissexto(a) && m >= 2) dias++;
        for(int i = 0; i < (m-1); i++){
            dias += qtdDias[i];
        }
        return dias;
    }

    private boolean isAnoBissexto(int a){
        if((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0)) return true;
        else return false;
    }

}
