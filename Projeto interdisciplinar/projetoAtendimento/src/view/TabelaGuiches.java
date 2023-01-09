package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;

public class TabelaGuiches extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabelaGuiches frame = new TabelaGuiches();
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
	public TabelaGuiches() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 10));
		tabbedPane.setForeground(new Color(0, 0, 0));
		CorpotabelaGuiches ct = new CorpotabelaGuiches();
		ct.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		ct.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
		ct.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ct.setForeground(new Color(0, 0, 0));
		tabbedPane.addTab("Guiches", ct);
		CorpotabelaGuiches mostraGuiches = new CorpotabelaGuiches();
		mostraGuiches.setBackground(new Color(240, 240, 240));
		mostraGuiches.setForeground(new Color(255, 255, 255));
		tabbedPane.addTab("Guiches",mostraGuiches);
		mostraGuiches.setLayout(null);
		
		/*****/
		setContentPane(contentPane);
		
	}

}
