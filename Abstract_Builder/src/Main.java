public class Main {
    public static void main(String[] args) {
        HouseFactory modernFactory = new ModernHouseFactory();
        House modernHouse = modernFactory.createHouse();
        modernHouse.show();

        System.out.println();

        HouseFactory traditionalFactory = new TraditionalHouseFactory();
        House traditionalHouse = traditionalFactory.createHouse();
        traditionalHouse.show();
    }
}
