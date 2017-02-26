/**
 * Created by Christian on 2/25/2017.
 */
public class Measure {
    private static double keySignature = 4.00;
    private double beatsleft = 0.0; //beatsleft tells the program how many beats required to have a full measure


    private final double halfNote = 2.0;
    private final double quarterNote = 1.0;
    private final double eighthNote = 0.50;
    private final double sixteenthNote = 0.25;


    public Measure(int x) {
        switch (x) {
            case 1: keySignature = 4.00 - halfNote;
                break;
            case 2: keySignature = 4.00 - quarterNote;
                break;
            case 3: keySignature = 4.00 - eighthNote;
                break;
            case 4: keySignature = 4.00 - sixteenthNote;

        }

    }
}
