package EstructuradeDatosyAlgoritmos;
import java.util.*;
public class Stackbook {
    static int mayor(Stack<Integer> lista,int n){
        Stack<Integer> Aux = new Stack<>();
        int mayor= lista.peek();
        int indice = 0;
        for(int i = 0 ;i < n ;i++)
        {
            if(mayor < lista.peek()){
                mayor = lista.peek();
                indice = i;
            }
            Aux.push(lista.peek());
            lista.pop();
        }
        while(!Aux.empty()){
            lista.push(Aux.peek());
            Aux.pop();
        }
        return indice;
    }
    static void invertir(Stack<Integer> a,int z){
        Queue<Integer> x = new LinkedList<>();
        for(int i = 0;i<=z;i++){
            x.add(a.peek());
            a.pop();
        }
        while(!x.isEmpty()){
            a.push(x.peek());
            x.poll();
        }

    }

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        Stack<Integer> lista1 = new Stack<>();
        int n = imput.nextInt();
        int z,x;
        for(int i = 0 ; i<n ;i++){
            z = imput.nextInt();
            lista1.push(z);
        }
        for(int i = 0;i<n;i++){
            x = mayor(lista1,n-i);
            invertir(lista1,x);
            invertir(lista1,n-(i+1));
        }
        while(!lista1.empty()){
            System.out.print(lista1.pop() + " ");
        }


    }
}
