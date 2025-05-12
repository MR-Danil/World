public class Truck extends Transport {

    public Engine engine = new Engine();


    private boolean isLoaded;


    public Truck(int weight, byte[] coordinate) {
        super(weight, coordinate);

    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Наш объект двигается со скорость: " + speed);
    }

    public Truck(int weight, byte[] coordinate, boolean isLoaded) {
        super(weight, coordinate);
        this.isLoaded = isLoaded;

    }


    public void setLoaded(boolean loaded) {
        this.isLoaded = loaded;
    }

    public void getLoaded() {
        if (isLoaded)
            System.out.println("Грузовик загружен");
        else
            System.out.println("Грузовик не загружен");
    }
}
