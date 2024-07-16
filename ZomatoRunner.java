class ZomatoRunner{

public static void main(String args[]){
System.out.println("main started");
String name="Stardust Macchiato";
int price = Zomato.getDrinksPrice(name);
System.out.println(price);

System.out.println("main ended");
}



}