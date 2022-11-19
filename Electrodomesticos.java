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
import javax.swing.JTextField;
import javax.swing.JButton;

public class Electrodomesticos extends JFrame {

	private JPanel contentPane;
	private JTextField cantCalefaccion;
	private JTextField minutosCalefaccion;
	private JTextField cantLavavajillas;
	private JTextField minutosLavavajillas;
	private JTextField cantVentilador;
	private JTextField minutosVentilador;
	private JTextField cantBombilla;
	private JTextField cantAire;
	private JTextField minutosAire;
	private JTextField cantTV;
	private JTextField minutosTV;
	private JTextField cantMicroondas;
	private JTextField minutosMicroondas;
	private JTextField cantHorno;
	private JTextField minutosHorno;
	private JTextField cantLavadora;
	private JTextField minutosLavadora;
	private JTextField cantTostadora;
	private JTextField minutosTostadora;
	private JTextField cantLicuadora;
	private JTextField minutosLicuadora;
	private JTextField cantRefri;
	private JTextField cantSecadora;
	private JTextField minutosSecadora;
	private JTextField cantPlancha;
	private JTextField minutosPlancha;
	private JTextField cantVideojuegos;
	private JTextField minutosVideojuegos;
	private GastoEnergia electrodomesticos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Electrodomesticos frame = new Electrodomesticos();
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
	public Electrodomesticos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		electrodomesticos = new GastoEnergia();
		
		JPanel verde = new JPanel();
		verde.setLayout(null);
		verde.setBackground(new Color(0, 153, 153));
		verde.setBounds(6, 6, 555, 150);
		contentPane.add(verde);
		
		JLabel lblClculoDeGasto = new JLabel("Cálculo de gasto de Energía");
		lblClculoDeGasto.setHorizontalAlignment(SwingConstants.CENTER);
		lblClculoDeGasto.setFont(new Font("Songti TC", Font.BOLD | Font.ITALIC, 43));
		lblClculoDeGasto.setBounds(19, 21, 519, 106);
		verde.add(lblClculoDeGasto);
		
		JLabel lblIngreseLaCantidad = new JLabel("Ingrese la cantidad y consumo por electrodoméstico:");
		lblIngreseLaCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseLaCantidad.setFont(new Font("Lucida Grande", Font.BOLD, 12));
		lblIngreseLaCantidad.setBounds(149, 168, 349, 19);
		contentPane.add(lblIngreseLaCantidad);
		
		JLabel calefaccion = new JLabel("Calefacción:");
		calefaccion.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		calefaccion.setBounds(6, 209, 86, 16);
		contentPane.add(calefaccion);
		
		cantCalefaccion = new JTextField();
		cantCalefaccion.setColumns(10);
		cantCalefaccion.setBounds(132, 204, 23, 26);
		contentPane.add(cantCalefaccion);
		
		JLabel lavavajillas = new JLabel("Lavavajillas:");
		lavavajillas.setBounds(183, 242, 86, 16);
		contentPane.add(lavavajillas);
		
		minutosCalefaccion = new JTextField();
		minutosCalefaccion.setColumns(10);
		minutosCalefaccion.setBounds(155, 204, 23, 26);
		contentPane.add(minutosCalefaccion);
		
		cantLavavajillas = new JTextField();
		cantLavavajillas.setColumns(10);
		cantLavavajillas.setBounds(299, 237, 23, 26);
		contentPane.add(cantLavavajillas);
		
		minutosLavavajillas = new JTextField();
		minutosLavavajillas.setColumns(10);
		minutosLavavajillas.setBounds(323, 237, 23, 26);
		contentPane.add(minutosLavavajillas);
		
		JLabel ventilador = new JLabel("Ventilador:");
		ventilador.setBounds(372, 209, 86, 16);
		contentPane.add(ventilador);
		
		cantVentilador = new JTextField();
		cantVentilador.setColumns(10);
		cantVentilador.setBounds(499, 204, 23, 26);
		contentPane.add(cantVentilador);
		
		minutosVentilador = new JTextField();
		minutosVentilador.setColumns(10);
		minutosVentilador.setBounds(523, 204, 23, 26);
		contentPane.add(minutosVentilador);
		
