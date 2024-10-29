import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class principalConversion {
    public static void main(String[] args) throws IOException, InterruptedException {
        int opcion;
        double cantidad;
        boolean finalizar = false;

        menu menu = new menu();
        Scanner respuesta = new Scanner(System.in);

        while (true) {
            System.out.println(menu.obtenerMensaje());

            while (true) {
                System.out.println("Ingresa una opcion:");
                try {
                    opcion = respuesta.nextInt();
                    if (opcion < 0 || opcion > 7) {
                        System.out.println("Opcion no valida");
                    } else if (opcion == 7) {
                        finalizar = true;
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("El caracter ingresado no es valido");
                    respuesta.nextLine();
                }
            }

            if(finalizar){
                System.out.println("Fin de el programa");
                break;
            }

            while (true) {
                System.out.println("Ingresa la cantidad:");
                try {
                    cantidad = respuesta.nextDouble();
                    break;
                } catch (Exception e) {
                    System.out.println("El valor ingresaso no es valido");
                    respuesta.nextLine();
                }

            }

            obtenerDivisas cambio = new obtenerDivisas(opcion);
            List<String> divisas = cambio.definirDivisas();

            obtenerCambio datos = new obtenerCambio(divisas, cantidad);
            String json = datos.regresarJson();
            recibirJson newJson = new Gson().fromJson(json, recibirJson.class);
            presentacionRespuesta solucionFinal = new presentacionRespuesta(newJson, cantidad);

            System.out.println(solucionFinal);
        }
    }
}