class RedBus{


public static void main(String args[]){

System.out.println("main started");
String company = "RedBus";
String founder = "Charan";
int dateFounded = 2006;
String headQuarters = "Bengaluru";
String busNames[] = {"Volvo","SRS","VRL","Suguma","Gajanana","Sea Bird","Rajahamsa","Airavat"};

System.out.println("The compny details are:");
System.out.println("The bus name is:" + company);
System.out.println("The founder of the company is:" + founder);
System.out.println("The date of the company founded is:" + dateFounded);
System.out.println("The head quarters of the company is in:" + headQuarters);
System.out.println("The buses available are:");

for(int index=0; index<busNames.length;index++){
   String value = busNames[index];
   System.out.println(value);
  

} 

System.out.println("main ended");
}

}