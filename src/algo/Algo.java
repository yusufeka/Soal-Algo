/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

import java.util.ArrayList;

/**
 *
 * @author yusuf
 */
public class Algo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        recursifSum(100, 2, new ArrayList<Integer>());
        int a[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
//        spiral(a);
//        soal2(7,11);
//        soal3(4);
//        soal1(4);
        soal4(12345);
//        soal5(a);
//        soal6("qqweqwqs");
//        soal7(1241, 3);
    }

    /**
     * zig zag
     *
     * @param input
     */
    public static void soal1(int input) {
        Easy.zigzag(input);
    }

    /**
     * is prima
     *
     * @param input
     * @return
     */
    public static void soal2(int keAwal, int keAkhir) {
        Easy.listPrima(keAwal, keAkhir);
    }
    
    /**
     * dadu
     *
     * @param dadu
     */
    public static void soal3(int dadu) {
        Hard.dadu(dadu, new ArrayList<Integer>(), 1);
    }

    /**
     * happy number
     *
     * @param n
     */
    public static void soal4(int n) {
        System.out.println(n);
        System.out.println(Medium.superDigit(n));
    }

    /**
     * rotate
     *
     * @param n
     */
    public static void soal5(int n[][]) {
        printArray(Medium.rotate(n));
    }

    /**
     * list jumlah karakter
     *
     * @param kalimat
     */
    public static void soal6(String kalimat) {
        Easy.jumlahKarakter(kalimat);
    }

    public static void soal7(int x, int n) {
        Hard.powerSum(x, n);
    }
    
    public static void print(ArrayList<Integer> data) {
        System.out.print("[");
        for (int i = 0; i < data.size(); i++) {
            if (i == data.size() - 1) {
                System.out.print(data.get(i) + "");
            } else {
                System.out.print(data.get(i) + ",");
            }
        }
        System.out.print("]");
        System.out.println("");
    }

    public static void printArray(int[][] args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length; j++) {
                System.out.print(args[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static void printManeh(ArrayList<Integer> hasil) {
        for (int i = 0; i < hasil.size(); i++) {
            System.out.print(hasil.get(i) + " ");
        }
        System.out.println("");
    }

    
}
