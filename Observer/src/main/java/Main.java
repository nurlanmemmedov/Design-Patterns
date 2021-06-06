import observables.Subject;
import observers.AsciiObserver;
import observers.HexadecimalObserver;
import observers.ReverseObserver;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new AsciiObserver(subject);

        new HexadecimalObserver(subject);

        new ReverseObserver(subject);

        subject.setState("Design Patterns - Hoorah");
    }
}
