/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorialcalculator;

/**
 *
 * @author Sanele
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();
        scanner.close();
        
        long factorial = (n); //calculate factorial
        System.out.println("The factorial of " + n +"is: " +factorial);
        
    }
    public static long calculatorFactorial(int n){
    if (n<0){
        throw new IllegalArgumentException("Factorial is not defined for negative comments.");
        
    }
    long factorial =1;
    for (int i =1; i<=n; i++){
        factorial *=i;
        
    }
    return factorial;
    }
}
