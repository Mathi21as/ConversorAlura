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
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class MainWindow {

	private JFrame frame;
	private JPanel pane_conversion[] = {
			WelcomePane.pane(),
			CurrencyPane.pane(), 
			TemperaturePane.pane(), 
			LengthPane.pane(),
			MassPane.pane(),
			VolumePane.pane(),
			BytePane.pane()};
	private Integer paneVisible = 0;
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
		
		JPanel pane = new JPanel();
		pane.setBounds(0, 35, 796, 34);
		pane.setBackground(new Color(0,0,0,000));
		
		JButton btnCurrency = new JButton("Divisa");
		btnCurrency.setBounds(43, 2, 110, 26);
		btnCurrency.setForeground(Color.WHITE);
		btnCurrency.setBackground(new Color(0,0,0,250));
		btnCurrency.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pane_conversion[paneVisible].setVisible(false);
				pane_conversion[1].setVisible(true);
				paneVisible = 1;
			}
		});
		pane.setLayout(null);
		pane.add(btnCurrency);
		
		JButton btnTemperature = new JButton("Temperatura");
		btnTemperature.setBounds(163, 2, 110, 26);
		btnTemperature.setForeground(Color.WHITE);
		btnTemperature.setBackground(new Color(0,0,0,150));
		btnTemperature.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pane_conversion[paneVisible].setVisible(false);
				pane_conversion[2].setVisible(true);
				paneVisible = 2;
			}
		});
		pane.add(btnTemperature);
		
		JButton btnLength = new JButton("Longitud");
		btnLength.setBounds(283, 2, 110, 26);
		btnLength.setForeground(Color.WHITE);
		btnLength.setBackground(new Color(0,0,0,150));
		btnLength.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pane_conversion[paneVisible].setVisible(false);
				pane_conversion[3].setVisible(true);
				paneVisible = 3;
			}
		});
		pane.add(btnLength);
		
		JButton btnMass = new JButton("Masa");
		btnMass.setBounds(403, 2, 110, 26);
		btnMass.setForeground(Color.WHITE);
		btnMass.setBackground(new Color(0,0,0,150));
		btnMass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pane_conversion[paneVisible].setVisible(false);
				pane_conversion[4].setVisible(true);
				paneVisible = 4;
			}
		});
		pane.add(btnMass);
		
		JButton btnVolume = new JButton("Volumen");
		btnVolume.setBounds(523, 2, 110, 26);
		btnVolume.setForeground(Color.WHITE);
		btnVolume.setBackground(new Color(0,0,0,150));
		btnVolume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pane_conversion[paneVisible].setVisible(false);
				pane_conversion[5].setVisible(true);
				paneVisible = 5;
			}
		});
		pane.add(btnVolume);
		
		JButton btnByte = new JButton("Byte");
		btnByte.setBounds(643, 2, 110, 26);
		btnByte.setForeground(Color.WHITE);
		btnByte.setBackground(new Color(0,0,0,150));
		btnByte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pane_conversion[paneVisible].setVisible(false);
				pane_conversion[6].setVisible(true);
				paneVisible = 6;
			}
		});
		pane.add(btnByte);
		
		JPanel paneTop = new JPanel();
		paneTop.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xMouse = e.getX();
				yMouse = e.getY();
			}
		});
		paneTop.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				xDragged = e.getXOnScreen();
				yDragged = e.getYOnScreen();
				frame.setLocation(xDragged-xMouse, yDragged-yMouse);
			}
		});
		paneTop.setBackground(new Color(0, 0, 0));
		paneTop.setForeground(new Color(255, 255, 255));
		paneTop.setBounds(0, 0, 796, 24);
		paneTop.setLayout(null);
		
		JLabel lblWindowTitle = new JLabel("Conversor Alura");
		lblWindowTitle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWindowTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblWindowTitle.setBounds(28, 0, 111, 24);
		lblWindowTitle.setForeground(new Color(255, 255, 255));
		paneTop.add(lblWindowTitle);
		
		JButton btnClose = new JButton("");
		btnClose.setIcon(new ImageIcon(".\\resources\\images\\cross-item-list1.png"));
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.setBackground(new Color(255, 0, 0));
		btnClose.setForeground(new Color(255, 0, 0));
		btnClose.setBounds(766, 0, 30, 26);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		paneTop.add(btnClose);
		
		JLabel lblAluraIcon = new JLabel("");
		lblAluraIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblAluraIcon.setIcon(new ImageIcon(".\\resources\\images\\a1.png"));
		lblAluraIcon.setBounds(0, 0, 30, 24);
		paneTop.add(lblAluraIcon);
		
		JButton btnMinimize = new JButton("");
		btnMinimize.setVerticalAlignment(SwingConstants.BOTTOM);
		btnMinimize.setIcon(new ImageIcon(".\\resources\\images\\minimize-sign1.png"));
		btnMinimize.setForeground(Color.WHITE);
		btnMinimize.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMinimize.setBackground(Color.GRAY);
		btnMinimize.setBounds(736, 0, 30, 26);
		btnMinimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setExtendedState(1);
				
			}
		});
		paneTop.add(btnMinimize);
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(pane);
		frame.getContentPane().add(paneTop);
		frame.getContentPane().add(pane_conversion[0]);
		frame.getContentPane().add(pane_conversion[1]);
		frame.getContentPane().add(pane_conversion[2]);
		frame.getContentPane().add(pane_conversion[3]);
		frame.getContentPane().add(pane_conversion[4]);
		frame.getContentPane().add(pane_conversion[5]);
		frame.getContentPane().add(pane_conversion[6]);
		
	}
}
