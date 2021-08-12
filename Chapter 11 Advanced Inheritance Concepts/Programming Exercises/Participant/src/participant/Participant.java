package participant;

public class Participant {
	private String name;
	private int age;
	private String address;
	
	public Participant(String n, int ag, String add) {
		name = n;
		age = ag;
		address = add;
	}
	
	public String toString() {
		return "Name: " + name + "\nAge: " + age + "\nAddress: " + address;
	}
	
	public boolean equals(Participant p) {
        if (this.name.equals(p.name) && this.address.equals(p.address) && this.age == p.age) {
            return true;
        }
        else{
            return false;
        }
    }
}
