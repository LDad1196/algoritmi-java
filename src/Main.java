import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        algoritmo23();
    }

    public static void algoritmo23() {
        //Dato un array di interi ed una target sum, trova gli indice dei 2 numeri che sommati risultano essere il target; diagramma di flusso, java, passo passo, pseudo
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto vuoi che sia lungo il vettore");
        int n = scan.nextInt();
        int[] V = new int[n];
        int i = 0;
        while (i < n) {
            System.out.println("Che numero vuoi aggiungere nel vettore in posizione " + i + "?");
            V[i] = scan.nextInt();
            i++;
        }
        i = 0;
        System.out.println("Qual'è la somma di numeri che stai cercando?");
        int targetsum = scan.nextInt();
        boolean trovata = false;
        int[] V2 = new int[2];
        while (i < n - 1 && !trovata) {
            int j = i + 1;
            while (j < n && !trovata) {
                int somma = V[i] + V[j];
                if (somma == targetsum) {
                    trovata = true;
                    V2[0] = i;
                    V2[1] = j;
                }
                j++;
            }
            i++;
        }
        if (trovata) {
            System.out.println("La somma " + targetsum + " è stata trovata ed e composta dal numero in posizione " + V2[0] + " e " + V2[1] + " del vettore V, perchè " + V[V2[0]] + "+" + V[V2[1]] + "=" + targetsum);
        } else {
            System.out.println("La somma " + targetsum + " non è stata trovata nel vettore V");
        }
    }
}