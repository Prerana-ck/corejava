class JuiceAddaRunner{

public static void main(String args[]){
System.out.println("main started");

boolean juiceAdded = JuiceAdda.addJuiceName("Sweet Lime");
System.out.println("The juice is added" + juiceAdded);


juiceAdded = JuiceAdda.addJuiceName("Watermelon");
System.out.println("The juice is added" + juiceAdded);


juiceAdded = JuiceAdda.addJuiceName("Pineapple");
System.out.println("The juice is added" + juiceAdded);


juiceAdded = JuiceAdda.addJuiceName("Orange");
System.out.println("The juice is added" + juiceAdded);


juiceAdded = JuiceAdda.addJuiceName("Muskmelon");
System.out.println("The juice is added" + juiceAdded);

juiceAdded = JuiceAdda.addJuiceName("Tender coconut");
System.out.println("The juice is added" + juiceAdded);


juiceAdded = JuiceAdda.addJuiceName("Pomegranate");
System.out.println("The juice is added" + juiceAdded);


JuiceAdda.displayJuiceName();
System.out.println("main ended");
}



}