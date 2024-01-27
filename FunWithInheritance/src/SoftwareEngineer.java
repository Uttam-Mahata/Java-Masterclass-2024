public class SoftwareEngineer {
    private String name;
    private String company;

    public SoftwareEngineer() {

    }

    public SoftwareEngineer(String name, String company) {
        this.name = name;
        this.company = company;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public void doConversation(String words) {
        System.out.println(name + " Da who works at VISA saying that  " + " '"
                + words + "'");

    }
}
