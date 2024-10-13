package EstructuradeDatosyAlgoritmos;
import java.util.*;
//Username:dante_hortuvia
class Karateka{
    public int Vida;
    public int Resistencia;
    public int Durabilidad;
    public int Ataque;
    public int Patada;
    public Karateka(int Vida,int Resistencia,int Durabilidad,int Ataque,int Patada){
        this.Vida = Vida;
        this.Resistencia = Resistencia;
        this.Durabilidad = Durabilidad;
        this.Ataque = Ataque;
        this.Patada = Patada;
    }
    public int getVida(){
        return this.Vida;
    }
    public int getPatada(){
        return this.Patada;
    }
    public int getAtaque(){
        return this.Ataque;
    }
    public int getResistencia(){
        return this.Resistencia;
    }
    public int getDurabilidad(){
        return this.Durabilidad;
    }
    public void setVida(int vida){
        this.Vida = vida;
    }
    public void setDurabilidad(){
        this.Durabilidad = this.Durabilidad - 1;
    }

}
public class Karate {
    static void comPatadavida(Karateka a, Karateka b) {
        if (a.getPatada() == b.getVida()) {
            b.setVida(0);
        }
    }

    static void Ataque(Karateka a, Karateka b) {
        if (b.getDurabilidad() > 0) {
                b.setVida(b.getVida() - (a.getAtaque() - b.getResistencia()));
                b.setDurabilidad();
        } else {
            b.setVida(b.getVida() - a.getAtaque());
        }
    }

        public static void main (String[] args){
            ArrayList<Karateka> PJ = new ArrayList<Karateka>();
            int N, V, R, D, A, S;
            int n = 0;
            Scanner imput = new Scanner(System.in);
            N = imput.nextInt();
            for (int i = 0; i < N; i++) {
                V = imput.nextInt();
                R = imput.nextInt();
                D = imput.nextInt();
                A = imput.nextInt();
                S = imput.nextInt();
                Karateka pj = new Karateka(V, R, D, A, S);
                PJ.add(pj);
            }
            for (int i = 1; i < N; i++) {
                Karateka a = PJ.get(n);
                Karateka b = PJ.get(i);
                while (true) {
                    comPatadavida(a,b);
                    if(b.getVida() < 1) {
                        break;
                    }
                    Ataque(a,b);
                    if(b.getVida() < 1) {
                        break;
                    }
                    comPatadavida(b,a);
                    if(a.getVida() < 1) {
                        n = i;
                        break;
                    }
                    Ataque(b,a);
                    if(a.getVida() < 1) {
                        n = i;
                        break;
                    }
                }
            }
            if (n == 0) {
                System.out.println("gane yo :D");
            } else {
                System.out.println(n + 1);
            }
        }
    }



