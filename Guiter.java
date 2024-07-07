class  Guiter {

public static void main(String args[]){
System.out.println("main started");
getFeatures();
System.out.println("main ended");
}

public static void getFeatures(){
System.out.println("get features method started");

   String brandName = "Yamaha ";
   int price = 8000 ;
   String color = "Natural";
   String topMaterial = "Rose";
   String bodyMaterial = "Rosewood";
   String origin = "India";

   
   System.out.println("The brand name of the guiter is " + brandName );
   System.out.println("The price of this product is " + price );
   System.out.println("The color of the guiter is " + color );
   System.out.println("The top material of the guiter is " + topMaterial );
   System.out.println("The body material of the guiter is " + bodyMaterial );
   System.out.println("The origin of this product is  " + origin );
System.out.println("get features method ended");
}


}