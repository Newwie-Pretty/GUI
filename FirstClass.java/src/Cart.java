import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cart {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Cart() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cart window = new Cart();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cart() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 869, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(16, 16, 835, 694);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("My Cart!");
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setFont(new Font("Noteworthy", Font.PLAIN, 63));
		lblNewLabel_1.setBounds(35, 6, 236, 106);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(Color.PINK);
		panel_1_2.setBounds(21, 113, 792, 561);
		panel.add(panel_1_2);
		
		JButton btnCart = new JButton("Check Out");
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check nw = new Check();
				nw.Checkframe.setVisible(true);
				frame.dispose();
			}
		});
		btnCart.setBounds(505, 487, 154, 57);
		panel_1_2.add(btnCart);
		btnCart.setForeground(Color.PINK);
		btnCart.setFont(new Font("Noteworthy", Font.PLAIN, 30));
		btnCart.setBackground(Color.WHITE);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu nw = new Menu();
				nw.Menuframe.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(663, 487, 109, 57);
		panel_1_2.add(btnNewButton);
		btnNewButton.setForeground(Color.PINK);
		btnNewButton.setFont(new Font("Noteworthy", Font.PLAIN, 30));
		btnNewButton.setBackground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(6, 373, 823, 520);
		panel.add(lblNewLabel);
	}
}
