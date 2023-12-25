public class PersonalComputer extends Product{
    private ComputerCase computercase;
    private Monitor monitor;
    private MotherBoard motherboard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computercase,
                            Monitor monitor, MotherBoard motherboard) {
        super(model, manufacturer);
        this.computercase = computercase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    private void drawLogo() {
        monitor.drawPixelsAt(10, 10, "blue");

    }

    public void powerUp() {
        computercase.pressPowerButton();
        drawLogo();

    }

//    public ComputerCase getComputercase() {
//        return computercase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public MotherBoard getMotherboard() {
//        return motherboard;
//    }

}
