/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kamildo
 */
public class Pole {
    
    byte x;
    byte y;
    boolean jest_ladem;
    boolean zaatakowane;
    Statek zawartoscpola;
    
    public Pole(byte _x,byte _y){
    this.x=_x;
    this.y=_y;
    this.jest_ladem=false;
    this.zaatakowane=false;
    this.zawartoscpola=null;
    }

    public void setZawartoscpola(Statek zawartoscpola) {
        this.zawartoscpola = zawartoscpola;
    }
    public void set_jest_ladem(){
    this.jest_ladem=true;
    }
    public boolean czy_jest_statek()
    {
    if(this.zawartoscpola==null)
    {
    return false;
    }
    return true;
    }
    
    
}
