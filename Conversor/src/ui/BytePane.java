package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.ConversionController;

public class BytePane {
	private static JPanel pane_byte = new JPanel();
	private static ConversionController conversionController = ConversionController.getInstance();
	private static Double result;
	
	public static JPanel pane() {
		pane_byte.setBounds(0,80,796,426);
		pane_byte.setLayout(null);
		pane_byte.setVisible(false);	
		
		JLabel lblConversionType = new JLabel("Byte");
		lblConversionType.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversionType.setBounds(322, 95, 150, 40);
		lblConversionType.setBackground(Color.BLACK);
		lblConversionType.setForeground(Color.WHITE);
		lblConversionType.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pane_byte.add(lblConversionType);
		
		JLabel lblConversorAlura = new JLabel("Conversor Alura");
		lblConversorAlura.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversorAlura.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblConversorAlura.setForeground(Color.WHITE);
		lblConversorAlura.setBounds(287, 11, 205, 27);
		pane_byte.add(lblConversorAlura);
		
		JTextField outputData;
		outputData = new JTextField();
		outputData.setHorizontalAlignment(SwingConstants.CENTER);
		outputData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		outputData.setEditable(false);
		outputData.setColumns(10);
		outputData.setBounds(452, 223, 161, 27);
		outputData.setBackground(new Color(0,0,0,150));
		outputData.setForeground(Color.WHITE);
		pane_byte.add(outputData);
		
		JTextField inputData;
		inputData = new JTextField();
		inputData.setHorizontalAlignment(SwingConstants.CENTER);
		inputData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		inputData.setColumns(10);
		inputData.setBounds(175, 223, 161, 27);
		inputData.setBackground(new Color(0,0,0,150));
		inputData.setForeground(Color.WHITE);
		inputData.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();

			    boolean numeros = key >= 48 && key <= 57;
			        
			    if (!numeros)
			    {
			        e.consume();
			    }
			}
		});
		pane_byte.add(inputData);
		
		JLabel lblArrowIco = new JLabel("");
		lblArrowIco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblArrowIco.setHorizontalAlignment(SwingConstants.CENTER);
		lblArrowIco.setIcon(new ImageIcon("./resources/images/image.png"));
		lblArrowIco.setBounds(337, 158, 114, 92);
		pane_byte.add(lblArrowIco);
		
		JComboBox<String> inputMeasure = new JComboBox<String>();
		inputMeasure.setBounds(175, 158, 161, 27);
		inputMeasure.setForeground(Color.WHITE);
		inputMeasure.setBackground(new Color(0,0,0,150));
		inputMeasure.addItem("Byte");
		inputMeasure.addItem("Kilobyte KB");
		inputMeasure.addItem("Megabyte MB");
		inputMeasure.addItem("Gigabyte GB");
		inputMeasure.addItem("Terabyte TB");
		inputMeasure.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pane_byte.add(inputMeasure);
		
		JComboBox<String> outputMeasure = new JComboBox<String>();
		outputMeasure.setBounds(452, 158, 161, 27);
		outputMeasure.setForeground(Color.WHITE);
		outputMeasure.setBackground(new Color(0,0,0,150));
		outputMeasure.addItem("Byte");
		outputMeasure.addItem("Kilobyte KB");
		outputMeasure.addItem("Megabyte MB");
		outputMeasure.addItem("Gigabyte GB");
		outputMeasure.addItem("Terabyte TB");
		outputMeasure.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pane_byte.add(outputMeasure);
		
		JButton btnConvert = new JButton("Convertir");
		btnConvert.setBounds(337, 310, 114, 27);
		btnConvert.setForeground(Color.WHITE);
		btnConvert.setBackground(new Color(0,0,0,150));
		btnConvert.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = conversionController.sendInputToByteObject(
						inputMeasure.getSelectedItem().toString(), 
						outputMeasure.getSelectedItem().toString(), 
						Double.valueOf(inputData.getText()));
				outputData.setText(String.format("%.2f", result));
			}
		});
		pane_byte.add(btnConvert);
		
		JLabel lblBackgroundImg = new JLabel("");
		lblBackgroundImg.setBounds(0, 0, 796, 426);
		lblBackgroundImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackgroundImg.setLabelFor(lblConversionType);
		lblBackgroundImg.setIcon(new ImageIcon("./resources/images/byte.png"));
		pane_byte.add(lblBackgroundImg);
		
		return pane_byte;
	}
}
