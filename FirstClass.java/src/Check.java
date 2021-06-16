import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Check {

	 JFrame Checkframe;

	/**
	 * Launch the application.
	 */
	public static void Check() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Check window = new Check();
					window.Checkframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Check() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Checkframe = new JFrame();
		Checkframe.setUndecorated(true);
		Checkframe.getContentPane().setBackground(Color.PINK);
		Checkframe.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(16, 14, 835, 694);
		Checkframe.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("CheckOut");
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setFont(new Font("Noteworthy", Font.PLAIN, 63));
		lblNewLabel_1.setBounds(35, 6, 283, 106);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(Color.PINK);
		panel_1_2.setBounds(21, 113, 792, 561);
		panel.add(panel_1_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(6, 373, 823, 520);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu nw = new Menu();
				nw.Menuframe.setVisible(true);
				Checkframe.dispose();
			}
		});
		btnNewButton.setBounds(704, 26, 109, 57);
		panel.add(btnNewButton);
		btnNewButton.setForeground(Color.PINK);
		btnNewButton.setFont(new Font("Noteworthy", Font.PLAIN, 30));
		btnNewButton.setBackground(Color.WHITE);
		Checkframe.setBounds(100, 100, 869, 730);
		Checkframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
