//Brian Knapp
//Set up Class.
public class Queue {

	//Set up private data fields for "elements", "size", and "capacity"
    private int[] elements;
    private int size;
    private int capacity;

    //Set up the queue class with the capacity passed to it.
    public Queue(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity]; }

    //Create the queue object with a default value of 8.
    public Queue() {
        this(8); }

    //Set up the enqueue class that receives an integer and adds it into the queue.
    public void enqueue(int numbers) {
    	
    	//If the queue exceeds its capacity, double the size.
        if (size >= elements.length) {
            int[] tempNum = new int[size * 2];
            System.arraycopy(elements, 0, tempNum, 0, size);
            elements = tempNum; }
        elements[size++] = numbers; }

    //Set up dequeue to remove an element from the queue and return it.
    public int dequeue() {
        int numbers = elements[0];
        size--;
        for (int i = 0; i < size; i++) {
            elements[i] = elements[i + 1]; }
        return numbers; }

    //Set up empty to determine whether the queue is empty.
    public boolean empty() {
        return size == 0; }

    //Set up getSize to return the size of the queue.
    public int getSize() {
        return size; }

  //Set up getCapacity to return the capacity of the queue.
    public int getCapacity() {
        return capacity; }
}