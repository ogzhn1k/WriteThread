import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WriteText extends JFrame{

	private JTextArea endless;
	private JButton writeButton,exitB;
	private WriterThread wThread;
	private JScrollPane scroll;
	
	public WriteText(){
		
		writeButton = new JButton("Write");
		exitB = new JButton("Exit");
		endless = new JTextArea(30,20);
		 wThread = new WriterThread(endless);
			scroll = new JScrollPane(endless);
		Container c = getContentPane();		
		
		FlowLayout fl = new FlowLayout();
		
		c.setLayout(fl);
		c.add(writeButton);
		c.add(exitB);
		//c.add(endless);
		c.add(scroll);
		
		writeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(!wThread.isAlive())//Thread ýn sonlanmýþ olup olmamasi kontrol edilir
				wThread.start();
		
			}

			
		});
		
		
		exitB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}

			
		});
		
		
		
		
	}
	
	
}
