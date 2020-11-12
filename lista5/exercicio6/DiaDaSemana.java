package poo.lista5.exercicio6;

public enum DiaDaSemana{
    DOMINGO,
    SEGUNDA,
    TERÇA,
    QUARTA,
    QUINTA,
    SEXTA,
    SÁBADO;

    public boolean ehDiaUtil(){
        switch(this){
            case DOMINGO: return false;
            case SÁBADO: return false;
            default: return true;
        }
    }
}

//outra forma de implementar
/*public class DiaDaSemana{
    private DiasDaSemana dia;

    public enum DiasDaSemana{
        DOMINGO,
        SEGUNDA,
        TERÇA,
        QUARTA,
        QUINTA,
        SEXTA,
        SÁBADO;
    }

    public boolean ehDiaUtil(){
        if(this.getDia() == DiasDaSemana.DOMINGO || this.getDia() == DiasDaSemana.DOMINGO){
            return false;
        }
        return true;
    }

    public DiasDaSemana getDia() {
        return dia;
    }
}*/
