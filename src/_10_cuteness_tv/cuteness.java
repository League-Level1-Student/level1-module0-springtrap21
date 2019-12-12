package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cuteness implements ActionListener {
	JButton button = new JButton();
	JButton ela = new JButton();
	JButton nokk = new JButton();
	public void showButton() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.add(button);       
        panel.add(ela);
        ela.addActionListener(this);
        panel.add(nokk);
        button.addActionListener(this);
        frame.pack();
        nokk.addActionListener(this);     
   }
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=tWFaP1tkGgM");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			showDucks();
		}
		if (e.getSource() == ela) {
			showFrog();
		}
		if (e.getSource() == nokk) {
			showFluffyUnicorns();
}
	}
}









