package hello;
import java.util.*;
public class TherealmofBinaria {
    static boolean sumamayor(int[][] matriz,int x,int y) {
        boolean aux = false;
        int ceros =0, unos =0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (matriz[j][i] == 1) {
                   unos++;
                } else {
                    ceros++;
                }
            }
        }
        if(unos > ceros){
            aux = true;
        }
        return aux;
    }
    static void cambiodeordencolum(int[][] matriz, int y, int i) {
        for (int j = 0; j < y; j++) {
            if (matriz[i][j] == 1) {
                matriz[i][j] = 0;
            } else {
                matriz[i][j] = 1;
            }
        }
    }
    static void cambiodeordenfilas(int[][] matriz, int y, int i) {
        for (int j = 0; j < y; j++) {
            if (matriz[j][i] == 1) {
                matriz[j][i] = 0;
            } else {
                matriz[j][i] = 1;
            }
        }
    }
    static boolean cosecutivosfilas(int[][] matriz,int y,int i){
        int n1 =0;
        boolean aux = false;
        for(int j = 0;j<y;j++){
            if(matriz[j][i]==1){
                n1++;
            }else{
                if(n1>0) {
                    n1--;
                }
            }
            if(n1 > 1){
                aux = true;
            }
        }
        return aux;
    }
    public static void main(String[] args) {
        Scanner Imput = new Scanner(System.in);
        int N, M, contador = 0, z, ceros = 0, suma = 0;
        boolean aux;
        N = Imput.nextInt();
        M = Imput.nextInt();
        int[][] matriz = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                z = Imput.nextInt();
                matriz[i][j] = z;
            }
        }
        aux = sumamayor(matriz,M,N);
        for (int i = 0; i < M; i++) {
            contador = 0;
            ceros = 0;
            for (int j = 0; j < N; j++) {
                if (matriz[j][i] == 1) {
                    contador++;
                } else {
                    ceros++;
                }
            }
                if(cosecutivosfilas(matriz,N,i) == true && aux == true && contador !=N){
                    cambiodeordenfilas(matriz, N, i);
                }else if (contador < ceros) {
                    cambiodeordenfilas(matriz, N, i);
                }
            }
        for (int i = 0; i < N; i++) {
            contador = 0;
            ceros = 0;
            for (int j = 0; j < M; j++) {
                if (matriz[i][j] == 1) {
                    contador++;
                } else {
                    ceros++;
                }
            }
            if (contador < ceros) {
                cambiodeordencolum(matriz, M, i);
            }
        }
            for (int i = 0; i < N; i++) {
                int x = M - 1;
                for (int j = 0; j < M; j++) {
                    suma += Math.pow(2, x) * matriz[i][j];
                    x--;
                }
            }
            System.out.println(suma);
        }

    }


