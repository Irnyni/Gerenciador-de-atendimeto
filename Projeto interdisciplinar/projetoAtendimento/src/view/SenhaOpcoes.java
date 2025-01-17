package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import modelo.entidade.Senha;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CargoController;
import controller.MonitorController;
import controller.SenhaController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import javax.swing.JLayeredPane;

public class SenhaOpcoes extends JFrame {

	private JPanel contentPane;
	private int cat; 
	private int key;
	private int incremento;
    Senhas s = new Senhas();
	Senha senha = new Senha();
	private String pref;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SenhaOpcoes frame = new SenhaOpcoes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param pref 
	 * @return 
	 * @return 
	 */
	public void passaDados(int cat, int key, String pref){
	      this.key=key;
	      this.cat= cat;
	      this.pref=pref;
	      System.out.println("Essa e a preferncial : "+ pref);
	      System.out.println("Essa e a key em senhas opcoes : "+ key);
	      System.out.println("Essa e a categoria em senhas opcoes : "+ cat);
			SenhaGerada sg = new SenhaGerada();
			sg.passaDados(this.key,"a");
	  }
    MonitorController mc = new MonitorController();

	public SenhaOpcoes() {

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
		
		JButton btnSalvar = new JButton("PAGAMENTOS");
		btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SenhaGerada frame = new SenhaGerada();
				
				senha.setCategoria(cat);
			    senha.setServico(1);
	            int incremento = key+1;
	            System.out.println("preferencial antes da impressão: " +pref );
				String senhaschamada = "PAG"+incremento+pref;
			    senha.setSenha(senhaschamada);
			    Calendar calendar = new GregorianCalendar();
                Timestamp ts=new Timestamp(System.currentTimeMillis());  
                Date date=new Date(ts.getTime());  
				String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
				 // if no ids were returned, something is wrong. get out.
				if (ids.length == 0)
				System.exit(0);
                String a;

			    a=""+calendar.getTime();
				senha.setData(a);
				 System.out.println(a);
			    
				System.out.println(senha.toString());
				dispose();
				frame.setVisible(true);
				SenhaController s = new SenhaController();
				s.executa(senha);
				System.out.println("senhaschamada");
				System.out.println(senhaschamada);
				
				frame.passaDados(incremento,senhaschamada);
				Senhas sd = new Senhas();
				sd.passaDados(incremento);

			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalvar.setBounds(81, 97, 357, 54);
		contentPane.add(btnSalvar);
		
		JLabel lblInserirGuich = new JLabel("SOLICITAR SENHA");
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		lblInserirGuich.setBounds(131, 11, 277, 60);
		contentPane.add(lblInserirGuich);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(252, 192, 1, 1);
		contentPane.add(layeredPane);
		
		JButton btnEmprstimos = new JButton("EMPRÉSTIMOS");
		btnEmprstimos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SenhaGerada frame = new SenhaGerada();
				
				senha.setCategoria(cat);
			    senha.setServico(2);
	            int incremento = key+1;
				String senhaschamada = "EMP"+incremento+pref;
			    senha.setSenha(senhaschamada);
			    Calendar calendar = new GregorianCalendar();
                Timestamp ts=new Timestamp(System.currentTimeMillis());  
                Date date=new Date(ts.getTime());  
				String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
				 // if no ids were returned, something is wrong. get out.
				if (ids.length == 0)
				System.exit(0);
                String a;

			    a=""+calendar.getTime();
				senha.setData(a);
				 System.out.println(a);
			    
				System.out.println(senha.toString());
				dispose();
				frame.setVisible(true);
				SenhaController s = new SenhaController();
				s.executa(senha);
				System.out.println("essa e a senha "+ incremento);
				frame.passaDados(incremento,senhaschamada);
				Senhas sd = new Senhas();
				sd.passaDados(incremento);
				frame.setVisible(true);
			}
		});
		btnEmprstimos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEmprstimos.setBounds(81, 192, 357, 54);
		contentPane.add(btnEmprstimos);
		
		JButton btnInvestimentos = new JButton("INVESTIMENTOS");
		btnInvestimentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SenhaGerada frame = new SenhaGerada();
				senha.setCategoria(cat);
			    senha.setServico(3);
	            int incremento = key+1;
				String senhaschamada = "INV"+incremento+pref;
			    senha.setSenha(senhaschamada);
			    Calendar calendar = new GregorianCalendar();
                Timestamp ts=new Timestamp(System.currentTimeMillis());  
                Date date=new Date(ts.getTime());  
				String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
				 // if no ids were returned, something is wrong. get out.
				if (ids.length == 0)
				System.exit(0);
                String a;

			    a=""+calendar.getTime();
				senha.setData(a);
				 System.out.println(a);
			    
				System.out.println(senha.toString());
				dispose();
				frame.setVisible(true);
				SenhaController s = new SenhaController();
				s.executa(senha);
				System.out.println("essa e a senha "+ incremento);
				frame.passaDados(incremento,senhaschamada);
				Senhas sd = new Senhas();
				sd.passaDados(incremento);
				frame.setVisible(true);
                 
			}
		});
		btnInvestimentos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnInvestimentos.setBounds(81, 285, 357, 54);
		contentPane.add(btnInvestimentos);
		
		JButton btnConta = new JButton("CONTA");
		btnConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SenhaGerada frame = new SenhaGerada();
				senha.setCategoria(cat);
			    senha.setServico(4);
	            int incremento = key+1;
				String senhaschamada = "CON"+incremento+pref;
			    senha.setSenha(senhaschamada);
			    Calendar calendar = new GregorianCalendar();
                Timestamp ts=new Timestamp(System.currentTimeMillis());  
                Date date=new Date(ts.getTime());  
				String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
				 // if no ids were returned, something is wrong. get out.
				if (ids.length == 0)
				System.exit(0);
                String a;

			    a=""+calendar.getTime();
				senha.setData(a);
				 System.out.println(a);
			    
				System.out.println(senha.toString());
				dispose();
				frame.setVisible(true);
				SenhaController s = new SenhaController();
				s.executa(senha);
				System.out.println("essa e a senha "+ incremento);
				frame.passaDados(incremento, senhaschamada);
				Senhas sd = new Senhas();
				sd.passaDados(incremento);
				frame.setVisible(true);
				
				

			}
		});
		btnConta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConta.setBounds(81, 373, 357, 54);
		contentPane.add(btnConta);
	}

	public int getIncremento() {
		return incremento;
	}

	public void setIncremento(int incremento) {
		this.incremento = incremento;
	}




//
//	public void setTxtTitulo(JTextField txtDescricao) {
//		this.txtDescricao = txtDescricao;
//	}
//
//	public JTextField getTxtHierarquia() {
//		return txtHierarquia;
//	}
//
//	public void setTxtHierarquia(JTextField txtHierarquia) {
//		this.txtHierarquia = txtHierarquia;
//	}
}
