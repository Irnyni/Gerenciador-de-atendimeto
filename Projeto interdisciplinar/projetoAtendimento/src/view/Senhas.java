package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CargoController;
import controller.MonitorController;
import modelo.entidade.Senha;

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

public class Senhas extends JFrame  {
	private int cat;
	private static int key;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Senhas frame = new Senhas();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	
	public static void passaDados(int s) {
	       key=s;
		   System.out.println("essa e a key SENHASsss: "+key);
		 
	}

	
	public Senhas() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		JButton btnSalvar = new JButton("ATENDIMENTO PRIORITARIO");
		btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SenhaOpcoes frame = new SenhaOpcoes();
				cat=2;
			    String pref = "(A+)";
				System.out.println(key);
			    frame.passaDados(cat,key,pref);
				dispose();
				frame.setVisible(true);
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalvar.setBounds(80, 139, 357, 54);
		contentPane.add(btnSalvar);
		
		JLabel lblInserirGuich = new JLabel("SOLICITAR SENHA");
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		lblInserirGuich.setBounds(118, 11, 277, 60);
		contentPane.add(lblInserirGuich);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(252, 192, 1, 1);
		contentPane.add(layeredPane);
		
		JButton btnAtendimentoConvencional = new JButton("ATENDIMENTO CONVENCIONAL");
		btnAtendimentoConvencional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SenhaOpcoes frame = new SenhaOpcoes();
				cat=3;
				
				
			    frame.passaDados(cat,key,"");
				dispose();
				frame.setVisible(true);
			}
		});
		btnAtendimentoConvencional.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAtendimentoConvencional.setBounds(81, 272, 357, 54);
		contentPane.add(btnAtendimentoConvencional);
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getCat() {
		return cat;

	}

	public void setCat(int cat) {
		this.cat = cat;
	}




}
