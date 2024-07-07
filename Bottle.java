class   Bottle{

public static void main(String args[]){
System.out.println("main started");
getFeatures();
System.out.println("main ended");
}

public static void getFeatures(){
System.out.println("get features method started");

   String brandName = "Milton";
   int price = 500;
   String color = "Pink";
   int capacity = 1000 ;
   String origin = "India";
   String type = "Flask";
   
   System.out.println("The brand name of bottle is " + brandName);
   System.out.println("The price of the bottle is " + price);
   System.out.println("The color of the bottle is " + color);
   System.out.println("The capacity of the bottle is " + capacity );
   System.out.println("The origin of the product is " + origin);
   System.out.println("The type of the bottle is " + type);
System.out.println("get features method ended");
}


}