class Player {
    private String playerName;
    private int playerLevel;
    private int playerHealth;

    public Player(String name ,int level, int health){
        playerName = name;
        playerLevel = level;
        playerHealth = health;
    }

    public void displayInfo(){
        System.out.println("Player Name: " + playerName);
        System.out.println("Player Level: " + playerLevel);
        System.out.println("Player Health: " + playerHealth);
    }

    public void takeDamage(int damage){
        playerHealth -= damage;
        System.out.println(playerName + " took " + damage + " damage!");
        System.out.println("Current Health: " + playerHealth);
    }
}

public class Main{
    public static void main(String[] args) {
    Player player1 = new Player("Cypher",10,100);
    player1.displayInfo();
    player1.takeDamage(30);
    }
}