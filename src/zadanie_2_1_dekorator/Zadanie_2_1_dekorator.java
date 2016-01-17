/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie_2_1_dekorator;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Zadanie_2_1_dekorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int znak;
        int licznik_lini=0;
        try {
            // TODO code application logic here

            BufferedReader in = new BufferedReader(new FileReader("plik.txt"));
            while((znak=in.read())!=-1)
            {
            if(znak==10) 
             licznik_lini++;
            }
            
            
        } catch (FileNotFoundException ex) {
           System.out.println("nie ma pliku");
        } catch (IOException ex) {
           
        }
        System.out.println("ilość wierszy: "+licznik_lini);

    }
}
