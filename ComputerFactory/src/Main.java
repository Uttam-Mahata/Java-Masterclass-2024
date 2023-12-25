
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("GalaxyBook2-NP550", "SAMSUNG", "240");
        Monitor theMonitor = new Monitor("16''", "Samsung", 16, "1920 x 1800");
        MotherBoard theMotherboard = new MotherBoard("BJ-200","Samsung", 4, 6, "v2.44" );
        PersonalComputer thePC = new PersonalComputer("GalaxyBook2-NP550", "SAMSUNG", theCase, theMonitor, theMotherboard);

//
//        thePC.getMonitor().drawPixelsAt(10, 10, "blue");
//        thePC.getMotherboard().loadPrograms("Windows 11");
//        thePC.getComputercase().pressPowerButton();

        thePC.powerUp();
        System.out.println(thePC);


    }
}