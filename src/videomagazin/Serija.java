/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videomagazin;

/**
 *
 * @author 0000
 */
public class Serija extends Video {
    protected int sezona;
    protected int epizoda;

    public Serija(String naziv, int trajanje, int rejting, String zanr, String zemljaPorekla,int sezona , int epizoda) throws BadInputException {
        super(naziv, trajanje, rejting, zanr, zemljaPorekla);
        this.epizoda=epizoda;
        this.sezona = sezona;
        
    }

    public int getSezona() {
        return sezona;
    }

    public void setSezona(int sezona) {
        this.sezona = sezona;
    }

    public int getEpizoda() {
        return epizoda;
    }

    public void setEpizoda(int epizoda) {
        this.epizoda = epizoda;
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

    public int getID() {
        return ID;
    }
    
    
}
