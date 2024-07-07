class Candles{

public static void main(String light[]){
System.out.println("main started");
// invoke a method
// call a method
 getFeatures();
System.out.println("main ended");

}

public static  void getFeatures(){
System.out.println("get features method started");
	 System.out.println("THe features of candles are:");
	 //local variables
	 String brandName = "Welburn";
	 String color = "White";
	 int weightInGrams = 8;
	 int noOfItems = 100;
	 int price = 379;
	 String usageType = "Indoor";
	 System.out.println("The brand name is:" + brandName);
	 System.out.println("The color of the candles is:" + color);
	 System.out.println("The weight of candles in kg is:" + weightInGrams);
	 System.out.println("The number of items in the box is:" + noOfItems);
	 System.out.println("The price of the candle is:" + price);
System.out.println("get features method ended");
return;
}

}