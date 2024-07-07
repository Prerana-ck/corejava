class Noodles{

public static void main(String tasty[]){

System.out.println("main started");
String noodlesName = "Maggi";
int price = 20;
String quantity = "50g";
String ingridients[] = {"Refined Wheat Flour","Palm Oil","Iodised Salt","Wheat Gluten","Thickners"};

System.out.println("The name of the noodles brand is:" + noodlesName);
System.out.println("The price of the noodles is:" + price);
System.out.println("The quantity of the noodles is:" + quantity);
System.out.println("The ingrediants of the noodles are:");

for(int index=0; index<ingridients.length; index++){
   String value = ingridients[index];
   System.out.println(value);


}

System.out.println("main ended");
}

}