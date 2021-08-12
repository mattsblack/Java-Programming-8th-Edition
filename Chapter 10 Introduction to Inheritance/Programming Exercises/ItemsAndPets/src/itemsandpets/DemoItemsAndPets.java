package itemsandpets;

public class DemoItemsAndPets {
	public static void main(String[] args) {
		ItemSold item = new ItemSold();
		PetSold pet = new PetSold();
		item.setInvoice(1);
		item.setDescription("item");
		item.setPrice(10.99);
		pet.setInvoice(10);
		pet.setDescription("A dog");
		pet.setPrice(499.99);
		pet.setVaccine(true);
		pet.setHousebroken(true);
		pet.setNeutered(false);
		System.out.println("Invoice number: " + item.getInvoice());
		System.out.println("Description: " + item.getDescription());
		System.out.println("Price: " + item.getPrice());
		System.out.println();
		System.out.println("Invoice number: " + pet.getInvoice());
		System.out.println("Description: " + pet.getDescription());
		System.out.println("Price: " + pet.getPrice());
		System.out.println("Vaccinated? " + pet.getVaccine());
		System.out.println("Housebroken? " + pet.getHousebroken());
		System.out.println("Neutered? " + pet.getNeutered());
	}
}
