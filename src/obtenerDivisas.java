import java.util.ArrayList;
import java.util.List;

public class obtenerDivisas {

    String divisaFuente;
    String divisaDestino;
    int opcion;


    public obtenerDivisas(int opcion){
        this.opcion = opcion;
    }

    private List<String> opciones(){
        ArrayList<String> divisas = new ArrayList<>();
        switch (opcion) {
            case 1:
                divisaFuente = "USD";
                divisaDestino = "ARS";
                break;
            case 2:
                divisaFuente = "ARS";
                divisaDestino = "USD";
                break;
            case 3:
                divisaFuente = "USD";
                divisaDestino = "BRL";
                break;
            case 4:
                divisaFuente = "BRL";
                divisaDestino = "USD";
                break;
            case 5:
                divisaFuente = "USD";
                divisaDestino = "COP";
                break;
            case 6:
                divisaFuente = "COP";
                divisaDestino = "USD";
                break;}

        divisas.add(divisaFuente);
        divisas.add(divisaDestino);
        return divisas;
    }

    public List<String> definirDivisas(){
        return opciones();
    }
}
