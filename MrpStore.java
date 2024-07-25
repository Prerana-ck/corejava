import java.util.Arrays;
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

public static boolean updateAlcoholName(String newAlcoholName , String oldAlcoholName){
	 boolean isAlcoholNameUpdated = false;
	 
	 for(int position=0 ; position<alcoholNames.length; position++){
		 if(alcoholNames[position]==oldAlcoholName){
			 alcoholNames[position]=newAlcoholName;
		
			 isAlcoholNameUpdated=true;
			 	 
		 }
	 }
	 if(isAlcoholNameUpdated==false){
		 System.out.println(oldAlcoholName + "not found");
	 }
	
	return isAlcoholNameUpdated;
}

public static boolean deleteAlcoholName(String alcoholName){
	boolean isAlcoholNameDeleted = false;
	
	int position , newposition ;
	for(position=0 , newposition=0; position<alcoholNames.length ; position++ ){
		if(alcoholNames[position]!=alcoholName){
			alcoholNames[newposition]=alcoholNames[position];
			newposition++;
		}
		else
			isAlcoholNameDeleted=true;
	}
	 
	 int newlength = newposition;
	 alcoholNames = Arrays.copyOf(alcoholNames,newlength);

 if(isAlcoholNameDeleted==false){
	 System.out.println(alcoholName + "not found");
 }
 return isAlcoholNameDeleted;
}

}