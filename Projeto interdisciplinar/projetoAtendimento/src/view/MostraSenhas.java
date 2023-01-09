package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MostraSenhas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostraSenhas frame = new MostraSenhas();
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
	public MostraSenhas() {
		setForeground(new Color(0, 0, 0));
		setTitle("SENHAS");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(280, 200, 980, 551);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		tabbedPane.setForeground(new Color(0, 0, 0));
		tabbedPane.setBackground(new Color(0, 0, 0));
		tabbedPane.setBounds(0, 10, 915, 485);
		CorpotabelaSenhas SH = new CorpotabelaSenhas();
		SH.setForeground(new Color(0, 0, 0));
		SH.setBackground(new Color(255, 255, 255));

		tabbedPane.addTab("SENHAS", SH);
		tabbedPane.setBackgroundAt(0, new Color(0, 0, 0));
		SH.setLayout(null);
		SH.setLayout(null);
		SH.setLayout(null);
		SH.setLayout(null);
		SH.setLayout(null);
		SH.setLayout(null);
		SH.setLayout(null);
		/*****/
		
		contentPane.add(tabbedPane);
		
		JButton btnNewButton = new JButton("<--");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gerencia frame = new Gerencia();
				dispose();
				frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(909, 472, 57, 23);
		contentPane.add(btnNewButton);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
