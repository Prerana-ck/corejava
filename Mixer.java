class  Mixer {

public static void main(String args[]){
System.out.println("main started");
getFeatures();
System.out.println("main ended");
}

public static void getFeatures(){
System.out.println("get features method started");

   String brandName = "Philips";
   int price =  4000;
   String color = "Green";
   int capacity = 500;
   String origin = "India";
   String type = "Fruits mixer";
   
   System.out.println("The brand name of the mixer is " + brandName);
   System.out.println("The price of the mixer is " + price);
   System.out.println("The color of the mixer is " + color);
   System.out.println("The capacity of the mixer is " + capacity );
   System.out.println("The origin of the product is " + origin);
   System.out.println("The type of the mixer is " + type);
System.out.println("get features method ended");
}


}