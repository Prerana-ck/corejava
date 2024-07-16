class DominosRunner{

public static void main(String args[]){
System.out.println("main started");
String name ="Cheese Pizza";
int qnt=3;
int price = Dominos.getPizzaPrice(name,qnt);
System.out.println(price);

System.out.println("main ended");
}


}