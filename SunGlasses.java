class SunGlasses{

public static void main(String args[]){
System.out.println("main started");
 getProductFeatures();
 System.out.println("main ended");

}

public static void getProductFeatures(){
System.out.println("get product features method started");
   String brandName = "Voyage ";
   int price = 800;
   int weightInGms = 50;
   String frameShape = "Square";
   String frameMaterial = "Metal";
   String origin = "India";
      
   System.out.println("The brand name of the barnd is " + brandName );
   System.out.println("The price of this product is " + price );
   System.out.println("The weight if the glasses in grams is  " + weightInGms );
   System.out.println("The shape of the frame is  " + frameShape );
   System.out.println("The material of the frame is  " + frameMaterial );
   System.out.println("The origin of this product is  " + origin );
   System.out.println("get product features method ended");

}

}