import java.util.ArrayList;
import java.util.List;
public class Home {
    private int floortcount;
    private double sqr;
    private int people;
    private int rooms;
    List<Floor> floors=new ArrayList<>();
    public Home(int fnum, int anum){
        this.floortcount=fnum;
        for (int i=0; i<=fnum; i++){
            Floor floor=new Floor(anum);
            floors.add(floor);
        }
    }
    void createFloor(int fcount){
        floortcount=fcount;
    }
    double getSqr(){
       return this.sqr;
    }
    int getPeople(){
     return this.people;
    }
    int getRooms(){
       return this.rooms;
    }
    void setSqr(double sqr){
        this.sqr=sqr;
    }
    void setPeople(int people){
        this.people=people;
    }
    void setRooms(int rooms){
        this.rooms=rooms;
    }
    void Info(){
        System.out.println("Площадь: "+getSqr()+" Кол-во жильцов: "+getPeople()+" Кол-во комнат: "+getRooms());
    }
}
