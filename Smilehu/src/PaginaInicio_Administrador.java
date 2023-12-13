import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import javax.swing.DropMode;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public class PaginaInicio_Administrador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSmilehub;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaInicio_Administrador PaginaInicio_Administrador = new PaginaInicio_Administrador();
					PaginaInicio_Administrador.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PaginaInicio_Administrador() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 570);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(4, 20, 36));
		contentPane.setForeground(new Color(4, 20, 36));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSmilehub = new JTextField();
		txtSmilehub.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtSmilehub.setBackground(new Color(205, 234, 251));
		txtSmilehub.setEditable(false);
		txtSmilehub.setHorizontalAlignment(SwingConstants.CENTER);
		txtSmilehub.setText("SmileHub\r\n");
		txtSmilehub.setBounds(379, 11, 277, 31);
		contentPane.add(txtSmilehub);
		txtSmilehub.setColumns(10);
		
		JPanel content = new JPanel();
		content.setBackground(new Color(42, 61, 80));
		content.setBounds(34, 147, 974, 373);
		contentPane.add(content);
		content.setLayout(null);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(42, 61, 80));
		panel_2.setBounds(34, 53, 710, 82);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btn_usuarios = new JButton("Usuarios");
		btn_usuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				content.removeAll();
				Panel_admin_usuarios pag_usuarios =new Panel_admin_usuarios();
				content.add(pag_usuarios);
				((BasicInternalFrameUI) pag_usuarios.getUI()).setNorthPane(null);
				pag_usuarios.setLocation(0,0);
				pag_usuarios.show();
			


			}

		
		});
		btn_usuarios.setBounds(10, 34, 164, 23);
		panel_2.add(btn_usuarios);
		
		JButton btn_GestionMedica = new JButton("Gestion Medica");
		btn_GestionMedica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				content.removeAll();
				Jdialog_admin_GestMedica pag_GestMedica =new Jdialog_admin_GestMedica();
				pag_GestMedica.setUndecorated(true);			
				pag_GestMedica.setLocation(10,34);
				pag_GestMedica.setModal(true);
				pag_GestMedica.setVisible(true);
				
				
				
			}
		});
		btn_GestionMedica.setBounds(184, 34, 164, 23);
		panel_2.add(btn_GestionMedica);
		
		JButton btn_GestionEconomica = new JButton("Gestion Economica");
		btn_GestionEconomica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				content.removeAll();
				Panel_admin_GestEconomica pag_GestEconomica =new Panel_admin_GestEconomica();
				content.add(pag_GestEconomica);
				((BasicInternalFrameUI) pag_GestEconomica.getUI()).setNorthPane(null);
				pag_GestEconomica.setLocation(0,0);
				pag_GestEconomica.show();
				
			}
		});
		btn_GestionEconomica.setBounds(358, 34, 164, 23);
		panel_2.add(btn_GestionEconomica);
		
		JButton btn_Material = new JButton("Material");
		btn_Material.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Panel_admin_Material pag_Material =new Panel_admin_Material();
				content.removeAll();
				content.add(pag_Material);
				((BasicInternalFrameUI) pag_Material.getUI()).setNorthPane(null);
				pag_Material.setLocation(0,0);
				pag_Material.setVisible(true);
			
			}
		});
		btn_Material.setBounds(532, 34, 164, 23);
		panel_2.add(btn_Material);
		
		JMenuBar Menu_DNI = new JMenuBar();
		Menu_DNI.setBounds(907, 11, 101, 22);
		contentPane.add(Menu_DNI);
		
		JMenu mnNewMenu_5 = new JMenu("DNI");
		Menu_DNI.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Editar Perfil");
		mnNewMenu_5.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("New menu item");
		mnNewMenu_5.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Cerrar Perfil");
		mnNewMenu_5.add(mntmNewMenuItem_9);
		
		JLabel lbl_nombreAdmin = new JLabel("Nombre Admin");
		lbl_nombreAdmin.setForeground(new Color(255, 255, 128));
		lbl_nombreAdmin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_nombreAdmin.setBounds(779, 67, 213, 44);
		contentPane.add(lbl_nombreAdmin);
	}
}
