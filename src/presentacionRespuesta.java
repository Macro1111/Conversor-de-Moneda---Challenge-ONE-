public class presentacionRespuesta {

    String divisaBase;
    String divisaobjetivo;
    Double valorInicial;
    Double valorFinal;

    public presentacionRespuesta(recibirJson j, double valorInicial){
        divisaBase = j.base_code();
        divisaobjetivo = j.target_code();
        this.valorInicial = valorInicial;
        valorFinal = Math.round(j.conversion_result() * 100.0) / 100.0;

    }

    @Override
    public String toString() {
        return "La conversion de " + valorInicial +"("+ divisaBase + ")"+ " es igual a " + valorFinal +"("+divisaobjetivo+")";
    }
}
