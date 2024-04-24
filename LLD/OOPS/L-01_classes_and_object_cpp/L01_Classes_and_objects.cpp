#include <iostream>
#include <string>

// Define a class called Player
class Player {
private:
    std::string playerName;
    int playerLevel;
    int playerHealth;

public:
    // Constructor to initialize player attributes
    Player(std::string name, int level, int health) {
        playerName = name;
        playerLevel = level;
        playerHealth = health;
    }

    // Method to display player information
    void displayInfo() {
        std::cout << "Player Name: " << playerName << std::endl;
        std::cout << "Player Level: " << playerLevel << std::endl;
        std::cout << "Player Health: " << playerHealth << std::endl;
    }

    // Method to simulate player taking damage
    void takeDamage(int damage) {
        playerHealth -= damage;
        std::cout << playerName << " took " << damage << " damage!" << std::endl;
        std::cout << "Current Health: " << playerHealth << std::endl;
    }
};

int main() {
    // Create an object of class Player
    Player player1("Sova", 5, 100);

    // Display player information
    player1.displayInfo();

    // Simulate player taking damage
    player1.takeDamage(20);

    return 0;
}
