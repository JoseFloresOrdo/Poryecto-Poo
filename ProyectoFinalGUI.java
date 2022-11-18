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
import java.io.*
;public class ProyectoFinalGUI extends JFrame {

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
		File Archivo = new File("C:" + File.separator + "Users" + File.separatorChar + "José Javier Flores" + File.separator + "Desktop" + File.separator + "Prueba.txt");
		String Destino = Archivo.getAbsolutePath();
        try{
            Archivo.createNewFile();
        } catch (IOException e){
            e.printStackTrace();
        }

        Escribiendo accede = new Escribiendo();

        accede.escribir(Destino);
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
		final JPanel verde = new JPanel();
		verde.setBackground(new Color(46, 139, 87));
		verde.setBounds(6, 6, 555, 150);
		contentPane.add(verde);
		verde.setLayout(null);
		
		final JLabel ecoEnergy = new JLabel("EcoEnergy");
		ecoEnergy.setBounds(109, 18, 348, 106);
		ecoEnergy.setFont(new Font("Songti TC", Font.BOLD | Font.ITALIC, 75));
		verde.add(ecoEnergy);
		
		final JLabel inicioLabel = new JLabel("Inicio de Sesión");
		inicioLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		inicioLabel.setBounds(202, 197, 171, 33);
		contentPane.add(inicioLabel);
		
		final JPanel nombre = new JPanel();
		nombre.setBackground(new Color(0, 139, 139));
		nombre.setForeground(new Color(220, 220, 220));
		nombre.setBounds(106, 256, 154, 26);
		contentPane.add(nombre);
		nombre.setLayout(null);
		
		final JLabel nombreLabel = new JLabel("Nombre:");
		nombreLabel.setBounds(54, 6, 54, 16);
		nombre.add(nombreLabel);
		
		final JPanel correo = new JPanel();
		correo.setLayout(null);
		correo.setForeground(new Color(220, 220, 220));
		correo.setBackground(new Color(0, 128, 128));
		correo.setBounds(106, 299, 154, 26);
		contentPane.add(correo);
		
		final JLabel correoLabel = new JLabel("Correo:");
		correoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		correoLabel.setBounds(56, 6, 54, 16);
		correo.add(correoLabel);
		
		final JPanel pais = new JPanel();
		pais.setLayout(null);
		pais.setForeground(new Color(220, 220, 220));
		pais.setBackground(new Color(51, 102, 102));
		pais.setBounds(106, 337, 154, 26);
		contentPane.add(pais);
		
		final JLabel paisLabel = new JLabel("País:");
		paisLabel.setForeground(Color.WHITE);
		paisLabel.setHorizontalAlignment(SwingConstants.CENTER);
		paisLabel.setBounds(53, 6, 54, 16);
		pais.add(paisLabel);
		
		final JPanel miembros = new JPanel();
		miembros.setLayout(null);
		miembros.setForeground(new Color(220, 220, 220));
		miembros.setBackground(new Color(47, 79, 79));
		miembros.setBounds(106, 375, 154, 26);
		contentPane.add(miembros);
		
		final JLabel miembrosLabel = new JLabel("Miembros de familia:");
		miembrosLabel.setForeground(Color.WHITE);
		miembrosLabel.setBackground(Color.WHITE);
		miembrosLabel.setHorizontalAlignment(SwingConstants.CENTER);
		miembrosLabel.setBounds(6, 6, 142, 16);
		miembros.add(miembrosLabel);
		
		ingresoNombre = new JTextField();
		ingresoNombre.setBounds(302, 256, 154, 26);
		contentPane.add(ingresoNombre);
		ingresoNombre.setColumns(10);
		
		ingresoCorreo = new JTextField();
		ingresoCorreo.setColumns(10);
		ingresoCorreo.setBounds(302, 299, 154, 26);
		contentPane.add(ingresoCorreo);
		
		ingresoPais = new JTextField();
		ingresoPais.setColumns(10);
		ingresoPais.setBounds(302, 337, 154, 26);
		contentPane.add(ingresoPais);
		
		ingresoMiembros = new JTextField();
		ingresoMiembros.setColumns(10);
		ingresoMiembros.setBounds(302, 375, 154, 26);
		contentPane.add(ingresoMiembros);
		
		final JPanel botonIngresar = new JPanel();
		botonIngresar.setBackground(Color.LIGHT_GRAY);
		botonIngresar.setBounds(224, 439, 132, 26);
		contentPane.add(botonIngresar);
		botonIngresar.setLayout(null);
		
		final JLabel ingresoLabel = new JLabel("Ingresar");
		ingresoLabel.setBounds(40, 6, 61, 16);
		botonIngresar.add(ingresoLabel);
		botonIngresar.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				botonIngresar.setBackground(Color.darkGray);
				ingresoLabel.setForeground(Color.WHITE);
			}
			public void mouseExited(MouseEvent e) {
				botonIngresar.setBackground(Color.LIGHT_GRAY);
				ingresoLabel.setForeground(Color.BLACK);
			}
			public void mouseClicked(MouseEvent e) {
				usuario.setNombre(ingresoNombre.getText());
				usuario.setCorreo(ingresoCorreo.getText());
				usuario.setPais(ingresoPais.getText());
				usuario.setMiembros(Integer.parseInt(ingresoMiembros.getText()));
				VentanaDatos ventanaNueva = new VentanaDatos();
				ventanaNueva.setVisible(true);
			}
		});
	}
}
