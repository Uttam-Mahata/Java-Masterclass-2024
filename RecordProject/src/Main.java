
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            CSEStudent s = new CSEStudent("2022CSB10" +i,
                    switch (i) {
                case 1 -> "Anurag";
                case 2 -> "Suchana";
                case 3 -> "K Ramchandra";
                case 4 -> "Uttam";
                case 5 -> "Abhilash";
                        default -> "Unknown";



                    },
                    switch (i) {
                        case 1 -> "Unknown";
                        case 2 -> "Unknown";
                        case 3 -> "Unknown";
                        case 4 -> "04/08/2004";
                        case 5 -> "Unknown";
                        default -> "Unknown";

                    },
                    "Computer Science");
            System.out.println(s);
        }


    }
}