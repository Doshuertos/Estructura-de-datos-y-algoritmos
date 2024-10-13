package EstructuradeDatosyAlgoritmos;
import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
    Node(){
    }
    Node arbol(int[] inorder, int[]postorder){
        int distancia = inorder.length;
        return Creador(inorder,postorder,0,distancia-1,0,distancia-1);
    }
    Node Creador(int[] inorder,int[]postorder,int inicioInorder, int finalInorder,int iniciopostorder, int finalpostorder){
        if(inicioInorder > finalInorder || iniciopostorder > finalpostorder){
            return null;
        }
        Node Root = new Node(postorder[finalpostorder]);
        int indice = inicioInorder;
        for(; indice <= finalInorder; indice++){
            if(inorder[indice]==Root.val){
                break;
            }
        }
        int tamanioI= indice - inicioInorder;
        int tamanioD= finalInorder - indice;
        Root.left = Creador(inorder,postorder,inicioInorder,indice-1,iniciopostorder,iniciopostorder+tamanioI-1);
        Root.right = Creador(inorder,postorder,indice+1,finalInorder,finalpostorder-tamanioD,finalpostorder-1);
        return Root;
    }

}

public class JardínVirtual {
    static void preorder(Node Root){
        if(Root == null){
            return;
        }
        System.out.print(Root.val + " ");
        preorder(Root.left);
        preorder(Root.right);
    }
    public static void main(String[] args) {
        int n;
        Scanner imput = new Scanner(System.in);
        n = imput.nextInt();
        int z;
        int[] postorder = new int[n];
        int[] inorder = new int[n];
        for(int i = 0;i<n;i++){
            z = imput.nextInt();
            inorder[i] = z;
        }
        for(int i = 0;i<n;i++){
            z = imput.nextInt();
            postorder[i] = z;
        }
        Node Arbol = new Node();
        preorder(Arbol.arbol(inorder,postorder));
    }
}