		JLabel bombilla = new JLabel("Bombilla:");
		bombilla.setBounds(372, 352, 86, 16);
		contentPane.add(bombilla);
		
		cantBombilla = new JTextField();
		cantBombilla.setColumns(10);
		cantBombilla.setBounds(501, 347, 45, 26);
		contentPane.add(cantBombilla);
		
		JLabel aireAcondicionado = new JLabel("Aire Acondicionado:");
		aireAcondicionado.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		aireAcondicionado.setBounds(6, 242, 121, 16);
		contentPane.add(aireAcondicionado);
		
		JLabel television = new JLabel("Televisión:");
		television.setBounds(6, 278, 86, 16);
		contentPane.add(television);
		
		JLabel microondas = new JLabel("Microondas:");
		microondas.setBounds(6, 315, 86, 16);
		contentPane.add(microondas);
		
		JLabel hornoElectrico = new JLabel("Honro Eléctrico:");
		hornoElectrico.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		hornoElectrico.setBounds(6, 353, 114, 16);
		contentPane.add(hornoElectrico);
		
		JLabel tostadora = new JLabel("Tostadora:");
		tostadora.setBounds(183, 278, 86, 16);
		contentPane.add(tostadora);
		
		JLabel licuadora = new JLabel("Licuadora:");
		licuadora.setBounds(183, 315, 86, 16);
		contentPane.add(licuadora);
		
		JLabel refrigerador = new JLabel("Refrigerador:");
		refrigerador.setBounds(183, 352, 86, 16);
		contentPane.add(refrigerador);
		
		JLabel lavadora = new JLabel("Lavadora:");
		lavadora.setBounds(183, 209, 86, 16);
		contentPane.add(lavadora);
		
		JLabel secadora = new JLabel("Secadora:");
		secadora.setBounds(372, 242, 86, 16);
		contentPane.add(secadora);
		
		JLabel plancha = new JLabel("Plancha:");
		plancha.setBounds(372, 278, 86, 16);
		contentPane.add(plancha);
		
		JLabel videojuego = new JLabel("Consola VideoJuegos:");
		videojuego.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		videojuego.setBounds(372, 315, 141, 16);
		contentPane.add(videojuego);
		
		cantAire = new JTextField();
		cantAire.setColumns(10);
		cantAire.setBounds(132, 237, 23, 26);
		contentPane.add(cantAire);
		
		minutosAire = new JTextField();
		minutosAire.setColumns(10);
		minutosAire.setBounds(155, 237, 23, 26);
		contentPane.add(minutosAire);
		
		cantTV = new JTextField();
		cantTV.setColumns(10);
		cantTV.setBounds(132, 273, 23, 26);
		contentPane.add(cantTV);
		
		minutosTV = new JTextField();
		minutosTV.setColumns(10);
		minutosTV.setBounds(155, 273, 23, 26);
		contentPane.add(minutosTV);
		
		cantMicroondas = new JTextField();
		cantMicroondas.setColumns(10);
		cantMicroondas.setBounds(132, 310, 23, 26);
		contentPane.add(cantMicroondas);
		
		minutosMicroondas = new JTextField();
		minutosMicroondas.setColumns(10);
		minutosMicroondas.setBounds(155, 310, 23, 26);
		contentPane.add(minutosMicroondas);
		
		cantHorno = new JTextField();
		cantHorno.setColumns(10);
		cantHorno.setBounds(132, 347, 23, 26);
		contentPane.add(cantHorno);
		
		minutosHorno = new JTextField();
		minutosHorno.setColumns(10);
		minutosHorno.setBounds(155, 347, 23, 26);
		contentPane.add(minutosHorno);
		
		cantLavadora = new JTextField();
		cantLavadora.setColumns(10);
		cantLavadora.setBounds(299, 204, 23, 26);
		contentPane.add(cantLavadora);
		
		minutosLavadora = new JTextField();
		minutosLavadora.setColumns(10);
		minutosLavadora.setBounds(323, 204, 23, 26);
		contentPane.add(minutosLavadora);
		
		cantTostadora = new JTextField();
		cantTostadora.setColumns(10);
		cantTostadora.setBounds(299, 273, 23, 26);
		contentPane.add(cantTostadora);
		
