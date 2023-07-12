package ui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;


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
	private int xMouse, yMouse, xDragged, yDragged;

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
		frame.setBounds(0, 0, 796, 501);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0,0,0));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 35, 796, 34);
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
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xMouse = e.getX();
				yMouse = e.getY();
			}
		});
		panelSuperior.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				xDragged = e.getXOnScreen();
				yDragged = e.getYOnScreen();
				frame.setLocation(xDragged-xMouse, yDragged-yMouse);
			}
		});
		panelSuperior.setBackground(new Color(0, 0, 0));
		panelSuperior.setForeground(new Color(255, 255, 255));
		panelSuperior.setBounds(0, 0, 796, 24);
		panelSuperior.setLayout(null);
		
		JLabel lblTituloVentana = new JLabel("Conversor Alura");
		lblTituloVentana.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTituloVentana.setHorizontalAlignment(SwingConstants.LEFT);
		lblTituloVentana.setBounds(28, 0, 111, 24);
		lblTituloVentana.setForeground(new Color(255, 255, 255));
		panelSuperior.add(lblTituloVentana);
		
		JButton btnClose = new JButton("");
		btnClose.setIcon(new ImageIcon("C:\\Users\\0x00034a5d\\Downloads\\"
				+ "UI Conversor ALura\\cross-item-list1.png"));
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.setBackground(new Color(255, 0, 0));
		btnClose.setForeground(new Color(255, 0, 0));
		btnClose.setBounds(766, 0, 30, 26);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panelSuperior.add(btnClose);
		
		JLabel lblIconoAlura = new JLabel("");
		lblIconoAlura.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconoAlura.setIcon(new ImageIcon("C:\\Users\\0x00034a5d\\Downloads\\"
				+ "UI Conversor ALura\\a1.png"));
		lblIconoAlura.setBounds(0, 0, 30, 24);
		panelSuperior.add(lblIconoAlura);
		
		JButton btnMinimize = new JButton("");
		btnMinimize.setVerticalAlignment(SwingConstants.BOTTOM);
		btnMinimize.setIcon(new ImageIcon("C:\\Users\\0x00034a5d\\Downloads\\"
				+ "UI Conversor ALura\\minimize-sign1.png"));
		btnMinimize.setForeground(Color.WHITE);
		btnMinimize.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMinimize.setBackground(Color.GRAY);
		btnMinimize.setBounds(736, 0, 30, 26);
		btnMinimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setExtendedState(1);
				
			}
		});
		panelSuperior.add(btnMinimize);
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(panel);
		frame.getContentPane().add(panelSuperior);
		frame.getContentPane().add(panel_conversion[0]);
		frame.getContentPane().add(panel_conversion[1]);
		frame.getContentPane().add(panel_conversion[2]);
		frame.getContentPane().add(panel_conversion[3]);
		frame.getContentPane().add(panel_conversion[4]);
		frame.getContentPane().add(panel_conversion[5]);
	}
}
