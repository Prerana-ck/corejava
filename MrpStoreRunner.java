class MrpStoreRunner{

public static void main(String alcohol[]){
System.out.println("main started");

boolean alcoholAdded = MrpStore.addAlcoholName("Kahula");
System.out.println("The alcohol name is added:" + alcoholAdded);

 alcoholAdded = MrpStore.addAlcoholName("Malibua");
System.out.println("The alcohol name is added:" + alcoholAdded);

alcoholAdded = MrpStore.addAlcoholName("Triple Sec");
System.out.println("The alcohol name is added:" + alcoholAdded);

alcoholAdded = MrpStore.addAlcoholName("Baileys Irish");
System.out.println("The alcohol name is added:" + alcoholAdded);

alcoholAdded = MrpStore.addAlcoholName("Sambuca");
System.out.println("The alcohol name is added:" + alcoholAdded);

alcoholAdded = MrpStore.addAlcoholName("Peach Schnapps");
System.out.println("The alcohol name is added:" + alcoholAdded);
 
alcoholAdded = MrpStore.addAlcoholName("Jagermeister");
System.out.println("The alcohol name is added:" + alcoholAdded);

alcoholAdded = MrpStore.addAlcoholName("Old Monk");
System.out.println("The alcohol name is added:" + alcoholAdded);

alcoholAdded = MrpStore.addAlcoholName("Morpheus");
System.out.println("The alcohol name is added:" + alcoholAdded);

alcoholAdded = MrpStore.addAlcoholName("Gordons");
System.out.println("The alcohol name is added:" + alcoholAdded);

alcoholAdded = MrpStore.addAlcoholName("Smirnoff");
System.out.println("The alcohol name is added:" + alcoholAdded);


MrpStore.displayAlcoholNames();
}
}