package main;

import java.util.Scanner;

//public class Triangulo {
//
//    public static void main(String[] args) {
//
//       String resultado = triangulo(5,5,5);
//       System.out.println(resultado);
//    }
//
//
//    public static String triangulo(int x, int y, int z) {
//
//
////        System.out.println("Executar");
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Digite três valores: ");
//
//        int ladoA, ladoB, ladoC;
//
////        try {
////            ladoA = sc.nextInt() ;
////            ladoB = sc.nextInt() ;
////            ladoC = sc.nextInt() ;
////
////        } catch (Exception e) {
////            return "Entrada inválida.";
////        }
//
//        ladoA = x;
//        ladoB = y;
//        ladoC = z;
//
//        if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
//            return "Os três lados não formam um triângulo";
//        } else if (ladoA == ladoB && ladoA ==ladoC) {
//            return "Equilátero";
//        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
//            return "Isósceles";
//        } else {
//            return "Escaleno";
//        }
//    }
//}

/**
 * Classe Triangulo que contém métodos para determinar o tipo de um triângulo com base nos comprimentos dos seus lados.
 */
public class Triangulo {

    /**
     * Método principal que executa o programa.
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        String resultado = triangulo(5, 5, 5);
        System.out.println(resultado);
    }

    /**
     * Método que determina o tipo de um triângulo com base nos comprimentos dos seus lados.
     * @param x Comprimento do lado A.
     * @param y Comprimento do lado B.
     * @param z Comprimento do lado C.
     * @return O tipo do triângulo.
     */
    public static String triangulo(int x, int y, int z) {
        return triangulo(new int[] {x, y, z});
    }

    /**
     * Método que determina o tipo de um triângulo com base nos comprimentos dos seus lados.
     * @param lados Array com os comprimentos dos lados.
     * @return O tipo do triângulo.
     */
    public static String triangulo(int[] lados) {
        if (lados.length != 3) {
            return "Número incorreto de valores.";
        }

        int ladoA = lados[0];
        int ladoB = lados[1];
        int ladoC = lados[2];

        if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
            return "Os três lados não formam um triângulo";
        } else if (ladoA == ladoB && ladoA == ladoC) {
            return "Equilátero";
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}
