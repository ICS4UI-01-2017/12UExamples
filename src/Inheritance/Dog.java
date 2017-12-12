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
public class Dog extends Pet{

    public Dog(String name, int age, String breed, String colour){
        super(name, age, breed, colour);
    }

    @Override
    public void speak() {
        System.out.println("WOOF WOOF");
    }
    
}
