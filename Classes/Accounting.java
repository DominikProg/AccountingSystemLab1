import java.lang.Double;
import java.util.ArrayList;
import java.util.HashMap;

public class Accounting {
    private int homecount;
    HashMap<Integer, Home> homes=new HashMap<>();
    public void createHome(int hnum,int fnum, int anum){
        Home home=new Home(fnum, anum);
        homes.put(hnum,home);
        System.out.println("Дом добавлен");
    }
    public void createApart(int nh, int nf, int na, int s, int p, int r){
        homes.get(nh).floors.get(nf).aparts.get(na).createApart(s,p,r);
        homes.get(nh).floors.get(nf).setSqr(homes.get(nh).floors.get(nf).getSqr()+s);
        homes.get(nh).floors.get(nf).setPeople(homes.get(nh).floors.get(nf).getPeople()+p);
        homes.get(nh).floors.get(nf).setRooms(homes.get(nh).floors.get(nf).getRooms()+r);
        homes.get(nh).setSqr(homes.get(nh).getSqr()+s);
        homes.get(nh).setPeople(homes.get(nh).getPeople()+p);
        homes.get(nh).setRooms(homes.get(nh).getRooms()+r);
        this.homecount++;
    }
    public String getSign(double a, double b) {
        if (Double.compare(a, b) > 0) {
            return ">";
        }
        else if (Double.compare(a, b) < 0) {
            return"<";
        }
        else {

           return "=";
        }
    }
    int getHomecount(){
        return this.homecount;
    }
    void setHomecount(int homecount){
        this.homecount=homecount;
    }
    public void compareApart(int homen1, int floorn1, int apartn1,int homen2, int floorn2, int apartn2){
    Apart apartment1=homes.get(homen1).floors.get(floorn1).aparts.get(apartn1);
    Apart apartment2=homes.get(homen2).floors.get(floorn2).aparts.get(apartn2);
    System.out.println("Площадь1"+getSign(apartment1.sqr, apartment2.sqr)+"Площадь2");
    System.out.println("Жильцов1"+getSign(apartment1.people, apartment2.people)+"Жильцов2");
    System.out.println("Комнат1"+getSign(apartment1.people, apartment2.people)+"Комнат2");
    }
    public void compareHome(int n1, int n2){
    Home home1=homes.get(n1);
    Home home2=homes.get(n2);
    System.out.println("Площадь1"+getSign(home1.getSqr(), home2.getSqr())+"Площадь2");
    System.out.println("Жильцов1"+getSign(home1.getPeople(), home2.getPeople())+"Жильцов2");
    System.out.println("Комнат1"+getSign(home1.getRooms(), home2.getRooms())+"Комнат2");
    }
}
