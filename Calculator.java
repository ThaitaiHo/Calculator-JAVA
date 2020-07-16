package Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.SystemColor;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double FirstNum;
	double SecondNum;
	double Result;
	String Symbols;
	String Answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(112, 128, 144));
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.setBounds(100, 100, 461, 445);
		frame.setTitle("Calculator");
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setBounds(10, 11, 425, 72);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton Button7 = new JButton("7");
		Button7.setBackground(new Color(112, 128, 144));
		Button7.setForeground(Color.WHITE);
		Button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + Button7.getText();
				textField.setText(EnterNumber);
			}
		});
		Button7.setFont(new Font("Tahoma", Font.BOLD, 18));
		Button7.setBounds(93, 157, 52, 52);
		frame.getContentPane().add(Button7);
		
		JButton Button8 = new JButton("8");
		Button8.setBackground(new Color(112, 128, 144));
		Button8.setForeground(Color.WHITE);
		Button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + Button8.getText();
				textField.setText(EnterNumber);
			}
		});
		Button8.setFont(new Font("Tahoma", Font.BOLD, 18));
		Button8.setBounds(155, 157, 52, 52);
		frame.getContentPane().add(Button8);
		
		JButton Button9 = new JButton("9");
		Button9.setBackground(new Color(112, 128, 144));
		Button9.setForeground(Color.WHITE);
		Button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + Button9.getText();
				textField.setText(EnterNumber);
			}
		});
		Button9.setFont(new Font("Tahoma", Font.BOLD, 18));
		Button9.setBounds(217, 157, 52, 52);
		frame.getContentPane().add(Button9);
		
		JButton Button4 = new JButton("4");
		Button4.setBackground(new Color(112, 128, 144));
		Button4.setForeground(Color.WHITE);
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + Button4.getText();
				textField.setText(EnterNumber);
			}
		});
		Button4.setFont(new Font("Tahoma", Font.BOLD, 18));
		Button4.setBounds(93, 220, 52, 52);
		frame.getContentPane().add(Button4);
		
		JButton Button5 = new JButton("5");
		Button5.setBackground(new Color(112, 128, 144));
		Button5.setForeground(Color.WHITE);
		Button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + Button5.getText();
				textField.setText(EnterNumber);
			}
		});
		Button5.setFont(new Font("Tahoma", Font.BOLD, 18));
		Button5.setBounds(155, 220, 52, 52);
		frame.getContentPane().add(Button5);
		
		JButton Button6 = new JButton("6");
		Button6.setBackground(new Color(112, 128, 144));
		Button6.setForeground(Color.WHITE);
		Button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + Button6.getText();
				textField.setText(EnterNumber);
			}
		});
		Button6.setFont(new Font("Tahoma", Font.BOLD, 18));
		Button6.setBounds(217, 220, 52, 52);
		frame.getContentPane().add(Button6);
		
		JButton Button1 = new JButton("1");
		Button1.setBackground(new Color(112, 128, 144));
		Button1.setForeground(Color.WHITE);
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + Button1.getText();
				textField.setText(EnterNumber);
			}
		});
		Button1.setFont(new Font("Tahoma", Font.BOLD, 18));
		Button1.setBounds(93, 283, 52, 52);
		frame.getContentPane().add(Button1);
		
		JButton Button2 = new JButton("2");
		Button2.setBackground(new Color(112, 128, 144));
		Button2.setForeground(Color.WHITE);
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + Button2.getText();
				textField.setText(EnterNumber);
			}
		});
		Button2.setFont(new Font("Tahoma", Font.BOLD, 18));
		Button2.setBounds(155, 283, 52, 52);
		frame.getContentPane().add(Button2);
		
		JButton Button3 = new JButton("3");
		Button3.setBackground(new Color(112, 128, 144));
		Button3.setForeground(Color.WHITE);
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + Button3.getText();
				textField.setText(EnterNumber);
			}
		});
		Button3.setFont(new Font("Tahoma", Font.BOLD, 18));
		Button3.setBounds(217, 283, 52, 52);
		frame.getContentPane().add(Button3);
		
		JButton Button0 = new JButton("0");
		Button0.setBackground(new Color(112, 128, 144));
		Button0.setForeground(Color.WHITE);
		Button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + Button0.getText();
				textField.setText(EnterNumber);
			}
		});
		Button0.setFont(new Font("Tahoma", Font.BOLD, 18));
		Button0.setBounds(155, 346, 52, 52);
		frame.getContentPane().add(Button0);
		
		JButton NegativeButton = new JButton("\u00B1");
		NegativeButton.setBackground(new Color(112, 128, 144));
		NegativeButton.setForeground(Color.WHITE);
		NegativeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		NegativeButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		NegativeButton.setBounds(93, 346, 52, 52);
		frame.getContentPane().add(NegativeButton);
		
		
		JButton DotButton = new JButton(".");
		DotButton.setBackground(new Color(112, 128, 144));
		DotButton.setForeground(Color.WHITE);
		DotButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + DotButton.getText();
				textField.setText(EnterNumber);
			}
		});
		DotButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		DotButton.setBounds(217, 346, 52, 52);
		frame.getContentPane().add(DotButton);
		
		JButton DelButton = new JButton("DE");
		DelButton.setBackground(new Color(255, 165, 0));
		DelButton.setForeground(new Color(255, 255, 255));
		DelButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		DelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Del = null;
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					Del = strB.toString();
					textField.setText(Del);
				}
			}
		});
		DelButton.setBounds(93, 94, 52, 52);
		frame.getContentPane().add(DelButton);
		
		JButton ACButton = new JButton("AC");
		ACButton.setBackground(new Color(255, 165, 0));
		ACButton.setForeground(new Color(255, 255, 255));
		ACButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		ACButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		ACButton.setBounds(155, 94, 52, 52);
		frame.getContentPane().add(ACButton);
		
		JButton PercentButton = new JButton("%");
		PercentButton.setBackground(new Color(255, 165, 0));
		PercentButton.setForeground(new Color(255, 255, 255));
		PercentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = (ops* 0.1);
				textField.setText(String.valueOf(ops));
			}
		});
		PercentButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		PercentButton.setBounds(217, 94, 52, 52);
		frame.getContentPane().add(PercentButton);
		
		JButton DivButton = new JButton("/");
		DivButton.setBackground(new Color(255, 165, 0));
		DivButton.setForeground(new Color(255, 255, 255));
		DivButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				Symbols = "/";
			}
		});
		DivButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		DivButton.setBounds(279, 157, 73, 52);
		frame.getContentPane().add(DivButton);
		
		JButton MultButton = new JButton("*");
		MultButton.setBackground(new Color(255, 165, 0));
		MultButton.setForeground(Color.WHITE);
		MultButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				Symbols = "*";
			}
		});
		MultButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		MultButton.setBounds(279, 220, 73, 52);
		frame.getContentPane().add(MultButton);
		
		JButton SubButton = new JButton("-");
		SubButton.setBackground(new Color(255, 165, 0));
		SubButton.setForeground(Color.WHITE);
		SubButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				Symbols = "-";
			}
		});
		SubButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		SubButton.setBounds(279, 283, 73, 52);
		frame.getContentPane().add(SubButton);
		
		JButton AddButton = new JButton("+");
		AddButton.setBackground(new Color(255, 165, 0));
		AddButton.setForeground(Color.WHITE);
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				Symbols = "+";
			}
		});
		AddButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		AddButton.setBounds(279, 346, 73, 52);
		frame.getContentPane().add(AddButton);
		
		JButton ResultButton = new JButton("=");
		ResultButton.setBackground(new Color(255, 165, 0));
		ResultButton.setForeground(Color.WHITE);
		ResultButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Answer;
				int Res;
				SecondNum = Double.parseDouble(textField.getText());
				if(Symbols == "+")
				{
					Result = FirstNum + SecondNum;
					Answer = String.format("%.2f", Result);
					textField.setText(Answer);
				}
				else if(Symbols == "-")
				{
					Result = FirstNum - SecondNum;
					Answer = String.format("%.2f", Result);
					textField.setText(Answer);
				}
				else if(Symbols == "*")
				{
					Result = FirstNum * SecondNum;
					Answer = String.format("%.2f", Result);
					textField.setText(Answer);
				}
				else if(Symbols == "/")
				{
					Result = FirstNum / SecondNum;
					Answer = String.format("%.2f", Result);
					textField.setText(Answer);
				}
				else if(Symbols == "%")
				{
					Result = FirstNum * 0.1;
					Answer = String.format("%.2f", Result);
					textField.setText(Answer);
				}
				else if(Symbols == "Mod")
				{
					Res = (int)FirstNum % (int)SecondNum;
					Answer = String.format("%d", Res);
					textField.setText(Answer);
				}
			}
		});
		ResultButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		ResultButton.setBounds(362, 346, 73, 52);
		frame.getContentPane().add(ResultButton);
		
		JButton SquaredButton = new JButton("X^2");
		SquaredButton.setBackground(new Color(222, 184, 135));
		SquaredButton.setForeground(new Color(0, 0, 0));
		SquaredButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = (ops* ops);
				textField.setText(String.valueOf(ops));
			}
			
		});
		SquaredButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		SquaredButton.setBounds(279, 94, 73, 52);
		frame.getContentPane().add(SquaredButton);
		
		JButton ModButton = new JButton("Mod");
		ModButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				Symbols = "Mod";
			}
		});
		ModButton.setForeground(new Color(0, 0, 0));
		ModButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		ModButton.setBackground(new Color(222, 184, 135));
		ModButton.setBounds(362, 94, 73, 52);
		frame.getContentPane().add(ModButton);
		
		JButton BinButton = new JButton("Bin");
		BinButton.setBackground(new Color(222, 184, 135));
		BinButton.setForeground(new Color(0, 0, 0));
		BinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				textField.setText(Integer.toString(a, 2));
			}
		});
		BinButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		BinButton.setBounds(362, 157, 73, 52);
		frame.getContentPane().add(BinButton);
		
		JButton HexButton = new JButton("Hex");
		HexButton.setBackground(new Color(222, 184, 135));
		HexButton.setForeground(new Color(0, 0, 0));
		HexButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				textField.setText(Integer.toString(a, 16));
			}
		});
		HexButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		HexButton.setBounds(362, 220, 73, 52);
		frame.getContentPane().add(HexButton);
		
		JButton OctButton = new JButton("Oct");
		OctButton.setBackground(new Color(222, 184, 135));
		OctButton.setForeground(new Color(0, 0, 0));
		OctButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				textField.setText(Integer.toString(a, 8));
			}
		});
		OctButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		OctButton.setBounds(362, 283, 73, 52);
		frame.getContentPane().add(OctButton);
		
		JButton SqrtButton = new JButton("\u221A");
		SqrtButton.setBackground(new Color(255, 165, 0));
		SqrtButton.setForeground(new Color(255, 255, 255));
		SqrtButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					double ops = Double.parseDouble(String.valueOf(textField.getText()));
					ops = Math.sqrt(ops);
					textField.setText(String.valueOf(ops));
			}
		});
		SqrtButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		SqrtButton.setBounds(10, 94, 73, 52);
		frame.getContentPane().add(SqrtButton);
		
		JButton SinButton = new JButton("SIN");
		SinButton.setBackground(new Color(192, 192, 192));
		SinButton.setForeground(Color.BLACK);
		SinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				double radians = Math.toRadians(ops);
				ops = Math.sin(radians);
				textField.setText(String.valueOf(ops));
			}
		});
		SinButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		SinButton.setBounds(10, 157, 73, 52);
		frame.getContentPane().add(SinButton);
		
		JButton CosButton = new JButton("COS");
		CosButton.setBackground(new Color(192, 192, 192));
		CosButton.setForeground(Color.BLACK);
		CosButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				double radians = Math.toRadians(ops);
				ops = Math.cos(radians);
				textField.setText(String.valueOf(ops));
			}
		});
		CosButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		CosButton.setBounds(10, 220, 73, 52);
		frame.getContentPane().add(CosButton);
		
		JButton TanButton = new JButton("TAN");
		TanButton.setBackground(new Color(192, 192, 192));
		TanButton.setForeground(Color.BLACK);
		TanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				double radians = Math.toRadians(ops);
				ops = Math.tan(radians);
				textField.setText(String.valueOf(ops));
			}
		});
		TanButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		TanButton.setBounds(10, 283, 73, 52);
		frame.getContentPane().add(TanButton);
		
		JButton PItButton = new JButton("\u03C0");
		PItButton.setBackground(new Color(192, 192, 192));
		PItButton.setForeground(Color.BLACK);
		PItButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops = Math.PI;
				textField.setText(String.valueOf(ops));
			}
		});
		PItButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		PItButton.setBounds(10, 345, 73, 52);
		frame.getContentPane().add(PItButton);
	}
}
