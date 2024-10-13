package hello;
import java.util.*;
class Node {
    int val;
    String Nombre;
    Node left;
    Node right;

    Node(int val, String Nombre) {
        this.val = val;
        this.Nombre = Nombre;
    }
    Node(){};

    Node insert(Node root, int poder,String nombre){
        if(root == null){
            root = new Node(poder,nombre);
            return root;
        }else if(root.val<poder){
            root.right = insert(root.right,poder,nombre);
        }else if(root.val>poder){
            root.left = insert(root.left,poder,nombre);
        }
        return root;
    }
}
public class TorneodeCellZ {
    static Node participante(Node root,int poder1,int poder2){
        if(root == null || root.val ==poder1|| root.val ==poder2){
            return root;
        }
        Node LadoI = participante(root.left,poder1,poder2);
        Node LadoD = participante(root.right,poder1,poder2);
        if(LadoI == null){
            return LadoD;
        }else if(LadoD == null){
            return LadoI;
        }else{
            return root;
        }
    }
    public static void main(String[] args) {
        Scanner Imput = new Scanner(System.in);
        HashMap<String, Integer> Participantes = new HashMap<String,Integer>();
        int n = Imput.nextInt();
        int poder;
        String nombre,nombre1,nombre2;
        Node Torneo = new Node();
        for(int i =0 ; i < n;i++){
            nombre = Imput.next();
            poder = Imput.nextInt();
            Participantes.put(nombre,poder);
            Torneo.insert(Torneo,poder,nombre);
        }
        nombre1= Imput.next();
        nombre2= Imput.next();
        System.out.println(participante(Torneo,Participantes.get(nombre1),Participantes.get(nombre2)).Nombre);
    }
}
