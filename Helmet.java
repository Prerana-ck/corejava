class  Helmet {

public static void main(String args[]){
System.out.println("main started");
getFeatures();
System.out.println("main ended");
}

public static void getFeatures(){
System.out.println("get features method started");

    String color = "Black";
	String brandName = "Steelbird";
	int weightInKgs = 1;
	String material = "Thermoresistant";
	int price = 2000;
	String type = "Bike";
  
  
    System.out.println("The color of the helmet is  " + price );
    System.out.println("The brand name of the helmet is " + brandName );
	System.out.println("The weight of the helmet in kgs is  " + weightInKgs );
	System.out.println("The material of the helmet is " + material );
	System.out.println("The price of the helmet is  " + price );
	System.out.println("The type of the helmet is "+ type);
System.out.println("get features method ended");
}


}