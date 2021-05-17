import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame extends JFrame implements Runnable {
	private JButton b;
	
	public MainFrame(String title) {
		super(title);
		setSize(600,400);
		b=new JButton("Przycisk");
		add(b);
		b.addActionListener(
			e->JOptionPane.showMessageDialog(null, "Kliknięto przycisk "+((JButton)e.getSource()).getText()));
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new MainFrame("Okno główne"));
	}

	@Override
	public void run() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
