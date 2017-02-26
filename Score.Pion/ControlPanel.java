/**
 * Created by Rupponi on 2/25/2017.
 */
import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {
    private JLabel noteLabel = new JLabel("Note");
    private ButtonPanel buttonPanel = new ButtonPanel();

    public ControlPanel() {
        setBackground(Color.CYAN);
        setLayout(new GridLayout(2,1));
        add(noteLabel);
        add(buttonPanel);

        setSize(1920,380);
    }
}
