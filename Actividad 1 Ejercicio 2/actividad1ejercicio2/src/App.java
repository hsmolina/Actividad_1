/*Es importante notar que para elevar y**2 no es necesario realizar una importación
 * implicita de Math, pues java como tal ya la incluye
 */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio #2");

        /*Trabajaremos con variables de tipo double */

        double suma, x, y;

        suma = 0;
        x = 20;
        suma = suma + x;
        y = 40;
        x = x + Math.pow(y,2);
        suma = suma + (x/y);

        System.out.println("El valor de la suma es: "+suma);
    }
}
