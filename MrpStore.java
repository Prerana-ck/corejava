class MrpStore{

static String alcoholNames[]={null,null,null,null,null,null,null,null,null,null};
static int start=0;

public static boolean addAlcoholName(String alcoholName){
boolean isAlcoholNameAdded = false;

if(start>=alcoholNames.length)
System.out.println("Array index is out of bound");
  else if(alcoholName!=null){
  alcoholNames[start++]=alcoholName;
  isAlcoholNameAdded=true;
}
else
  System.out.println("Invalid alcohol name");


return isAlcoholNameAdded;
}

public static void displayAlcoholNames(){
for(String alcoholName : alcoholNames)
System.out.println(alcoholName);
return;
}

}