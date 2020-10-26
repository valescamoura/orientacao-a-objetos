package poo.lista4.ex1;

public class ConversaoDeUnidadesDeArea{
    
    /** Converte de metro quadrado para pés quadrados
     * @param metroQuadrado
     * @return double
     */
    public static double metroToPes(double metroQuadrado){
        return metroQuadrado*10.76;
    }

    
    /** Converte de pés quadrados para centimetros quadrados
     * @param pesQuadrados
     * @return double
     */
    public static double pesToCentimetros(double pesQuadrados){
        return pesQuadrados*929;
    }

    
    /** Converte de milha quadrada para acres
     * @param milhaQuadrada
     * @return double
     */
    public static double milhaToAcre(double milhaQuadrada){
        return milhaQuadrada*640;
    }

    
    /** Converte de acre para pés quadrados
     * @param acre
     * @return double
     */
    public static double acreToPes(double acre){
        return acre*43560;
    }

    
    /** Converte de pés quadrados para acres
     * @param pesQuadrados
     * @return double
     */
    public static double PesToAcres(double pesQuadrados){
        return pesQuadrados/43560;
    }
}