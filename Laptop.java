class  Laptop  {

public static void main(String args[]){
System.out.println("main started");
getFeatures();
System.out.println("main ended");
}

public static void getFeatures(){
System.out.println("get features method started");

   String brandName = "Dell";
   int price =  80000;
   String color = "Black";
   int capacity = 80;
   String origin = "India";
   String storage = "1TB";
   
   System.out.println("The brand name of the laptop is " + brandName );
   System.out.println("The price of the laptop is " + price);
   System.out.println("The color of the laptop is " + color);
   System.out.println("The capacity of the laptop is  " + capacity );
   System.out.println("The origin of the product is " + origin);
   System.out.println("The storage of the laptop is " + storage);
System.out.println("get features method ended");
}


}