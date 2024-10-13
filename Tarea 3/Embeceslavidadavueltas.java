package EstructuradeDatosyAlgoritmos;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Embeceslavidadavueltas {
    static void  invertir(int[] arr , int pocicionI,int pocicionF){
        Stack<Integer> orden = new Stack<>();
        for(int i = pocicionI;i<pocicionF+1;i++){
            orden.add(arr[i]);
        }
        for(int i = pocicionI;i<pocicionF+1;i++){
            arr[i] = orden.pop();
        }
    }
    static int ecuaciondecoef(int i,int j){
        return j-i+1;
    }
    static int menor(int[] arr,int Pocicion){
        int menor = arr[Pocicion],menorcoef = Pocicion;
        for(int i = Pocicion;i<arr.length;i++){
            if (menor > arr[i]) {
                menor = arr[i];
                menorcoef = i;
            }
        }
        return menorcoef;
    }

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int n = imput.nextInt();
        int z;
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            z = imput.nextInt();
            a[i] = z;
        }
        int suma = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int coefJ = menor(a, i);
            invertir(a, i, coefJ);
            suma += ecuaciondecoef(i, coefJ);
        }
        System.out.println(suma);
    }
}