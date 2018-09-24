import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;

public class counter {

	private JFrame frame;
	private JTextField textField;
	private JComboBox comboBox;
	private JMenuItem JMenuexit ;
	private JMenuItem JmenuReset;
	private JMenu JmenuMenu;
	private JMenuBar menuBar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					counter window = new counter();
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
	public counter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 773, 556);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblValue = new JLabel("Value");
		lblValue.setBounds(15, 238, 69, 20);
		frame.getContentPane().add(lblValue);
		
		textField = new JTextField();
		textField.setBounds(171, 235, 146, 26);
		frame.getContentPane().add(textField);
		
		JButton btnNewButton = new JButton("Incr");
	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int incr = Integer.parseInt(textField.getText()); // get text from text box which i will enter once the program is run
				incr++;
				textField.setText(""+incr);
			}
		});
		btnNewButton.setBounds(15, 284, 115, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDecrBtn = new JButton("Decr");
		btnDecrBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int decr = Integer.parseInt(textField.getText());
				decr--;
				textField.setText("" +decr); // after button dcr click set new NuMBER, put "" because setText require it or will give error
			}
		});
		btnDecrBtn.setBounds(171, 284, 115, 29);
		frame.getContentPane().add(btnDecrBtn);
		
		JButton btnNewButton_2 = new JButton("Add");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int incr2 = Integer.parseInt(textField.getText()); // get textfield number and put a new variable incr2
				int incrCombox = Integer.parseInt((String)comboBox.getSelectedItem());
				
				int result= incr2+ incrCombox;
				textField.setText("" + result);
				
				
			}
		});
		btnNewButton_2.setBounds(15, 351, 115, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6"}));
		comboBox.setBounds(175, 352, 36, 26);
		frame.getContentPane().add(comboBox);
		
		 menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JmenuMenu = new JMenu("Menu");
		menuBar.add(JmenuMenu);
		
		JmenuReset = new JMenuItem("Reset");
		JmenuReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				
				
				
			}
		});
		menuBar.add(JmenuReset); 
		
		
		JMenuexit = new JMenuItem("Exit");
		JMenuexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		menuBar.add(JMenuexit); 
		
		
		
		
	}
}
