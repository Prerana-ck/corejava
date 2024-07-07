class Shoe{

public static void main(String shop[]){
System.out.println("main started");
 //invoke a method
 // call a method
 productFeatures();
 System.out.println("main ended");

}

public static void productFeatures(){
System.out.println("product features method started");
    String brandName = "Puma";
	int price = 2000;
	String color = "Red";
	int brandId = 864;
	String type = "Casual";
	int size = 6 ;
	System.out.println("The product features are:");
	System.out.println("The name of the brand is " + brandName);
	System.out.println("The price of the shoe is " + price);
	System.out.println("The color of the shoe is " + color);
	System.out.println("The brandid of shoe is " + brandId);
	System.out.println("The type of the shoe is " + type);
	System.out.println("The size of the shoe is " + size);
	System.out.println("product features method ended");

}

}