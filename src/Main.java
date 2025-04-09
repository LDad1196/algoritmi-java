import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        algoritmo23();
    }

    public static void algoritmo23() {
       //Realizzare un algoritmo che inserisca un nuovo numero all'interno di vettore v di lunghezza n contenente numeri interi in posizioner crescente
        Scanner scan = new Scanner(System.in);
        System.out.println("Quante colonne vuoi che abbia la tua matrice?");
        int n = scan.nextInt();
        int[] V = new int [n];
        int i = 0;
        while (i < n ) {
            System.out.println("Che numero vuoi inserire nel vettore V in posizione [" + i + "]?");
            V[i] = scan.nextInt();
            i++;
        }
        i = 0;
        int[] V2 = new int[n + 1];
        int newnum = 4;
        while (i < n) {
           if (V[i] > newnum) {
               V[i] = newnum;
           }
           i++;
        }
        int l = 0;
        System.out.print("Vettore con i numeri più bassi della colonna: ");
        while (l < n) {
            System.out.print(V[l] + " ");
            l++;
        }
    }


}