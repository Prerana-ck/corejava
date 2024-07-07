class  Cooker {

public static void main(String args[]){
System.out.println("main started");
getFeatures();
System.out.println("main ended");
}

public static void getFeatures(){
System.out.println("get features method started");

    String brandName = "Piegon";
	int capacityInLiters = 5;
	String material = "Aluminium";
	int weightInKg = 1;
	String color = "Black";
	String controlMethod = "Touch" ;
	
	System.out.println("The name of the brand is " + brandName);
	System.out.println("The capacity of cooker is is " + capacityInLiters);
	System.out.println("The material of cooker is " + material);
	System.out.println("The Weight of cooker is " + weightInKg);
	System.out.println("The color of cooker is " + color);
	System.out.println("The contolling method of cooker is " + controlMethod);
System.out.println("get features method ended");
}


}