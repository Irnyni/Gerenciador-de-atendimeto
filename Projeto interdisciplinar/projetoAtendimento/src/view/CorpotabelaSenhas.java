package view;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.SenhaController;
import modelo.entidade.Senha;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Font;

public class CorpotabelaSenhas extends JPanel {
	private JTable table;


	public CorpotabelaSenhas() {
		setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 911, 458);
		add(scrollPane_1);	

		// As colunas da tabela
		String colunas[] = { "ID", "SENHA", "CATEGORIA", "SERVIÇO", "DATA"};

		// Cria um DefaultTableModel para manipular os dados do JTable. Os par�metros s�o um array que identifica as colunas e um int que seta o n�mero inicial que linhas
		DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

		SenhaController senhaController = new SenhaController();

		ArrayList<Senha> senhas = senhaController.consultar();
		table = new JTable(5,senhas.size());

		table.setFont(new Font("Tahoma", Font.BOLD, 15));
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setForeground(new Color(0, 0, 0));


		for(int i=0; i < senhas.size() ; i++) {
			// Insere os dados no DefaultTableModel
			//			Integer ano = senhas.get(i).getAno();
			Integer key=senhas.get(i).getKey();
			Integer categoria = senhas.get(i).getCategoria();
			Integer servico = senhas.get(i).getServico();
			System.out.println(senhas.get(i).getKey() + senhas.get(i).getSenha() + senhas.get(i).getCategoria() +  + senhas.get(i).getServico()+ senhas.get(i).getData());
			modelo.addRow(new String[]{" "+key,senhas.get(i).getSenha(),""+categoria,""+servico,senhas.get(i).getData()});   
		}
		// Associa o DefaultTableModel ao JTable
		table.setModel(modelo);		

		//table = new JTable(listaPessoas, getNameColumns());
		scrollPane_1.setViewportView(table);

	}
}
