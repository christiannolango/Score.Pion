import javax.swing.*;

import java.awt.*;

public class SheetMusic extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.WHITE);
		
		for (int i = 0; i < 50; i+= 10){
		g.drawLine(100, i+60, 1820, i+60);
		}
	}
}
