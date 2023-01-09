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

public class MostraGuiches extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostraGuiches frame = new MostraGuiches();
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
	public MostraGuiches() {
		setBackground(new Color(0, 0, 0));
		setForeground(new Color(0, 0, 0));
		setTitle("Guiches");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 715, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 10));
		tabbedPane.setForeground(new Color(0, 0, 0));
		tabbedPane.setBackground(new Color(0, 0, 0));
		tabbedPane.setBounds(0, 10, 701, 517);
		CorpotabelaGuiches SH = new CorpotabelaGuiches();
		SH.setForeground(new Color(64, 0, 128));
		SH.setBackground(new Color(0, 0, 0));

		tabbedPane.addTab("GUICHÊS", SH);
		tabbedPane.setBackgroundAt(0, new Color(0, 0, 0));
		SH.setLayout(null);
		SH.setLayout(null);
		SH.setLayout(null);
		SH.setLayout(null);
		SH.setLayout(null);
		SH.setLayout(null);
		
		JButton btnNewButton = new JButton("<--");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gerencia frame = new Gerencia();
				dispose();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(629, 436, 78, 23);
		SH.add(btnNewButton);
		/*****/
		
		contentPane.add(tabbedPane);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
