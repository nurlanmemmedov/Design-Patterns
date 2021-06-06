package interfaces;

/**
 * Represents a generic queue
 */
public interface IQueue<T> {
    /**
     * adds an element to the queue
     * @param t
     * @return
     */
    boolean add(T t);

    /**
     * removes an element from the queue
     * @return
     */
    T remove() throws Exception;

    /**
     * returns the head of the queue
     * @return
     */
    T peek() throws Exception;
}
