package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import controller.MonitorController;
import controller.SenhaController;
import modelo.entidade.Senha;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CargoController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTable;

import java.awt.Cursor;
import javax.swing.JLayeredPane;
import java.awt.Component;
import javax.swing.SwingConstants;

public class Monitor extends JFrame {

	private JPanel contentPane;
	private static String senha;
	private static int conti=1;
	private static int guiche;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monitor frame = new Monitor();
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




	public Monitor() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		SenhaController sc = new SenhaController();
		Senha senhas = sc.ultimaSenha(conti);
		System.out.println("conti no monitor"+conti);
		setAlwaysOnTop(true);
		setBounds(0, 200, 550, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(64, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(81, 11, -35, 26);
		contentPane.add(lblNewLabel);

		JLabel lblInserirGuich = new JLabel("SENHA");
		lblInserirGuich.setBackground(new Color(255, 255, 255));
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 128));
		lblInserirGuich.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 99));
		lblInserirGuich.setBounds(70, 10, 412, 113);
		contentPane.add(lblInserirGuich);

		JLayeredPane layeredPane = new JLayeredPane();

		layeredPane.setBounds(272, 193, 1, 1);
		contentPane.add(layeredPane);
		JTable table;
		System.out.println("Essa a senha no monitor:2 "+ senha);




		TelaAtendimento frame1 = new TelaAtendimento();
		guiche=frame1.getGuiches();

		
		JLabel lbSenha = new JLabel();
		lbSenha.setText(senhas.getSenha());
		lbSenha.setBackground(new Color(255, 255, 255));
		lbSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lbSenha.setForeground(Color.WHITE);
		lbSenha.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 99));
		lbSenha.setAutoscrolls(true);
		lbSenha.setBounds(0, 89, 536, 226);
		contentPane.add(lbSenha);
		
		JLabel lbguiche = new JLabel();
		lbguiche.setText("GUICH� "+guiche);
		lbguiche.setHorizontalAlignment(SwingConstants.CENTER);
		lbguiche.setForeground(Color.WHITE);
		lbguiche.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 99));
		lbguiche.setBackground(Color.WHITE);
		lbguiche.setAutoscrolls(true);
		lbguiche.setBounds(0, 237, 536, 226);
		contentPane.add(lbguiche);



	}
	public static void passaDados(String string, int cont, int guiches) {
		senha=string;
		conti=cont;
		guiche=guiches;
		System.out.println("Essa a senha no monitor 1: "+ senha);




	}
}
