class  DishWasher {

public static void main(String args[]){
System.out.println("main started");
getFeatures();
System.out.println("main ended");
}

public static void getFeatures(){
System.out.println("get features method started");

   String brandName = "LG";
   int price = 50000 ;
   String color = "Black";
   int capacity = 500 ;
   String origin = "India";
   String loadtype = "hard dishers";
   
   System.out.println("The brand name of dish washer " + brandName);
   System.out.println("The price of dish washer is " + price);
   System.out.println("The color of dish washer is " + color);
   System.out.println("The capacity of dish washer is " + capacity );
   System.out.println("The origin of the product is " + origin);
   System.out.println("The type of the load is " + loadtype);
System.out.println("get features method ended");
}


}