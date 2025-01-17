package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CargoController;
import modelo.dao.FuncionarioDao;
import modelo.dao.SenhaDao;

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
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;

public class SenhaGerada extends JFrame {

	private JPanel contentPane;
	private int key; 
	private String senhachamada;

	
	public void passaDados(int senha, String senhaschamada){
        this.key=senha;
        this.senhachamada=senhaschamada;
	      System.out.println("fim" + senhachamada);
	  	JLabel lblPaga = new JLabel(senhachamada);
		lblPaga.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaga.setForeground(new Color(255, 255, 255));
		lblPaga.setFont(new Font("Ebrima", Font.BOLD, 85));
		lblPaga.setAutoscrolls(true);
		lblPaga.setBounds(27, 117, 464, 198);
		contentPane.add(lblPaga);
	  }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SenhaGerada frame = new SenhaGerada();
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
	

	
	
	public int getKey() {
		return key;
	}

	public String getSenhachamada() {
		return senhachamada;
	}

	public void setSenhachamada(String senhachamada) {
		this.senhachamada = senhachamada;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public SenhaGerada() {
		
		setAlwaysOnTop(true);
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
		
		JLabel lblInserirGuich = new JLabel("SOLICITAR SENHA");
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		lblInserirGuich.setBounds(117, 32, 277, 60);
		contentPane.add(lblInserirGuich);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(252, 192, 1, 1);
		contentPane.add(layeredPane);
		SenhaDao senha = new SenhaDao(); 
		JLabel lblPaga = new JLabel("");
		lblPaga.setBackground(new Color(255, 255, 255));
		lblPaga.setHorizontalAlignment(SwingConstants.CENTER);
		lblPaga.setForeground(new Color(255, 255, 255));
		lblPaga.setFont(new Font("Ebrima", Font.BOLD, 60));
		lblPaga.setAutoscrolls(true);
		lblPaga.setBounds(0, 117, 536, 198);
		contentPane.add(lblPaga);
		
		JLabel lblSuaSenhaSer = new JLabel("SUA SENHA SERÁ IMPRESSA!");
		lblSuaSenhaSer.setForeground(Color.WHITE);
		lblSuaSenhaSer.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		lblSuaSenhaSer.setAutoscrolls(true);
		lblSuaSenhaSer.setBounds(46, 345, 463, 60);
		contentPane.add(lblSuaSenhaSer);
		
		JButton btnNewButton = new JButton("SAIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SenhaGerada sg = new SenhaGerada();
				Senhas frame = new Senhas();
				dispose();
				frame.setVisible(true);

			}
		});
		btnNewButton.setBounds(203, 416, 89, 23);
		contentPane.add(btnNewButton);

	

	}

}
