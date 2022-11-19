import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaDatos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaDatos frame = new VentanaDatos();
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
	public VentanaDatos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel verde = new JPanel();
		verde.setLayout(null);
		verde.setBackground(new Color(46, 139, 87));
		verde.setBounds(6, 6, 555, 150);
		contentPane.add(verde);
		
		JLabel ecoEnergy = new JLabel("EcoEnergy");
		ecoEnergy.setFont(new Font("Songti TC", Font.BOLD | Font.ITALIC, 75));
		ecoEnergy.setBounds(109, 18, 348, 106);
		verde.add(ecoEnergy);
		
		JLabel bienvenido = new JLabel("¡Bienvenido!");
		bienvenido.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		bienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		bienvenido.setBounds(200, 201, 142, 31);
		contentPane.add(bienvenido);
		
		JLabel seleccioneOpcion = new JLabel("Seleccione una opción:");
		seleccioneOpcion.setHorizontalAlignment(SwingConstants.CENTER);
		seleccioneOpcion.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		seleccioneOpcion.setBounds(175, 232, 198, 19);
		contentPane.add(seleccioneOpcion);
		
		final JPanel electrodomesticos = new JPanel();
		electrodomesticos.setBackground(new Color(0, 153, 153));
		electrodomesticos.setBounds(175, 344, 198, 41);
		contentPane.add(electrodomesticos);
		electrodomesticos.setLayout(null);
		final JLabel textoElectro = new JLabel("Consumo de energía");
		textoElectro.setBounds(6, 6, 184, 16);
		textoElectro.setHorizontalAlignment(SwingConstants.CENTER);
		electrodomesticos.add(textoElectro);
		electrodomesticos.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				electrodomesticos.setBackground(new Color(0, 123, 123));
				textoElectro.setForeground(Color.WHITE);
			}
			public void mouseExited(MouseEvent e) {
				electrodomesticos.setBackground(new Color(0, 153, 153));
				textoElectro.setForeground(Color.black);
			}
			public void mouseClicked(MouseEvent e) {
				Electrodomesticos ventanaNuevaElectro = new Electrodomesticos();
				ventanaNuevaElectro.setVisible(true);
			}
		});
		
		final JPanel agua = new JPanel();
		agua.setBackground(new Color(0, 153, 204));
		agua.setBounds(175, 412, 198, 41);
		contentPane.add(agua);
		agua.setLayout(null);
		final JLabel textoAgua = new JLabel("Consumo de agua");
		textoAgua.setHorizontalAlignment(SwingConstants.CENTER);
		textoAgua.setBounds(6, 6, 184, 16);
		agua.add(textoAgua);
		agua.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				agua.setBackground(new Color(0, 123, 174));
				textoAgua.setForeground(Color.WHITE);
			}
			public void mouseExited(MouseEvent e) {
				agua.setBackground(new Color(0, 153, 204));
				textoAgua.setForeground(Color.BLACK);
			}
			public void mouseClicked(MouseEvent e) {
				Agua ventanaNuevaAgua = new Agua();
				ventanaNuevaAgua.setVisible(true);
			}
		});
		
		final JPanel gasolina = new JPanel();
		gasolina.setBackground(new Color(102, 204, 204));
		gasolina.setBounds(175, 278, 198, 41);
		contentPane.add(gasolina);
		gasolina.setLayout(null);
		final JLabel textoGasolina = new JLabel("Consumo de gasolina");
		textoGasolina.setHorizontalAlignment(SwingConstants.CENTER);
		textoGasolina.setBounds(6, 6, 184, 16);
		gasolina.add(textoGasolina);
		gasolina.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				gasolina.setBackground(new Color(72, 174, 174));
				textoGasolina.setForeground(Color.WHITE);
			}
			public void mouseExited(MouseEvent e) {
				gasolina.setBackground(new Color(102, 204, 204));
				textoGasolina.setForeground(Color.BLACK);
			}
			public void mouseClicked(MouseEvent e) {
				Gasolina ventanaNuevaGasolina = new Gasolina();
				ventanaNuevaGasolina.setVisible(true);
			}
		});
		
		final JPanel cerrarSesion = new JPanel();
		cerrarSesion.setBackground(Color.LIGHT_GRAY);
		cerrarSesion.setForeground(Color.LIGHT_GRAY);
		cerrarSesion.setBounds(16, 168, 104, 19);
		contentPane.add(cerrarSesion);
		final JLabel salir = new JLabel("Salir y Cerrar Sesion");
		salir.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		cerrarSesion.add(salir);
		cerrarSesion.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				cerrarSesion.setBackground(Color.DARK_GRAY);
				salir.setForeground(Color.WHITE);
			}
			public void mouseExited(MouseEvent e) {
				cerrarSesion.setBackground(Color.LIGHT_GRAY);
				salir.setForeground(Color.BLACK);
			}
			public void mouseClicked(MouseEvent e) {
				ProyectoFinalGUI regresar = new ProyectoFinalGUI();
				regresar.setVisible(true);
			}
		});
		
	}
}
