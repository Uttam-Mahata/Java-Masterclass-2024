
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SoftwareEngineer s = new SoftwareEngineer("Kajal", "VISA");
        talkWithUttam(s,"আমাদেরকে ডাক্তার দের মতো টাকা কামাতে হবে 😁");

    }

    public static void talkWithUttam(SoftwareEngineer s, String words) {
        s.doConversation(words);
        System.out.println(s);

    }
}