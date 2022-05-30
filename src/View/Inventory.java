package View;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.Main;

public class Inventory extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFrame registerProduct = null;

	/**
	 * Create the frame.
	 */
	public Inventory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(0, 0, 1920, 1080);
		setUndecorated(true);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(51, 153, 255));
		panel.setBounds(0, 0, 1920, 130);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblBack = new JLabel("");
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.frame.dispose();
			}
		});
		lblBack.setIcon(new ImageIcon(Menu.class.getResource("/Img/icons8-back-32.png")));
		lblBack.setBounds(49, 35, 42, 49);
		panel.add(lblBack);
		
		JLabel lblAdd = new JLabel("");
		lblAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				registerProduct = new RegisterProduct();
		        registerProduct.setLocationRelativeTo(null);
		        registerProduct.setVisible(true);
			}
		});
		lblAdd.setIcon(new ImageIcon(Inventory.class.getResource("/Img/Add.png")));
		lblAdd.setBounds(1800, 20, 96, 95);
		panel.add(lblAdd);
	}
}
