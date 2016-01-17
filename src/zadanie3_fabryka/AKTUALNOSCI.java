/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zadanie3_fabryka;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
/**
 *
 * @author Kamildo
 */
public class AKTUALNOSCI extends Strona{

    public AKTUALNOSCI() {
        Random rand =new Random();
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter(new File("AKTUALNOSCI.html")));
            String tresc="";
            int i=0;
            while(i<1000)
            {
              tresc+=(char)(rand.nextInt(26)+97);//97-122
                
             if(i%100==0) 
                 tresc+="<br>";
            i++;
            }
            file.write(tresc);
            file.close();
        } catch (IOException ex) {
            Logger.getLogger(GALERIA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