		minutosTostadora = new JTextField();
		minutosTostadora.setColumns(10);
		minutosTostadora.setBounds(323, 273, 23, 26);
		contentPane.add(minutosTostadora);
		
		cantLicuadora = new JTextField();
		cantLicuadora.setColumns(10);
		cantLicuadora.setBounds(299, 310, 23, 26);
		contentPane.add(cantLicuadora);
		
		minutosLicuadora = new JTextField();
		minutosLicuadora.setColumns(10);
		minutosLicuadora.setBounds(323, 310, 23, 26);
		contentPane.add(minutosLicuadora);
		
		cantRefri = new JTextField();
		cantRefri.setColumns(10);
		cantRefri.setBounds(299, 347, 46, 26);
		contentPane.add(cantRefri);
		
		cantSecadora = new JTextField();
		cantSecadora.setColumns(10);
		cantSecadora.setBounds(499, 237, 23, 26);
		contentPane.add(cantSecadora);
		
		minutosSecadora = new JTextField();
		minutosSecadora.setColumns(10);
		minutosSecadora.setBounds(523, 237, 23, 26);
		contentPane.add(minutosSecadora);
		
		cantPlancha = new JTextField();
		cantPlancha.setColumns(10);
		cantPlancha.setBounds(499, 273, 23, 26);
		contentPane.add(cantPlancha);
		
		minutosPlancha = new JTextField();
		minutosPlancha.setColumns(10);
		minutosPlancha.setBounds(523, 273, 23, 26);
		contentPane.add(minutosPlancha);
		
		cantVideojuegos = new JTextField();
		cantVideojuegos.setColumns(10);
		cantVideojuegos.setBounds(499, 310, 23, 26);
		contentPane.add(cantVideojuegos);
		
		minutosVideojuegos = new JTextField();
		minutosVideojuegos.setColumns(10);
		minutosVideojuegos.setBounds(523, 310, 23, 26);
		contentPane.add(minutosVideojuegos);
		
		JLabel ayudaGeneral = new JLabel("Ayuda: Si no posee algun electrodoméstico coloque 0.");
		ayudaGeneral.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		ayudaGeneral.setBounds(224, 187, 188, 16);
		contentPane.add(ayudaGeneral);
		
		JLabel ayudaCalefaccion = new JLabel("Ayuda: Consumo en horas al día");
		ayudaCalefaccion.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		ayudaCalefaccion.setBounds(28, 226, 117, 9);
		contentPane.add(ayudaCalefaccion);
		
		JLabel ayudaAC = new JLabel("Ayuda: Consumo en horas al día");
		ayudaAC.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		ayudaAC.setBounds(28, 257, 117, 9);
		contentPane.add(ayudaAC);
		
		JLabel ayudaTV = new JLabel("Ayuda: Consumo en horas al día");
		ayudaTV.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		ayudaTV.setBounds(28, 294, 117, 9);
		contentPane.add(ayudaTV);
		
		JLabel ayudaMicroondas = new JLabel("Ayuda: Veces de uso al día");
		ayudaMicroondas.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		ayudaMicroondas.setBounds(28, 332, 117, 9);
		contentPane.add(ayudaMicroondas);
		
		JLabel ayudaHornoElectrico = new JLabel("Ayuda: Consumo en horas al día");
		ayudaHornoElectrico.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		ayudaHornoElectrico.setBounds(28, 371, 117, 9);
		contentPane.add(ayudaHornoElectrico);
		
		JLabel ayudaLavadora = new JLabel("Ayuda: Veces de uso a la semana");
		ayudaLavadora.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		ayudaLavadora.setBounds(202, 226, 117, 9);
		contentPane.add(ayudaLavadora);
		
		JLabel ayudaLavavajilla = new JLabel("Ayuda: Veces de uso al día");
		ayudaLavavajilla.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		ayudaLavavajilla.setBounds(205, 257, 117, 9);
		contentPane.add(ayudaLavavajilla);
		
		JLabel ayudaTostadora = new JLabel("Ayuda: Veces de uso al día");
		ayudaTostadora.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		ayudaTostadora.setBounds(205, 294, 117, 9);
		contentPane.add(ayudaTostadora);
		
