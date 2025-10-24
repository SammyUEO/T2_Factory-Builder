
public class ModernHouseFactory implements HouseFactory {
    @Override
    public House createHouse() {
        HouseBuilder builder = new ModernHouseBuilder();
        Director director = new Director();
        director.construct(builder);
        return builder.getResult();
    }
}