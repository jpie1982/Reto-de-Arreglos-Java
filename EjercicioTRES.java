import java.util.Scanner;

public class EjercicioTRES {
    public static void main(String[] args) {
        //Imprimir los números primos del 1 al 1000, el resultado debe ser buscado de forma matemática.
        System.out.println("Ejercicio 3 - Imprimir los números primos del 1 al 1000, el resultado debe ser buscado de forma matemática.");
        System.out.println("Prueba arreglos");

        int[] lista = new int[100];

        for (int i = 1; i < lista.length; i++){
            int contador = 0;
            for (int j = 1; j <= i; j++){

                if (i%j==0){
                    contador++;
                }
            }
            if (contador == 2){
                System.out.println(i+ " es un numero primo");
            }
        }
    }
}
