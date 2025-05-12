
import java.util.Scanner;
public class edad {
    private static final Scanner scanner = new Scanner(System.in);

    public static int obtenerNumero(String mensaje){
        int numeroTemporal;
        System.out.println(mensaje + ": ");
        numeroTemporal = scanner.nextInt();
        return numeroTemporal;
    }

    public static void main(String[] args){
        int numero1 = obtenerNumero("ingresa un numero");
        int numero2 = obtenerNumero("ingresa un numero");
        int resultado = numero1 + numero2;

        System.out.println("La suma es:"+resultado);

      
        int edad = obtenerNumero("ingresa tu edad");

        if(edad >=18){
            System.out.println("Saca la cheve, eres mayor de edad");
        } else {
            System.out.println("eres menor de edad");
        }
    

    }

    
}