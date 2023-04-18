// MyCharacter.java

public class MyCharacter {
    private String name;
    private int level;
    private int health;

    // Constructor
    public MyCharacter(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for level
    public int getLevel() {
        return level;
    }

    // Setter for level
    public void setLevel(int level) {
        this.level = level;
    }

    // Getter for health
    public int getHealth() {
        return health;
    }

    // Setter for health
    public void setHealth(int health) {
        this.health = health;
    }
}
