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
public class JavaMethods {
    
    public void helloWorld(){
        System.out.println("Hello world");
    }
    
    public void helloWorld(String name){
        System.out.println("Hello " + name);
    }
    
    public int sumRange(int start, int end){
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum = sum + i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        // create an object to run methods
        JavaMethods test = new JavaMethods();
        test.helloWorld();
        test.helloWorld("moon");
        int total = test.sumRange(5,10);
        System.out.println(total);
    }
}
