package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.GuicheController;
import controller.SenhaController;
import modelo.entidade.Senha;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.SwingConstants;

public class TelaAtendimento0 extends JFrame {

	private JPanel contentPane;
	private int cont;
	private JTextField numeroguiche;
	private int a;
    private static int conti=1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtendimento0 frame = new TelaAtendimento0();
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




	public TelaAtendimento0() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 550, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(64, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(81, 11, -35, 26);
		contentPane.add(lblNewLabel);

		JButton btnSalvar = new JButton("SELECIONAR GUICH\u00CA");
		btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAtendimento frame = new TelaAtendimento();
				a = Integer.parseInt(numeroguiche.getText());
				frame.passaDados(a,conti);
				dispose();

				frame.setVisible(true);
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalvar.setBounds(94, 341, 331, 56);
		contentPane.add(btnSalvar);

		JLabel lblInserirGuich = new JLabel("ATENDIMENTO");
		lblInserirGuich.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Comic Sans MS", Font.BOLD, 49));
		lblInserirGuich.setBounds(72, 11, 401, 60);
		contentPane.add(lblInserirGuich); 

		numeroguiche = new JTextField();
		numeroguiche.setHorizontalAlignment(SwingConstants.CENTER);
		numeroguiche.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		numeroguiche.setAlignmentX(Component.LEFT_ALIGNMENT);
		numeroguiche.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		numeroguiche.setFont(new Font("Tahoma", Font.BOLD, 45));
		numeroguiche.setBounds(313, 168, 84, 47);
		contentPane.add(numeroguiche);
		numeroguiche.setColumns(10);

		JTextArea txtrGuich = new JTextArea();
		txtrGuich.setForeground(new Color(255, 255, 255));
		txtrGuich.setFont(new Font("Monospaced", Font.BOLD, 50));
		txtrGuich.setBackground(new Color(0, 0, 0));
		txtrGuich.setText("GUICH�");
		txtrGuich.setBounds(115, 156, 173, 117);
		contentPane.add(txtrGuich);
	}
	public static void passaDados(int cont) {

		conti=cont;
		System.out.println("essa e a senha em pd 0"+conti);
		
	}
}
