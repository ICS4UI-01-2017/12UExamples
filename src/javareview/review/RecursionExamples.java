/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview.review;

/**
 *
 * @author lamon
 */
public class RecursionExamples {

    // Returns the nth Fibbonacci number using a loop
    // n - the nth number we want in the sequence
    public int fibLoop(int n){
        // array to store sequence
        int[] numbers = new int[n+1];
        numbers[0] = 1;
        // boundry condition fix
        if(n > 0){
            numbers[1] = 1;
        }
        // building the sequence
        for(int i = 2; i < n+1; i++){
            numbers[i] = numbers[i-1] + 
                            numbers[i-2];
        }
        // returning the number
        return numbers[n];
    }
    
    // Calculate the nth Fib number using recursion
    // n - the nth number in the sequence
    public int fibR(int n){
        // BASE CASE
        if(n == 0 || n == 1){
            return 1;
        }else{
            return fibR(n-1) + fibR(n-2);
        }
    }
    
    public int gcd(int a, int b){
        // swap if a is lower number
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        // check if we are done
        if(b == 0){
            return a;
        }else{
            // find new values for a and b
            int r = a%b;
            // calculate new GCD
            return gcd(b,r);
        }
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RecursionExamples test = new RecursionExamples();
        int bound1 = test.fibLoop(0);
        System.out.println("0th: " + bound1);
        int bound2 = test.fibLoop(1);
        System.out.println("1th: " + bound2);
        int norm = test.fibLoop(56);
        System.out.println("56th: " + norm);
        System.out.println("----------");
        int boundR1 = test.fibR(0);
        System.out.println("0th: " + boundR1);
        int boundR2 = test.fibR(1);
        System.out.println("1th: " + boundR2);
        
        
        System.out.println("----- GCD Test");
        System.out.println("GCD(1378944,120)");
        int gcd = test.gcd(1378944,120);
        System.out.println(gcd);
    
    }
    
}
