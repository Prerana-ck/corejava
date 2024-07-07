class RotiMaker{

public static void main(String shop[]){
System.out.println("main started");
getFeatures();
System.out.println("main ended");
}

public static void getFeatures(){
System.out.println("get features method started");

   String brandName = "Libra";
   int price = 1000 ;
   String color = "Black";
   int capacity = 100 ;
   String origin = "India";
   
   System.out.println("The brand name of roti maker is " + brandName);
   System.out.println("The price of roti maker is " + price);
   System.out.println("The color of roti maker is " + color);
   System.out.println("The capacity of roti maker is " + capacity );
   System.out.println("The origin of the product is " + origin);
   System.out.println("get features method ended");
}
}