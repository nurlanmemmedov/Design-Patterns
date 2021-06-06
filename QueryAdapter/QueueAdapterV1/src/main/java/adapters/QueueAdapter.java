package adapters;
import models.MyQueue;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Represents the adapter of the queue
 * @param <T>
 */
public class QueueAdapter<T> extends MyQueue<T> {

    private ArrayList<T> arrayList;

    public QueueAdapter(ArrayList<T> arrayList){
        this.arrayList = arrayList;
    }

    @Override
    public boolean add(T t) {
        arrayList.add(0, t);
        return true;
    }

    @Override
    public T remove() {
        try{
            T lastItem = arrayList.get(arrayList.size() - 1);
            arrayList.remove(lastItem);
            return lastItem;
        }catch (Exception e){
            throw new NoSuchElementException();
        }
    }

    @Override
    public T peek() {
        if (arrayList.size() > 0)
            return arrayList.get(arrayList.size() - 1);
        return null;
    }

    // getters and setters
    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }
}
