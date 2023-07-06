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

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
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
			}
		});
		panel.setLayout(null);
		panel.add(btnDivisa);
		
		JButton btnTemperatura = new JButton("Temperatura");
		btnTemperatura.setBounds(163, 2, 110, 26);
		btnTemperatura.setForeground(Color.WHITE);
		btnTemperatura.setBackground(new Color(0,0,0,150));
		panel.add(btnTemperatura);
		
		JButton btnLongitud = new JButton("Longitud");
		btnLongitud.setBounds(283, 2, 110, 26);
		btnLongitud.setForeground(Color.WHITE);
		btnLongitud.setBackground(new Color(0,0,0,150));
		panel.add(btnLongitud);
		
		JButton btnMasa = new JButton("Masa");
		btnMasa.setBounds(403, 2, 110, 26);
		btnMasa.setForeground(Color.WHITE);
		btnMasa.setBackground(new Color(0,0,0,150));
		panel.add(btnMasa);
		
		JButton btnVolumen = new JButton("Volumen");
		btnVolumen.setBounds(523, 2, 110, 26);
		btnVolumen.setForeground(Color.WHITE);
		btnVolumen.setBackground(new Color(0,0,0,150));
		panel.add(btnVolumen);
		
		JButton btnByte = new JButton("Byte");
		btnByte.setBounds(643, 2, 110, 26);
		btnByte.setForeground(Color.WHITE);
		btnByte.setBackground(new Color(0,0,0,150));
		panel.add(btnByte);
		
		//Panel Divisa
		JPanel panel_divisa = new JPanel();
		panel_divisa.setLayout(null);
		panel_divisa.setVisible(true);
		
		JLabel lblTipoConversionDivisa = new JLabel("Divisa");
		lblTipoConversionDivisa.setHorizontalAlignment(SwingConstants.CENTER);
		Font f = new Font(lblTipoConversionDivisa.getFont().getFontName(), lblTipoConversionDivisa.getFont().getStyle(), 25);
		lblTipoConversionDivisa.setBounds(322, 95, 150, 40);
		lblTipoConversionDivisa.setBackground(Color.BLACK);
		lblTipoConversionDivisa.setForeground(Color.WHITE);
		lblTipoConversionDivisa.setFont(f);
		panel_divisa.add(lblTipoConversionDivisa);
		
		JLabel lblConversorAluraDivisa = new JLabel("Conversor Alura");
		lblConversorAluraDivisa.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversorAluraDivisa.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblConversorAluraDivisa.setForeground(Color.WHITE);
		lblConversorAluraDivisa.setBounds(287, 11, 205, 27);
		panel_divisa.add(lblConversorAluraDivisa);
		
		JTextField datoSalidaDivisa;
		datoSalidaDivisa = new JTextField();
		Font fLblIO = new Font(datoSalidaDivisa.getFont().getFontName(), datoSalidaDivisa.getFont().getStyle(), 16);
		datoSalidaDivisa.setHorizontalAlignment(SwingConstants.CENTER);
		datoSalidaDivisa.setFont(fLblIO);
		datoSalidaDivisa.setColumns(10);
		datoSalidaDivisa.setBounds(452, 223, 161, 27);
		datoSalidaDivisa.setBackground(new Color(0,0,0,150));
		datoSalidaDivisa.setForeground(Color.WHITE);
		panel_divisa.add(datoSalidaDivisa);
		
		JTextField datoEntradaDivisa;
		datoEntradaDivisa = new JTextField();
		datoEntradaDivisa.setHorizontalAlignment(SwingConstants.CENTER);
		datoEntradaDivisa.setFont(fLblIO);
		datoEntradaDivisa.setColumns(10);
		datoEntradaDivisa.setBounds(175, 223, 161, 27);
		datoEntradaDivisa.setBackground(new Color(0,0,0,150));
		datoEntradaDivisa.setForeground(Color.WHITE);
		panel_divisa.add(datoEntradaDivisa);
		
		JLabel lblArrowIco = new JLabel("");
		lblArrowIco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblArrowIco.setHorizontalAlignment(SwingConstants.CENTER);
		lblArrowIco.setIcon(new ImageIcon("C:\\Users\\0x00034a5d\\Downloads\\UI Conversor ALura\\131196-arrow-hd-image-free2.png"));
		lblArrowIco.setBounds(337, 158, 114, 92);
		panel_divisa.add(lblArrowIco);
		
		JButton btnConvertirDivisa = new JButton("Convertir");
		btnConvertirDivisa.setBounds(337, 310, 114, 27);
		btnConvertirDivisa.setForeground(Color.WHITE);
		btnConvertirDivisa.setBackground(new Color(0,0,0,150));
		btnConvertirDivisa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_divisa.add(btnConvertirDivisa);
		
		JComboBox medidaEntradaDivisa = new JComboBox();
		medidaEntradaDivisa.setBounds(175, 158, 161, 27);
		medidaEntradaDivisa.setForeground(Color.WHITE);
		medidaEntradaDivisa.setBackground(new Color(0,0,0,150));
		medidaEntradaDivisa.addItem("USD");
		medidaEntradaDivisa.addItem("ARS");
		medidaEntradaDivisa.addItem("YEN");
		medidaEntradaDivisa.addItem("WON");
		medidaEntradaDivisa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_divisa.add(medidaEntradaDivisa);
		
		JComboBox medidaSalidaDivisa = new JComboBox();
		medidaSalidaDivisa.setBounds(452, 158, 161, 27);
		medidaSalidaDivisa.setForeground(Color.WHITE);
		medidaSalidaDivisa.setBackground(new Color(0,0,0,150));
		medidaSalidaDivisa.addItem("USD");
		medidaSalidaDivisa.addItem("ARS");
		medidaSalidaDivisa.addItem("YEN");
		medidaSalidaDivisa.addItem("WON");
		medidaSalidaDivisa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_divisa.add(medidaSalidaDivisa);
		
		JLabel lblBackgroundImgDivisa = new JLabel("");
		lblBackgroundImgDivisa.setBounds(0, 0, 796, 426);
		lblBackgroundImgDivisa.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackgroundImgDivisa.setLabelFor(lblTipoConversionDivisa);
		lblBackgroundImgDivisa.setIcon(new ImageIcon("C:\\Users\\0x00034a5d\\Downloads\\"
				+ "UI Conversor ALura\\divisa.jpg"));
		panel_divisa.add(lblBackgroundImgDivisa);
		
		
		//Panel Temperatura
		
		JPanel panel_temperatura = new JPanel();
		panel_temperatura.setLayout(null);
		panel_temperatura.setVisible(false);	
		
		JLabel lblTipoConversionTemp = new JLabel("Temperatura");
		lblTipoConversionTemp.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoConversionTemp.setBounds(322, 95, 150, 40);
		lblTipoConversionTemp.setBackground(Color.BLACK);
		lblTipoConversionTemp.setForeground(Color.WHITE);
		lblTipoConversionTemp.setFont(f);
		panel_temperatura.add(lblTipoConversionTemp);
		
		JLabel lblConversorAluraTemp = new JLabel("Conversor Alura");
		lblConversorAluraTemp.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversorAluraTemp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblConversorAluraTemp.setForeground(Color.WHITE);
		lblConversorAluraTemp.setBounds(287, 11, 205, 27);
		panel_temperatura.add(lblConversorAluraTemp);
		
		JTextField datoSalidaTemp;
		datoSalidaTemp = new JTextField();
		datoSalidaTemp.setHorizontalAlignment(SwingConstants.CENTER);
		datoSalidaTemp.setFont(fLblIO);
		datoSalidaTemp.setColumns(10);
		datoSalidaTemp.setBounds(452, 223, 161, 27);
		datoSalidaTemp.setBackground(new Color(0,0,0,150));
		datoSalidaTemp.setForeground(Color.WHITE);
		panel_temperatura.add(datoSalidaTemp);
		
		JTextField datoEntradaTemp;
		datoEntradaTemp = new JTextField();
		datoEntradaTemp.setHorizontalAlignment(SwingConstants.CENTER);
		datoEntradaTemp.setFont(fLblIO);
		datoEntradaTemp.setColumns(10);
		datoEntradaTemp.setBounds(175, 223, 161, 27);
		datoEntradaTemp.setBackground(new Color(0,0,0,150));
		datoEntradaTemp.setForeground(Color.WHITE);
		panel_temperatura.add(datoEntradaTemp);
		
		JLabel lblArrowIcoTemp = new JLabel("");
		lblArrowIcoTemp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblArrowIcoTemp.setHorizontalAlignment(SwingConstants.CENTER);
		lblArrowIcoTemp.setIcon(new ImageIcon("C:\\Users\\0x00034a5d\\Downloads\\UI Conversor ALura\\131196-arrow-hd-image-free2.png"));
		lblArrowIcoTemp.setBounds(337, 158, 114, 92);
		panel_divisa.add(lblArrowIcoTemp);
		
		JButton btnConvertirTemp = new JButton("Convertir");
		btnConvertirTemp.setBounds(337, 310, 114, 27);
		btnConvertirTemp.setForeground(Color.WHITE);
		btnConvertirTemp.setBackground(new Color(0,0,0,150));
		btnConvertirTemp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_temperatura.add(btnConvertirTemp);
		
		JComboBox medidaEntradaTemp = new JComboBox();
		medidaEntradaTemp.setBounds(175, 158, 161, 27);
		medidaEntradaTemp.setForeground(Color.WHITE);
		medidaEntradaTemp.setBackground(new Color(0,0,0,150));
		medidaEntradaTemp.addItem("Celsius C");
		medidaEntradaTemp.addItem("Farenheit");
		medidaEntradaTemp.addItem("Kelvin");
		medidaEntradaTemp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_temperatura.add(medidaEntradaTemp);
		
		JComboBox medidaSalidaTemp = new JComboBox();
		medidaSalidaTemp.setBounds(452, 158, 161, 27);
		medidaSalidaTemp.setForeground(Color.WHITE);
		medidaSalidaTemp.setBackground(new Color(0,0,0,150));
		medidaSalidaTemp.addItem("Celsius C");
		medidaSalidaTemp.addItem("Farenheit");
		medidaSalidaTemp.addItem("Kelvin");
		medidaSalidaTemp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_temperatura.add(medidaSalidaTemp);
		
		JLabel lblBackgroundImgTemp = new JLabel("");
		lblBackgroundImgTemp.setBounds(0, 0, 796, 426);
		lblBackgroundImgTemp.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackgroundImgTemp.setLabelFor(lblTipoConversionTemp);
		lblBackgroundImgTemp.setIcon(new ImageIcon("C:\\Users\\0x00034a5d\\Downloads\\"
				+ "UI Conversor ALura\\"
				+ "primer-plano-termometro-que-muestra-temperatura-alta.jpg"));
		panel_temperatura.add(lblBackgroundImgTemp);
		
		//GridLayout
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 796, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_divisa, GroupLayout.PREFERRED_SIZE, 796, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel_temperatura, GroupLayout.PREFERRED_SIZE, 796, GroupLayout.PREFERRED_SIZE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(panel_divisa, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
					.addComponent(panel_temperatura, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE))
		);		
		frame.getContentPane().setLayout(groupLayout);
	}
}
