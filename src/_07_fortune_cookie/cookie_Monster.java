package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class cookie_Monster implements ActionListener {
	public void showButton() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int rnd = new Random().nextInt(5);
		if (rnd == 0) {
			JOptionPane.showMessageDialog(null, "You will miss all your quick scopes in Call of Duty!");
		}
		else if (rnd == 1) {
			JOptionPane.showMessageDialog(null, "You will hit your trick-shots!");
		}
		else if (rnd == 2) {
			JOptionPane.showMessageDialog(null, "Good or bad, karma is coming for ya'!");
		}
		else if (rnd == 3) {
			JOptionPane.showMessageDialog(null, "You will get good luck if you search up Fat Guy Eating Big Buger!");
		}
		else if (rnd == 4) {
			JOptionPane.showMessageDialog(null, "Be a Good person. :)");
		}
	}
		
	
}
