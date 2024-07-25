import java.util.Arrays;
class JuiceAdda{

static int start =0;
 static String juiceNames[]={null,null,null,null,null,null};

public static boolean addJuiceName(String juiceName){


boolean isJuiceNameAdded=false;

if(start>=juiceNames.length){
	System.out.println("Array index is out of bound");
}
   else if(juiceName!=null){
 juiceNames[start++]=juiceName;
 isJuiceNameAdded=true; 
 }	
 
 else
 System.out.println("Invalid juice name");


return isJuiceNameAdded;
}


public static void displayJuiceName(){
for(String juiceName : juiceNames)
	System.out.println(juiceName);

return;
}

public static boolean updateJuiceName(String newJuiceName , String oldJuiceName){
	boolean isJuiceNameUpdated = false;
	
	for( int position=0; position<juiceNames.length; position++){
	if(juiceNames[position]==oldJuiceName){
		juiceNames[position]=newJuiceName;
		isJuiceNameUpdated=true;	
	}
}
	

	
	if(isJuiceNameUpdated==false){
		System.out.println(oldJuiceName + "not found");
	}
		
	
	return isJuiceNameUpdated;
}

public static boolean deleteJuicetName(String juiceName){
	boolean isJuiceNameDeleted = false;
	
	int position , newposition ;
	for(position=0 , newposition=0; position<juiceNames.length ; position++ ){
		if(juiceNames[position]!=juiceName){
			juiceNames[newposition]=juiceNames[position];
			newposition++;
		}
		else
			isJuiceNameDeleted=true;
	}
	 
	 int newlength = newposition;
	 juiceNames = Arrays.copyOf(juiceNames,newlength);

 if(isJuiceNameDeleted==false){
	 System.out.println(juiceName + "not found");
 }
 return isJuiceNameDeleted;
}
}