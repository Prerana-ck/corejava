class  Refrigerator {

public static void main(String args[]){
System.out.println("main started");
getFeatures();
System.out.println("main ended");
}

public static void getFeatures(){
System.out.println("get features method started");
   String brandName = "lg";
   int price =  2000;
   String color = "Blue";
   int capacity = 1000 ;
   String origin = "India";
   
   System.out.println("The brand name of refrigerator is " + brandName);
   System.out.println("The price of of this product is " + price);
   System.out.println("The color of refrigerator is " + color);
   System.out.println("The capacity of frifge is " + capacity );
   System.out.println("The origin of the product is " + origin);
System.out.println("get features method ended");
}


}