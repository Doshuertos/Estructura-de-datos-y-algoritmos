package EstructuradeDatosyAlgoritmos;
import java.util.*;
public class Fuuuuusion {
    static void juntar(Queue<Integer>a,Queue<Integer>b,Queue<Integer>c){
            while(true){
                if(a.isEmpty() || b.isEmpty()){
                    break;
                }else{
                    if(a.peek()>b.peek()){
                        c.add(b.poll());
                    }else{
                        c.add(a.poll());
                    }
                }
            }
            while(true) {
                if(a.isEmpty() && b.isEmpty()) {
                 break;
                } else {
                    if (a.isEmpty()) {
                        c.add(b.poll());
                    } else {
                        c.add(a.poll());
                    }
                }
            }

    }
    public static void main(String[] args) {
        Queue<Integer>PJ1 = new LinkedList<>();
        Queue<Integer>PJ2 = new LinkedList<>();
        Queue<Integer>Fusion = new LinkedList<>();
        Scanner Imput = new Scanner(System.in);
        int N1,Datos;
        N1 = Imput.nextInt();
        for(int i =0;i<N1;i++){
            Datos = Imput.nextInt();
         PJ1.add(Datos);
        }
        N1 = Imput.nextInt();
        for(int i =0;i<N1;i++){
            Datos = Imput.nextInt();
            PJ2.add(Datos);
        }
        juntar(PJ1,PJ2,Fusion);
        while(!Fusion.isEmpty()){
            System.out.print(Fusion.poll() + " ");
        }
    }
}
