package models;
import interfaces.IQueue;

/**
 * Represents Custom Queue
 * @param <T>
 */
public class MyQueue<T> implements IQueue<T> {

    private int length;
    private Node front, rear;

    public MyQueue(){
        length = 0;
        front = rear = null;
    }

    /**
     * adds an element to queue
     * @param data
     * @return
     */
    @Override
    public boolean add(T data){
        Node<T> node = new Node(data);
        if(isEmpty()){
            front = node;
        }else {
            rear.setNext(node);
        }
        rear = node;
        length++;
        return true;
    }

    /**
     * removes an element from queue
     * @return
     * @throws Exception
     */
    @Override
    public T remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        T result = (T)front.getData();
        front = front.getNext();
        length--;
        if(isEmpty()){
            rear = null;
        }
        return result;
    }

    /**
     * returns the head of the queue
     * @return
     * @throws Exception
     */
    @Override
    public T peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return (T) front.getData();
    }

    public  boolean isEmpty(){
        return length == 0;
    }

    public int size(){
        return length;
    }
}