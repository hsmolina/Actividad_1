/*Algoritmo planteado
 *INICIO
	HORAS_TRABAJADAS = 48
	VALOR_HORA = 5.000
	SALARIO_BRUTO = HORAS_TRABAJADAS * VALOR_HORA
	RETENCIÓN = SALARIO_BRUTO * 0.125
	SALARIO_NETO = SALARIO_BRUTO - RETENCIÓN
	ESCRIBA: “EL SALARIO BRUTO ES: “, SALARIO_BRUTO, “LA RETENCIÓN EN LA FUENTE ES: “, RETENCIÓN, “EL SALARIO NETO ES: “, SALARIO_NETO
FIN_INICIO
 
 */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio #3");

        /*Usaremos variables de tipo double */
        double horas_trabajadas, valor_hora, salario_bruto, retencion, salario_neto;

        horas_trabajadas = 48;
        valor_hora = 5000;
        salario_bruto = horas_trabajadas * valor_hora;
        retencion = salario_bruto * 0.125;
        salario_neto = salario_bruto - retencion;

        /*Primera posibilidad de impresión en pantalla */
        /*System.out.println("El salario bruto es: $"+salario_bruto+". La retención es: $"+retencion+". El salario neto es: $"+salario_neto);*/

        /*Para hacer más eficiente la impresión en pantalla utilizaremos la concatenación de strings en java */
        /*Se utiliza el String.format(texto) y las variables las agreagos con %.xf siendo x la cantidad de decimales que deseamos representar */
        System.out.println(String.format("El salario bruto es: $%.1f. La retención en la fuente es: $%.1f. El salario neto es: $%.1f", salario_bruto,retencion,salario_neto));

    }
}
