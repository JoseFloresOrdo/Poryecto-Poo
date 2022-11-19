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
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

public class Agua extends JFrame {

	private JPanel contentPane;
	private JTextField numeroDatosInodoro;
	private JTextField numeroDatosRegadera;
	private JTextField numeroDatosLavadora;
	private JTextField numeroDatosGrifo;
	private JTextField valorMinutosUso;
	private JTextField valorAguaEchada;
	private JTextField valorUsoDiario;
	private JTextField valorMinutosBanarse;
	private JTextField numeroDatosLavavajilla;
	private JTextField minutosUsoDiarioLavavajillas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agua frame = new Agua();
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
	public Agua() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		final GastoAgua agua = new GastoAgua();
		JPanel verde = new JPanel();
		verde.setLayout(null);
		verde.setBackground(new Color(0, 153, 204));
		verde.setBounds(6, 6, 555, 150);
		contentPane.add(verde);
		
		JLabel lblClculoDeGasto = new JLabel("Cálculo de gasto de Agua");
		lblClculoDeGasto.setHorizontalAlignment(SwingConstants.CENTER);
		lblClculoDeGasto.setFont(new Font("Songti TC", Font.BOLD | Font.ITALIC, 43));
		lblClculoDeGasto.setBounds(19, 21, 519, 106);
		verde.add(lblClculoDeGasto);
		
		final JPanel cerrarSesion = new JPanel();
		cerrarSesion.setForeground(Color.LIGHT_GRAY);
		cerrarSesion.setBackground(Color.LIGHT_GRAY);
		cerrarSesion.setBounds(16, 168, 104, 19);
		contentPane.add(cerrarSesion);
		final JLabel regresarMenu = new JLabel("Regresar");
		regresarMenu.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		cerrarSesion.add(regresarMenu);
		
		final JLabel ingreseDatos = new JLabel("Ingrese lo que se le solicita acorde a lo que tiene en su casa:");
		ingreseDatos.setHorizontalAlignment(SwingConstants.CENTER);
		ingreseDatos.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		ingreseDatos.setBounds(69, 185, 436, 31);
		contentPane.add(ingreseDatos);
		
		final JLabel cantidadInodoro = new JLabel("Ingrese la cantidad de inodoros:");
		cantidadInodoro.setBounds(16, 238, 211, 16);
		contentPane.add(cantidadInodoro);
		
		numeroDatosInodoro = new JTextField();
		numeroDatosInodoro.setBounds(239, 233, 39, 26);
		contentPane.add(numeroDatosInodoro);
		numeroDatosInodoro.setColumns(10);
		
		final JLabel cantidadRegadera = new JLabel("Ingrese la cantidad de regaderas:");
		cantidadRegadera.setBounds(16, 273, 211, 16);
		contentPane.add(cantidadRegadera);
		
		final JLabel cantidadLavadora = new JLabel("Ingrese la cantidad de lavadoras:");
		cantidadLavadora.setBounds(16, 306, 211, 16);
		contentPane.add(cantidadLavadora);
		
		numeroDatosRegadera = new JTextField();
		numeroDatosRegadera.setColumns(10);
		numeroDatosRegadera.setBounds(239, 271, 39, 26);
		contentPane.add(numeroDatosRegadera);
		
		numeroDatosLavadora = new JTextField();
		numeroDatosLavadora.setColumns(10);
		numeroDatosLavadora.setBounds(239, 301, 39, 26);
		contentPane.add(numeroDatosLavadora);
		
		final JLabel cantidadChorro = new JLabel("Ingrese la cantidad de grifos:");
		cantidadChorro.setBounds(16, 341, 211, 16);
		contentPane.add(cantidadChorro);
		
		numeroDatosGrifo = new JTextField();
		numeroDatosGrifo.setColumns(10);
		numeroDatosGrifo.setBounds(239, 336, 39, 26);
		contentPane.add(numeroDatosGrifo);
		
		JLabel minutosUso = new JLabel("Minutos de uso al día:");
		minutosUso.setBounds(310, 341, 190, 16);
		contentPane.add(minutosUso);
		
		valorMinutosUso = new JTextField();
		valorMinutosUso.setColumns(10);
		valorMinutosUso.setBounds(510, 336, 39, 26);
		contentPane.add(valorMinutosUso);
		
