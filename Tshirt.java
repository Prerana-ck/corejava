class Tshirt{

public static void main(String allen[]){
System.out.println("main started");
getproductsFeatures();
System.out.println("main ended");
}

public static void getproductsFeatures(){
System.out.println("get product features method started");
	String material = "Cotton";
	String color = "black";
	String sleeveType = "Half";
	int price = 800;
	String occasion = "Causual";
	String origin = "India";
	
   System.out.println("The material of tshirt is "+ material );
	 System.out.println("The color of tshirt is "+ color );
	 System.out.println("The type of sleeve is "+ sleeveType );
	 System.out.println("The price of tshirt is "+ price );
	 System.out.println("The occasion of tshirt is "+ occasion );
	 System.out.println("The origin of product is "+ origin );
	 
	 System.out.println("get products features method ended");
}
}