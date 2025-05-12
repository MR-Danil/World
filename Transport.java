public abstract class Transport {

    private byte[] coordinate;
    private float speed;
    private int weight;
    private String color;

    public Transport() {

    }

    public Transport(float speed, int weight, String color, byte[] coordinate) {
        System.out.println("Object created");
        setValues(speed, weight, color, coordinate);
        System.out.println(getValues());
    }

    public Transport(int weight, byte[] coordinate) {
        this.weight = weight;
        this.coordinate = coordinate;
        System.out.println(getValues());
    }


    public abstract void moveObject(float speed);


    protected void setValues(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    protected String getValues() {
        String info = "Object speed: " + this.speed + ".Weight: " + this.weight + ". Color: " + this.color + ".\n";
        String infoCoordinates = "Coordinates: \n";
        for (int i = 0; i < coordinate.length; i++)
            infoCoordinates += coordinate[i] + "\n";


        return info + infoCoordinates;
    }

    class Engine {

        private boolean isReady;
        private int km;

        public void setValues(boolean isReady, int km) {
            this.isReady = isReady;
            this.km = km;

        }

        public void info() {
            if (isReady)

                System.out.println("Двигатель исправлен");
            else
                System.out.println("no on ne rabotaet on proehal yge" + km + "KM");
        }

    }


}
