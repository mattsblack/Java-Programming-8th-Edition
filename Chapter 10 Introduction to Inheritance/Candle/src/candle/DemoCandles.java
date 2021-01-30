package candle;

public class DemoCandles {

	public static void main(String[] args) {
		Candle candle = new Candle();
        ScentedCandle candle2 = new ScentedCandle();
        candle.setColor("Blue");
        candle.setHeight(10);
        candle2.setColor("Yellow");
        candle2.setScent("Mint");
        candle2.setHeight(15);
        System.out.printf("The candle's color is: "+ candle.getColor()
                +", its height is: "+ candle.getHeight()
                +", and its price is: $%.2f",candle.getPrice());
        System.out.printf("\nThe scented candle's color is: "+ candle2.getColor()
                +", its height is: "+ candle2.getHeight()
                +", its scent is: "+ candle2.getScent()
                +", and its price is: $%.2f",candle2.getPrice());

	}

}
