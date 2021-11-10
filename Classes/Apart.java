public class Apart {
    double sqr;
    int people;
    int rooms;
    public void Apart(){
        this.sqr=0;
        this.people=0;
        this.rooms=0;
    }
    void createApart(double s, int p, int r){
        sqr=s;
        people=p;
        rooms=r;
    }
    double getSqr(){
        return this.sqr;
    }
    double getPeople() {
        return this.people;
    }
    double getRooms() {
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
        System.out.println("Площадь: "+sqr+" Кол-во жильцов: "+people+" Кол-во комнат: "+rooms);
    }
}
