/*Algoritmo
 * INICIO
    LEA = NÚMERO
    CUADRADO = NÚMERO ** 2
    CUBO = NÚMERO **3
    ESCRIBA: “EL CUADRADO DEL NÚMERO ES: ”, CUADRADO,”. EL CUBO DEL NÚMERO ES: “, CUBO
FIN_INICIO

 */
/*Importamos la clase Scanner del paquete java.util para leer los datos de entrada*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio #4");

        double numero, cuadrado,cubo;

        /*Creamos una instancia Sacanner para leer los datos de entrada */
        
        Scanner scanner = new Scanner(System.in);

        /*Pedimos al usuario el número para el cual desea obtener el cuadrado y cubo */
        System.out.print("Ingrese el número para el cual desea obtener su cuadrado y cubo: ");
        numero = scanner.nextDouble();

        cuadrado = Math.pow(numero,2);
        cubo = Math.pow(numero,3);

        System.out.println(String.format("El cuadrado de %.0f es %.1f. El cubo de %.0f es %.1f.", numero,cuadrado,numero,cubo));

        /*Como buena práctica se recomienda cerrar el scanner al final del programa con scanner.close() */
        scanner.close();
    }
}
