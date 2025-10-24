
public class TraditionalHouseFactory implements HouseFactory {
    @Override
    public House createHouse() {
        HouseBuilder builder = new TraditionalHouseBuilder();
        Director director = new Director();
        director.construct(builder);
        return builder.getResult();
    }
}