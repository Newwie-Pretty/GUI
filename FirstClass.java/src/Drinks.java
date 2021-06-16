import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Drinks {

	 JFrame Drinksframe;

	/**
	 * Launch the application.
	 */
	public static void Drinks() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Drinks window = new Drinks();
					window.Drinksframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Drinks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Drinksframe = new JFrame();
		Drinksframe.setUndecorated(true);
		Drinksframe.setType(Type.UTILITY);
		Drinksframe.getContentPane().setBackground(Color.PINK);
		Drinksframe.setBounds(100, 100, 869, 730);
		Drinksframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Drinksframe.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(17, 16, 835, 694);
		Drinksframe.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu nw = new Menu();
				nw.Menuframe.setVisible(true);
			    Drinksframe.dispose ();
				
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
				Drinksframe.dispose();
			}
		});
		btnCart.setForeground(Color.PINK);
		btnCart.setFont(new Font("Noteworthy", Font.PLAIN, 30));
		btnCart.setBackground(Color.WHITE);
		btnCart.setBounds(607, 631, 109, 57);
		panel.add(btnCart);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/romyr/Downloads/miniGif_20210611102933.gif"));
		lblNewLabel.setBounds(6, 373, 823, 520);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(6, 138, 823, 467);
		panel.add(panel_1);
		
		JButton btnNewButton_1 = new JButton("Mango Shake");
		btnNewButton_1.setForeground(Color.PINK);
		btnNewButton_1.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1.setBounds(16, 38, 144, 38);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Shake:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Noteworthy", Font.BOLD, 27));
		lblNewLabel_3.setBounds(6, 6, 103, 29);
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton_1_1 = new JButton("Strawberry Shake");
		btnNewButton_1_1.setForeground(Color.PINK);
		btnNewButton_1_1.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(16, 76, 144, 38);
		panel_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Tea:");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Noteworthy", Font.BOLD, 27));
		lblNewLabel_3_1.setBounds(6, 126, 103, 29);
		panel_1.add(lblNewLabel_3_1);
		
		JButton btnNewButton_1_2 = new JButton("Regular Ice Tea");
		btnNewButton_1_2.setForeground(Color.PINK);
		btnNewButton_1_2.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_2.setBounds(16, 160, 144, 38);
		panel_1.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("Pitcher Ice Tea");
		btnNewButton_1_2_1.setForeground(Color.PINK);
		btnNewButton_1_2_1.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_2_1.setBounds(16, 199, 144, 38);
		panel_1.add(btnNewButton_1_2_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Local Wine:");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Noteworthy", Font.BOLD, 27));
		lblNewLabel_3_1_1.setBounds(6, 247, 154, 29);
		panel_1.add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_1_3 = new JButton("Chari Wine");
		btnNewButton_1_3.setForeground(Color.PINK);
		btnNewButton_1_3.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_3.setBounds(16, 283, 144, 38);
		panel_1.add(btnNewButton_1_3);
		
		JLabel lblNewLabel_3_2 = new JLabel("MilkTea:");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Noteworthy", Font.BOLD, 27));
		lblNewLabel_3_2.setBounds(212, 6, 103, 29);
		panel_1.add(lblNewLabel_3_2);
		
		JButton btnNewButton_1_4 = new JButton("Wintermelon MilkTea");
		btnNewButton_1_4.setForeground(Color.PINK);
		btnNewButton_1_4.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_4.setBounds(222, 38, 154, 38);
		panel_1.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_4_1 = new JButton("Red Velvet MilkTea");
		btnNewButton_1_4_1.setForeground(Color.PINK);
		btnNewButton_1_4_1.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_4_1.setBounds(222, 76, 154, 38);
		panel_1.add(btnNewButton_1_4_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Hot Drinks:");
		lblNewLabel_3_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_2_1.setFont(new Font("Noteworthy", Font.BOLD, 27));
		lblNewLabel_3_2_1.setBounds(212, 126, 144, 29);
		panel_1.add(lblNewLabel_3_2_1);
		
		JButton btnNewButton_1_5 = new JButton("Expresso");
		btnNewButton_1_5.setForeground(Color.PINK);
		btnNewButton_1_5.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_5.setBounds(222, 160, 144, 38);
		panel_1.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("Hot Tea");
		btnNewButton_1_6.setForeground(Color.PINK);
		btnNewButton_1_6.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_6.setBounds(222, 199, 144, 38);
		panel_1.add(btnNewButton_1_6);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Alcoholic:");
		lblNewLabel_3_2_2.setForeground(Color.WHITE);
		lblNewLabel_3_2_2.setFont(new Font("Noteworthy", Font.BOLD, 27));
		lblNewLabel_3_2_2.setBounds(412, 6, 163, 29);
		panel_1.add(lblNewLabel_3_2_2);
		
		JButton btnNewButton_1_7 = new JButton("San Miguel Light");
		btnNewButton_1_7.setForeground(Color.PINK);
		btnNewButton_1_7.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_7.setBounds(441, 38, 144, 38);
		panel_1.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_7_1 = new JButton("A Bucket of Beer");
		btnNewButton_1_7_1.setForeground(Color.PINK);
		btnNewButton_1_7_1.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_7_1.setBounds(441, 76, 144, 38);
		panel_1.add(btnNewButton_1_7_1);
		
		JLabel lblNewLabel_3_2_2_1 = new JLabel("Juice:");
		lblNewLabel_3_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_2_2_1.setFont(new Font("Noteworthy", Font.BOLD, 27));
		lblNewLabel_3_2_2_1.setBounds(412, 126, 163, 29);
		panel_1.add(lblNewLabel_3_2_2_1);
		
		JButton btnNewButton_1_7_2 = new JButton("Calamansi Juice");
		btnNewButton_1_7_2.setForeground(Color.PINK);
		btnNewButton_1_7_2.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_7_2.setBounds(441, 160, 144, 38);
		panel_1.add(btnNewButton_1_7_2);
		
		JButton btnNewButton_1_7_2_1 = new JButton("Pitcher Calamansi Juice");
		btnNewButton_1_7_2_1.setForeground(Color.PINK);
		btnNewButton_1_7_2_1.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_7_2_1.setBounds(441, 199, 172, 38);
		panel_1.add(btnNewButton_1_7_2_1);
		
		JLabel lblNewLabel_3_2_2_2 = new JLabel("SoftDrinks:");
		lblNewLabel_3_2_2_2.setForeground(Color.WHITE);
		lblNewLabel_3_2_2_2.setFont(new Font("Noteworthy", Font.BOLD, 27));
		lblNewLabel_3_2_2_2.setBounds(625, 6, 163, 29);
		panel_1.add(lblNewLabel_3_2_2_2);
		
		JButton btnNewButton_1_7_3 = new JButton("Coca-Cola");
		btnNewButton_1_7_3.setForeground(Color.PINK);
		btnNewButton_1_7_3.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_7_3.setBounds(649, 38, 144, 38);
		panel_1.add(btnNewButton_1_7_3);
		
		JButton btnNewButton_1_7_3_1 = new JButton("Sprite");
		btnNewButton_1_7_3_1.setForeground(Color.PINK);
		btnNewButton_1_7_3_1.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_7_3_1.setBounds(649, 76, 144, 38);
		panel_1.add(btnNewButton_1_7_3_1);
		
		JLabel lblNewLabel_1 = new JLabel("Beverages");
		lblNewLabel_1.setBounds(20, 16, 369, 120);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setFont(new Font("Noteworthy", Font.PLAIN, 70));
	}

}
