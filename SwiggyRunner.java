class SwiggyRunner{

public static void main(String args[]){
System.out.println("main started");
String name = "Paneer Tikka";
int qnty=3;
int price = Swiggy.getStartersPrice(name,qnty);
System.out.println(price);
System.out.println("main ended");

}

}