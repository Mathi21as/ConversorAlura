package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;


public class MainWindow {

	private JFrame frame;
	private JPanel panel_conversion[] = {
			PanelDivisa.panel(), 
			PanelTemperatura.panel(), 
			PanelLongitud.panel(),
			PanelMasa.panel(),
			PanelVolumen.panel(),
			PanelByte.panel()};
	private Integer panelVisible = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainWindow() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame("Conversor Alura");
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 814, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0,0,0,200));
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0,0,0,000));
		
		JButton btnDivisa = new JButton("Divisa");
		btnDivisa.setBounds(43, 2, 110, 26);
		btnDivisa.setForeground(Color.WHITE);
		btnDivisa.setBackground(new Color(0,0,0,250));
		btnDivisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_conversion[panelVisible].setVisible(false);
				panel_conversion[0].setVisible(true);
				panelVisible = 0;
			}
		});
		panel.setLayout(null);
		panel.add(btnDivisa);
		
		JButton btnTemperatura = new JButton("Temperatura");
		btnTemperatura.setBounds(163, 2, 110, 26);
		btnTemperatura.setForeground(Color.WHITE);
		btnTemperatura.setBackground(new Color(0,0,0,150));
		btnTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_conversion[panelVisible].setVisible(false);
				panel_conversion[1].setVisible(true);
				panelVisible = 1;
			}
		});
		panel.add(btnTemperatura);
		
		JButton btnLongitud = new JButton("Longitud");
		btnLongitud.setBounds(283, 2, 110, 26);
		btnLongitud.setForeground(Color.WHITE);
		btnLongitud.setBackground(new Color(0,0,0,150));
		btnLongitud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_conversion[panelVisible].setVisible(false);
				panel_conversion[2].setVisible(true);
				panelVisible = 2;
			}
		});
		panel.add(btnLongitud);
		
		JButton btnMasa = new JButton("Masa");
		btnMasa.setBounds(403, 2, 110, 26);
		btnMasa.setForeground(Color.WHITE);
		btnMasa.setBackground(new Color(0,0,0,150));
		btnMasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_conversion[panelVisible].setVisible(false);
				panel_conversion[3].setVisible(true);
				panelVisible = 3;
			}
		});
		panel.add(btnMasa);
		
		JButton btnVolumen = new JButton("Volumen");
		btnVolumen.setBounds(523, 2, 110, 26);
		btnVolumen.setForeground(Color.WHITE);
		btnVolumen.setBackground(new Color(0,0,0,150));
		btnVolumen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_conversion[panelVisible].setVisible(false);
				panel_conversion[4].setVisible(true);
				panelVisible = 4;
			}
		});
		panel.add(btnVolumen);
		
		JButton btnByte = new JButton("Byte");
		btnByte.setBounds(643, 2, 110, 26);
		btnByte.setForeground(Color.WHITE);
		btnByte.setBackground(new Color(0,0,0,150));
		btnByte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_conversion[panelVisible].setVisible(false);
				panel_conversion[5].setVisible(true);
				panelVisible = 5;
			}
		});
		panel.add(btnByte);
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 796, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_conversion[0], GroupLayout.PREFERRED_SIZE, 796, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_conversion[1], GroupLayout.PREFERRED_SIZE, 796, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_conversion[2], GroupLayout.PREFERRED_SIZE, 796, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_conversion[3], GroupLayout.PREFERRED_SIZE, 796, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_conversion[4], GroupLayout.PREFERRED_SIZE, 796, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_conversion[5], GroupLayout.PREFERRED_SIZE, 796, GroupLayout.PREFERRED_SIZE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(panel_conversion[0], GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
					.addComponent(panel_conversion[1], GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
					.addComponent(panel_conversion[2], GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
					.addComponent(panel_conversion[3], GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
					.addComponent(panel_conversion[4], GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
					.addComponent(panel_conversion[5], GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE))
		);		
		frame.getContentPane().setLayout(groupLayout);
	}
}
