package packages;

public class Package {
	private final double[][] PRICES = {{1,2.00, 1.50, .50}, {9, 3.00, 2.35, 1.50}, {17,4.50, 3.25, 2.15}};
	private int weight;
	private char shippingMethod;
	protected double cost;
	
	public Package(int weight, char shippingMethod) {
		this.weight = weight;
		this.shippingMethod = shippingMethod;
		calculateCost();
	}
	
	protected void calculateCost() {
		if(weight >= PRICES[0][0] && weight < PRICES[1][0]) {
			switch(shippingMethod){
            case 'A':
                cost = PRICES[0][1];
                break;
            case 'T':
                cost = PRICES[0][2];
                break;
            case 'M':
                cost = PRICES[0][3];
                break;
			}
		}
		else if(weight >= PRICES[1][0] 
                && weight < PRICES[2][0]){
            switch(shippingMethod){
                case 'A':
                    cost = PRICES[1][1];
                    break;
                case 'T':
                    cost = PRICES[1][2];
                    break;
                case 'M':
                    cost = PRICES[1][3];
                    break;
            }
        }
		else if(weight >= PRICES[2][0]){
            switch(shippingMethod){
                case 'A':
                    cost = PRICES[2][1];
                    break;
                case 'T':
                    cost = PRICES[2][2];
                    break;
                case 'M':
                    cost = PRICES[2][3];
                    break;
            }
        }
	}
	
	public void display() {
		int i, j;
		System.out.println("Table: ");
		for(i = 0; i < PRICES.length; ++i){
            for(j = 0; j < PRICES[i].length; ++j)
                System.out.print(PRICES[i][j] + " ");
            System.out.println();
        }
        System.out.println("And here's the weight: " + weight + "\n"
                + "Shipping method: " + shippingMethod
                + " and cost: " + cost);
	}
}
