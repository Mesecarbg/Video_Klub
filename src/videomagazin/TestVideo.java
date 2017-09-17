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
public class TestVideo {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws VideoException, BadInputException {
        // TODO code application logic here
        Film f = new Film("Naziv",98,4,"horor","Srbija");
        Film f1 = new Film("faziv",98,5,"horor","Srbija");
        Film f2 = new Film("Naziv",98,10,"horor","Srbija");
        Film f3 = new Film("Naziv",98,8,"horor","Srbija");
        Film f4 = new Film("Naziv",98,6,"horor","Srbija");
        Film f5 = new Film("Naziv",98,5,"horor","Srbija");
        Film f6 = new Film("Naziv",98,4,"horor","Srbija");
        Film f7 = new Film("Naziv",98,4,"horor","Srbija");
        Film f8 = new Film("Naziv",98,4,"horor","Srbija");
        Film f9 = new Film("Naziv",98,4,"horor","Srbija");
        Film f10 = new Film("Naziv",98,4,"horor","Srbija");
        Film f11 = new Film("NazivL",600,2,"horor","Srbija");
        ArrayList<Video> nocFilmofila = new ArrayList<>();
        nocFilmofila.add(f);
        nocFilmofila.add(f1);
        nocFilmofila.add(f2);
        nocFilmofila.add(f3);
        nocFilmofila.add(f4);
        nocFilmofila.add(f5);
        nocFilmofila.add(f6);
        nocFilmofila.add(f7);
        nocFilmofila.add(f8);
        nocFilmofila.add(f9);
        nocFilmofila.add(f10);
        nocFilmofila.add(f11);
        VideoMenager vm = new VideoMenager();
        vm.listaVidea=nocFilmofila;
        System.out.println(vm.vratiUkupnoTrajanje(nocFilmofila));
       
    }
}
