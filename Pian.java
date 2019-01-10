package pi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Pian {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pian window = new Pian();
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
	public Pian() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 947, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setBounds(28, 205, 70, 198);
		frame.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnD_2 = new JButton("D");
		btnD_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnD_2.setBounds(118, 205, 70, 198);
		frame.getContentPane().add(btnD_2);
		
		JButton btnE = new JButton("E");
		btnE.setVerticalAlignment(SwingConstants.BOTTOM);
		btnE.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnE.setBounds(207, 205, 70, 198);
		frame.getContentPane().add(btnE);
		
		JButton btnF_1 = new JButton("F");
		btnF_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnF_1.setBounds(299, 205, 70, 198);
		frame.getContentPane().add(btnF_1);
		
		JButton btnG_1 = new JButton("G");
		btnG_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnG_1.setBounds(388, 205, 70, 198);
		frame.getContentPane().add(btnG_1);
		
		JButton btnA = new JButton("A");
		btnA.setVerticalAlignment(SwingConstants.BOTTOM);
		btnA.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnA.setBounds(480, 205, 70, 198);
		frame.getContentPane().add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.setVerticalAlignment(SwingConstants.BOTTOM);
		btnB.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnB.setBounds(572, 205, 70, 198);
		frame.getContentPane().add(btnB);
		
		JButton btnC = new JButton("C1");
		btnC.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnC.setBounds(662, 205, 70, 198);
		frame.getContentPane().add(btnC);
		
		JButton btnE_1 = new JButton("E1");
		btnE_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnE_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnE_1.setBounds(752, 205, 70, 198);
		frame.getContentPane().add(btnE_1);
		
		JButton btnF_2 = new JButton("F1");
		btnF_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnF_2.setBounds(843, 205, 70, 198);
		frame.getContentPane().add(btnF_2);
		
		JButton btnNewButton_1 = new JButton("C#");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(64, 56, 80, 116);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnD = new JButton("D#");
		btnD.setBackground(Color.BLACK);
		btnD.setForeground(Color.WHITE);
		btnD.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnD.setBounds(154, 56, 80, 116);
		frame.getContentPane().add(btnD);
		
		JButton btnD_1 = new JButton("D#1");
		btnD_1.setBackground(Color.BLACK);
		btnD_1.setForeground(Color.WHITE);
		btnD_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnD_1.setBounds(784, 56, 80, 116);
		frame.getContentPane().add(btnD_1);
		
		JButton button_11 = new JButton("C#1");
		button_11.setBackground(Color.BLACK);
		button_11.setForeground(Color.WHITE);
		button_11.setVerticalAlignment(SwingConstants.BOTTOM);
		button_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_11.setBounds(694, 56, 80, 116);
		frame.getContentPane().add(button_11);
		
		JButton btnF = new JButton("F#");
		btnF.setBackground(Color.BLACK);
		btnF.setForeground(Color.WHITE);
		btnF.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnF.setBounds(337, 56, 80, 116);
		frame.getContentPane().add(btnF);
		
		JButton btnG = new JButton("G#");
		btnG.setBackground(Color.BLACK);
		btnG.setForeground(Color.WHITE);
		btnG.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnG.setBounds(427, 56, 80, 116);
		frame.getContentPane().add(btnG);
		
		JButton btnBb = new JButton("Bb");
		btnBb.setBackground(Color.BLACK);
		btnBb.setForeground(Color.WHITE);
		btnBb.setVerticalAlignment(SwingConstants.BOTTOM);
		btnBb.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnBb.setBounds(517, 56, 80, 116);
		frame.getContentPane().add(btnBb);
	}
}
