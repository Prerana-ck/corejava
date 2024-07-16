class ZomatoRunner{

public static void main(String args[]){
System.out.println("main started");
String name="Stardust Macchiato";
int qnty=3;
int price = Zomato.getDrinksPrice(name,qnty);
System.out.println(price);

System.out.println("main ended");
}



}