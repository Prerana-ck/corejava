class  Lamp {

public static void main(String args[]){
System.out.println("main started");
getFeatures();
System.out.println("main ended");
}

public static void getFeatures(){
System.out.println("get features method started");

   String brandName = "Ziva";
   int price = 1200 ;
   String color = "pink";
   int capacity = 100 ;
   String origin = "India";
   String type = "Night lamp";
   
   System.out.println("The brand name of the lamp is " + brandName);
   System.out.println("The price of the lamp is " + price);
   System.out.println("The color of the lamp is " + color);
   System.out.println("The capacity of the lamp is " + capacity );
   System.out.println("The origin of the product is " + origin);
   System.out.println("The type of the lamp is " +type);
System.out.println("get features method ended");
}


}