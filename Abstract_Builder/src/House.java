
public class House {
    private String walls;
    private String roof;
    private String interior;

    public void setWalls(String walls) { this.walls = walls; }
    public void setRoof(String roof) { this.roof = roof; }
    public void setInterior(String interior) { this.interior = interior; }

    public void show() {
        System.out.println("House with " + walls + ", " + roof + ", and " + interior);
    }
}
