class Division{

public static void main(String divide[]){
System.out.println("main ended");
div(60,20);
div(32,20);
System.out.println("main ended");
}

public static void div(int num1, int num2){
System.out.println("div method started");
System.out.println(num1 / num2);
System.out.println("div method ended");
return;
}
}