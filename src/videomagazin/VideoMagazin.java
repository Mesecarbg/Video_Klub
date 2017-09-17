/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videomagazin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import static javafx.scene.input.KeyCode.T;
import videomagazin.Interface.VideoInterface;

/**
 *
 * @author 0000
 */
public class VideoMagazin {
     /**
     * @param args the command line arguments
     * @throws videomagazin.BadInputException
     */
    public static void main(String[] args) throws BadInputException {
        // TODO code application logic here
        VideoMenager VMenadzer = new VideoMenager();
         
        ArrayList<Video> nocFilmofila = new ArrayList<>();
       nocFilmofila.add(new Film("Shutter Island",98,10,"triler","Srbija"));
            nocFilmofila.add(new Film("Crna macka,beli macor",98,7,"komedija","Srbija"));
            nocFilmofila.add( new Film("Inception",98,10,"Sci-fi","Srbija"));
            nocFilmofila.add(new Film("Montevideo",98,8,"Drama","Srbija"));
            nocFilmofila.add(new Film("Sejtan",98,4,"Horor","Srbija"));
            nocFilmofila.add(new Film("Saw",98,7,"horor","Srbija"));
            nocFilmofila.add(new Film("Tri palme za dve bitange i ribicu",98,8,"komedija","Srbija"));
            nocFilmofila.add(new Film("Vanila Sky",98,10,"Sci-fi/triler","Srbija"));
            nocFilmofila.add(new Film("Gladijator",98,7,"Drama","Srbija"));
            nocFilmofila.add(new Film("Kill Bill",98,7,"Akcija","Srbija"));
            nocFilmofila.add(new Film("Star Wars",98,8,"Sci-fi","Srbija"));
            nocFilmofila.add(new Film("Star Trek",600,8,"Sci-fi","Srbija"));
        nocFilmofila.add(new Serija("Java",60,4,"akcija","Srbija",1,1));
        nocFilmofila.add(new Serija("Java",60,4,"akcija","Srbija",1,2));
        nocFilmofila.add(new Serija("Java",60,2,"akcija","Srbija",1,3));
        nocFilmofila.add(new Serija("Java",60,4,"akcija","Srbija",1,4));
        nocFilmofila.add(new Serija("Java",60,3,"akcija","Srbija",1,5));
        nocFilmofila.add(new Serija("Java",60,5,"akcija","Srbija",2,1));
        nocFilmofila.add(new Serija("Java",60,9,"akcija","Srbija",2,2));
        nocFilmofila.add(new Serija("Java",60,2,"akcija","Srbija",2,3));
        nocFilmofila.add(new Serija("Java",60,5,"akcija","Srbija",2,4));
        nocFilmofila.add(new Serija("Java",60,10,"akcija","Srbija",2,5));
        nocFilmofila.add(new Serija("PHP",60,4,"akcija","Srbija",1,1));
        nocFilmofila.add(new Serija("PHP",60,6,"akcija","Srbija",1,2));
        nocFilmofila.add(new Serija("PHP",60,10,"akcija","Srbija",1,3));
        nocFilmofila.add(new Serija("JavaScript",60,10,"akcija","Srbija",1,4));
        nocFilmofila.add(new Serija("Ruby",60,10,"akcija","Srbija",1,5));
        VMenadzer.listaVidea=nocFilmofila;
      
        Scanner noviUnos = new Scanner(System.in);
        Scanner noviUnos1 = new Scanner(System.in);
        
      
               
        System.out.println("Ukucajte film ako unosite film ili serija "
                + "ako unosite seriju ili ukucajte q ako zelite prikaz Magazina !!!");
        String odgovor = noviUnos.next();
        if(odgovor.equalsIgnoreCase("film")){
            System.out.println("Parametre koje unosite odvojite razmakom!!! \n Unesite naziv filma,"
                    + "trajanje(izrazeno u broju minuta),rejting(ocenu filma od 1 do 10) , "
                    + " \n zanr kome film pripada, zemlju porekla,kao i godinu izdavanja");
            String parametriF = noviUnos1.nextLine();
            String[] params=parametriF.split(" ");
         
            Film film=new Film(params[0].toUpperCase(),Integer.parseInt(params[1]),
                    Integer.parseInt(params[2]),params[3],
                    params[4],params[5]);
            VMenadzer.dodajVideo(film);
            System.out.println(VMenadzer.printMagazin());
        }else if(odgovor.equalsIgnoreCase("serija")){
            System.out.println("Parametre koje unosite odvojite razmakom!!! \n Unesite naziv serije,"
                    + "trajanje(izrazeno u broju minuta),rejting(ocenu serije od 1 do 10) , "
                    + " \n zanr kome serija pripada, zemlju porekla,redni broj sezone , kao i redni br epizode");
            String parametriS = noviUnos1.nextLine();
             String[] pojedinacniParSerije = parametriS.split(" ");
            Serija serija = new Serija(pojedinacniParSerije[0].toUpperCase(),Integer.parseInt(pojedinacniParSerije[1]),
                    Integer.parseInt(pojedinacniParSerije[2]),pojedinacniParSerije[3],pojedinacniParSerije[4],
                    Integer.parseInt(pojedinacniParSerije[5]),Integer.parseInt(pojedinacniParSerije[6]));  
            VMenadzer.dodajVideo(serija);
            System.out.println(VMenadzer.printMagazin());
        }else if(odgovor.equalsIgnoreCase("q")){
            System.out.println("Zavrsili ste sa editovanjem , a ovo je vas MAGAZIN!!!");
            System.out.println(VMenadzer.printMagazin());
        }else
            throw new BadInputException();
    }

}
