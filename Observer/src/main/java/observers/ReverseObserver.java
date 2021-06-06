package observers;
import observables.Subject;

/**
 * shows the reverse of the changed state
 */
public class ReverseObserver extends Observer {
    public ReverseObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }
    @Override
    public void update() {
        System.out.println(new StringBuilder(subject.getState()).reverse().toString());
    }
}
