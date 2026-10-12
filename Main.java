import Excepciones.JuegoAdivinar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        JuegoAdivinar juego = new JuegoAdivinar();
        Scanner sc = new Scanner(System.in);

        int numeroUsuario = 0;
        int resultado = -1;

        do {
            try {
                System.out.println("Ingrese un numero: ");
                numeroUsuario = sc.nextInt();

                resultado = juego.numeroAdivinar(numeroUsuario);

                if (resultado == 1){
                    System.out.println("El numero es menor a: " + numeroUsuario);
                }
                else if (resultado == -1){
                    System.out.println("El numero es mayor a: " + numeroUsuario);
                }

            }
            catch (InputMismatchException e){
                System.out.println("Ingreso una letra, debe ingresar un numero.");
                sc.nextLine();
                juego.sumarIntento();
            }
        }
        while (resultado != 0);

            System.out.println("Adivino el numero, es: " + numeroUsuario);
            System.out.println("Total de intentos: " + juego.getContador());

    }


}
