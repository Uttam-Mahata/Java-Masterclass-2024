public class Player {
    public String PlayerName;
    public int health;
    public String weapon;

//    public Player(String playerName, int health, String weapon) {
//        PlayerName = playerName;
//        this.health = health;
//        this.weapon = weapon;
//    }

    public void loseHealth(int damage) {
        health = health - damage;
        if(health < 0) {
            System.out.println("Player knocked out.");

        }
    }

    public int healthRemaining() {
        return health;
    }
    public  void restoreHealth(int extraHealth) {
        if(health > 100) {
            System.out.println("Health 100% restored.");
        }
        health = health + extraHealth;
    }

}
