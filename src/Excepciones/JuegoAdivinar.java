package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class JuegoAdivinar {

    private int numero;
    private int contador = 0;

    public JuegoAdivinar() {
        this.contador = contador;
        this.numero = ThreadLocalRandom.current().nextInt(1, 501);
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int numeroAdivinar(int numeroUsuario){

        contador++;

        if (numeroUsuario > numero){
            return 1;
        }
        else if (numeroUsuario < numero){
            return -1;
        }

        return 0;

    }

    public void sumarIntento(){
        contador++;
    }

}
