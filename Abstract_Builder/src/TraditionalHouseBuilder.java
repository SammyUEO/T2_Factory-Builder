
public class TraditionalHouseBuilder implements HouseBuilder {
    private House house = new House();
    public void buildWalls() { house.setWalls("brick walls"); }
    public void buildRoof() { house.setRoof("tiled roof"); }
    public void buildInterior() { house.setInterior("wooden furniture"); }
    public House getResult() { return house; }
}