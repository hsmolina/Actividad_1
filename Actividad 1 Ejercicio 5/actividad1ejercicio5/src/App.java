import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double radio, area, perimetro;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ejercicio #5");
        System.out.print("Digite el radio del círculo: ");
        radio = scanner.nextDouble();
        area = Math.PI * (Math.pow(radio,2));
        perimetro = 2 * Math.PI * radio;

        System.out.println(String.format("El área del círculo es %.1f. La longitud de la circunferencia es: %.1f",area,perimetro));

        scanner.close();

    }
}
