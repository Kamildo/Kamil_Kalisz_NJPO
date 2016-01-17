/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie_2_3_dekorator;

/**
 *
 * @author student
 */
public class Rower extends Uzytkownik_drogi{
      Uzytkownik_drogi uz;
      Pieszy p;
     
    public Rower( Uzytkownik_drogi a,int x,int y)
    {
        this.uz=a;
          this.x=x;
       this.y=y;
    }
     public Rower( Pieszy a)
    {
        this.uz=a;
         a.x=x;
       a.y=y;
       this.p=a;
    }
     public void  sprawdz(){
    if (this.x>24) this.x=24;
    if (this.y>24) this.y=24;
    if (this.x<0) this.x=0;
     if (this.y<0) this.y=0;
    
    }
     public void ruch(int kierunek){
        //kierunek 0-gora,1prawo,2dol,3lewo
        switch(kierunek){
            case 0: this.x-=2;
            case 1: this.y+=2; 
            case 2: this.x+=2;   
            case 3: this.y-=2;     
        }
          this.sprawdz();
       }
}
