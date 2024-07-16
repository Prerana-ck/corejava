class NandhiniParlourRunner{

public static void main(String args[]){
System.out.println("main started");
String name = "Plain Lassi";
int qnty= 3;
int price=NandhiniParlour.getProductPrice(name,qnty);
System.out.println(price);
System.out.println("main ended");
}


}