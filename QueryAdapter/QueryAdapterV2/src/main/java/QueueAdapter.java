import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * represents Adapter for queue
 * @param <T>
 */
public class QueueAdapter<T> extends ArrayList<T> implements Queue<T> {

    /**
     * adds an element to the queue
     * @param t
     * @return
     */
    @Override
    public boolean add(T t) {
        super.add(0, t);
        return true;
    }

    /**
     * removes an element from the queue
     * @return
     */
    @Override
    public T remove() {
        try {
            T lastItem = super.get(super.size() - 1);
            super.remove(lastItem);
            return lastItem;
        }catch (Exception e){
            throw new NoSuchElementException();
        }

    }

    /**
     * returns the head of the queue
     * @return
     */
    @Override
    public T peek() {
        if (super.size() > 0)
            return super.get(super.size() - 1);
        return null;
    }

    @Override
    public T element() {
        return null;
    }

    @Override
    public T poll() {
        return null;
    }

    @Override
    public boolean offer(T t) {
        return false;
    }
}
