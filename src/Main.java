import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        algoritmo19();
    }

    public static void algoritmo19() {
        int[] v1 = {1,2,3,1,1,2,4,3,5,6,5,7};
        int n = v1.length;
        int[] v2 = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean duplicato = false;
            for (int j = 0; j < count; j++) {
                if (v1[i] == v2[j]) {
                    duplicato = true;
                    break;
                }
            }
            if (!duplicato) {
                v2[count] = v1[i];
                System.out.println("In posizione " + count + " del vettore v2 si trova il numero " + v1[i]);
                count++;
            }
        }
        System.out.print("Vettore senza duplicati: ");
        for (int i = 0; i < count; i++) {
            System.out.print(v2[i] + " ");
        }
    }

}