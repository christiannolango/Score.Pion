import javax.swing.*;

import java.awt.*;

public class SheetMusic extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.WHITE);
		
		for (int i = 0; i < 100; i+= 20){
		    g.drawLine(100, i+50, 1820, i+50);
		}

		for (int j = 350; j < 450; j += 20) {
		    g.drawLine(100, j+50,1820,j+50);
        }
        setSize(1920,700);
	}
}
