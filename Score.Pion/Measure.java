/**
 * Created by Christian on 2/25/2017.
 */
public class Measure {
    private static double keySignature = 4.00;
    private static double beatsLeft = 4.0; //beatsleft tells the program how many beats required to have a full measure

    private final static double wholeNote = 4.0;
    private final static double halfNote = 2.0;
    private final static double quarterNote = 1.0;
    private final static double eighthNote = 0.50;


    public static double setBeatsLeft(int x) {
        switch (x) {
            case 1: beatsLeft = beatsLeft = wholeNote;
            case 2: beatsLeft = beatsLeft - halfNote;
                break;
            case 3: beatsLeft = beatsLeft - quarterNote;
                break;
            case 4: beatsLeft = beatsLeft - eighthNote;
                break;
        }
        return beatsLeft;
    }//edit beatsleft

    public static void clearKeySig(){
        beatsLeft=keySignature;
    }//clear KeySig to default value
}
