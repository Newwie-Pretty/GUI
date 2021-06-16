import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Dessert {

	 JFrame Dessframe;

	/**
	 * Launch the application.
	 */
	public static void Dessert() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dessert window = new Dessert();
					window.Dessframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Dessert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dessframe = new JFrame();
		Dessframe.setUndecorated(true);
		Dessframe.getContentPane().setBackground(Color.PINK);
		Dessframe.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(17, 18, 835, 694);
		Dessframe.getContentPane().add(panel);
		
		JButton btnCart = new JButton("Cart");
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cart nw = new Cart();
				nw.frame.setVisible(true);
				Dessframe.dispose();
			}
		});
		btnCart.setForeground(Color.PINK);
		btnCart.setFont(new Font("Noteworthy", Font.PLAIN, 30));
		btnCart.setBackground(Color.WHITE);
		btnCart.setBounds(607, 631, 109, 57);
		panel.add(btnCart);
		
		JLabel lblNewLabel_1 = new JLabel("Desserts");
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setFont(new Font("Noteworthy", Font.PLAIN, 70));
		lblNewLabel_1.setBounds(34, 27, 369, 89);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu nw = new Menu();
				nw.Menuframe.setVisible(true);
			    Dessframe.dispose ();
				
			}
		});
		btnNewButton.setForeground(Color.PINK);
		btnNewButton.setFont(new Font("Noteworthy", Font.PLAIN, 30));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(720, 631, 109, 57);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/romyr/Downloads/miniGif_20210611102933.gif"));
		lblNewLabel.setBounds(6, 396, 823, 520);
		panel.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.PINK);
		panel_1_1.setBounds(34, 128, 236, 288);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("/Users/romyr/Downloads/PicsArt_06-15-12.23.29.jpg"));
		lblNewLabel_2_1.setBounds(6, 6, 224, 222);
		panel_1_1.add(lblNewLabel_2_1);
		
		JButton btnNewButton_1_2 = new JButton("Add to Cart");
		btnNewButton_1_2.setForeground(Color.PINK);
		btnNewButton_1_2.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_2.setBounds(6, 259, 117, 29);
		panel_1_1.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("White Chocolate Moose");
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
		panel_1_1_1.setBounds(282, 128, 236, 288);
		panel.add(panel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon("/Users/romyr/Downloads/PicsArt_06-15-12.23.57.jpg"));
		lblNewLabel_2_1_1.setBounds(6, 6, 224, 222);
		panel_1_1_1.add(lblNewLabel_2_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("Add to Cart");
		btnNewButton_1_2_1.setForeground(Color.PINK);
		btnNewButton_1_2_1.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_2_1.setBounds(6, 259, 117, 29);
		panel_1_1_1.add(btnNewButton_1_2_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Vanilla BB Cheese Cake");
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
		panel_1_1_2.setBounds(530, 128, 236, 288);
		panel.add(panel_1_1_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("");
		lblNewLabel_2_1_2.setIcon(new ImageIcon("/Users/romyr/Downloads/PicsArt_06-15-12.24.34.jpg"));
		lblNewLabel_2_1_2.setBounds(6, 6, 224, 222);
		panel_1_1_2.add(lblNewLabel_2_1_2);
		
		JButton btnNewButton_1_2_2 = new JButton("Add to Cart");
		btnNewButton_1_2_2.setForeground(Color.PINK);
		btnNewButton_1_2_2.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_2_2.setBounds(6, 259, 117, 29);
		panel_1_1_2.add(btnNewButton_1_2_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Frost Ravioli ");
		lblNewLabel_3_1_2.setForeground(Color.WHITE);
		lblNewLabel_3_1_2.setFont(new Font("Noteworthy", Font.BOLD, 20));
		lblNewLabel_3_1_2.setBounds(60, 229, 170, 29);
		panel_1_1_2.add(lblNewLabel_3_1_2);
		
		JButton btnNewButton_1_1_1_2 = new JButton("Description");
		btnNewButton_1_1_1_2.setForeground(Color.PINK);
		btnNewButton_1_1_1_2.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_1_1_2.setBounds(113, 259, 117, 29);
		panel_1_1_2.add(btnNewButton_1_1_1_2);
		Dessframe.setBackground(Color.PINK);
		Dessframe.setBounds(100, 100, 869, 730);
		Dessframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
