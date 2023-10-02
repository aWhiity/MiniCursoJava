package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import entities.Aluno;

public class AlunoGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textField_2;
	private JTextField textRegistroAcademico;
	private JTable table;

	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlunoGUI frame = new AlunoGUI();
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
	public AlunoGUI() {
		this.initComponents();
	}
	
	public void initComponents() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 454, 468);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(234, 234, 234));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JMenuBar menuBar = new JMenuBar();
			menuBar.setBounds(0, 0, 434, 22);
			contentPane.add(menuBar);
			
			JMenu mnNewMenu = new JMenu("Arquivo");
			menuBar.add(mnNewMenu);
			
			JMenuItem mntmNewMenuItem = new JMenuItem("Sair");
			mnNewMenu.add(mntmNewMenuItem);
			
			JMenu mnNewMenu_1 = new JMenu("Ajuda");
			menuBar.add(mnNewMenu_1);
			
			JMenuItem mntmNewMenuItem_1 = new JMenuItem("Sobre");
			mnNewMenu_1.add(mntmNewMenuItem_1);
			
			JLabel lblNewLabel = new JLabel("Registro Acadêmico");
			lblNewLabel.setBounds(21, 36, 103, 14);
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Nome");
			lblNewLabel_1.setBounds(21, 68, 46, 14);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Curso");
			lblNewLabel_2.setBounds(182, 100, 46, 14);
			contentPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Data de Ingresso");
			lblNewLabel_3.setBounds(182, 135, 90, 14);
			contentPane.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("Coeficiente");
			lblNewLabel_4.setBounds(182, 170, 60, 14);
			contentPane.add(lblNewLabel_4);
			
			JLabel lblNewLabel_5 = new JLabel("Período");
			lblNewLabel_5.setBounds(343, 135, 60, 14);
			contentPane.add(lblNewLabel_5);
			
			textNome = new JTextField();
			textNome.setBounds(56, 65, 356, 20);
			contentPane.add(textNome);
			textNome.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setBounds(247, 167, 86, 20);
			contentPane.add(textField_2);
			textField_2.setColumns(10);
			
			textRegistroAcademico = new JTextField();
			textRegistroAcademico.setBounds(121, 33, 95, 20);
			contentPane.add(textRegistroAcademico);
			textRegistroAcademico.setColumns(10);
			
			JFormattedTextField formattedTextField = new JFormattedTextField();
			formattedTextField.setBounds(269, 132, 64, 20);
			contentPane.add(formattedTextField);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setForeground(new Color(128, 128, 128));
			comboBox.setBackground(new Color(128, 128, 128));
			comboBox.setBounds(221, 96, 203, 22);
			contentPane.add(comboBox);
			
			JSpinner spinner = new JSpinner();
			spinner.setBounds(386, 132, 38, 20);
			contentPane.add(spinner);
			
			JPanel panel = new JPanel();
			panel.setToolTipText("");
			panel.setBackground(new Color(234, 234, 234));
			panel.setBorder(new TitledBorder(null, "Sexo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setForeground(new Color(128, 128, 128));
			panel.setBounds(21, 100, 141, 113);
			contentPane.add(panel);
			panel.setLayout(null);
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setBackground(new Color(234, 234, 234));
			rdbtnNewRadioButton.setBounds(6, 19, 109, 23);
			panel.add(rdbtnNewRadioButton);
			
			JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Feminino");
			buttonGroup.add(rdbtnNewRadioButton_1);
			rdbtnNewRadioButton_1.setBackground(new Color(234, 234, 234));
			rdbtnNewRadioButton_1.setBounds(6, 45, 109, 23);
			panel.add(rdbtnNewRadioButton_1);
			
			JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Não Informar");
			buttonGroup.add(rdbtnNewRadioButton_2);
			rdbtnNewRadioButton_2.setBackground(new Color(234, 234, 234));
			rdbtnNewRadioButton_2.setBounds(6, 71, 109, 23);
			panel.add(rdbtnNewRadioButton_2);
			
			
			
			JSeparator separator = new JSeparator();
			separator.setBounds(10, 224, 414, 2);
			contentPane.add(separator);
			
			JButton btnNewButton = new JButton("Limpar Campos");
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnNewButton.setBounds(307, 240, 117, 23);
			contentPane.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Cadastrar");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cadastrar();
				}
			});
			btnNewButton_1.setBounds(195, 240, 103, 23);
			contentPane.add(btnNewButton_1);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Alunos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_1.setBounds(10, 275, 414, 143);
			contentPane.add(panel_1);
			panel_1.setLayout(null);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
							"RA"
					}
					));
			table.setBounds(10, 130, 394, -113);
			panel_1.add(table);
		
	}
	
	public void cadastrar() {
		Aluno novoAluno = new Aluno();
		novoAluno.setRA(Integer.parseInt(this.textRegistroAcademico.getText()));
		novoAluno.setNome(this.textNome.getText());
	}
	
}
