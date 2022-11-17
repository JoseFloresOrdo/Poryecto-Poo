

import java.io.*;

public class Java {

    public static void main(String[] args) {
        File Archivo = new File("C:/Users/José Javier Flores/Desktop/Prueba.txt");

        String Destino = Archivo.getAbsolutePath();
        try{
            Archivo.createNewFile();
        } catch (IOException e){
            e.printStackTrace();
        }

        Escribiendo accede = new Escribiendo();

        accede.escribir(Destino);
        
    }
    
}


class Escribiendo {

    public void escribir(String RutaArchivo){
        String Fase = "Ejemplosssss";
        try{
            FileWriter escritura = new FileWriter(RutaArchivo);
            for (int i = 0; i<Fase.length(); i++){
                escritura.write(Fase.charAt(i));
            }
            escritura.close();
        }catch(IOException e){}
    }
}
