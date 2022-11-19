import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Gasolina extends JFrame {

	private JPanel contentPane;
	private JTextField ingresoTextoModelo;
	private JTextField ingresoTextoGasto;
	private GastoGasolina gasolina;
	private Integer cambio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gasolina frame = new Gasolina();
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
	public Gasolina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		gasolina = new GastoGasolina();
		JPanel verde = new JPanel();
		verde.setLayout(null);
		verde.setBackground(new Color(102, 204, 204));
		verde.setBounds(6, 6, 555, 150);
		contentPane.add(verde);
		
		JLabel lblClculoDeGasto = new JLabel("Cálculo de gasto de Gasolina");
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
		cerrarSesion.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				cerrarSesion.setBackground(Color.DARK_GRAY);
				regresarMenu.setForeground(Color.white);
			}
			public void mouseExited(MouseEvent e) {
				cerrarSesion.setBackground(Color.LIGHT_GRAY);
				regresarMenu.setForeground(Color.black);
			}
			public void mouseClicked(MouseEvent e) {
				VentanaDatos regresarMenu = new VentanaDatos();
				regresarMenu.setVisible(true);
			}
		});
		
		ingresoTextoModelo = new JTextField();
		ingresoTextoModelo.setBounds(370, 252, 130, 26);
		contentPane.add(ingresoTextoModelo);
		ingresoTextoModelo.setColumns(10);
		
		ingresoTextoGasto = new JTextField();
		ingresoTextoGasto.setColumns(10);
		ingresoTextoGasto.setBounds(370, 320, 130, 26);
		contentPane.add(ingresoTextoGasto);
		
		JLabel modelo = new JLabel("Tipo de carro (debe ingresar un número):");
		modelo.setBounds(101, 257, 257, 16);
		contentPane.add(modelo);
		
		JLabel gasto = new JLabel("Kilometros recorridos a diario:");
		gasto.setBounds(101, 325, 223, 16);
		contentPane.add(gasto);
		
		JButton calcular = new JButton("Calcular");
		calcular.setBounds(230, 367, 117, 29);
		contentPane.add(calcular);
		
		JLabel ingreseDatos = new JLabel("Ingrese los datos que se le piden:");
		ingreseDatos.setHorizontalAlignment(SwingConstants.CENTER);
		ingreseDatos.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		ingreseDatos.setBounds(139, 204, 297, 31);
		contentPane.add(ingreseDatos);
		
		JLabel ayuda = new JLabel("Ayuda:");
		ayuda.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		ayuda.setBounds(111, 274, 61, 16);
		contentPane.add(ayuda);
		
		final JLabel mostrarResultado = new JLabel();
		mostrarResultado.setBounds(139, 408, 361, 19);
		contentPane.add(mostrarResultado);
		
		final JLabel mostrarNumero = new JLabel();
		mostrarNumero.setHorizontalAlignment(SwingConstants.CENTER);
		mostrarNumero.setBounds(165, 439, 260, 19);
		contentPane.add(mostrarNumero);
		
		JLabel tipo1y2 = new JLabel("1-Mediano, 2-SUV, 3-Eléctrico, 4-Otro");
		tipo1y2.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		tipo1y2.setBounds(121, 297, 173, 16);
		contentPane.add(tipo1y2);
		calcular.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				gasolina.setTipocarro(Integer.parseInt(ingresoTextoModelo.getText()));
				gasolina.setKilometrosaldia(Integer.parseInt(ingresoTextoGasto.getText()));
				mostrarResultado.setText("La emisión de dióxido de carbono total es de: ");
				mostrarNumero.setText(gasolina.AsignacionesGastos(gasolina.getTipocarro(), gasolina.getKilometrosaldia())+ " Ppm");
			}
		});
	}
}
