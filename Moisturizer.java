class  Moisturizer {

public static void main(String args[]){
System.out.println("main started");
getFeatures();
System.out.println("main ended");
}

public static void getFeatures(){
System.out.println("get features method started");

   String brandName = "Ponds ";
   int price = 380;
   String skinType = "All";
   String type = "Gel";
   String scent = "Musk";
   int weightInGrms = 9;
   String origin = "India";
   
   System.out.println("The brand name of the moisturizer is " + brandName );
   System.out.println("The price of this product is " + price );
   System.out.println("The skin type of this product is  " + skinType );
   System.out.println("The scent of this cream is " + scent );
   System.out.println("The weight of this cream is " + weightInGrms );
   System.out.println("The origin of this product is  " + origin );
System.out.println("get features method ended");
}


}