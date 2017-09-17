/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videomagazin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import videomagazin.Interface.VideoInterface;

/**
 *
 * @author 0000
 */
public class VideoMenager implements VideoInterface{
public  List<Video> listaVidea=new ArrayList<>();

    public List<Video> getListaVidea() {
        return listaVidea;
    }
   
   
  @Override
    public void dodajVideo(Video video) {
    this.listaVidea.add(video);
    }

   
  @Override
    public void obrisiVideo(Video video) {
     this.listaVidea.remove(video.ID);
    }

  
  @Override
    public Set<Video> vratiVideaPoRejtingu(int rejting) {
        Set listaPoZadatomRejtingu = new HashSet();
        for(Video video:this.listaVidea){
            if(video.rejting == rejting){
                listaPoZadatomRejtingu.add(video);
            }
        }
        return listaPoZadatomRejtingu;
    }
  public Set<Film> vratiFilmovePoRejtingu(int rejting) {
        Set listaPoZadatomRejtingu = new HashSet();
        for(Film film:getFilmove()){
            if(film.rejting == rejting){
                listaPoZadatomRejtingu.add(film);
            }
        }
        return listaPoZadatomRejtingu;
    }
    public Set<Serija> vratiSerijePoRejtingu(int rejting) {
        Set listaPoZadatomRejtingu = new HashSet();
        for(Serija serija:getSerije()){
            if(serija.rejting == rejting){
                listaPoZadatomRejtingu.add(serija);
            }
        }
        return listaPoZadatomRejtingu;
    }
    
  @Override
    public Set<Video> vratiVideaPoRejtingu(int rejtingDonji, int rejtingGornji) {
          Set listaPoRanguRejtinga = new HashSet();
        for(Video video:this.listaVidea){
            if(video.rejting > rejtingDonji && video.rejting < rejtingGornji){
                 listaPoRanguRejtinga.add(video);
            }
    }
        
        return listaPoRanguRejtinga;
    }

