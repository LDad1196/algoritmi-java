import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        algoritmo17();
    }

    public static void algoritmo17() {
        //Inverti il vettore V=[1,2,3,10,5,6,8]
        int[] V = {1,2,3,10,5,6,8};
        int n = V.length;
        int i = 0;
        while (i < n / 2) {
            int j = n - 1 - i;
            int temp = V[i];
            V[i] = V[j];
            V[j] = temp;
            i++;
        }
        for (i = 0; i < V.length; i++) {
            System.out.println("il numero nel vettore V in posizione " + i + " ora è " + V[i]);
        }
    }

}