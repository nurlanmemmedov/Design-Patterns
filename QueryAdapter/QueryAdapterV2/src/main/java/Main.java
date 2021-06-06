import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new QueueAdapter<>();
        queue.add("Nurlan");
        queue.add("Amrah");
        queue.add("Saleh");

        queue.remove();
        queue.remove();

        System.out.println(queue.peek()); // output: Saleh
    }
}
