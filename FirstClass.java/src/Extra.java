import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Extra {

	 JFrame Extraframe;

	/**
	 * Launch the application.
	 */
	public static void Extra() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Extra window = new Extra();
					window.Extraframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Extra() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Extraframe = new JFrame();
		Extraframe.setUndecorated(true);
		Extraframe.getContentPane().setBackground(Color.PINK);
		Extraframe.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(16, 19, 835, 694);
		Extraframe.getContentPane().add(panel);
		
		JButton btnCart = new JButton("Cart");
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cart nw = new Cart();
				nw.frame.setVisible(true);
				Extraframe.dispose();
			}
		});
		btnCart.setForeground(Color.PINK);
		btnCart.setFont(new Font("Noteworthy", Font.PLAIN, 30));
		btnCart.setBackground(Color.WHITE);
		btnCart.setBounds(607, 631, 109, 57);
		panel.add(btnCart);
		
		JLabel lblNewLabel_1 = new JLabel("Extra's");
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setFont(new Font("Noteworthy", Font.PLAIN, 70));
		lblNewLabel_1.setBounds(22, 6, 369, 89);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu nw = new Menu();
				nw.Menuframe.setVisible(true);
				Extraframe.disable();
			}
		});
		btnNewButton.setForeground(Color.PINK);
		btnNewButton.setFont(new Font("Noteworthy", Font.PLAIN, 30));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(720, 631, 109, 57);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/romyr/Downloads/miniGif_20210611102933.gif"));
		lblNewLabel.setBounds(6, 373, 823, 520);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(6, 97, 823, 467);
		panel.add(panel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Rice:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Noteworthy", Font.BOLD, 27));
		lblNewLabel_3.setBounds(16, 6, 135, 29);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_2 = new JLabel("Salad:");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Noteworthy", Font.BOLD, 27));
		lblNewLabel_3_2.setBounds(209, 6, 103, 29);
		panel_1.add(lblNewLabel_3_2);
		
		JButton btnNewButton_1_7_3 = new JButton("Rice");
		btnNewButton_1_7_3.setForeground(Color.PINK);
		btnNewButton_1_7_3.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_7_3.setBounds(16, 47, 94, 38);
		panel_1.add(btnNewButton_1_7_3);
		
		JButton btnNewButton_1_7_3_1 = new JButton("Rice Platter");
		btnNewButton_1_7_3_1.setForeground(Color.PINK);
		btnNewButton_1_7_3_1.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_7_3_1.setBounds(16, 84, 103, 38);
		panel_1.add(btnNewButton_1_7_3_1);
		
		JButton btnNewButton_1_7_3_1_1 = new JButton("Garlic Rice Platter");
		btnNewButton_1_7_3_1_1.setForeground(Color.PINK);
		btnNewButton_1_7_3_1_1.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_7_3_1_1.setBounds(16, 122, 135, 38);
		panel_1.add(btnNewButton_1_7_3_1_1);
		
		JButton btnNewButton_1_7_3_2 = new JButton("Rice");
		btnNewButton_1_7_3_2.setForeground(Color.PINK);
		btnNewButton_1_7_3_2.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_7_3_2.setBounds(209, 47, 103, 38);
		panel_1.add(btnNewButton_1_7_3_2);
		
		JButton btnNewButton_1_7_3_1_2 = new JButton("Rice Platter");
		btnNewButton_1_7_3_1_2.setForeground(Color.PINK);
		btnNewButton_1_7_3_1_2.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_7_3_1_2.setBounds(209, 84, 103, 38);
		panel_1.add(btnNewButton_1_7_3_1_2);
		Extraframe.setBounds(100, 100, 869, 730);
		Extraframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
