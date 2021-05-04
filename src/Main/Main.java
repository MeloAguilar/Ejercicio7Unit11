package Main;
/**
 * Scanner sc =  new Scanner ((System.in));
 *         int attempts = 0;
 *         Locker lk = new Locker ("Raro", 3);
 *         UpperPasswordCase ps = new UpperPasswordCase (lk,"./pruebe.txt");
 *         do {
 *             try {
 *                 System.out.println ("Escribe aquí la contraseña");
 *                 String passWordtry = sc.nextLine();
 *                 System.out.println ("Escribe aqui el archivo a leer" );
 *                 String filetoRead = sc.nextLine ();
 *                 ps.openFile (passWordtry, filetoRead);
 *             } catch (IOException e) {
 *                 System.out.println ("Somethin was not what i expected");
 *             }
 *         }while (!);
 *     }
 */

import Clases.Locker;
import Clases.UpperPasswordCase;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Locker lk = new Locker ("Raro", 3);
        UpperPasswordCase ps = new UpperPasswordCase (lk,"./pruebe.txt");
        try {
            ps.openFile ("Raro", "D:\\GSDAM\\cosa.txt");
        } catch(IOException e){
            System.out.println ("Algo saló MAL" );
        }
    }
}
