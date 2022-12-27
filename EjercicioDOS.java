import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class EjercicioDOS {
    public static void main(String[] args){
        System.out.println("Ejercicio 2");
        //1-Crear un arreglo de números enteros de 20 posiciones
        Scanner lectura = new Scanner(System.in);
        Random rnd = new Random(); // numero aleatorio
        int num1;
        //Crear un arreglo de números enteros de 20 posiciones,
        // el cual, debe ser llenado con números aleatorios entre 1 y 100
        int [] lista = new int[20];
        for (int i = 0 ; i< lista.length; i++){
            int random = (int) (Math.random() * 100 + 1);
            lista[i] = random;
            System.out.println("["+i+"] = "+lista[i] );
        }
        System.out.println("------------------------------------\n");
        System.out.println("PARTE 2\n");
        for (int i = 0 ; i< lista.length; i++){
            if (lista[i] % 2 == 0) {
                System.out.println("["+i+"] = "+lista[i]+ " Es un numero PAR");
            }else {System.out.println("["+i+"] = "+lista[i]+ " Es un numero INPAR");}
        }
        // se debe volver a recorrer utilizando un
        // ciclo diferente al que se usó para llenarse e imprimir los números pares e impares

    }

}
