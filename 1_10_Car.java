class Car {
    protected int num;
    protected double gas;

    public Car() {
        num = 0; gas = 0.0;
    }
    public Car(int n, double g) {
        num = n; gas = g;
    }
    public void show() {
        System.out.print("Carのshow: ");
        System.out.println("(num) " + num + " (gas) " + gas);
    }
}

class RacingCar extends Car {
    private int course;
    public RacingCar() {
        super();
        course = 0;
    }
    public RacingCar(int n, double g, int c) {
        super(n, g);
        course = c;
    }
    public void show() {
        super.show();
        System.out.print("RacingCarのshow: ");
        System.out.println("(course) " + course);
    }
}

class Pd10car1 {
    public static void main(String[] args) {
        RacingCar rc1 = new RacingCar();
        RacingCar rc2 = new RacingCar(5678, 20.5, 5);
        System.out.println("--- rc1.show() ---");
        rc1.show();
        System.out.println("--- rc2.show() ---");
        rc2.show();
        
        Car c1, c2;
        c1 = new Car(1234, 15.0);
        c2 = new RacingCar(2468, 30.0, 8);
        System.out.println("--- c1.show() ---");
        c1.show();
        System.out.println("--- c2.show() ---");
        c2.show();
        
        Car[] cars;
        cars = new Car[2];
        cars[0] = new RacingCar(1357, 45.0, 2);
        cars[1] = new Car(4321, 25.0);
        for(int i = 0; i < cars.length; i++) {
            System.out.printf("--- cars[%d].show() ---\n", i);
            cars[i].show();
        }
    }
}
