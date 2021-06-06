package observers;
import observables.Subject;

/**
 * shows the ASCII values of the characters in changed state
 */
public class AsciiObserver extends Observer {
    public AsciiObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }
    @Override
    public void update() {
        char[] chars = subject.getState().toCharArray();

        for (char ch : chars){
            System.out.print((int)ch+" ");
        }
    }
}