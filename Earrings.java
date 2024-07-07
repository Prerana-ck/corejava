class  Earrings {

public static void main(String args[]){
System.out.println("main started");
getFeatures();
System.out.println("main ended");
}

public static void getFeatures(){
System.out.println("get features method started");

   String brandName = "Ziva ";
   int price = 2000;
   String materialType = "Silver";
   String gemType = "Zircon";
   String metalType = "SterlingSilver";
   String origin = "India";
   
   System.out.println("The brand name of the earrings is " + brandName );
   System.out.println("The price of this product is " + price );
   System.out.println("The material type of the earrings is  " + materialType );
   System.out.println("The gem type of the earrings is " + gemType );
   System.out.println("The metal type of this earrings is " + metalType );
   System.out.println("The origin of this product is  " + origin );
System.out.println("get features method ended");
}


}