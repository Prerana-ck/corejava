class   Perfume{

public static void main(String args[]){
System.out.println("main started");
getFeatures();
System.out.println("main ended");
}

public static void getFeatures(){
System.out.println("get features method started");
  
   String brandName = "Engage";
   String itemForm = "Liquid";
   int price = 200;
   int quantityInMl = 120;
   String feature = "LongLasting";
   String scent = "Multiple";
  
  
  
    System.out.println("The brand name of the perfume is " + brandName );
    System.out.println("The form of this perfume is  " + itemForm );
	System.out.println("The price of the perfume is  " + price );
	System.out.println("The quantity of the perfume is " + quantityInMl);
	System.out.println("the special feature of the perfume is   " + feature );
	System.out.println(" The scent of this perfume is  " + scent );
System.out.println("get features method ended");
}


}