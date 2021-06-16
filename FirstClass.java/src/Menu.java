import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	JFrame Menuframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.Menuframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Menuframe = new JFrame();
		Menuframe.getContentPane().setBackground(Color.PINK);
		Menuframe.setBackground(Color.PINK);
		Menuframe.setBounds(100, 100, 869, 730);
		Menuframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Menuframe.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(17, 17, 835, 670);
		Menuframe.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/romyr/Downloads/miniGif_20210611102933.gif"));
		lblNewLabel.setBounds(6, 258, 823, 520);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pink Print");
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setFont(new Font("Noteworthy", Font.PLAIN, 70));
		lblNewLabel_1.setBounds(284, 18, 331, 89);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ON-Resto!");
		lblNewLabel_1_1.setForeground(Color.PINK);
		lblNewLabel_1_1.setFont(new Font("Noteworthy", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(373, 81, 110, 69);
		panel.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cource nw = new Cource();
				nw.Courceframe.setVisible(true);
			    Menuframe.dispose ();
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("/Users/romyr/Downloads/miniGif_20210611112242.gif"));
		btnNewButton.setBounds(27, 137, 134, 83);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drinks nw = new Drinks();
				nw.Drinksframe.setVisible(true);
			    Menuframe.dispose ();
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("/Users/romyr/Downloads/miniGif_20210611112143.gif"));
		btnNewButton_1.setBounds(512, 137, 134, 83);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				App nw = new App();
				nw.Appframe.setVisible(true);
				Menuframe.disable();
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("/Users/romyr/Downloads/miniGif_20210611112313.gif"));
		btnNewButton_2.setBounds(204, 137, 134, 83);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dessert nw = new Dessert();
				nw.Dessframe.setVisible(true);
			    Menuframe.dispose ();
				
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("/Users/romyr/Downloads/miniGif_20210611112456.gif"));
		btnNewButton_3.setBounds(350, 137, 134, 83);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Extra nw = new Extra();
				nw.Extraframe.setVisible(true);
				Menuframe.disable();
			}
		});
		btnNewButton_3_1.setIcon(new ImageIcon("/Users/romyr/Downloads/Funny Gif.gif"));
		btnNewButton_3_1.setBounds(670, 137, 134, 83);
		panel.add(btnNewButton_3_1);
		
		JButton btnNewButton_4 = new JButton("My Cart");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cart nw = new Cart();
				nw.frame.setVisible(true);
				Menuframe.dispose();
			}
		});
		btnNewButton_4.setForeground(Color.PINK);
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setFont(new Font("Noteworthy", Font.BOLD, 13));
		btnNewButton_4.setBounds(306, 255, 85, 29);
		panel.add(btnNewButton_4);
		
		JLabel lblNewLabel_1_2 = new JLabel("Main Course");
		lblNewLabel_1_2.setForeground(Color.PINK);
		lblNewLabel_1_2.setFont(new Font("Noteworthy", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_2.setBounds(48, 218, 92, 29);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Appetizers");
		lblNewLabel_1_2_1.setForeground(Color.PINK);
		lblNewLabel_1_2_1.setFont(new Font("Noteworthy", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_2_1.setBounds(214, 218, 92, 29);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Desserts");
		lblNewLabel_1_2_1_1.setForeground(Color.PINK);
		lblNewLabel_1_2_1_1.setFont(new Font("Noteworthy", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_2_1_1.setBounds(391, 218, 92, 29);
		panel.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Beverages");
		lblNewLabel_1_2_1_1_1.setForeground(Color.PINK);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Noteworthy", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_2_1_1_1.setBounds(541, 218, 92, 29);
		panel.add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel("Extra's");
		lblNewLabel_1_2_1_1_1_1.setForeground(Color.PINK);
		lblNewLabel_1_2_1_1_1_1.setFont(new Font("Noteworthy", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_2_1_1_1_1.setBounds(702, 218, 70, 29);
		panel.add(lblNewLabel_1_2_1_1_1_1);
		
		JButton btnNewButton_4_1 = new JButton("My CheckOut");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Check nw = new Check();
				nw.Checkframe.setVisible(true);
				Menuframe.dispose();
			}
		});
		btnNewButton_4_1.setForeground(Color.PINK);
		btnNewButton_4_1.setFont(new Font("Noteworthy", Font.BOLD, 13));
		btnNewButton_4_1.setBackground(Color.WHITE);
		btnNewButton_4_1.setBounds(403, 256, 101, 29);
		panel.add(btnNewButton_4_1);
	}
}
