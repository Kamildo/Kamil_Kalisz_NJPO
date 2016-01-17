/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kamildo
 */
public class Statek {

    public byte getRodzaj() {
        return rodzaj;
    }
    
  private  byte rodzaj;//1 wodny,2lądowy,3samolot
  private  byte hp;
  private  byte wielkosc;
    
    public  Statek(byte _rodzaj,byte _wielkosc)
    {
   this.rodzaj=_rodzaj;
   this.wielkosc=_wielkosc;
   this.hp=_wielkosc;
    }
    public boolean zmiejszhp_czy_atopiony(){
    this.hp--;
    if(hp==0){
    return true;
    }
    else return false;
    }
    public byte getwielkosc(){
    return this.wielkosc;
    
    }
    @Override
    public String toString(){
        String wynik="";
        if((this.rodzaj)==1)
        {
            wynik="Rodzaj Morski";
        }
        else if((this.rodzaj)==2)
        {
            wynik="Rodzaj Lądowy";
        }
        else if((this.rodzaj)==3)
        {
            wynik="Rodzaj Samolot";
        }
        
        return (wynik+" wielkosc: "+String.valueOf(this.wielkosc));
    
    }
    
    
    
    
 
}
