import java.util.Scanner;

public class EjercicioUNO {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1 - Crear un vector de tipo Entero con 5 posiciones,\n llenarlo con información solicitada al usuario. Después de recoger toda la información,\n se requiere imprimir el índice de cada posición en el arreglo con su valor de la siguiente manera:\n");
        Scanner lectura = new Scanner(System.in);
        System.out.println("Prueba arreglos");
        System.out.println("Agregar 5 valores al array");
        int datos[] = new  int[5];
        datos[0]=lectura.nextInt();
        datos[1]=lectura.nextInt();
        datos[2]=lectura.nextInt();
        datos[3]=lectura.nextInt();
        datos[4]=lectura.nextInt();

        for (int i = 0; i < datos.length ; i++){
            System.out.println("["+i+"]"+" = "+datos[i] );}
        }

    }

