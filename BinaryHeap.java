package lab4;

public class BinaryHeap {

    private Word[] wordArray;
    private int size;

    public BinaryHeap(Word[] array) {
        size = array.length;
        buildHeap(array);
    }

    // Problem #2 (20 pts)
    // Fill in the following method with an O(n) time algorithm
    // that builds an n element complete binary heap.
    // Note: You are allowed to add helper methods.
    int rightChild(int position) {
		return (position * 2) + 1;
	}
    int leftChild(int position) {
    	return (position * 2);
    }
    int parent(int position) {
    	return (position -1)/ 2;
    }

    public void buildHeap(Word[] array) {
    	for(int i = 0; i < array.length; i++) {
    		Word curr = array[i];
    		size++;
    		if(curr.compareTo(array[parent(i)]) > 0) {
    			swap(curr, array[parent(i)]);
    			curr = array[parent(i)];
    		}
    		else
    			return;
    	}
    }
    // Problem #3 (15 pts)
    // Fill in the following method with an O(log(n)) time algorithm
    // that removes the root element, restores the heap structure,
    // and finally returns the removed root element.
    // Note: You are allowed to add helper methods.
    
    /*
     remove largest element (array already sorted)
     check for end cases (null tree, one element)
     change references
     perform swim operation until largest is at the top
     update size
     return removed element 
     
     */
    public Word removeMax() {
    	if(size == 0) {
    		return null;
    	}
    	else if(size == 1) {
    		return array[0]
    	}
        return null;
    }

}