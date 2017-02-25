import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;


public class scorepion extends JApplet {

	private int APPLET_WIDTH = 1920, APPLET_HEIGHT = 1080;
	private JPanel mainPanel = new JPanel();
	private JPanel sheetPanel = new JPanel();
	private JLabel l1 = new JLabel("Sheet"+"\n");
	private JLabel l2 = new JLabel("Note");
	private JPanel notePanel = new JPanel();
	
	
	
	public void init(){
		setLayout(new GridLayout(3,1));
		
		
		SheetMusic s = new SheetMusic();
		getContentPane();
		add(s);
		add(notePanel);
		notePanel.add(l2);

		setSize(APPLET_WIDTH, APPLET_HEIGHT);
		
	}
	
	
	
	
}
