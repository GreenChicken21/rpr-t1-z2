package ba.unsa.etf.rpr;


import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n){
        int s = 0;
        do{
            s+=n%10;
            n = n/10;
        }while (n != 0);
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Unesite broj n: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i<=n;i++)
            if(i % sumaCifara(i) == 0)
                System.out.println(i);
    }
}
