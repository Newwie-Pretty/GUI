import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Cource {

	 JFrame Courceframe;

	/**
	 * Launch the application.
	 */
	public static void Cource() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cource window = new Cource();
					window.Courceframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cource() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Courceframe = new JFrame();
		Courceframe.setUndecorated(true);
		Courceframe.setType(Type.POPUP);
		Courceframe.getContentPane().setBackground(Color.PINK);
		Courceframe.setBounds(100, 100, 869, 730);
		Courceframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Courceframe.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(17, 19, 835, 694);
		Courceframe.getContentPane().add(panel);
		
		JButton btnCart = new JButton("Cart");
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cart nw = new Cart();
				nw.frame.setVisible(true);
				Courceframe.dispose();
			}
		});
		btnCart.setForeground(Color.PINK);
		btnCart.setFont(new Font("Noteworthy", Font.PLAIN, 30));
		btnCart.setBackground(Color.WHITE);
		btnCart.setBounds(607, 631, 109, 57);
		panel.add(btnCart);
		
		JLabel lblNewLabel_1 = new JLabel("Main Course");
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setFont(new Font("Noteworthy", Font.PLAIN, 70));
		lblNewLabel_1.setBounds(34, 27, 369, 89);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setForeground(Color.PINK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu nw = new Menu();
				nw.Menuframe.setVisible(true);
				Courceframe.dispose ();
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Noteworthy", Font.PLAIN, 30));
		btnNewButton.setBounds(720, 631, 109, 57);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon("/Users/romyr/Downloads/miniGif_20210611102933.gif"));
		lblNewLabel.setBounds(6, 401, 823, 520);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		panel_1.setBounds(22, 128, 236, 288);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/romyr/Downloads/PicsArt_06-15-10.08.31.jpg"));
		lblNewLabel_2.setBounds(6, 6, 224, 222);
		panel_1.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Add to Cart");
		btnNewButton_1.setForeground(Color.PINK);
		btnNewButton_1.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1.setBounds(6, 259, 117, 29);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Beef Braised Wellington");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Noteworthy", Font.BOLD, 20));
		lblNewLabel_3.setBounds(16, 229, 214, 29);
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton_1_1 = new JButton("Description");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Made out of fillet "
						+ "steak coated with pâté and duxelles.",null, JOptionPane.PLAIN_MESSAGE, null);
			
			}
		});
		btnNewButton_1_1.setForeground(Color.PINK);
		btnNewButton_1_1.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(113, 259, 117, 29);
		panel_1.add(btnNewButton_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.PINK);
		panel_1_1.setBounds(288, 128, 236, 288);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("/Users/romyr/Downloads/PicsArt_06-15-10.09.29.jpg"));
		lblNewLabel_2_1.setBounds(6, 6, 224, 222);
		panel_1_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Chicken Cured Chicken");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Noteworthy", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(16, 229, 214, 29);
		panel_1_1.add(lblNewLabel_3_1);
		
		JButton btnNewButton_1_2 = new JButton("Add to Cart");
		btnNewButton_1_2.setForeground(Color.PINK);
		btnNewButton_1_2.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_2.setBounds(6, 259, 117, 29);
		panel_1_1.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_1 = new JButton("Description");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Stunning entrée stars boneless"
						+ " chicken breasts topped with a mushroom-onion ",null, JOptionPane.PLAIN_MESSAGE, null);
			}
		});
		btnNewButton_1_1_1.setForeground(Color.PINK);
		btnNewButton_1_1_1.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_1_1.setBounds(113, 259, 117, 29);
		panel_1_1.add(btnNewButton_1_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(Color.PINK);
		panel_1_2.setBounds(561, 128, 236, 288);
		panel.add(panel_1_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("New label");
		lblNewLabel_2_1_1.setIcon(new ImageIcon("/Users/romyr/Downloads/PicsArt_06-15-10.10.51.jpg"));
		lblNewLabel_2_1_1.setBounds(6, 6, 224, 222);
		panel_1_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("              Bicol Express");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("Noteworthy", Font.BOLD, 20));
		lblNewLabel_3_1_1.setBounds(16, 227, 214, 29);
		panel_1_2.add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("Add to Cart");
		btnNewButton_1_2_1.setForeground(Color.PINK);
		btnNewButton_1_2_1.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_2_1.setBounds(6, 259, 117, 29);
		panel_1_2.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Description");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Its a popular Filipino z"
						+ "dish which made in traditional Bicolano style.",null, JOptionPane.PLAIN_MESSAGE, null);
			}
		});
		btnNewButton_1_1_1_1.setForeground(Color.PINK);
		btnNewButton_1_1_1_1.setFont(new Font("Noteworthy", Font.BOLD, 15));
		btnNewButton_1_1_1_1.setBounds(113, 259, 117, 29);
		panel_1_2.add(btnNewButton_1_1_1_1);
	}
}
