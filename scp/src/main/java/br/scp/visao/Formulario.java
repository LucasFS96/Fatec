package br.scp.visao;

import org.apache.log4j.Logger;

import br.scp.controle.Controle;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class Formulario extends JFrame {
	private JPanel jContentPane = null;
	private JPanel pnlCentral = null;
	private JPanel pnlInferior = null;

	private JButton btnConfirma = null;
	private JButton btnLimpar = null;
	private JButton btnSair = null;
	
	static Logger logger = Logger.getLogger(Formulario.class);
	/***************************************************************************
	 * campos do formulario
	 **************************************************************************/
	private JTextField txtCNPJ = null;
	private JTextField txtRazaoSocial = null;
	private JTextField txtEndereco= null;
	private JTextField txtTelefone= null;
	private JTextField txtHI= null;
	private JTextField txtHT= null;
	private JTextField txtConjunto1= null;
	private JTextField txtConjunto2= null;
	private JTextField txtConjunto3= null;
	private JTextField txtTemperaturaMaxima= null;
	private JTextField txtArHI= null;
	private JTextField txtArHT= null;
	private JTextField txtMensagem = null;
	Controle controle;
	public Formulario() {
		super();
		logger.info("Inicializa o sistema de controle predial."); 
		inicializa();
	}
	private void inicializa() {
		this.setSize(600, 420);
		this.setContentPane(getJContentPane());
		this.setTitle("Cadastra Empresa");
		
		// Dimensiona a tela
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((screenSize.width - 650) / 2, (screenSize.height - 490) / 2,
				650, 490);// largura x altura

		// registro no listener dos objetos controlados
		controle = new Controle();
		
		// btnNovoAutor.addActionListener(this);

		// Limpa informações da tela

		// limpaCampos();
		setVisible(true);
	}
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getPnlCentral(), BorderLayout.CENTER);
			jContentPane.add(getPnlInferior(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}
	private JPanel getPnlInferior() {
		if (pnlInferior == null) {
			pnlInferior = new JPanel();
			pnlInferior.setBorder(BorderFactory
					.createEtchedBorder(EtchedBorder.RAISED));
			pnlInferior.add(getBtnConfirma(), null);

			pnlInferior.add(getBtnLimpar(), null);
			pnlInferior.add(getBtnSair(), null);

		}
		return pnlInferior;
	}

	private JPanel getPnlCentral() {
		if (pnlCentral == null) {
			pnlCentral = new JPanel();
			pnlCentral.setLayout(null);
			pnlCentral.setFont(new Font("Dialog", Font.PLAIN, 11));
			pnlCentral.add(getTxtCNPJ(), null);
			pnlCentral.add(getTxtRazaoSocial(), null);
			pnlCentral.add(getTxtEndereco(), null);
			pnlCentral.add(getTxtTelefone(), null);
			pnlCentral.add(getTxtHI(), null);
			pnlCentral.add(getTxtHT(), null);
			pnlCentral.add(getTxtConjunto1(), null);
			pnlCentral.add(getTxtConjunto2(), null);
			pnlCentral.add(getTxtConjunto3(), null);
			pnlCentral.add(getTxtTemperaturaMaxima(), null);
			pnlCentral.add(getTxtArHI(), null);
			pnlCentral.add(getTxtArHT(), null);
			pnlCentral.add(getTxtMensagem(), null);
			

		}
		return pnlCentral;
	}
	public JTextField getTxtCNPJ() {
		if (txtCNPJ == null) {
			txtCNPJ = new JTextField();
			txtCNPJ.setSize(95, 40); // largura x altura
			txtCNPJ.setLocation(150, 10); // horizontal x vertical
			txtCNPJ.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "CNPJ",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtCNPJ.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtCNPJ;
	}
	public JTextField getTxtRazaoSocial() {
		if (txtRazaoSocial == null) {
			txtRazaoSocial = new JTextField();
			txtRazaoSocial.setSize(285, 40); // largura x altura
			txtRazaoSocial.setLocation(150, 60); // horizontal x vertical
			txtRazaoSocial.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "Razao Social",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtRazaoSocial.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtRazaoSocial;
	}
	public JTextField getTxtEndereco() {
		if (txtEndereco == null) {
			txtEndereco = new JTextField();
			txtEndereco.setSize(285, 40); // largura x altura
			txtEndereco.setLocation(150, 110); // horizontal x vertical
			txtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "Endereco",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtEndereco.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtEndereco;
	}
	public JTextField getTxtTelefone() {
		if (txtTelefone == null) {
			txtTelefone = new JTextField();
			txtTelefone.setSize(95, 40); // largura x altura
			txtTelefone.setLocation(150, 160); // horizontal x vertical
			txtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "Telefone",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtTelefone.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtTelefone;
	}
	public JTextField getTxtHI() {
		if (txtHI == null) {
			txtHI = new JTextField();
			txtHI.setSize(125, 40); // largura x altura
			txtHI.setLocation(150, 210); // horizontal x vertical
			txtHI.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "Horario de inicio",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtHI.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtHI;
	}
	public JTextField getTxtHT() {
		if (txtHT == null) {
			txtHT = new JTextField();
			txtHT.setSize(125, 40); // largura x altura
			txtHT.setLocation(290, 210); // horizontal x vertical
			txtHT.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "Horario de termino",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtHT.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtHT;
	}
	public JTextField getTxtConjunto1() {
		if (txtConjunto1 == null) {
			txtConjunto1 = new JTextField();
			txtConjunto1.setSize(75, 40); // largura x altura
			txtConjunto1.setLocation(150, 260); // horizontal x vertical
			txtConjunto1.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "Conjunto1",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtConjunto1.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtConjunto1;
	}
	public JTextField getTxtConjunto2() {
		if (txtConjunto2 == null) {
			txtConjunto2 = new JTextField();
			txtConjunto2.setSize(75, 40); // largura x altura
			txtConjunto2.setLocation(250, 260); // horizontal x vertical
			txtConjunto2.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "Conjunto 2",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtConjunto2.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtConjunto2;
	}
	public JTextField getTxtConjunto3() {
		if (txtConjunto3 == null) {
			txtConjunto3 = new JTextField();
			txtConjunto3.setSize(75, 40); // largura x altura
			txtConjunto3.setLocation(350, 260); // horizontal x vertical
			txtConjunto3.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "Conjunto 3",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtConjunto3.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtConjunto3;
	}
	public JTextField getTxtTemperaturaMaxima() {
		if (txtTemperaturaMaxima == null) {
			txtTemperaturaMaxima = new JTextField();
			txtTemperaturaMaxima.setSize(140, 40); // largura x altura
			txtTemperaturaMaxima.setLocation(150, 310); // horizontal x vertical
			txtTemperaturaMaxima.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "Temperatura Maxima",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtTemperaturaMaxima.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtTemperaturaMaxima;
	}
	public JTextField getTxtArHI() {
		if (txtArHI == null) {
			txtArHI = new JTextField();
			txtArHI.setSize(140, 40); // largura x altura
			txtArHI.setLocation(300, 310); // horizontal x vertical
			txtArHI.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "Ar Horario de inicio",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtArHI.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtArHI;
	}
	public JTextField getTxtArHT() {
		if (txtArHT == null) {
			txtArHT = new JTextField();
			txtArHT.setSize(140, 40); // largura x altura
			txtArHT.setLocation(440, 310); // horizontal x vertical
			txtArHT.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "Ar Horario de termino",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtArHT.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtArHT;
	}
	public JTextField getTxtMensagem() {
		if (txtMensagem == null) {
			txtMensagem = new JTextField();
			txtMensagem.setSize(550, 40); // largura x altura
			txtMensagem.setLocation(40, 355); // horizontal x vertical
			txtMensagem.setBorder(javax.swing.BorderFactory.createTitledBorder(
					null, "Mensagem",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
					javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Dialog", java.awt.Font.BOLD, 11), null));
			txtMensagem.setFont(new java.awt.Font("Dialog",
					java.awt.Font.PLAIN, 12));
		}
		return txtMensagem;
	}
	/**
	 * manipula os eventos do botao confirma
	 * @return - um objeto do JButton
	 */
	public JButton getBtnConfirma() {

		if (btnConfirma == null) {
			btnConfirma = new JButton();
			btnConfirma.setFont(new Font("Dialog", Font.BOLD, 11));
			btnConfirma.setText("Confirma");
			btnConfirma.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					txtMensagem.setText(controle.setAtributos(getTxtCNPJ().getText(), getTxtRazaoSocial().getText(), getTxtEndereco().getText(),
							getTxtHI().getText(), getTxtHT().getText(),getTxtConjunto1().getText(),
							getTxtConjunto2().getText(),getTxtConjunto3().getText(),
							getTxtTemperaturaMaxima().getText(),getTxtArHI().getText(), getTxtArHT().getText()));
					
				}
			});
		}
		return btnConfirma;
	}

	private JButton getBtnSair() {
		if (btnSair == null) {
			btnSair = new JButton();
			btnSair.setText("Sair");
			btnSair.setFont(new Font("Dialog", Font.BOLD, 11));
			btnSair.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					dispose();
				}
			});
		}
		return btnSair;
	}

	private JButton getBtnLimpar() {
		if (btnLimpar == null) {
			btnLimpar = new JButton();
			btnLimpar.setFont(new Font("Dialog", Font.BOLD, 11));
			btnLimpar.setText("Limpar");
		}
		return btnLimpar;
	}
	
}
