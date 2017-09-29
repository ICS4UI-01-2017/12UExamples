/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview.review;

import java.util.Arrays;

/**
 *
 * @author lamon
 */
public class SortingSearching {

    
    public void swap(int[] array, int p1, int p2){
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }
    
    
    public void selectionSort(int[] array){
        // keep track of which position we are sorting
        for(int position = 0; position < array.length; position++){
            // go through the rest looking for a smaller number
            for(int i = position+1; i < array.length; i++){
                // have we found smaller?
                if(array[i] < array[position]){
                    // swap numbers
                    swap(array, i, position);
                }
            }
        }
    }
    
    
    public void bubbleSort(int[] array){
        // keep track of end
        int last = array.length;
        // boolean to flag a swap
        boolean swap = true;
        // continue if a swap has been made
        while(swap){
            // assume no swaps will be done
            swap = false;
            // look for swaps
            for(int i = 0; i < last - 1; i++){
                // find a bigger value?
                if(array[i] > array[i+1]){
                    // swap
                    swap(array, i, i+1);
                    // set flag to true
                    swap = true;
                }
            }
            // move the last position tracker
            last--;
        }
    }
    
    
    // insertion sort
    public void insertionSort(int[] array){
        // start going through the array
        for(int i = 0; i < array.length - 1; i++){
            // store position
            int position = i;
            // check values beside each other 
            while(position >= 0 && array[position] > array[position + 1]){
               // if out of place, swap it downwards
               // until correct position is reached 
               swap(array, position, position + 1);
               position--;
            }
        }
    }
    
    
    public void mergeSort(int[] array){
        // if we are 1 item, done sorting
        if(array.length <= 1){
            return;
        }
        // divide into 2 arrays
        int split = array.length/2;
        // create 2 arrays
        int[] front = Arrays.copyOfRange(array, 0, split);
        int[] back = Arrays.copyOfRange(array, split, array.length);
        
        // recursively sort
        mergeSort(front);
        mergeSort(back);
        
        // put numbers in correct spot
        // keeping track of where we are
        int fSpot = 0;
        int bSpot = 0;
        for(int i = 0; i < array.length; i++){
            // no more items in front array
            if(fSpot == front.length){
                // put item from back array in
                array[i] = back[bSpot];
                bSpot++;
            }else if(bSpot == back.length){
                // put item from front array in
                array[i] = front[fSpot];
                fSpot++;
            }else if(front[fSpot] < back[bSpot]){
                // put front item in
                array[i] = front[fSpot];
                fSpot++;
            }else{
                // put back item in
                array[i] = back[bSpot];
                bSpot++;
            }
        }
    }
    
    public int sequentialSearch(int[] array, int number){
        // start going through array
        for(int i = 0; i < array.length; i++){
            // did I find it?
            if(array[i] == number){
                // tell them where
                return i;
            }
        }
        // didn't find it
        return -1;
    }
    
    // binary search
    public int binarySearch(int[] array, int target){
        int min = 0;
        int max = array.length - 1;
        while(max >= min){
            int guess = (max+min)/2;
            // find it?
            if(array[guess] == target){
                return guess;
            }else if(target > array[guess]){
                min = guess + 1;
            }else{
                max = guess - 1;
            }
        }
        // didn't find it
        return -1;
        
        
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SortingSearching test = new SortingSearching();
        
        // making a random array of ints
        int[] numbers = new int[100000];
        for(int i = 0; i < numbers.length; i++){
            // make a random number
            numbers[i] = (int)(Math.random()*101);
        }
        System.out.println("BEFORE:");
        for(int i = 0; i < numbers.length; i++){
            //System.out.println(numbers[i]);
        }
        //SORT HERE
        test.insertionSort(numbers);
        
        //AFTER
        System.out.println("AFTER:");
        for(int i = 0; i < numbers.length; i++){
            //System.out.println(numbers[i]);
        }
        
        System.out.println("");
        System.out.println(test.binarySearch(numbers, 36));
        
    }
    
}
