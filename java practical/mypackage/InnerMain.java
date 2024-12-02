
import mypackage.lassA;
import mypackage.lassB;

public class InnerMain {

    public static void main(String[] args) {
        lassA lassA = new lassA();
        lassA.display(); // Outputs: Hello from lassA!

        lassB lassB = new lassB();
        lassB.display();    // Outputs: Hello from lassB!
    }

}
    

