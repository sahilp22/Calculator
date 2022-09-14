import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class calc extends JFrame {

	private JPanel contentPane;
//	private JTextField textField;
	
	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc frame = new calc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calc() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton button_3 = new JButton("\u00F7");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				operations = "/";
			}
		});
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(10, 5, 5, 5);
		//gbc_textField_1
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 45;
		gbc_textField_1.gridy = 35;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(55);
		
		JButton btnM = new JButton("M+");
		GridBagConstraints gbc_btnM = new GridBagConstraints();
		gbc_btnM.insets = new Insets(0, 0, 5, 0);
		gbc_btnM.gridx = 45;
		gbc_btnM.gridy = 39;
		contentPane.add(btnM, gbc_btnM);
		
		JButton btnMs = new JButton("MS");
		GridBagConstraints gbc_btnMs = new GridBagConstraints();
		gbc_btnMs.insets = new Insets(0, 0, 5, 5);
		gbc_btnMs.gridx = 44;
		gbc_btnMs.gridy = 39;
		contentPane.add(btnMs, gbc_btnMs);
		
		JButton btnWord = new JButton("WORD");
		GridBagConstraints gbc_btnWord = new GridBagConstraints();
		gbc_btnWord.insets = new Insets(0, 0, 5, 5);
		gbc_btnWord.gridx = 42;
		gbc_btnWord.gridy = 39;
		contentPane.add(btnWord, gbc_btnWord);
		
		JButton btnPad = new JButton("Pad2");
		GridBagConstraints gbc_btnPad = new GridBagConstraints();
		gbc_btnPad.insets = new Insets(0, 0, 5, 5);
		gbc_btnPad.gridx = 41;
		gbc_btnPad.gridy = 39;
		contentPane.add(btnPad, gbc_btnPad);
		
		JButton btnHex = new JButton("HEX");
		GridBagConstraints gbc_btnHex = new GridBagConstraints();
		gbc_btnHex.insets = new Insets(0, 0, 5, 5);
		gbc_btnHex.gridx = 40;
		gbc_btnHex.gridy = 35;
		contentPane.add(btnHex, gbc_btnHex);
		
		JButton btnDec = new JButton("DEC");
		GridBagConstraints gbc_btnDec = new GridBagConstraints();
		gbc_btnDec.insets = new Insets(0, 0, 5, 5);
		gbc_btnDec.gridx = 40;
		gbc_btnDec.gridy = 36;
		contentPane.add(btnDec, gbc_btnDec);
		
		JButton btnOct = new JButton("OCT");
		GridBagConstraints gbc_btnOct = new GridBagConstraints();
		gbc_btnOct.insets = new Insets(0, 0, 5, 5);
		gbc_btnOct.gridx = 40;
		gbc_btnOct.gridy = 37;
		contentPane.add(btnOct, gbc_btnOct);
		
		JButton btnBin = new JButton("BIN");
		GridBagConstraints gbc_btnBin = new GridBagConstraints();
		gbc_btnBin.insets = new Insets(0, 0, 5, 5);
		gbc_btnBin.gridx = 40;
		gbc_btnBin.gridy = 38;
		contentPane.add(btnBin, gbc_btnBin);
		
		JButton btnKeyPad = new JButton("Pad");
		GridBagConstraints gbc_btnKeyPad = new GridBagConstraints();
		gbc_btnKeyPad.insets = new Insets(0, 0, 5, 5);
		gbc_btnKeyPad.gridx = 40;
		gbc_btnKeyPad.gridy = 39;
		contentPane.add(btnKeyPad, gbc_btnKeyPad);
		
		JButton btnLsh = new JButton("Lsh");
		GridBagConstraints gbc_btnLsh = new GridBagConstraints();
		gbc_btnLsh.insets = new Insets(0, 0, 5, 5);
		gbc_btnLsh.gridx = 40;
		gbc_btnLsh.gridy = 40;
		contentPane.add(btnLsh, gbc_btnLsh);
		
		JButton btnRsh = new JButton("Rsh");
		GridBagConstraints gbc_btnRsh = new GridBagConstraints();
		gbc_btnRsh.insets = new Insets(0, 0, 5, 5);
		gbc_btnRsh.gridx = 41;
		gbc_btnRsh.gridy = 40;
		contentPane.add(btnRsh, gbc_btnRsh);
		
		JButton btnOr = new JButton("Or");
		GridBagConstraints gbc_btnOr = new GridBagConstraints();
		gbc_btnOr.insets = new Insets(0, 0, 5, 5);
		gbc_btnOr.gridx = 42;
		gbc_btnOr.gridy = 40;
		contentPane.add(btnOr, gbc_btnOr);
		
		JButton btnXor = new JButton("Xor");
		GridBagConstraints gbc_btnXor = new GridBagConstraints();
		gbc_btnXor.insets = new Insets(0, 0, 5, 5);
		gbc_btnXor.gridx = 43;
		gbc_btnXor.gridy = 40;
		contentPane.add(btnXor, gbc_btnXor);
		
		JButton btnNot = new JButton("Not");
		GridBagConstraints gbc_btnNot = new GridBagConstraints();
		gbc_btnNot.insets = new Insets(0, 0, 5, 5);
		gbc_btnNot.gridx = 44;
		gbc_btnNot.gridy = 40;
		contentPane.add(btnNot, gbc_btnNot);
		
		JButton btnAnd = new JButton("And");
		GridBagConstraints gbc_btnAnd = new GridBagConstraints();
		gbc_btnAnd.insets = new Insets(0, 0, 5, 0);
		gbc_btnAnd.gridx = 45;
		gbc_btnAnd.gridy = 40;
		contentPane.add(btnAnd, gbc_btnAnd);
		
		JButton btnArrow = new JButton("\u2191");
		GridBagConstraints gbc_btnArrow = new GridBagConstraints();
		gbc_btnArrow.insets = new Insets(0, 0, 5, 5);
		gbc_btnArrow.gridx = 40;
		gbc_btnArrow.gridy = 41;
		contentPane.add(btnArrow, gbc_btnArrow);
		
		JButton btnMod = new JButton("Mod");
		GridBagConstraints gbc_btnMod = new GridBagConstraints();
		gbc_btnMod.insets = new Insets(0, 0, 5, 5);
		gbc_btnMod.gridx = 41;
		gbc_btnMod.gridy = 41;
		contentPane.add(btnMod, gbc_btnMod);
		
		JButton btnCe = new JButton("CE");
		GridBagConstraints gbc_btnCe = new GridBagConstraints();
		gbc_btnCe.insets = new Insets(0, 0, 5, 5);
		gbc_btnCe.gridx = 42;
		gbc_btnCe.gridy = 41;
		contentPane.add(btnCe, gbc_btnCe);
		
		JButton btnC = new JButton("C");
		GridBagConstraints gbc_btnC = new GridBagConstraints();
		gbc_btnC.insets = new Insets(0, 0, 5, 5);
		gbc_btnC.gridx = 43;
		gbc_btnC.gridy = 41;
		contentPane.add(btnC, gbc_btnC);
		
		JButton btnBack = new JButton("\u232B");
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack.gridx = 44;
		gbc_btnBack.gridy = 41;
		contentPane.add(btnBack, gbc_btnBack);
		
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 0);
		gbc_button_3.gridx = 45;
		gbc_button_3.gridy = 41;
		contentPane.add(button_3, gbc_button_3);
		
		JButton button_18 = new JButton("7");
		GridBagConstraints gbc_button_18 = new GridBagConstraints();
		gbc_button_18.insets = new Insets(0, 0, 5, 5);
		gbc_button_18.gridx = 42;
		gbc_button_18.gridy = 42;
		contentPane.add(button_18, gbc_button_18);
		
		JButton btnA = new JButton("A");
		GridBagConstraints gbc_btnA = new GridBagConstraints();
		gbc_btnA.insets = new Insets(0, 0, 5, 5);
		gbc_btnA.gridx = 40;
		gbc_btnA.gridy = 42;
		contentPane.add(btnA, gbc_btnA);
		
		JButton btnB = new JButton("B");
		GridBagConstraints gbc_btnB = new GridBagConstraints();
		gbc_btnB.insets = new Insets(0, 0, 5, 5);
		gbc_btnB.gridx = 41;
		gbc_btnB.gridy = 42;
		contentPane.add(btnB, gbc_btnB);
		
		JButton button_15 = new JButton("4");
		GridBagConstraints gbc_button_15 = new GridBagConstraints();
		gbc_button_15.insets = new Insets(0, 0, 5, 5);
		gbc_button_15.gridx = 42;
		gbc_button_15.gridy = 43;
		contentPane.add(button_15, gbc_button_15);
		
		JButton button_11 = new JButton("8");
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.insets = new Insets(0, 0, 5, 5);
		gbc_button_11.gridx = 43;
		gbc_button_11.gridy = 42;
		contentPane.add(button_11, gbc_button_11);
		
		JButton button_7 = new JButton("9");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 44;
		gbc_button_7.gridy = 42;
		contentPane.add(button_7, gbc_button_7);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				operations = "*";
			}
		});
		GridBagConstraints gbc_btnX = new GridBagConstraints();
		gbc_btnX.insets = new Insets(0, 0, 5, 0);
		gbc_btnX.gridx = 45;
		gbc_btnX.gridy = 42;
		contentPane.add(btnX, gbc_btnX);
		
		JButton btnC_1 = new JButton("C");
		GridBagConstraints gbc_btnC_1 = new GridBagConstraints();
		gbc_btnC_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnC_1.gridx = 40;
		gbc_btnC_1.gridy = 43;
		contentPane.add(btnC_1, gbc_btnC_1);
		
		JButton btnD = new JButton("D");
		GridBagConstraints gbc_btnD = new GridBagConstraints();
		gbc_btnD.insets = new Insets(0, 0, 5, 5);
		gbc_btnD.gridx = 41;
		gbc_btnD.gridy = 43;
		contentPane.add(btnD, gbc_btnD);
		
		JButton button_14 = new JButton("4");
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.insets = new Insets(0, 0, 5, 5);
		gbc_button_14.gridx = 42;
		gbc_button_14.gridy = 43;
		contentPane.add(button_14, gbc_button_14);
		
		JButton button_10 = new JButton("5");
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 43;
		gbc_button_10.gridy = 43;
		contentPane.add(button_10, gbc_button_10);
		
		JButton button_6 = new JButton("6");
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 44;
		gbc_button_6.gridy = 43;
		contentPane.add(button_6, gbc_button_6);
		
		JButton button_2 = new JButton("-");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				operations = "-";
			}
		});
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 0);
		gbc_button_2.gridx = 45;
		gbc_button_2.gridy = 43;
		contentPane.add(button_2, gbc_button_2);
		
		JButton btnE = new JButton("E");
		GridBagConstraints gbc_btnE = new GridBagConstraints();
		gbc_btnE.insets = new Insets(0, 0, 5, 5);
		gbc_btnE.gridx = 40;
		gbc_btnE.gridy = 44;
		contentPane.add(btnE, gbc_btnE);
		
		JButton btnF = new JButton("F");
		GridBagConstraints gbc_btnF = new GridBagConstraints();
		gbc_btnF.insets = new Insets(0, 0, 5, 5);
		gbc_btnF.gridx = 41;
		gbc_btnF.gridy = 44;
		contentPane.add(btnF, gbc_btnF);
		
		JButton button_13 = new JButton("1");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String enterNum = textField_1.getText() + button_13.getText();
			textField_1.setText(enterNum);
			}
		});
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.insets = new Insets(0, 0, 5, 5);
		gbc_button_13.gridx = 42;
		gbc_button_13.gridy = 44;
		contentPane.add(button_13, gbc_button_13);
		
		JButton button_9 = new JButton("2");
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 43;
		gbc_button_9.gridy = 44;
		contentPane.add(button_9, gbc_button_9);
		
		JButton button_5 = new JButton("3");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 44;
		gbc_button_5.gridy = 44;
		contentPane.add(button_5, gbc_button_5);
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				operations = "+";
			}
		});
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 0);
		gbc_button_1.gridx = 45;
		gbc_button_1.gridy = 44;
		contentPane.add(button_1, gbc_button_1);
		
		JButton button_17 = new JButton("(");
		GridBagConstraints gbc_button_17 = new GridBagConstraints();
		gbc_button_17.insets = new Insets(0, 0, 0, 5);
		gbc_button_17.gridx = 40;
		gbc_button_17.gridy = 45;
		contentPane.add(button_17, gbc_button_17);
		
		JButton button_16 = new JButton(")");
		GridBagConstraints gbc_button_16 = new GridBagConstraints();
		gbc_button_16.insets = new Insets(0, 0, 0, 5);
		gbc_button_16.gridx = 41;
		gbc_button_16.gridy = 45;
		contentPane.add(button_16, gbc_button_16);
		
		JButton button_12 = new JButton("+/-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField_1.getText()));
				ops = ops * (-1);
				textField_1.setText(String.valueOf(ops));
			}
		});
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.insets = new Insets(0, 0, 0, 5);
		gbc_button_12.gridx = 42;
		gbc_button_12.gridy = 45;
		contentPane.add(button_12, gbc_button_12);
		
		JButton button_8 = new JButton("0");
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.insets = new Insets(0, 0, 0, 5);
		gbc_button_8.gridx = 43;
		gbc_button_8.gridy = 45;
		contentPane.add(button_8, gbc_button_8);
		
		JButton button_4 = new JButton(".");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 0, 5);
		gbc_button_4.gridx = 44;
		gbc_button_4.gridy = 45;
		contentPane.add(button_4, gbc_button_4);
		
		JButton button = new JButton("=");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.gridx = 45;
		gbc_button.gridy = 45;
		contentPane.add(button, gbc_button);
	}

}