		JLabel ayudaLicuadora = new JLabel("Ayuda: Veces de uso al día");
		ayudaLicuadora.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		ayudaLicuadora.setBounds(205, 332, 117, 9);
		contentPane.add(ayudaLicuadora);
		
		JLabel ayudaRefrigerador = new JLabel("Ayuda: 0 si no tiene, 1 si tiene");
		ayudaRefrigerador.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		ayudaRefrigerador.setBounds(202, 371, 117, 9);
		contentPane.add(ayudaRefrigerador);
		
		JLabel ayudaVentilador = new JLabel("Ayuda: Consumo en horas al día");
		ayudaVentilador.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		ayudaVentilador.setBounds(404, 226, 117, 9);
		contentPane.add(ayudaVentilador);
		
		JLabel ayudaSecadora = new JLabel("Ayuda: Veces de uso a la semana");
		ayudaSecadora.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		ayudaSecadora.setBounds(404, 257, 117, 9);
		contentPane.add(ayudaSecadora);
		
		JLabel ayudaPlancha = new JLabel("Ayuda: Veces de uso a la semana");
		ayudaPlancha.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		ayudaPlancha.setBounds(405, 294, 117, 9);
		contentPane.add(ayudaPlancha);
		
		JLabel ayudaVideojuegos = new JLabel("Ayuda: Consumo en horas al día");
		ayudaVideojuegos.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		ayudaVideojuegos.setBounds(404, 331, 117, 9);
		contentPane.add(ayudaVideojuegos);
		
		JLabel lblAyudaCantidadDe = new JLabel("Ayuda: Cantidad de bombillas.");
		lblAyudaCantidadDe.setFont(new Font("Lucida Grande", Font.PLAIN, 7));
		lblAyudaCantidadDe.setBounds(405, 369, 117, 9);
		contentPane.add(lblAyudaCantidadDe);
		
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
		
		final JLabel mensaje = new JLabel();
		mensaje.setHorizontalAlignment(SwingConstants.CENTER);
		mensaje.setBounds(114, 433, 337, 16);
		contentPane.add(mensaje);
		
		final JLabel calculo = new JLabel();
		calculo.setHorizontalAlignment(SwingConstants.CENTER);
		calculo.setBounds(224, 461, 121, 16);
		contentPane.add(calculo);
		
		JButton calcular = new JButton("Calcular");
		calcular.setBounds(219, 392, 117, 29);
		contentPane.add(calcular);
		calcular.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int personas = 1;
				electrodomesticos.setCalefaccion(Integer.parseInt(minutosCalefaccion.getText()));
				electrodomesticos.setAireacondicionado(Integer.parseInt(minutosAire.getText()));
				electrodomesticos.setTelevisor(Integer.parseInt(minutosTV.getText()));
				electrodomesticos.setMicroondas(Integer.parseInt(minutosMicroondas.getText()));
				electrodomesticos.setHornoelectrico(Integer.parseInt(minutosHorno.getText()));
				electrodomesticos.setLavadora(Integer.parseInt(minutosLavadora.getText()));
				electrodomesticos.setLavavajillas(Integer.parseInt(minutosLavavajillas.getText()));
				electrodomesticos.setTostadora(Integer.parseInt(minutosTostadora.getText()));
				electrodomesticos.setLicuadora(Integer.parseInt(minutosLicuadora.getText()));
				electrodomesticos.setRefrigerador(Integer.parseInt(cantRefri.getText()));
				electrodomesticos.setVentilador(Integer.parseInt(minutosVentilador.getText()));
				electrodomesticos.setSecadora(Integer.parseInt(minutosSecadora.getText()));
				electrodomesticos.setPlancha(Integer.parseInt(minutosPlancha.getText()));
				electrodomesticos.setConsoladevideojuegos(Integer.parseInt(minutosVideojuegos.getText()));
				electrodomesticos.setBombilla(Integer.parseInt(cantBombilla.getText()));
				mensaje.setText("La cantidad de energía gastada al día es de:");
				calculo.setText(electrodomesticos.ConversionEnergia(personas)+ " kW");
			}
		});
	}

}
