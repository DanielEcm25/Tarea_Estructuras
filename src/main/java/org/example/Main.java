package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static Stack<Integer> torre1 = new Stack<>();
    private static Stack<Integer> torre2 = new Stack<>();
    private static Stack<Integer> torre3 = new Stack<>();

    public static void main(String[] args) {
        //Preguntándole al usuario con cuántos discos desea jugar
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Con cuántos discos desea jugar?");
        int discos = entrada.nextInt();
        //Insertando los discos a la torre 1
        for (int i = discos; i >= 1; i--) {
            torre1.push(i);
        }
        hanoi(discos, torre1, torre2, torre3);}
    //Método Hannoi
    public static void hanoi(int discos, Stack<Integer> origen, Stack<Integer> auxiliar, Stack<Integer> destino) {
        /*si solo hay que mover un disco en la torre de origen, se mandará directamente
        a la torre que se pase como origen a la que se nombre destino*/
        if (discos == 1) {
            //Llamando al moverDisco
        /*si hay más de un disco:
        Ahora la torre auxiliar será la torre destino
        Se moverá n-1 discos desde el origen al auxiliar*/
        } else {
            //La torre de apoyo será ahora la torre destino
            hanoi(discos - 1, origen, destino, auxiliar);
            hanoi(discos - 1, auxiliar, origen, destino);
        }
    }

    }

