//zadanie z kopii zapasowej mam nadzieje że była ostateczna wersja


package zadanie_2_2_dekorator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author student
 */
public class Zadanie_2_2_dekorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int licznik_slow=1;
        try {
            // TODO code application logic here

            BufferedReader in = new BufferedReader(new FileReader("plik.txt"));
             int znak=in.read();
            
             while(znak!=-1)
            {
            if(znak==10||znak==32||znak==9){
                znak=in.read();
                if(znak!=10&&znak!=13&&znak!=32&&znak!=9)
                {
                     licznik_slow++;
                }
                else 
                {
                    continue;
                }
               }
              znak=in.read();
            }
        } catch (FileNotFoundException ex) {
           System.out.println("nie ma pliku");
        } catch (IOException ex) {
           
        }
        System.out.println("ilość słów: "+licznik_slow);

    }
}
