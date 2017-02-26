import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class scorepion extends JApplet {

	private int APPLET_WIDTH = 1920, APPLET_HEIGHT = 1080;
	private JPanel mainPanel = new JPanel();
	private JPanel sheetPanel = new JPanel();
	private JLabel l1 = new JLabel("Sheet"+"\n");
	private ControlPanel notePanel = new ControlPanel();
	
	
	
	public void init(){
		
		SheetMusic s = new SheetMusic();
		getContentPane();
		setLayout(new GridLayout(2,1));
		this.add(s);
		this.add(notePanel);

		setSize(APPLET_WIDTH, APPLET_HEIGHT);
		
	}
	
	
	
	
}
