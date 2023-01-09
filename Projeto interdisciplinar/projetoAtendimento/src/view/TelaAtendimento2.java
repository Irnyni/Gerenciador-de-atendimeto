package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AtendimentoController;
import controller.GuicheController;
import modelo.entidade.Atendimento;
import modelo.entidade.Guiche;
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

public class TelaAtendimento2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtDescricao;
	private JTextField txtClientes;
	private String fila;
	private static Senha senha;
	private static String datas;
	private static  int guiches;
    private static int conti;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtendimento2 frame = new TelaAtendimento2();
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


	public TelaAtendimento2() {
		
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 550, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(64, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDescricao = new JLabel("DESCRI\u00C7\u00C3O");
		lblDescricao.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblDescricao.setForeground(new Color(255, 255, 255));
		lblDescricao.setBackground(new Color(255, 255, 255));
		lblDescricao.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblDescricao.setBounds(30, 192, 123, 36);
		contentPane.add(lblDescricao);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(81, 11, -35, 26);
		contentPane.add(lblNewLabel);

		txtDescricao = new JTextField();
		txtDescricao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtDescricao.setBounds(214, 192, 292, 32);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);

		JLabel lblCliente = new JLabel("CLIENTE");
		lblCliente.setForeground(new Color(255, 255, 255));
		lblCliente.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblCliente.setBounds(43, 273, 110, 21);
		contentPane.add(lblCliente);

		txtClientes = new JTextField();
		txtClientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtClientes.setBounds(214, 272, 292, 32);
		contentPane.add(txtClientes);
		txtClientes.setColumns(10);

		JButton btnSalvar = new JButton("FINALIZAR ATENDIMENTO");
		btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AtendimentoController ac = new AtendimentoController();

				Atendimento atendimento = new Atendimento();
				atendimento.setDescricao(txtDescricao.getText());
				atendimento.setCliente((Integer.parseInt(txtClientes.getText())));
				atendimento.setCategoria(senha.getCategoria());
				atendimento.setInicio(datas);
				System.out.println(atendimento.getInicio());
				Calendar calendar = new GregorianCalendar();
				Timestamp ts=new Timestamp(System.currentTimeMillis());  
				Date date=new Date(ts.getTime());  
				String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
				// if no ids were returned, something is wrong. get out.
				if (ids.length == 0)
					System.exit(0);
				String a;
				a=""+calendar.getTime();
				GuicheController gc = new GuicheController();
				Guiche guiche = gc.consultaEspecifica(guiches);
				

				atendimento.setFinal(a);
				atendimento.setData(""+calendar.getTime());
				atendimento.setGuiche(guiches);
				atendimento.setServico(guiche.getServico());
				atendimento.setSenha(senha.getSenha());
				atendimento.setAtendente(guiche.getFuncionario());
				System.out.println(atendimento.toString());
				ac.executa(atendimento);

				System.out.println("essa e a senha q devera ser pesquisada"+ conti);
				TelaAtendimento0 ta = new TelaAtendimento0();
				ta.passaDados(conti);
				dispose();
				ta.setVisible(true);
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalvar.setBounds(122, 405, 284, 23);
		contentPane.add(btnSalvar);

		JLabel lblInserirGuich = new JLabel("ATENDIMENTO");
		lblInserirGuich.setAutoscrolls(true);
		lblInserirGuich.setForeground(new Color(255, 255, 255));
		lblInserirGuich.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		lblInserirGuich.setBounds(149, 11, 277, 60);
		contentPane.add(lblInserirGuich);
	}



	public String getFila() {
		return fila;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public JTextField getTxtDescricao() {
		return txtDescricao;
	}

	public void setTxtDescricao(JTextField txtDescricao) {
		this.txtDescricao = txtDescricao;
	}

	public JTextField getTxtClientes() {
		return txtClientes;
	}

	public void setTxtClientes(JTextField txtClientes) {
		this.txtClientes = txtClientes;
	}

	public static void passaDados(Senha senhas, String a, int guiche, int cont) {
		senha=senhas;
		datas=a;
		guiches=guiche;
		conti=cont;
		System.out.println("Essa e o guiche em tela 3: "+ guiches);
	}










}
