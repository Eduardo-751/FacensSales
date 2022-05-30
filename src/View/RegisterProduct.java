package View;

import java.awt.Color;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;

import DB.DAL;

import java.awt.SystemColor;

import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterProduct extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtDescription;
	private DAL connection = new DAL();

	/**
	 * Create the frame.
	 */
	public RegisterProduct() {
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setUndecorated(true);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);

		Panel panel = new Panel();
		panel.setBackground(new Color(51, 153, 255));
		panel.setBounds(0, 0, 500, 64);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblName = new JLabel("Nome:");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(50, 99, 39, 17);
		contentPane.add(lblName);

		txtName = new JTextField();
		txtName.setBounds(99, 97, 197, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);

		JLabel lblPrice = new JLabel("Pre\u00E7o:");
		lblPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrice.setBounds(355, 101, 46, 14);
		contentPane.add(lblPrice);

		JLabel lblCategory = new JLabel("Categoria");
		lblCategory.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategory.setBounds(33, 188, 56, 14);
		contentPane.add(lblCategory);

		JComboBox<?> cboxCategory = new JComboBox();
		cboxCategory.setModel(new DefaultComboBoxModel(new String[] {"Selecione a Categoria...", "Bebidas Alcoolicas", "Cafeteria", "Salgados", "Sobremesas", "Sucos e Outras Bebidas"}));
		cboxCategory.setBounds(99, 184, 185, 22);
		contentPane.add(cboxCategory);

		JLabel lblQtd = new JLabel("Qtd:");
		lblQtd.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQtd.setBounds(369, 188, 32, 14);
		contentPane.add(lblQtd);

		JLabel lblDescription = new JLabel("Descri\u00E7\u00E3o:");
		lblDescription.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescription.setBounds(33, 141, 56, 17);
		contentPane.add(lblDescription);

		txtDescription = new JTextField();
		txtDescription.setColumns(10);
		txtDescription.setBounds(99, 139, 368, 20);
		contentPane.add(txtDescription);
		
		JFormattedTextField txtPrice = new JFormattedTextField();
		txtPrice.setBounds(411, 97, 56, 20);
		contentPane.add(txtPrice);

		JFormattedTextField txtQtd = new JFormattedTextField();
		txtQtd.setBounds(411, 185, 56, 20);
		contentPane.add(txtQtd);
		
		JButton btbAdd = new JButton("Adicionar");
		btbAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cboxCategory.getSelectedIndex() != 0) {
					connection.getConnection();
					connection.insertSQL("INSERT INTO iten (itenName, itenDescription, itenCostValue, qtd, idCategory)"
										+ "VALUES ('" + txtName.getText() + "', '" + txtDescription.getText() + "', '" + txtPrice.getText() + "', '" + txtQtd.getText() + "', '" + cboxCategory.getSelectedIndex() + "')");
					connection.closeConnection(connection.getConn());
					dispose();
				}
				else
					JOptionPane.showMessageDialog(null, "Por favor, Selecione a Categoria!");
			}
		});
		btbAdd.setBounds(169, 239, 89, 23);
		contentPane.add(btbAdd);
		
		JButton btnCancel = new JButton("Cancelar");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(282, 239, 89, 23);
		contentPane.add(btnCancel);
	}
}
