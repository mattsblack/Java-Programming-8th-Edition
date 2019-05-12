public class Sandwich {
      String mainIngredient;
      String breadType;
      double price;
   public Sandwich() {
     mainIngredient = "XXX";
     breadType = "XXX";
     price = 0;
   }
   public void setMainIngredient(String ingredient) {
      mainIngredient = ingredient;
   }
   public void setBreadType(String bread) {
      breadType = bread;
   }
   public void setPrice(double pr) {
      price = pr;
   }
     public String getMainIngredient() {
      return mainIngredient;
   }
     public String getBreadType() {
      return breadType;
   }
   public double getPrice() {
      return price;
   }
}