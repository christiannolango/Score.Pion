import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SheetMusic extends JPanel{
    String noteType;
    public SheetMusic() {
        ButtonListener buttonListener = new ButtonListener();
        addMouseListener(buttonListener);

    }

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
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("WholeNote.png"));
        } catch (IOException e) {
            System.out.println(e);
        }

        BufferedImage img2 = null;
        try {
            img2 = ImageIO.read(new File("halfNote.png"));
        } catch (IOException e) {
            System.out.println(e);
        }


        g.drawImage(img,30,-60,null);
        g.drawImage(img,70,-60,null);
	}

	private class ButtonListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
            int x = e.getY();
            int y = e.getX();


            if (ButtonPanel.getWholeNote().isSelected()) {
                Measure.setBeatsLeft(1);
            }
            if (ButtonPanel.getHalfNote().isSelected()) {
                Measure.setBeatsLeft(2);
            }
            if (ButtonPanel.getQuarterNote().isSelected()) {
                Measure.setBeatsLeft(3);
            }
            if (ButtonPanel.getEighthNote().isSelected()) {
                Measure.setBeatsLeft(4);
            }

		}

		public void mouseReleased(MouseEvent e) {
			//Leave blank.
		}

		public void mouseEntered(MouseEvent e) {
			//Leave blank.
		}

		public void mouseExited(MouseEvent e) {
			//Leave blank.
		}

		public void mouseClicked(MouseEvent e) {
			//Leave blank.
		}
	}
}
