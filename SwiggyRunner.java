class SwiggyRunner{

public static void main(String args[]){
System.out.println("main started");
String name = "Paneer Tikka";
int price = Swiggy.getStartersPrice(name);
System.out.println(price);
System.out.println("main ended");

}

}