    public Set<Serija> vratiSerijePoRejtingu(int rejtingDonji, int rejtingGornji) {
          Set listaPoRanguRejtinga = new HashSet();
        for(Serija serija:getSerije()){
            if(serija.rejting > rejtingDonji && serija.rejting < rejtingGornji){
                 listaPoRanguRejtinga.add(serija);
            }
    }
        
        return listaPoRanguRejtinga;
    }
     public Set<Film> vratiFilmovePoRejtingu(int rejtingDonji, int rejtingGornji) {
          Set listaPoRanguRejtinga = new HashSet();
        for(Film film:getFilmove()){
            if(film.rejting > rejtingDonji && film.rejting < rejtingGornji){
                 listaPoRanguRejtinga.add(film);
            }
    }
        
        return listaPoRanguRejtinga;
    }
  
@Override
    public int vratiUkupnoTrajanje(List<Video> spisakVidea) throws VideoException{
        int zbir=0; 
        for(Video video:spisakVidea){
            zbir = zbir + video.getTrajanje();
        }
        if(zbir>1440){
            throw new VideoException();
        }else
        return zbir;
    }

   
  @Override
    public List<Video> topTen(String vrstaVidea) {
        List<Video> topTen=new ArrayList<Video>();
        for (Video video:this.listaVidea) {
            if(vrstaVidea.equalsIgnoreCase("Video")){
               if(video instanceof Video){
                   topTen.add(video);
               }
        }else if(vrstaVidea.equalsIgnoreCase("Serija")){
            if(video instanceof Serija){
                   topTen.add(video);
               }
        }
    }
        Collections.sort(topTen);
        return topTen.subList(0, 10);
    }
    public ArrayList<Serija> getSerije(){
        ArrayList<Serija> serije = new ArrayList<>();
        for(Video video:this.listaVidea){
            if(video instanceof Serija){
                serije.add((Serija)video);
            }
        }
        return serije;
    }
    public ArrayList<Film> getFilmove(){
        ArrayList<Film> filmovi = new ArrayList<>();
        for(Video video:this.listaVidea){
            if(video instanceof Film){
                filmovi.add((Film)video);
            }
        }
        return filmovi;
    }
    //========================================================================================================
    //Drugi nacin za ispodProsecne serije
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//    public ArrayList<String> dajNaziveSerija(){
//        ArrayList<String> nazivi = new ArrayList<>();
//        for(Serija serija:this.getSerije()){
//            if(!nazivi.contains(serija.getNaziv())){
//                nazivi.add(serija.getNaziv());
//            }
//        }
//        
//        return nazivi;
//    }
//    public ArrayList <String> dajIspodprosecneSerije(){
//        ArrayList<String> nazivi = this.dajNaziveSerija();
//        ArrayList<String> ispodprosecneSerije= new ArrayList<>();
//        ArrayList<Integer> proseci = new ArrayList<>();
//        
//        for(String naziv:nazivi){
//            int counter=0;
//            int prosek = 0;
//            int zbir = 0;
//            for(Serija serija:this.getSerije()){
//                if(naziv.equalsIgnoreCase(serija.getNaziv())){
//                    counter++;
//                    zbir=zbir+serija.getRejting();
//                }
//            }
//            prosek=zbir/counter;
//            proseci.add(prosek);
//        }
//         for (int i = 0; i < proseci.size(); i++) {
//             if(proseci.get(i)<5){
//              ispodprosecneSerije.add(nazivi.get(i));
//             }
//         }
//         return ispodprosecneSerije;
//    }
    public int izracunajProsekEpizoda(Serija serija1){
        int counter=1;
        int zbir = serija1.rejting;
        int prosek = serija1.rejting;
        for(Serija serija:this.getSerije()) {
            if(serija1.getNaziv().equalsIgnoreCase(serija.getNaziv()) &&
                    serija1.getID()!=serija.getID()){
  
          counter++;
                zbir=zbir+serija.getRejting();
              prosek = zbir/counter;   //Namerno nisam stavio double za prosek , pa castovao ,jer me interesuju bilo koje vrednosti manje od 5 !!!
            }
        }
        return prosek;
    }
   
           
    public ArrayList<String> vratiNaziveSerijaSaEpizodamaIspodProsekaRejtinga(){
        ArrayList<String> ispodprosecneSerije = new ArrayList<>();
        for(Serija serija : getSerije()){
            if(!ispodprosecneSerije.contains(serija.getNaziv()) &&
                    izracunajProsekEpizoda(serija)<5){
                ispodprosecneSerije.add(serija.getNaziv());
        }}
        return ispodprosecneSerije;
    }
      public String printMagazin(){
        ArrayList<String> filmoviRejting10 = new ArrayList<>();
        
        for(Film film:this.vratiFilmovePoRejtingu(10)){
                filmoviRejting10.add(film.getNaziv());  
        }
        
         StringBuilder serijeSaEp10=new StringBuilder();
        for(Serija serija:this.vratiSerijePoRejtingu(10)){
            serijeSaEp10.append(serija.getNaziv()).append(" ").append("S")
                    .append(serija.getSezona()).append("E").append(serija.getEpizoda()).append("\n");
            
        }   
        
         ArrayList<String> filmoviRejtingVeryLow = new ArrayList<>();
         
        for(Film film:this.vratiFilmovePoRejtingu(0,5)){
                filmoviRejtingVeryLow.add(film.getNaziv());
        }
        
         ArrayList<String> serijeRejtingVeryLow = this.vratiNaziveSerijaSaEpizodamaIspodProsekaRejtinga();
         
        return "Najbolji Filmovi !!! \n"+filmoviRejting10 + "\n" +"Najgori Filmovi !!!  \n" + filmoviRejtingVeryLow + "\n"
                + "Najbolje Serije !!!  \n"+serijeSaEp10 + "\n" + "Najgore Serije !!!   \n"+serijeRejtingVeryLow;
        }
}
