package EstructuradeDatosyAlgoritmos;
import java.util.*;
//Username:dante_hortuvia
public class siqueda1 {
    static void Quede(int[] arr, int m, int s,int[] a,int z){
        if(s == 0){
           return;
        }
        if(m > arr.length-1){
            m = 0;
        }
        a[z] = arr[m];
        Quede(arr,m+1,s-1,a,z+1);


    }
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int N,M,S,num;
        N = imput.nextInt();
        M = imput.nextInt();
        S = imput.nextInt();
        int[] arr = new int[N];
        int[] a = new int[S];
        for(int i = 0;i<N;i++){
            num = imput.nextInt();
            arr[i] = num;
        }
        num =0;
        Quede(arr,M,S,a,num);
        for(int i =0 ; i < S; i++){
            System.out.print(a[i]+ " ");
        }

    }
}