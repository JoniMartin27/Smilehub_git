import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Jdialog_admin_GestMedica extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Jdialog_admin_GestMedica dialog = new Jdialog_admin_GestMedica();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Jdialog_admin_GestMedica() {
		setBounds(100, 100, 648, 453);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lbl_Tratamientos = new JLabel("Tratamientos");
		lbl_Tratamientos.setBounds(10, 112, 88, 14);
		contentPanel.add(lbl_Tratamientos);
		
		ButtonGroup group = new ButtonGroup();

		JRadioButton radio1 = new JRadioButton("Limpieza Dental");
		radio1.setBounds(10, 133, 109, 23);
		contentPanel.add(radio1);
		
		JRadioButton radio2 = new JRadioButton("Examen Dental");
		radio2.setBounds(10, 159, 109, 23);
		contentPanel.add(radio2);
		
		JRadioButton radio3 = new JRadioButton("Radiografías Dentales");
		radio3.setBounds(10, 185, 142, 23);
		contentPanel.add(radio3);
		
		JRadioButton radio4 = new JRadioButton("Rellenos Dentales");
		radio4.setBounds(10, 211, 123, 23);
		contentPanel.add(radio4);
		
		JRadioButton radio5 = new JRadioButton("Tratamiento de Conducto ");
		radio5.setBounds(10, 237, 158, 23);
		contentPanel.add(radio5);
		
		JRadioButton radio6 = new JRadioButton("Coronas Dentales");
		radio6.setBounds(10, 263, 123, 23);
		contentPanel.add(radio6);
		
		JRadioButton radio7 = new JRadioButton("Puentes Dentales");
		radio7.setBounds(10, 289, 109, 23);
		contentPanel.add(radio7);
		
		JRadioButton radio8 = new JRadioButton("Implantes Dentales");
		radio8.setBounds(10, 315, 123, 23);
		contentPanel.add(radio8);
		
		JRadioButton radio9 = new JRadioButton("Ortodoncia");
		radio9.setBounds(10, 341, 109, 23);
		contentPanel.add(radio9);
		
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);
		group.add(radio4);
		group.add(radio5);
		group.add(radio6);
		group.add(radio7);
		group.add(radio8);
		group.add(radio9);
		
		textField = new JTextField();
		textField.setBounds(337, 44, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lbl_nombreUsuario = new JLabel("Nombre Usuario");
		lbl_nombreUsuario.setBounds(239, 47, 88, 14);
		contentPanel.add(lbl_nombreUsuario);
		
	}
}
