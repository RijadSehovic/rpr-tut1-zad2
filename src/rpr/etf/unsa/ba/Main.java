package rpr.etf.unsa.ba;
import java.util.Scanner;
public class Main {
    private static int ZbirCifara(int x) {
        int suma=0,pomocni=x;
        while(pomocni>0){
            suma+=pomocni%10;
            pomocni/=10;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for(int i=1; i<=n; i++) {
            if(i%ZbirCifara(i)==0) System.out.println(i);

        }
    }
}