		JLabel aguaEchada = new JLabel("Veces que se echa agua al día:");
		aguaEchada.setBounds(310, 238, 190, 16);
		contentPane.add(aguaEchada);
		
		JLabel minutosBanarse = new JLabel("Minutos de aseado al día:");
		minutosBanarse.setBounds(310, 273, 195, 16);
		contentPane.add(minutosBanarse);
		
		JLabel usoDiario = new JLabel("Uso diario:");
		usoDiario.setBounds(310, 306, 190, 16);
		contentPane.add(usoDiario);
		
		valorAguaEchada = new JTextField();
		valorAguaEchada.setColumns(10);
		valorAguaEchada.setBounds(510, 233, 39, 26);
		contentPane.add(valorAguaEchada);
		
		valorMinutosBanarse = new JTextField();
		valorMinutosBanarse.setColumns(10);
		valorMinutosBanarse.setBounds(510, 268, 39, 26);
		contentPane.add(valorMinutosBanarse);
		
		valorUsoDiario = new JTextField();
		valorUsoDiario.setColumns(10);
		valorUsoDiario.setBounds(510, 301, 39, 26);
		contentPane.add(valorUsoDiario);
		cerrarSesion.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				cerrarSesion.setBackground(Color.DARK_GRAY);
				regresarMenu.setForeground(Color.WHITE);
			}
			public void mouseExited(MouseEvent e) {
				cerrarSesion.setBackground(Color.LIGHT_GRAY);
				regresarMenu.setForeground(Color.BLACK);
			}
			public void mouseClicked(MouseEvent e) {
				VentanaDatos regresar = new VentanaDatos();
				regresar.setVisible(true);
			}
		});
		
		
		final JLabel cantidadLavavajilla = new JLabel("Ingrese la cantidad de lavavajillas:");
		cantidadLavavajilla.setBounds(16, 379, 222, 16);
		contentPane.add(cantidadLavavajilla);
		
		numeroDatosLavavajilla = new JTextField();
		numeroDatosLavavajilla.setColumns(10);
		numeroDatosLavavajilla.setBounds(239, 374, 39, 26);
		contentPane.add(numeroDatosLavavajilla);
		
		final JLabel minutosUsoLavaVajillas = new JLabel("Minutos de uso al día:");
		minutosUsoLavaVajillas.setBounds(310, 379, 190, 16);
		contentPane.add(minutosUsoLavaVajillas);
		
		minutosUsoDiarioLavavajillas = new JTextField();
		minutosUsoDiarioLavavajillas.setColumns(10);
		minutosUsoDiarioLavavajillas.setBounds(510, 374, 39, 26);
		contentPane.add(minutosUsoDiarioLavavajillas);
		
		JLabel lblNewLabel_1 = new JLabel("Ayuda: Si no posee algun electrodoméstico coloque 0.");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		lblNewLabel_1.setBounds(190, 212, 188, 16);
		contentPane.add(lblNewLabel_1);
		
		final JLabel mensajeFinal = new JLabel();
		mensajeFinal.setHorizontalAlignment(SwingConstants.CENTER);
		mensajeFinal.setBounds(142, 448, 336, 16);
		contentPane.add(mensajeFinal);
		
		final JLabel calculoTotal = new JLabel();
		calculoTotal.setHorizontalAlignment(SwingConstants.CENTER);
		calculoTotal.setBounds(204, 476, 200, 16);
		contentPane.add(calculoTotal);
		
		JButton calcular = new JButton("Calcular");
		calcular.setBounds(238, 412, 117, 29);
		contentPane.add(calcular);
		calcular.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				agua.setInodoro(Integer.parseInt(valorAguaEchada.getText()));
				agua.setRegadera(Integer.parseInt(valorMinutosBanarse.getText()));
				agua.setLavadora(Integer.parseInt(valorUsoDiario.getText()));
				agua.setChorro(Integer.parseInt(valorMinutosUso.getText()));
				agua.setLavavajillas(Integer.parseInt(minutosUsoDiarioLavavajillas.getText()));
				mensajeFinal.setText("La cantidad de agua gastada al día es de:");
				calculoTotal.setText(agua.AsignacionesGastos(agua.getInodoro(), agua.getRegadera(), agua.getLavadora(), agua.getChorro(), agua.getLavavajillas())+ " Litros");
			}
		});
	}
}
