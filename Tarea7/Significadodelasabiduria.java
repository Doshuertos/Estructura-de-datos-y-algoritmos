package hello;
import java.util.*;
public class Significadodelasabiduria {
    public static void main(String[] args) {
        Scanner Imput = new Scanner(System.in);
        int n,k,z,menor;
        n = Imput.nextInt();
        k = Imput.nextInt();
        int[] edades = new int[n];
        for(int i = 0 ;i <n;i++){
            z = Imput.nextInt();
            edades[i] = z;
        }
        Arrays.sort(edades);
        menor = Integer.MAX_VALUE;
        for(int i = 0 ;i<n;i++){
            if(i+k >= n-1){
                break;
            }
            int Edad = edades[i+k-1]-edades[i];
            if(menor > Edad){
                menor = Edad;
            }
        }
        System.out.println(menor);
    }
}