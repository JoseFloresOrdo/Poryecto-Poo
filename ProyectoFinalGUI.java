import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProyectoFinalGUI extends JFrame {

	private JPanel contentPane;
	private Usuario usuario;
	private JTextField ingresoNombre;
	private JTextField ingresoCorreo;
	private JTextField ingresoPais;
	private JTextField ingresoMiembros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProyectoFinalGUI frame = new ProyectoFinalGUI();
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
	public ProyectoFinalGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		final Usuario usuario = new Usuario();
		JPanel panel = new JPanel();
		panel.setBackground(new Color(46, 139, 87));
		panel.setBounds(6, 6, 555, 150);
		contentPane.add(panel);
		panel.setLayout(null);
		
		final JLabel lblNewLabel = new JLabel("EcoEnergy");
		lblNewLabel.setBounds(109, 18, 348, 106);
		lblNewLabel.setFont(new Font("Songti TC", Font.BOLD | Font.ITALIC, 75));
		panel.add(lblNewLabel);
		
		final JLabel inicioLabel = new JLabel("Inicio de Sesión");
		inicioLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		inicioLabel.setBounds(202, 197, 171, 33);
		contentPane.add(inicioLabel);
		
		final JPanel nombre = new JPanel();
		nombre.setBackground(new Color(169, 169, 169));
		nombre.setForeground(new Color(220, 220, 220));
		nombre.setBounds(128, 256, 132, 26);
		contentPane.add(nombre);
		nombre.setLayout(null);
		
		final JLabel nombreLabel = new JLabel("Nombre:");
		nombreLabel.setBounds(39, 6, 54, 16);
		nombre.add(nombreLabel);
		
		final JPanel correo = new JPanel();
		correo.setLayout(null);
		correo.setForeground(new Color(220, 220, 220));
		correo.setBackground(new Color(169, 169, 169));
		correo.setBounds(128, 299, 132, 26);
		contentPane.add(correo);
		
		final JLabel correoLabel = new JLabel("Correo:");
		correoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		correoLabel.setBounds(39, 6, 54, 16);
		correo.add(correoLabel);
		
		final JPanel pais = new JPanel();
		pais.setLayout(null);
		pais.setForeground(new Color(220, 220, 220));
		pais.setBackground(new Color(169, 169, 169));
		pais.setBounds(128, 337, 132, 26);
		contentPane.add(pais);
		
		final JLabel paisLabel = new JLabel("País:");
		paisLabel.setHorizontalAlignment(SwingConstants.CENTER);
		paisLabel.setBounds(39, 6, 54, 16);
		pais.add(paisLabel);
		
		ingresoNombre = new JTextField();
		ingresoNombre.setBounds(302, 256, 132, 26);
		contentPane.add(ingresoNombre);
		ingresoNombre.setColumns(10);
		
		ingresoCorreo = new JTextField();
		ingresoCorreo.setColumns(10);
		ingresoCorreo.setBounds(302, 299, 132, 26);
		contentPane.add(ingresoCorreo);
		
		ingresoPais = new JTextField();
		ingresoPais.setColumns(10);
		ingresoPais.setBounds(302, 337, 132, 26);
		contentPane.add(ingresoPais);
		
		final JPanel botonIngresar = new JPanel();
		botonIngresar.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				botonIngresar.setBackground(Color.DARK_GRAY);
			}
			
			public void mouseExited(MouseEvent e) {
				botonIngresar.setBackground(Color.LIGHT_GRAY);
			}
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		botonIngresar.setBackground(Color.LIGHT_GRAY);
		botonIngresar.setBounds(224, 439, 132, 26);
		contentPane.add(botonIngresar);
		botonIngresar.setLayout(null);
		
		JLabel ingresoLabel = new JLabel("Ingresar");
		ingresoLabel.setBounds(35, 6, 61, 16);
		botonIngresar.add(ingresoLabel);
		
		JPanel miembros = new JPanel();
		miembros.setLayout(null);
		miembros.setForeground(new Color(220, 220, 220));
		miembros.setBackground(new Color(169, 169, 169));
		miembros.setBounds(128, 375, 132, 26);
		contentPane.add(miembros);
		
		JLabel miembrosLabel = new JLabel("Miembros:");
		miembrosLabel.setHorizontalAlignment(SwingConstants.CENTER);
		miembrosLabel.setBounds(32, 6, 73, 16);
		miembros.add(miembrosLabel);
		
		ingresoMiembros = new JTextField();
		ingresoMiembros.setColumns(10);
		ingresoMiembros.setBounds(302, 375, 132, 26);
		contentPane.add(ingresoMiembros);
	}
}
