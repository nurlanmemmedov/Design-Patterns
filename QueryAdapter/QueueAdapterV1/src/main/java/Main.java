import adapters.QueueAdapter;
import models.MyQueue;

import java.util.ArrayList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        MyQueue<String> queue = new QueueAdapter<>(arrayList);
        queue.add("Emil");
        queue.add("Iqbal");
        queue.add("Mubariz");
        queue.remove();
        System.out.println(queue.peek()); // output: Iqbal
    }
}
