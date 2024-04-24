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

public class StringTest{
    public static void main(String[] args) {
        Player player1 = new Player("Cypher",10,100);
        Player player2 = new Player("Sage",10,50);
        Player player3 = new Player("Cypher",10,100);
        Player player4 = player1;
        //player1.displayInfo();
        // Default behavior of toString() is to print class name, then
        // @, then unsigned hexadecimal representation of the hash code of the object
        System.out.println(player1.toString());
        System.out.println(player1.hashCode());
        System.out.println(player1.equals(player2));
        System.out.println(player1.equals(player4));

        //player1.takeDamage(30);
    }
}