import java.io.*;
public class Escribiendo{
	public void escribir(String RutaArchivo) {
		String Fase = "56.26km" + "325.62kj" + "98.25kj" + "2598L" + "235465L";
		try {
			FileWriter escritura = new FileWriter(RutaArchivo);
			for (int i = 0; i < Fase.length(); i++) {
				escritura.write(Fase.charAt(i));
			}
			escritura.close();
		}catch (IOException e) {}
	}
}