package EstructuradeDatosyAlgoritmos;
import java.util.*;
//Username:dante_hortuvia
public class Siquede {
    static ArrayList<Integer> Quede(int[] arr, int m, int s,ArrayList<Integer>a){
        if(s == 0){
            return a;
        }
        if(m > arr.length-1){
            m = 0;
        }
        a.add(arr[m]);
        Quede(arr,m+1,s-1,a);
        return a;
    }
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        ArrayList<Integer>a = new ArrayList<Integer>();
        int N,M,S,num;
        N = imput.nextInt();
        M = imput.nextInt();
        S = imput.nextInt();
        int[] arr = new int[N];
        for(int i = 0;i<N;i++){
            num = imput.nextInt();
            arr[i] = num;
        }

        System.out.println(Quede(arr,M,S,a));
    }
}
