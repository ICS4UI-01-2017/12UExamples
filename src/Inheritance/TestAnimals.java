/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author lamon
 */
public class TestAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog fido = new Dog("Fido", 3, "Boston Terrier", "Black and White");
        Cat whiskers = new Cat("Whiskers", 5, "Tabby", "Brown Stripe");
        Dog spike = new Dog("Spike", 8, "Bull Dog", "Brown");
        
        fido.speak();
        whiskers.speak();
        
        System.out.println(fido);
        
        Pet[] p = new Pet[3];
        p[0] = fido;
        p[1] = whiskers;
        p[2] = spike;
        
        for(int i = 0; i < 3; i++){
            p[i].speak();
        }
    }
    
}
