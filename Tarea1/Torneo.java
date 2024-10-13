package EstructuradeDatosyAlgoritmos;
import java.util.*;
//Username:dante_hortuvia
class Luchador{
    public String nombre;
    public int poder;
    public Luchador(String nombre,int poder){
        this.nombre = nombre;
        this.poder = poder;
    }
    public int getPoder(){
        return poder;
    }
    public void getdatos(){
        System.out.println(nombre +" "+ poder);
    }
}
 class CompareBypower implements Comparator<Luchador>{
    public int compare(Luchador x , Luchador y) {
        return x.getPoder() - y.getPoder();
    }
}
public class Torneo {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int n,poder;
        String nombre;
        n = imput.nextInt();
        ArrayList<Luchador>Combate = new ArrayList<Luchador>();
        for(int i = 0;i<n;i++){
          nombre = imput.next();
          poder = imput.nextInt();
            Luchador x = new Luchador(nombre,poder);
            Combate.add(x);
        }
        Collections.sort(Combate,new CompareBypower());
        for(int i = 0 ;i<n;i++){
            Combate.get(i).getdatos();
        }

    }
}
