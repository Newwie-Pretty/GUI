import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App {

	 JFrame Appframe;

	/**
	 * Launch the application.
	 */
	public static void App() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.Appframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Appframe = new JFrame();
		Appframe.setUndecorated(true);
		Appframe.getContentPane().setBackground(Color.PINK);
		Appframe.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(16, 18, 835, 694);
		Appframe.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Appetizer");
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setFont(new Font("Noteworthy", Font.PLAIN, 70));
		lblNewLabel_1.setBounds(45, 27, 369, 89);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu nw = new Menu();
				nw.Menuframe.setVisible(true);
			    Appframe.dispose ();
				
			}
		});
		btnNewButton.setForeground(Color.PINK);
		btnNewButton.setFont(new Font("Noteworthy", Font.PLAIN, 30));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(720, 631, 109, 57);
		panel.add(btnNewButton);
		
		JButton btnCart = new JButton("Cart");
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cart nw = new Cart();
				nw.frame.setVisible(true);
				Appframe.dispose();
			}
		});
		btnCart.setForeground(Color.PINK);
		btnCart.setFont(new Font("Noteworthy", Font.PLAIN, 30));
		btnCart.setBackground(Color.WHITE);
		btnCart.setBounds(607, 631, 109, 57);
		panel.add(btnCart);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/romyr/Downloads/miniGif_20210611102933.gif"));
		lblNewLabel.setBounds(6, 406, 823, 520);
		panel.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.PINK);
		panel_1_1.setBounds(26, 128, 236, 288);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("/Users/romyr/Downloads/PicsArt_06-15-11.19.32.jpg"));
		lblNewLabel_2_1.setBounds(6, 6, 224, 222);
		panel_1_1.add(lblNewLabel_2_1);
		
		JButton btnNewButton_1_2 = new JButton("Add to Cart");
		btnNewButton_1_2.setForeground(Color.PINK);
		btnNewButton_1_2.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_2.setBounds(6, 259, 117, 29);
		panel_1_1.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Kropek Ravioli Tosted");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Noteworthy", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(16, 229, 214, 29);
		panel_1_1.add(lblNewLabel_3_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Description");
		btnNewButton_1_1_1.setForeground(Color.PINK);
		btnNewButton_1_1_1.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_1_1.setBounds(113, 259, 117, 29);
		panel_1_1.add(btnNewButton_1_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(Color.PINK);
		panel_1_1_1.setBounds(287, 128, 236, 288);
		panel.add(panel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon("/Users/romyr/Downloads/PicsArt_06-15-11.20.22.jpg"));
		lblNewLabel_2_1_1.setBounds(6, 6, 224, 222);
		panel_1_1_1.add(lblNewLabel_2_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("Add to Cart");
		btnNewButton_1_2_1.setForeground(Color.PINK);
		btnNewButton_1_2_1.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_2_1.setBounds(6, 259, 117, 29);
		panel_1_1_1.add(btnNewButton_1_2_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Morrocan Apple Ciders");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Noteworthy", Font.BOLD, 20));
		lblNewLabel_3_1_1.setBounds(16, 229, 214, 29);
		panel_1_1_1.add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Description");
		btnNewButton_1_1_1_1.setForeground(Color.PINK);
		btnNewButton_1_1_1_1.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_1_1_1.setBounds(113, 259, 117, 29);
		panel_1_1_1.add(btnNewButton_1_1_1_1);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBackground(Color.PINK);
		panel_1_1_2.setBounds(550, 128, 236, 288);
		panel.add(panel_1_1_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("");
		lblNewLabel_2_1_2.setIcon(new ImageIcon("/Users/romyr/Downloads/PicsArt_06-15-11.21.06.jpg"));
		lblNewLabel_2_1_2.setBounds(6, 6, 224, 222);
		panel_1_1_2.add(lblNewLabel_2_1_2);
		
		JButton btnNewButton_1_2_2 = new JButton("Add to Cart");
		btnNewButton_1_2_2.setForeground(Color.PINK);
		btnNewButton_1_2_2.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_2_2.setBounds(6, 259, 117, 29);
		panel_1_1_2.add(btnNewButton_1_2_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Tosted Sweet Anchovy");
		lblNewLabel_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_2.setFont(new Font("Noteworthy", Font.BOLD, 20));
		lblNewLabel_3_1_2.setBounds(16, 229, 214, 29);
		panel_1_1_2.add(lblNewLabel_3_1_2);
		
		JButton btnNewButton_1_1_1_2 = new JButton("Description");
		btnNewButton_1_1_1_2.setForeground(Color.PINK);
		btnNewButton_1_1_1_2.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_1_1_2.setBounds(113, 259, 117, 29);
		panel_1_1_2.add(btnNewButton_1_1_1_2);
		Appframe.setType(Type.UTILITY);
		Appframe.setBounds(100, 100, 869, 730);
		Appframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
