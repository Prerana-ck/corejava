class   BedSheet{

public static void main(String args[]){
System.out.println("main started");
getFeatures();
System.out.println("main ended");
}

public static void getFeatures(){
System.out.println("get features method started");

    String brandName = "UrbanSpace";
	String color = "Grey";
	String size = "Doublesize";
	String material = "Cotton";
	int price = 1000;
	String pattren = "Floral" ;
  
  
    System.out.println("The brand name of the bedsheet is  " + brandName );
    System.out.println("The color of the bedsheet is   " + color );
	System.out.println("The size of the bedsheet is  " + size );
	System.out.println("The material of the bedsheet is  " + material );
	System.out.println("The price of the bedsheet is   " + price );
	System.out.println("The pattern of the bedsheet is  " + pattren );
System.out.println("get features method ended");
}


}