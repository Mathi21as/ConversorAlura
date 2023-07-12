package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.ConversionController;

public class PanelDivisa {
	private static ConversionController conversionController = ConversionController.getInstance();
	private static JPanel panel_divisa = new JPanel();
	private static Double result;
	
	public static JPanel panel() { 
		panel_divisa.setBounds(0,80,796,426);
		panel_divisa.setLayout(null);
		panel_divisa.setVisible(true);
		
		JLabel lblTipoConversion = new JLabel("Divisa");
		lblTipoConversion.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoConversion.setBounds(322, 95, 150, 40);
		lblTipoConversion.setBackground(Color.BLACK);
		lblTipoConversion.setForeground(Color.WHITE);
		lblTipoConversion.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_divisa.add(lblTipoConversion);
		
		JLabel lblConversorAlura = new JLabel("Conversor Alura");
		lblConversorAlura.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversorAlura.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblConversorAlura.setForeground(Color.WHITE);
		lblConversorAlura.setBounds(287, 11, 205, 27);
		panel_divisa.add(lblConversorAlura);
		
		JTextField datoSalida;
		datoSalida = new JTextField();
		datoSalida.setHorizontalAlignment(SwingConstants.CENTER);
		datoSalida.setFont(new Font("Tahoma", Font.PLAIN, 15));
		datoSalida.setEditable(false);
		datoSalida.setColumns(10);
		datoSalida.setBounds(452, 223, 161, 27);
		datoSalida.setBackground(new Color(0,0,0,150));
		datoSalida.setForeground(Color.WHITE);
		panel_divisa.add(datoSalida);
		
		JTextField datoEntrada;
		datoEntrada = new JTextField();
		datoEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		datoEntrada.setFont(new Font("Tahoma", Font.PLAIN, 15));
		datoEntrada.setColumns(10);
		datoEntrada.setBounds(175, 223, 161, 27);
		datoEntrada.setBackground(new Color(0,0,0,150));
		datoEntrada.setForeground(Color.WHITE);
		panel_divisa.add(datoEntrada);
		
		JLabel lblArrowIco = new JLabel("");
		lblArrowIco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblArrowIco.setHorizontalAlignment(SwingConstants.CENTER);
		lblArrowIco.setIcon(new ImageIcon(".\\resources\\images\\image.png"));
		lblArrowIco.setBounds(337, 158, 114, 92);
		panel_divisa.add(lblArrowIco);
		
		JComboBox<String> medidaEntrada = new JComboBox<String>();
		medidaEntrada.setBounds(175, 158, 161, 27);
		medidaEntrada.setForeground(Color.WHITE);
		medidaEntrada.setBackground(new Color(0,0,0,150));
		medidaEntrada.addItem("Dolar USD");
		medidaEntrada.addItem("Euro EUR");
		medidaEntrada.addItem("Peso Argentino ARS");
		medidaEntrada.addItem("Libra Esterlina GBP");
		medidaEntrada.addItem("Yen Japones JPY");
		medidaEntrada.addItem("Won Coreano KRW");
		medidaEntrada.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_divisa.add(medidaEntrada);
		
		JComboBox<String> medidaSalida = new JComboBox<String>();
		medidaSalida.setBounds(452, 158, 161, 27);
		medidaSalida.setForeground(Color.WHITE);
		medidaSalida.setBackground(new Color(0,0,0,150));
		medidaSalida.addItem("Dolar USD");
		medidaSalida.addItem("Euro EUR");
		medidaSalida.addItem("Peso Argentino ARS");
		medidaSalida.addItem("Libra Esterlina GBP");
		medidaSalida.addItem("Yen Japones JPY");
		medidaSalida.addItem("Won Coreano KRW");
		medidaSalida.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_divisa.add(medidaSalida);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(337, 310, 114, 27);
		btnConvertir.setForeground(Color.WHITE);
		btnConvertir.setBackground(new Color(0,0,0,150));
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = conversionController.sendInputToDivisaObject(
						medidaEntrada.getSelectedItem().toString(), 
						medidaSalida.getSelectedItem().toString(), 
						Double.valueOf(datoEntrada.getText()));
				datoSalida.setText(String.format("%.2f", result));
			}
		});
		btnConvertir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_divisa.add(btnConvertir);
		
		JLabel lblBackgroundImg = new JLabel("");
		lblBackgroundImg.setBounds(0, 0, 796, 426);
		lblBackgroundImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackgroundImg.setLabelFor(lblTipoConversion);
		lblBackgroundImg.setIcon(new ImageIcon(".\\resources\\images\\divisa.png"));
		panel_divisa.add(lblBackgroundImg);
		
		return panel_divisa;
	}
	
}
