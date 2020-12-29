import javax.swing.*;

public class WriterThread extends Thread {

	
	private JTextArea textArea;
	
	public WriterThread(JTextArea ta) {
		this.textArea = ta;
	}
	
	public void run() {
		while(true) {
			this.textArea.append("Oðuzhan"+"\n");
		
		}
		
	}
	
}
