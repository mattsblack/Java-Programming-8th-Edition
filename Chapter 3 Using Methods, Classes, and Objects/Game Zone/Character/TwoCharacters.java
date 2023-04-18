// TwoCharacters.java

public class TwoCharacters {
    public static void main(String[] args) {
        // Create two characters
        MyCharacter character1 = new MyCharacter("Tom", 5, 100);
        MyCharacter character2 = new MyCharacter("Bob", 3, 75);
        character1.setName("Alice");
        character2.setLevel(4);
        character1.setHealth(90);

        // Display character attributes
        displayCharacter(character1);
        displayCharacter(character2);
    }

    // Method to display character attributes
    public static void displayCharacter(MyCharacter character) {
        System.out.println("Name: " + character.getName());
        System.out.println("Level: " + character.getLevel());
        System.out.println("Health: " + character.getHealth());
        System.out.println();
    }
}
