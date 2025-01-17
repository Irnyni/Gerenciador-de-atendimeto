package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ServicoController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Cursor;

public class Servicos extends JFrame {

	private JPanel contentPane;
	private JTextField txtDescricao;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Servicos frame = new Servicos();
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
	
	
	
	
	public Servicos() {
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 550, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(64, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescricao = new JLabel("DESCRI��O");
		lblDescricao.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblDescricao.setForeground(new Color(255, 255, 255));
		lblDescricao.setBackground(new Color(255, 255, 255));
		lblDescricao.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblDescricao.setBounds(36, 190, 123, 36);
		contentPane.add(lblDescricao);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(81, 11, -35, 26);
		contentPane.add(lblNewLabel);
		
		txtDescricao = new JTextField();
		txtDescricao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtDescricao.setBounds(213, 196, 292, 32);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JButton btnSalvar = new JButton("CRIAR SERVI�O");
		btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 ServicoController controller = new ServicoController();
		         controller.executa(Servicos.this);
		         Gerencia g = new Gerencia();
		         dispose();
		         g.setVisible(true);
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalvar.setBounds(164, 383, 197, 23);
		contentPane.add(btnSalvar);
		
		JLabel lblInserirGuich = new JLabel("INSERIR SERVI�O");
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		lblInserirGuich.setBounds(116, 10, 314, 60);
		contentPane.add(lblInserirGuich);
	}

	public JTextField getTxtDescricao() {
		return txtDescricao;
	}

	public void setTxtTitulo(JTextField txtDescricao) {
		this.txtDescricao = txtDescricao;
	}

}
