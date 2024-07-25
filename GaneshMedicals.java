import java.util.Arrays;
class GaneshMedicals{

static String medicineNames[]={null,null,null,null,null,null,null,null,null,null};
static int start=0;

public static boolean addMedicineName(String medicineName){
boolean isMedicineNameAdded = false;

if(start>=medicineNames.length)
System.out.println("Array index is out of bound");
  else if(medicineName!=null){
  medicineNames[start++]=medicineName;
  isMedicineNameAdded=true;
}
else
  System.out.println("Invalid place name");


return isMedicineNameAdded;
}

public static void displayMedicineNames(){
for(String medicineName : medicineNames)
System.out.println(medicineName);
return;
}


public static boolean updateMedicineName(String newMedicineName , String oldMedicineName){
	 boolean isMedicineNameUpdated = false;
	 
	 for(int position=0 ; position<medicineNames.length; position++){
		 if(medicineNames[position]==oldMedicineName){
			 medicineNames[position]=newMedicineName;
		
			 isMedicineNameUpdated=true;
			 	 
		 }
	 }
	 if(isMedicineNameUpdated==false){
		 System.out.println(oldMedicineName + "not found");
	 }
	
	return isMedicineNameUpdated;
}

public static boolean deleteMedicineName(String medicineName){
	boolean isMedicineNameDeleted = false;
	
	int position , newposition ;
	for(position=0 , newposition=0; position<medicineNames.length ; position++ ){
		if(medicineNames[position]!=medicineName){
			medicineNames[newposition]=medicineNames[position];
			newposition++;
		}
		else
			isMedicineNameDeleted=true;
	}
	 
	 int newlength = newposition;
	 medicineNames = Arrays.copyOf(medicineNames,newlength);

 if(isMedicineNameDeleted==false){
	 System.out.println(medicineName + "not found");
 }
 return isMedicineNameDeleted;
}

}