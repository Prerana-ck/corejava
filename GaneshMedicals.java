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

}