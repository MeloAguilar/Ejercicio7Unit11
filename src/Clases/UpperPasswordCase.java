package Clases;

import java.io.*;

/**
 * Diseña un programa con contraseña, que será suministrada desde la línea de
 * comandos junto con la ruta de un archivo de texto. Del archivo debes corregir las palabras que
 * deben empezar por mayúsculas.
 */

public class UpperPasswordCase {

    private Locker locker;
    File fileToWrite;

    public UpperPasswordCase(Locker locker, String path) {
        this.locker = locker;
        fileToWrite = new File (path);
    }

    public Locker getLocker() {
        return locker;
    }

    public void setLocker(Locker locker) {
        this.locker = locker;
    }

    /**
     * @param attempt
     * @param path
     * @return
     * @throws IOException
     */
    public File openFile(String attempt, String path) throws IOException {
        File file = new File (path);
        if (file.exists ( )) {

            BufferedWriter bw = new BufferedWriter (new FileWriter (this.fileToWrite));
            String coso = readFile (file, bw);//Llama al método para guardar
            bw.write (coso);
            bw.close ( );
        }
        return file;
    }



    public String readFile(File file, BufferedWriter bw) {
        BufferedReader br = null;
        String line;
        String coso = "";
        try {

            do {
                br = new BufferedReader (new FileReader (file));
                line = br.readLine ( );
                coso += line.toCharArray ( )[0];
                coso = coso.toUpperCase ( );
                coso += line.toCharArray ( )[1];
                for (int i = 2; i < line.length ( ); i++) {
                    if ((line.toCharArray ( )[i - 1] == ' ' && line.toCharArray ( )[i - 2] == '.') || line.toCharArray ( )[i - 1] == '.') {
                        String support = "";
                        support += line.charAt (i);
                        coso += support.toUpperCase ( );
                    } else {
                        coso += line.toCharArray ( )[i];
                    }
                }
            } while (line != null);
        } catch (IOException r) {
            //Falla al leer linea y guardarla en el String
        } finally {
            try {
                if (br != null)
                    br.close ( );
            } catch (IOException e) {
                //Falla al cerrar el BufferedReader
            }
        }
        return coso;
    }
}
