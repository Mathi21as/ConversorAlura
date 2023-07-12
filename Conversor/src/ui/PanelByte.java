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

public class PanelByte {
	private static JPanel panel_byte = new JPanel();
	private static ConversionController conversionController = ConversionController.getInstance();
	private static Double result;
	
	public static JPanel panel() {
		panel_byte.setBounds(0,80,796,426);
		panel_byte.setLayout(null);
		panel_byte.setVisible(false);	
		
		JLabel lblTipoConversion = new JLabel("Byte");
		lblTipoConversion.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoConversion.setBounds(322, 95, 150, 40);
		lblTipoConversion.setBackground(Color.BLACK);
		lblTipoConversion.setForeground(Color.WHITE);
		lblTipoConversion.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel_byte.add(lblTipoConversion);
		
		JLabel lblConversorAlura = new JLabel("Conversor Alura");
		lblConversorAlura.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversorAlura.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblConversorAlura.setForeground(Color.WHITE);
		lblConversorAlura.setBounds(287, 11, 205, 27);
		panel_byte.add(lblConversorAlura);
		
		JTextField datoSalida;
		datoSalida = new JTextField();
		datoSalida.setHorizontalAlignment(SwingConstants.CENTER);
		datoSalida.setFont(new Font("Tahoma", Font.PLAIN, 15));
		datoSalida.setEditable(false);
		datoSalida.setColumns(10);
		datoSalida.setBounds(452, 223, 161, 27);
		datoSalida.setBackground(new Color(0,0,0,150));
		datoSalida.setForeground(Color.WHITE);
		panel_byte.add(datoSalida);
		
		JTextField datoEntrada;
		datoEntrada = new JTextField();
		datoEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		datoEntrada.setFont(new Font("Tahoma", Font.PLAIN, 15));
		datoEntrada.setColumns(10);
		datoEntrada.setBounds(175, 223, 161, 27);
		datoEntrada.setBackground(new Color(0,0,0,150));
		datoEntrada.setForeground(Color.WHITE);
		panel_byte.add(datoEntrada);
		
		JLabel lblArrowIco = new JLabel("");
		lblArrowIco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblArrowIco.setHorizontalAlignment(SwingConstants.CENTER);
		lblArrowIco.setIcon(new ImageIcon(".\\resources\\images\\image.png"));
		lblArrowIco.setBounds(337, 158, 114, 92);
		panel_byte.add(lblArrowIco);
		
		JComboBox<String> medidaEntrada = new JComboBox<String>();
		medidaEntrada.setBounds(175, 158, 161, 27);
		medidaEntrada.setForeground(Color.WHITE);
		medidaEntrada.setBackground(new Color(0,0,0,150));
		medidaEntrada.addItem("Byte");
		medidaEntrada.addItem("Kilobyte KB");
		medidaEntrada.addItem("Megabyte MB");
		medidaEntrada.addItem("Gigabyte GB");
		medidaEntrada.addItem("Terabyte TB");
		medidaEntrada.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_byte.add(medidaEntrada);
		
		JComboBox<String> medidaSalida = new JComboBox<String>();
		medidaSalida.setBounds(452, 158, 161, 27);
		medidaSalida.setForeground(Color.WHITE);
		medidaSalida.setBackground(new Color(0,0,0,150));
		medidaSalida.addItem("Byte");
		medidaSalida.addItem("Kilobyte KB");
		medidaSalida.addItem("Megabyte MB");
		medidaSalida.addItem("Gigabyte GB");
		medidaSalida.addItem("Terabyte TB");
		medidaSalida.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_byte.add(medidaSalida);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(337, 310, 114, 27);
		btnConvertir.setForeground(Color.WHITE);
		btnConvertir.setBackground(new Color(0,0,0,150));
		btnConvertir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = conversionController.sendInputToByteObject(
						medidaEntrada.getSelectedItem().toString(), 
						medidaSalida.getSelectedItem().toString(), 
						Double.valueOf(datoEntrada.getText()));
				datoSalida.setText(String.format("%.2f", result));
			}
		});
		panel_byte.add(btnConvertir);
		
		JLabel lblBackgroundImg = new JLabel("");
		lblBackgroundImg.setBounds(0, 0, 796, 426);
		lblBackgroundImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackgroundImg.setLabelFor(lblTipoConversion);
		lblBackgroundImg.setIcon(new ImageIcon(".\\resources\\images\\byte.png"));
		panel_byte.add(lblBackgroundImg);
		
		return panel_byte;
	}
}
