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
    /**
     * 
     * @param name A String containing the name of the Dog
     * @param age An integer with the age of the dog
     * @param breed 
     * @param colour 
     */
    public Dog(String name, int age, String breed, String colour){
        super(name, age, breed, colour);
        
    }

    @Override
    public void speak() {
        System.out.println("WOOF WOOF");
    }
    
    /**
     * 
     */
    public void howl(){
        System.out.println("HOOOOOWWWWLL...");
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
        String fromPet = super.toString();
        fromPet += "\nType: Dog";
        return fromPet;
    }
    
}
