class  Fan {

public static void main(String args[]){
System.out.println("main started");
getFeatures();
System.out.println("main ended");
}

public static void getFeatures(){
System.out.println("get features method started");

	 String color = "White";
	 int price = 1500;
	 String fanDesign = "Cieling";
	 String controllerType = "Button";
	 int wattage = 52;
	 String powerSource = "Corded";
	 
	 System.out.println("The color of fan is " + color );
	 System.out.println(" The price of fan is  " + price );
	 System.out.println("The design of fan is " + fanDesign );
	 System.out.println("The type of controller is " + controllerType );
	 System.out.println("The wattge of fan is " + wattage);
	 System.out.println("The power source of fan is " + powerSource);
System.out.println("get features method ended");
}


}