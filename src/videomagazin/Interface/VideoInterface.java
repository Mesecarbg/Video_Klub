/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videomagazin.Interface;
import java.util.List;
import java.util.Set;
import videomagazin.Video;
import videomagazin.VideoException;

/**
 *
 * @author 0000
 */
public interface VideoInterface {
    public void dodajVideo(Video video);
    public void obrisiVideo(Video video);
    public Set<Video> vratiVideaPoRejtingu(int rejting);
    public Set<Video> vratiVideaPoRejtingu(int rejtingDonji,int rejtingGornji);
    public int vratiUkupnoTrajanje(List<Video> spisakVidea)throws VideoException;
    public List topTen(String vrstaVidea);
}
