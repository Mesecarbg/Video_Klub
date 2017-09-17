/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videomagazin;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author 0000
 */
public class Video implements Comparable<Video> {
    protected String naziv;
    protected int trajanje;
    protected int rejting; //Ograniciti od 1-10
    protected String zanr;
    protected String zemljaPorekla;
    protected static final AtomicInteger count = new AtomicInteger(0);
    protected final int ID;
    
    public Video(String naziv, int trajanje, int rejting, String zanr, String zemljaPorekla) throws BadInputException {
        this.naziv = naziv;
        this.trajanje = trajanje;
        if(rejting>0&&rejting<=10){
        this.rejting = rejting;
        }else{
            throw new BadInputException();
        }
        this.zanr = zanr;
        this.zemljaPorekla = zemljaPorekla;
        this.ID=count.incrementAndGet();
        
       
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    public int getRejting() {
        return rejting;
    }

    public void setRejting(int rejting) {
        this.rejting = rejting;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public String getZemljaPorekla() {
        return zemljaPorekla;
    }

    public void setZemljaPorekla(String zemljaPorekla) {
        this.zemljaPorekla = zemljaPorekla;
    }
    
    @Override
     public int compareTo(Video video){
         if(this.rejting == video.rejting){
             return 0;
         }else if(this.rejting<video.rejting){
             return 1;
         }else
             return -1;
     }
    
}
