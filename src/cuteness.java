import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cuteness implements ActionListener {
	public void showButton() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        frame.setVisible(true);
        frame.add(panel);       
        frame.pack();
        b1.addActionListener(this);
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
