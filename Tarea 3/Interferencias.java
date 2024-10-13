package EstructuradeDatosyAlgoritmos;

import java.util.Scanner;
/*static int Sumamayor(int[] arr,int inicio,int termino){
        int suma=0;
        for(int i = inicio;i<termino;i++){
            suma += arr[i];
        }
        return suma;
    }*/

public class Interferencias {

    public static int Divide(int[] arr, int L, int R) {
        int mid = (L+R)/2;
        if(L == R) {
            return arr[R];
        }
        int ladomayor = Math.max(Divide(arr, L, mid),Divide(arr, mid + 1, R));// Divide(arr, L, mid) suma mayor por la izquierda , Divide(arr, mid + 1, R) suma mayor por la derecha
        return Math.max(ladomayor,sumamax(arr,L,R));//sumamax(arr,L,R) suma total entre ambos lados
    }
    static int sumamax(int[] arr, int L, int R){
        int mid = (L+R)/2;
        int maxL = arr[mid];
        int maxR = arr[mid+1];
        int SumaIzquierda = 0 ,SumaDerecha = 0;
        for(int i = mid;i>=L;i--){
            SumaIzquierda += arr[i];
            if(maxL < SumaIzquierda){
                maxL = SumaIzquierda;
            }
        }
        for(int i = mid+1;i<=R;i++){
            SumaDerecha += arr[i];
            if(maxR < SumaDerecha){
                maxR = SumaDerecha;
            }
        }
        return maxL + maxR;
    }
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int n,z;
        int mayor = 0;
        n = imput.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i<n;i++){
            z = imput.nextInt();
            arr[i] = z;
        }
        System.out.println(Divide(arr,0,n-1));
    }
}
