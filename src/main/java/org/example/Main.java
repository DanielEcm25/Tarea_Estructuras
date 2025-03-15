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

    }
}
