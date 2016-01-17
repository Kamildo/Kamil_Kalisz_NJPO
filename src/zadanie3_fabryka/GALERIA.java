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
/**
 *
 * @author Kamildo
 */
public class GALERIA extends Strona{

    public GALERIA() {
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter(new File("GALERIA.html")));
            file.write("<img src=\"obraz.png\">");
		file.write("<br>");
		file.write("<img src=\"obraz.png\">");
		file.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(GALERIA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
