class SuperMarket{

 public static void main(String dmart[]) {
 
  System.out.println("main started");
  
  String groceries[] = {"Wheat" , "Rice" , "Urad Dal", "Peanuts" , "Moong Dal", "Jower" , "Toor Dal" , "Jaggery" , "Sugar" , "Oil" , "Mustard", "Clove" , "Cinnamon" , "CoffeeBeans"};
  String vegetables[] = {"Carrot" , "Beetroot", "Onion", "Beans" , "Spinach" , "Cucumber" , "BottleGuard" , "LadiesFinger" , "Garlic" , "Ginger"};
  String iceCreams[] = {"Vanilla" , "Chocolate" , "Butterscouth" , "Mango" , "Pista" , "BlackCurrent" , "Strawberry" , "blueberry" , "DarkChocolate" , "Oreo" , "Milk" , "Custard" , "Pineapple" , "Malai" , "Coconut"};
  String perfumes[] = {"Dior" , "Calvin Klein" , "Blueberry" , "Chloe" , "Gucci" , "Light BLue" , "Henry Rose" , "Chanel" , "Jimmy Choo" , "Mugler" , "Bvlgari" , "Givenchy" , "Gueralin" , "Paco Rabanne" , "Diva"};
  String fruits[] = {"Pomegrnate" , "Bannana" , "Papaya" , "Pear" , "Custard" , "Watermelon" , "Pineapple" , "Apple" , "Avacado" , "Blueberry" };
  String snacks[] = {"Chips" , "Chikki" , "Aloo Bujiya" , "Puffcorn" , "Bingo" , "Cookies" , "Jimjam" , "Nuts" , "KurKure" , "Unibic" };
  String milkProducts[] = {"DoodPeda" , "NutiGroe" , "Pedia Drink" , "LactoGrow" , "Kellogs" , "Amul" , "Dabur" , "Nurish" , "Sunfeast" , "Lactobites"};
  String chocolates[] = {"KitKat" , "DairyMilk" , "MilkyBar" , "Ferrori Rocheri" , "Shots" , "FiveStar" , "Perk" , "Munch" , "Snickers" , "Kisses" , "Caburary" , "Gems" , "Fuse" ,"Truffle" , "Nestle"};
  String cosemetics[] = {"kajal" , "Lipstick" , "Lipbalm" , "Lipglosal" , "Moisturizer" , "Sunscrean" , "Concealer" , "Primer" , "Maskara", "Rose water" , "Compact powder" , "Facial mask" , "Eye serum" , "Foundation" , "Eye liner"};
  String coolDrinks[] = {"Pepsi" , "Sprit" , "7up" , "Maza" , "Cocacola" , "Fanta" , "Thumbs Up" , "Mirinda" , "Frooti" , "AppyFizz" , "Tropicana" , "Stingg" , "Kenley" , "Tang" , "Sapphire"};
  String homeApplications[] = {"Fan" , "Mixer" , "Grinder", "Bulb" , "Stove" , "Fruitblender" , "Chopper" , "Regulator" , "Remotes" , "Trolley" , "Cooker" , "Induction" , "Heater" , "Cups", "DinnerSet"};   
  String alcohols[] = {"Black Dog" , "Teqilla" , "Vodka" , "Jim Beam" , "Baileys" , "Captain Morgan" ,"Kingfisher" , "Whishkey" , "Bira" , "Amrut" ,"Jonnie Walker" , "Henkein" , "Gleinfeddich" , "Sapphire" , "Hennessey"};
  System.out.println("The categories are:");
  
  System.out.println("The list of groceries are:");
  for(String grocery: groceries){
  
  System.out.print(grocery + ",");
  
  }
  
  System.out.println("The list of vegetables are:");
  for (String vegetable: vegetables){
	  System.out.println(vegetable);
  }
  System.out.println("The list of icecreams are:");
   for (String icecream: iceCreams){
	  System.out.println(icecream);
  }
  System.out.println("The list of perfumes are:");
   for (String perfume: perfumes){
	  System.out.println(perfume);
  }
  System.out.println("The list of fruits are:");
   for (String fruite: fruits){
	  System.out.println(fruite);
  }
  System.out.println("The list of snacks are:");
   for (String snack: snacks){
	  System.out.println(snack);
  }
  System.out.println("The list of milk products are:");
   for (String milkproducts: milkProducts){
	  System.out.println(milkproducts);
  }
  System.out.println("The list of chocolates are:");
   for (String chocolate: chocolates){
	  System.out.println(chocolate);
  }
  System.out.println("The list of cosemetics are:");
   for (String cosemetic: cosemetics){
	  System.out.println(cosemetic);
  }
  System.out.println("The list of cool drinks are:");
   for (String cooldrink: coolDrinks){
	  System.out.println(cooldrink);
  }
  System.out.println("The list of acholos are:");
   for (String alcohol: alcohols){
	  System.out.println(alcohol);
  }
  
  
  System.out.println("main ended");
  }
  
  }