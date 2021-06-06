package observers;
import observables.Subject;

/**
 * represents the abstract Observer class
 */
public abstract class Observer {
    public Subject subject;
    public abstract void update();
}
