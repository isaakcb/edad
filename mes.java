
import java.util.Scanner;

public class mes {
    private static final Scanner scanner = new Scanner(System.in);

    public static int obtenerNumero(String mensaje) {
        int numeroTemporal;
        System.out.println(mensaje + ": ");
        numeroTemporal = scanner.nextInt();
        return numeroTemporal;
    }

    public static void main(String[] args) {
        int numero1 = obtenerNumero("Ingresa un numero");
        int numero2 = obtenerNumero("Ingresa un numero");
        int resultado = numero1 + numero2;

        System.out.println("La suma es: " + resultado);

        int edad = obtenerNumero("Ingresa tu edad");

        if (edad >= 18) {
            System.out.println("mmmmqrico eres mayor de edad");
        } else {
            System.out.println("eres menor de edad");
        }

        
        int mes = obtenerNumero("Ingresa un numero entre 1 y 12 para conocer el mes");
        
        String nombreMes;
        
        if (mes == 1) {
            nombreMes = "Enero";
        } else if (mes == 2) {
            nombreMes = "Febrero";
        } else if (mes == 3) {
            nombreMes = "Marzo";
        } else if (mes == 4) {
            nombreMes = "Abril";
        } else if (mes == 5) {
            nombreMes = "Mayo";
        } else if (mes == 6) {
            nombreMes = "Junio";
        } else if (mes == 7) {
            nombreMes = "Julio";
        } else if (mes == 8) {
            nombreMes = "Agosto";
        } else if (mes == 9) {
            nombreMes = "Septiembre";
        } else if (mes == 10) {
            nombreMes = "Octubre";
        } else if (mes == 11) {
            nombreMes = "Noviembre";
        } else if (mes == 12) {
            nombreMes = "Diciembre";
        } else {
            nombreMes = "Numero invalido, debe ser entre 1 y 12";
        }
        
        System.out.println(mes + " es " + nombreMes);
    }
}