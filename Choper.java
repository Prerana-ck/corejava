class  Choper {

public static void main(String args[]){
System.out.println("main started");
getFeatures();
System.out.println("main ended");
}

public static void getFeatures(){
System.out.println("get features method started");

   String brandName = "Butterfly";
   int price =  400;
   String color = "Green";
   int capacity = 250;
   String origin = "India";
   String type = "vegetable choper";
   
   System.out.println("The brand name of choper is " + brandName);
   System.out.println("The price of the choper is" + price);
   System.out.println("The color of the choper is " + color);
   System.out.println("The capacity of the choper is " + capacity );
   System.out.println("The origin of the product is " + origin);
   System.out.println("The type of the choper is " + type);
System.out.println("get features method ended");
}


}