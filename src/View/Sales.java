package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.SystemColor;
import net.miginfocom.swing.MigLayout;

public class Sales extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Sales() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 1922, 1082);
		setUndecorated(true);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Panel panelMenu = new Panel();
		panelMenu.setBounds(0, 0, 1920, 180);
		panelMenu.setBackground(new Color(102, 153, 255));
		contentPane.add(panelMenu);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(20, 650, 300, 410);
		contentPane.add(scrollPane_1);

		Panel panelGroup = new Panel();
		scrollPane_1.setViewportView(panelGroup);
		panelGroup.setLayout(new MigLayout("", "[145px]", "[150px]"));

		JPanel panel_3 = new JPanel();
		panelGroup.add(panel_3, "cell 0 0,grow");

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_2.setBounds(20, 200, 841, 430);
		contentPane.add(scrollPane_2);

		Panel panelSales = new Panel();
		scrollPane_2.setViewportView(panelSales);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(340, 650, 1560, 410);
		contentPane.add(scrollPane);

		JPanel panelItens = new JPanel();
		scrollPane.setViewportView(panelItens);
		panelItens.setLayout(new MigLayout("", "[300px]", "[190px]"));

		JPanel panelItem2 = new JPanel();
		panelItem2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelItem2.setMaximumSize(new Dimension(400, 400));
		panelItens.add(panelItem2, "cell 0 0,grow");
		panelItem2.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_1 = new JLabel("19,90", SwingConstants.CENTER);
		lblNewLabel_1.setBackground(SystemColor.textHighlight);
		panelItem2.add(lblNewLabel_1, BorderLayout.SOUTH);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));

		JLabel lblNewLabel = new JLabel("<html>Pizza Grande<br/>Pepperoni</html>", SwingConstants.CENTER);
		lblNewLabel.setBackground(SystemColor.activeCaption);
		panelItem2.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
	}
}
