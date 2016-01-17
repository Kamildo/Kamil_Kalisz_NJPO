/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zadanie5_2kolekcje_odzysk;

/**
 *
 * @author Kamildo
 */
public class Person  implements Comparable{

    public Person(String imie, String nazwisko, String adres, String telefon) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.telefon = telefon;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public String getTelefon() {
        return telefon;
    }

    @Override
    public int compareTo(Object t) {
     return  ((Person)t).getNazwisko().compareTo(this.nazwisko);
       
    }
    
     String imie;
    String nazwisko;
    String adres;
    String telefon;
    
    
    
}
