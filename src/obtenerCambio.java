import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class obtenerCambio {

    String key = "[Ingresa tu key en este espacio]";
    String monedaBase;
    String monedaConvertir;
    Double cantidad;
    String direccion;

    obtenerCambio(List<String> divisas, Double cantidad) throws IOException, InterruptedException {
        this.monedaBase = divisas.get(0);
        this.monedaConvertir = divisas.get(1);
        this.cantidad = cantidad;

    }


    private String realizarBusqueda() throws IOException, InterruptedException {
        direccion = "https://v6.exchangerate-api.com/v6/"+key+"/pair/"+monedaBase+"/"+monedaConvertir+"/"+cantidad;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        return json;
    }


    public String regresarJson() throws IOException, InterruptedException {
        return realizarBusqueda();
    }
}
