package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.GuicheController;

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

public class GerenciaSenhas extends JFrame {

	private JPanel contentPane;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciaSenhas frame = new GerenciaSenhas();
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
	
	
	
	
	public GerenciaSenhas() {
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
		
		JLabel lblInserirGuich = new JLabel("SENHAS");
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		lblInserirGuich.setBounds(181, 11, 127, 60);
		contentPane.add(lblInserirGuich);
		
		JButton btnPesquisar = new JButton("PESQUISAR");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MostraSenhas frame =  new MostraSenhas();
				dispose();
				frame.setVisible(true);
			}
		});
		btnPesquisar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPesquisar.setBounds(60, 151, 398, 46);
		contentPane.add(btnPesquisar);
		
		JButton btnexcluir = new JButton("EXCLUIR");
		btnexcluir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnexcluir.setBounds(60, 261, 398, 46);
		contentPane.add(btnexcluir);
	}


}
