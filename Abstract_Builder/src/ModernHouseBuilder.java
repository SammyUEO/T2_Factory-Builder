
public class ModernHouseBuilder implements HouseBuilder {
    private House house = new House();
    public void buildWalls() { house.setWalls("glass walls"); }
    public void buildRoof() { house.setRoof("flat roof"); }
    public void buildInterior() { house.setInterior("modern furniture"); }
    public House getResult() { return house; }
}