/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videomagazin;

import java.util.ArrayList;

/**
 *
 * @author 0000
 */
public class Film extends Video {
   protected ArrayList<String> bioskopi= new ArrayList<>();
   protected String goodinaIzdavanja;

    public Film(String naziv, int trajanje, int rejting, String zanr, String zemljaPorekla, String godinaIzdavanja) throws BadInputException {
        super(naziv, trajanje, rejting, zanr, zemljaPorekla);
        this.goodinaIzdavanja = godinaIzdavanja;
    }
   public Film(String naziv ,int trajanje,int rejting, String zanr ,String zemljaPorekla) throws BadInputException{
       super(naziv, trajanje, rejting, zanr, zemljaPorekla);
   }
    public String getGoodinaIzdavanja() {
        return goodinaIzdavanja;
    }

    public void setGoodinaIzdavanja(String goodinaIzdavanja) {
        this.goodinaIzdavanja = goodinaIzdavanja;
    }

   @Override
    public String getNaziv() {
        return naziv;
    }

   @Override
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

   @Override
    public int getTrajanje() {
        return trajanje;
    }

    public int getID() {
        return ID;
    }

   @Override
    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

   @Override
    public int getRejting() {
        return rejting;
    }

   @Override
    public void setRejting(int rejting) {
        this.rejting = rejting;
    }

   @Override
    public String getZanr() {
        return zanr;
    }

   @Override
    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

   @Override
    public String getZemljaPorekla() {
        return zemljaPorekla;
    }

   @Override
    public void setZemljaPorekla(String zemljaPorekla) {
        this.zemljaPorekla = zemljaPorekla;
    }
   
   
}
