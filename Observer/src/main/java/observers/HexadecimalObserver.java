package observers;
import observables.Subject;

/**
 * shows the Hexadecimal values of the characters in changed state
 */
public class HexadecimalObserver extends Observer {
    public HexadecimalObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }
    @Override
    public void update() {
        char[] chars = subject.getState().toCharArray();
        for (char ch : chars){
            System.out.print(Integer.toHexString((int)ch)+" ");
        }
    }
}