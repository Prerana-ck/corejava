class Swiggy{

  public static void main(String args[]){
  
  System.out.println("main started");
  
  String vegStarter[] = {"Gobbi Manchurian" , "Paneer Tikka" , "Mushroom Manchurian" , "Chilli Paneer" , "Babycorn Manchurian" , "Aloo Tikki" , "Babycorn Pepper" , "Schezwan noodles" , "Palak Roll" , "Shawarma"};
  String nonvegStarter[] = {"Kabab" , "Chikken Tikka" , "Chilli Prawns" , "Ginger Fish" , "Scehzwan Chicken" , "Chilli Chicken" , "chicken Paneer" , "Paneer65" , "Lemon Chicken" , "Chilli Egg" };
  String nonVegMainCourse[] = {"Chicken Biryani" , "Chicken Chow Mushroom" , "Szechwan Sauce" , "Chicken Fried Rice" , "Butter Chicken" , "Egg Fried Rice" , "Mutton Curry" , "Chicken Curry" , "Chicken Shezwan" , "Chicken Masala"};
  String vegMainCourse[] = {"Mushroom Masala" , "Veg Fried Rice" , "Dal Makhini" , "Dum Aloo" , "Mix Veg" , "Dal Handi" , "Chana Masala" , "Bhindi Masala" , "Palak Paneer" , "Veg Kharahi"};
  System.out.println("The menu is as follows");
   for (String vegstarter: vegStarter){
   System.out.println(vegstarter);
   }
    for (String nonvegstarter: nonvegStarter){
	  System.out.println(nonvegstarter);
  }
   for (String nonvegcourse: nonVegMainCourse){
	  System.out.println(nonvegcourse);
  }
   for (String vegcourse: vegMainCourse){
	  System.out.println(vegcourse);
  }
  System.out.println("main ended");
  }
  
  }