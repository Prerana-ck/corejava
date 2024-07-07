class  HandBag {

public static void main(String args[]){
System.out.println("main started");
getFeatures();
System.out.println("main ended");
}

public static void getFeatures(){
System.out.println("get features method started");
   String brandName = "Zouk ";
   int price = 2000 ;
   String type = "Zipper";
   String material = "Jute";
   int noOfPockets = 4;
   String origin = "India";
   
   System.out.println("The brand name of the hand bag is " + brandName );
   System.out.println("The price of this product is " + price );
   System.out.println("The type of the hand bag is  " + material);
   System.out.println("The material of the bag is " + material );
   System.out.println("The number of pockets in bag is  " + noOfPockets);
   System.out.println("The origin of this product is  " + origin );
System.out.println("get features method ended");
}


}