import javax.swing.text.Style;

public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}

class Monitor extends Product {

    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelsAt(int x, int y, String color) {
       System.out.println("x =" + x);
        System.out.println("y =" + y);
        System.out.println("color=" + color);


    }

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }
}

class MotherBoard extends Product {
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadPrograms(String programName) {
        System.out.println("Program " + programName + " is loading.......");

    }

    public MotherBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }
}

class ComputerCase extends Product {

    private String powerSupply;

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");

    }

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

}

