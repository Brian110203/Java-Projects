//Brian Knapp
//Set up class and main loop.
public class Program8 {
    public static void main(String[] args) {
    	
    	//Add 20 numbers to the queue.
        Queue queue = new Queue();
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i); }

        //Display the numbers in the queue by the order they were added.
        for (int i = 0; i < 20; i++) {
            System.out.printf("%2d ", queue.dequeue());
            if ((i + 1) % 5 == 0) System.out.printf("\n"); }
    }
}
