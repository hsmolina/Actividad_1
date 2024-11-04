/* Algoritmo
 *
INICIO
    LEA: EDJUAN
    EDALBER = 2 * EDJUAN / 3  
    EDANA = 4 * EDJUAN / 3  
    EDMAMA = EDJUAN + EDALBER + EDANA  
    ESCRIBA: “LAS EDADES SON: ALBERTO =”, EDALBER,
    “JUAN =”, EDJUAN, “ANA =”, EDANA, “MAMA =”, EDMAMA
FIN_INICIO
 *
 */


 import java.util.Scanner; /* Importada la clase para hacer la lectura de datos por teclado */


 /*Declaramos una clase publica llamada actividad1ejercicio1 */
 
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio #1");


        /*Declaramos las variables a utilizar */
        int edad_juan, edad_alberto, edad_ana, edad_mama;


        /*Vamos a leer un dato de entrada por teclado con la clase Scanner que se encuentra en el paquete java.util*/
        /*Una vez importada procedemos a crear una instancia de scanner que será la que lea nuestros datos */


        Scanner scanner = new Scanner(System.in);


        /*Ahora procedemos a leer el dato de tipo entero que será la edad de juan */
        System.out.print("Ingrese la edad de Juan: ");
        edad_juan = scanner.nextInt();


        /*Operaciones para determinar cada edad */
        edad_alberto = 2 * (edad_juan/3);
        edad_ana = 4 * (edad_juan/3);
        edad_mama =  edad_juan + edad_alberto + edad_ana;


        /*Mensaje en pantalla con todas las edades calculadas */
        System.out.println("Las edades son: Alberto = "+edad_alberto+" Juan = "+edad_juan+" Ana = "+edad_ana+" Mamá = "+edad_mama);
    }
}
