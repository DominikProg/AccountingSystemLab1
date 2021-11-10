import java.util.List;

public class Floor {
    private int apartcount;
    private double sqr;
    private int people;
    private int rooms;
    List<Apart> aparts=new ArrayList<>();
    public Floor (int anum){
        this.apartcount=anum;
        for (int i=0; i<=anum; i++){
            Apart apart=new Apart();
            aparts.add(apart);
        }
    }
    void createFloor(int acount){
        apartcount=acount;
    }
    int getApartcount(){
        return this.apartcount;
    }
    double getSqr(){
        return this.sqr;
    }
    int getPeople() {
        return this.people;
    }
    int getRooms() {
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
    void setapartcount(int apartcount){
        this.apartcount=apartcount;
    }
    void Info(){
        System.out.println("Площадь: "+getSqr()+" Кол-во жильцов: "+getPeople()+" Кол-во комнат: "+getRooms());
    }


}
