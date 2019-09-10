package lab4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Selector {

    // This is a helper method
    public static void swap(Word[] array, int i, int j) {
        Word temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
// leftchild = 2i + 1 rightchild = 2i + 2
    // Problem #1 (5 pts)
    // Fill in the following method with an O(n*k) time algorithm
    // that returns the k largest elements of array in order from
    // largest to smallest.
    // Note: This should return an array with k elements.
    // Hint: Your approach should be similar to selection sort.
    public static Word[] simpleSelect(Word[] array, int k) {
    	for(int i = 0; i < array.length; i++) {
    		int smallest = i;
    		for(int j = i+1; j < array.length; j++) {
    			  Word curr = array[smallest];
    			  Word compared = array[j];
    			if(array[i].compareTo(array[j]) > 0) {
    				smallest = j;
    			}
    		}
    		swap(array, i, smallest);
    	}
    	Word x[] = new Word[5];
    	for(int t = 0; t < 5; t++) {
    		x[t] = array[t];
    	}
    	return x;
    }

    // Problem #4 (5 pts)
    // Fill in the following method with an O(n + klog(n)) time algorithm
    // that returns the k largest elements of array in order from
    // largest to smallest.
    // Note: This should return an array with k elements.
    // Hint: Your approach should use a BinaryHeap.
    public static Word[] heapSelect(Word[] array, int k) {
        Word f[] = new Word[k];
    	for(int i = 0; i <= k; i++) {
        	f[i] = array[i];
        }
    	return f;
    }

}