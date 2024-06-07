package pctjogo;

import java.util.Random;
import java.util.Scanner;

public class javasenhajogo {
    public static void main(String[] args) {
        int senha[] = new int[6];
        int tentativa[] = new int[6];
        System.out.println("   ");
        System.out.println("BEM VINDO AO JOGO MASTER MIND!");
        System.out.println("insira, em ordem, os números da sua tentativa abaixo.");
        System.out.println(" ");
        System.out.println("ta indo?");
        gennum(senha);
        scantentativa(tentativa);
    }

    public static void gennum(int v[]) {
        Random rd = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = rd.nextInt(0, 9);
        }
    }

 public static void scantentativa (int v[]){
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < v.length; i++) {
v[i]=sc.nextInt();
 }
}

public static boolean verify (int v[], int c[]){
    for (int i = 0; i < v.length; i++) {
    if ( v[i] == c[i]) {
        return true;
    }else{
        System.out.println("errou a senha ne seu broxa");
        return false;
    }
    //alterações na branch?? talvezz kkkkkkk
} 
    return false;
    
}

}

