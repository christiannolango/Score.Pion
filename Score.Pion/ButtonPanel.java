/**
 * Created by Rupponi on 2/25/2017.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonPanel extends JPanel{
    private JRadioButton wholeNote;
    private JRadioButton halfNote;
    private JRadioButton quarterNote;
    private JRadioButton eighthNote;
    private ButtonGroup bG;

    public ButtonPanel() {
        setBackground(Color.CYAN);
        wholeNote = new JRadioButton("Whole Button");
        halfNote = new JRadioButton("Half Note");
        quarterNote = new JRadioButton("Quarter Note");
        eighthNote = new JRadioButton("Eighth Note");

        wholeNote.setBackground(Color.CYAN);
        halfNote.setBackground(Color.CYAN);
        quarterNote.setBackground(Color.CYAN);
        eighthNote.setBackground(Color.CYAN);

        bG = new ButtonGroup();
        bG.add(wholeNote);
        bG.add(halfNote);
        bG.add(quarterNote);
        bG.add(eighthNote);
        wholeNote.setSelected(true);

        setLayout(new FlowLayout());
        add(wholeNote);
        add(halfNote);
        add(quarterNote);
        add(eighthNote);

        this.setVisible(true);
    }

}
