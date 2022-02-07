//Brian Knapp
//Set up class
import java.util.*;

class Lab5 {
	public static void main(String[] args)  { 
        //set up linked list and add nodes
		sortLinkedList listToSort = new sortLinkedList(); 
        listToSort.add(7); 
        listToSort.add(10); 
        listToSort.add(1); 
        listToSort.add(53); 
        listToSort.add(3); 
        
        //print the unsorted linked list
        System.out.println("List Before Sorting:"); 
        listToSort.printLinkedList(listToSort.headNode); 
        //sort the list using insertion sort
        listToSort.sortWithInsertion(listToSort.headNode); 
        //print the sorted list
        System.out.println("\nSorted Linked List:"); 
        listToSort.printLinkedList(listToSort.headNode); } 
}

class sortLinkedList { 
    node headNode; 
    node sorted; 
    //create node for linked list
    class node { 
        int value; 
        node nextValue; 
        public node(int value) { 
            this.value = value; } 
    } 
    
    //add node to the linked list
    void add(int value) { 
        //crate new node
        node newNode = new node(value); 
        //link the created node to the list
        newNode.nextValue = headNode; 
        //point headNode to newNode
        headNode = newNode; } 
    
    //insert node into the sorted list
    void insertNode(node newNode) { 
    	//adding the head node
        if (sorted == null || sorted.value >= newNode.value) { 
            newNode.nextValue = sorted; 
            sorted = newNode; } 
        
        else { 
            node current = sorted; 
            //find and insert a new node
            while (current.nextValue != null && current.nextValue.value < newNode.value) { 
                current = current.nextValue; } 
            
            newNode.nextValue = current.nextValue; 
            current.nextValue = newNode; } 
    } 
    
    //use insertion to sort the linked list
    void sortWithInsertion(node headref) { 
        //the sorted list has no starting values so its set to null 
        sorted = null; 
        node current = headref; 
        //add a sorted node to the sorted list
        while (current != null) { 
        	//add new node to list by setting the current value equal to the next value
            node nextValue = current.nextValue; 
            insertNode(current); 
            current = nextValue; } 
        headNode = sorted; 
    } 
 
    //print out the nodes in the list
    void printLinkedList(node headNode) { 
        while (headNode != null) { 
            System.out.print(headNode.value + " "); 
            headNode = headNode.nextValue; } 
    } 
}

