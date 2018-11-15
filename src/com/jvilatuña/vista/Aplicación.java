/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvilatuña.vista;

/**
 *
 * @author UseR
 */
public class Aplicación {
    public static void main(String[] args) {
        factorial();
        pares();
        multiplos3();
        fibonacci();
    }
    public static void factorial() {
        long fac=1;
        int num=4;
        for(int i=num;i>0;i--) {
            fac=fac*i;
        }
        System.out.println("El factorial de " + num + " es: " + fac);
    }
    public static void pares() {
        int lim=100;
        int t = 0;
        System.out.println("Los numeros pares son:");
        for (int j=1;j<=lim;j++){
            t=j%2;
            if(t==0){               
                System.out.print("- "+j);
            }
        }
        System.out.println("");
    }
    public static void multiplos3() {
        int lim=100;
        int t = 0;
        System.out.println("Los numeros multiplos de 3 son:");
        for (int j=1;j<=lim;j++){
            t=j%3;
            if(t==0){               
                System.out.print("- "+j);
            }
        }
        System.out.println("");
    }
    public static void fibonacci(){
        int fibo1=1;
        int fibo2=1;
        int numero=10;

        
        System.out.println("Los "+numero+" primeros números de la fibonacci son:");
        System.out.print(fibo1 + " ");
        for(int i=2;i<=numero;i++){
             System.out.print(fibo2 + " ");
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
        }
        System.out.println();
    }
}
