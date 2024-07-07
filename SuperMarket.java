class SuperMarket{

 public static void main(String dmart[]) {
 
  System.out.println("main started");
  
  String groceries[] = {"Wheat" , "Rice" , "Urad Dal", "Peanuts" , "Moong Dal", "Jower" , "Toor Dal" , "Jaggery" , "Sugar" , "Oil" , "Mustard", "Clove" , "Cinnamon" , "CoffeeBeans" , "Oats"};
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
  
  
  System.out.println("The Available groceries are :" + groceries[0] + "," + groceries[1] + "," + groceries[2] + "," + groceries[3] + "," + groceries[4] + "," + groceries[5] + "," + groceries[6] + "," + groceries[7] + "," + groceries[8] + "," + groceries[9] + "," + groceries[10] + "," + groceries[11] + "," + groceries[12] + "," + groceries[13] + "," + groceries[14] );
  System.out.println("Available vegetables are :" + vegetables[0] + " ," +  vegetables[1] + " ," + vegetables[2] + " ," + vegetables[3] + " ," + vegetables[4] + " ," + vegetables[5] + " ," + vegetables[6] + " ," + vegetables[7] + " ," + vegetables[8] + " ," + vegetables[9]);  
  System.out.println("Available icrecreams are :" + iceCreams[0] + "," + iceCreams[1] + "," + iceCreams[2] + "," + iceCreams[3] + "," + iceCreams[4] + "," + iceCreams[5] + "," + iceCreams[6] + "," + iceCreams[7] + "," + iceCreams[8] + "," + iceCreams[9] + "," + iceCreams[10] + "," + iceCreams[11] + "," + iceCreams[12] + "," + iceCreams[13] + "," + iceCreams[14]);
  System.out.println("Available perfumes are :"  + perfumes[0] + "," + perfumes[1] + "," + perfumes[2] + "," + perfumes[3] + "," + perfumes[4] + "," + perfumes[5] + "," + perfumes[6] + "," + perfumes[7] + "," + perfumes[8] + "," + perfumes[9] + "," + perfumes[10] + "," + perfumes[11] + "," + perfumes[12] + "," + perfumes[13] + "," + perfumes[14] );
  System.out.println("Avalable fruits are :" + fruits[0] + "," + fruits[1] + "," + fruits[2] + "," + fruits[3] + ","+ fruits[4] + "," + fruits[5] + "," + fruits[6] + "," + fruits[7] + "," + fruits[8] + "," + fruits[9] );
  System.out.println("Available snacks are :" + snacks[0] + "," + snacks[1] + "," + snacks[2] + "," + snacks[3] + "," + snacks[4] + "," + snacks[5] + "," + snacks[6] + "," + snacks[7] + "," + snacks[8] + "," + snacks[9] );
  System.out.println("Available milk products are :" + milkProducts[0] + "," + milkProducts[1] + "," + milkProducts[2] + "," + milkProducts[3] + "," + milkProducts[4] + "," + milkProducts[5] + "," + milkProducts[6] + "," + milkProducts[7] + "," + milkProducts[8] + "," + milkProducts[9]  );
  System.out.println("Available chocolates are :" + chocolates[0] + "," + chocolates[1] + "," + chocolates[2] + "," + chocolates[3] + "," + chocolates[4] + "," + chocolates[5] + "," + chocolates[6] + "," + chocolates[7] + "," + chocolates[8] + "," + chocolates[9] + "," + chocolates[10] + "," + chocolates[11] + "," + chocolates[12] + "," + chocolates[13] + "," + chocolates[14] );
  System.out.println("Available cosemetics are : " + cosemetics[0] + "," + cosemetics[1] + "," + cosemetics[2] + "," + cosemetics[3] + "," + cosemetics[4] + "," + cosemetics[5] + "," + cosemetics[6] + ","  + cosemetics[7] + "," + cosemetics[8] + "," + cosemetics[9] + "," + cosemetics[10] + "," + cosemetics[11] + "," + cosemetics[12] + "," + cosemetics[13] + "," + cosemetics[14] );
  System.out.println("Available cool Drinks are :" + coolDrinks[0] + ","+coolDrinks[1] + "," + coolDrinks[2] + "," + coolDrinks[3] + "," + coolDrinks[4] + "," + coolDrinks[5] + "," + coolDrinks[6] + "," + coolDrinks[7] + "," + coolDrinks[8] + "," + coolDrinks[9] + "," + coolDrinks[10] + "," + coolDrinks[11] + "," + coolDrinks[12] + "," + coolDrinks[13] + "," + coolDrinks[14] );
  System.out.println("Available home applications are :" + homeApplications[0] + "," + homeApplications[1] + "," + homeApplications[2] + "," + homeApplications[3] + "," + homeApplications[4] + "," + homeApplications[5] + "," + homeApplications[6] + "," + homeApplications[7] + "," + homeApplications[8] + "," + homeApplications[9] + "," + homeApplications[10] + "," + homeApplications[11] + "," + homeApplications[12] + "," + homeApplications[13] + "," + homeApplications[14] + "," + homeApplications[15] + "," + homeApplications[16] + "," + homeApplications[17] + "," + homeApplications[18] + "," + homeApplications[19] );
  System.out.println("Avaialble alcohols are :" + alcohols[0] + "," + alcohols[1] + "," + alcohols[2] + "," + alcohols[3] + "," + alcohols[4] + "," + alcohols[5] + "," + alcohols[6] + "," + alcohols[7] + "," + alcohols[8] + "," + alcohols[9] + "," + alcohols[10] + "," + alcohols[11] + "," + alcohols[12] + "," + alcohols[13] + ","  + alcohols[14] );
  
  System.out.println("main ended");

 }


}
