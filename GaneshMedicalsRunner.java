class GaneshMedicalsRunner{

public static void main(String medicine[]){
System.out.println("main started");

boolean medicineAdded = GaneshMedicals.addMedicineName("Avastin");
System.out.println("The medicine name is added:" + medicineAdded);

 medicineAdded = GaneshMedicals.addMedicineName("Actorise");
System.out.println("The medicine name is added:" + medicineAdded);

 medicineAdded = GaneshMedicals.addMedicineName("Azel");
System.out.println("The medicine name is added:" + medicineAdded);

 medicineAdded = GaneshMedicals.addMedicineName("Ascoril");
System.out.println("The medicine name is added:" + medicineAdded);

 medicineAdded = GaneshMedicals.addMedicineName("Aricep");
System.out.println("The medicine name is added:" + medicineAdded);

 medicineAdded = GaneshMedicals.addMedicineName("Pazoci");
System.out.println("The medicine name is added:" + medicineAdded);

 medicineAdded = GaneshMedicals.addMedicineName("Herclon");
System.out.println("The medicine name is added:" + medicineAdded);

 medicineAdded = GaneshMedicals.addMedicineName("Heptral");
System.out.println("The medicine name is added:" + medicineAdded);

 medicineAdded = GaneshMedicals.addMedicineName("Hetrazan");
System.out.println("The medicine name is added:" + medicineAdded);

 medicineAdded = GaneshMedicals.addMedicineName("Hepamerz");
System.out.println("The medicine name is added:" + medicineAdded);

 medicineAdded = GaneshMedicals.addMedicineName("Norflox");
System.out.println("The medicine name is added:" + medicineAdded);


GaneshMedicals.displayMedicineNames();

boolean medicineUpdated = GaneshMedicals.updateMedicineName("Dola", "Hepamerz");
System.out.println("The medicine name is updated:" + medicineUpdated);


GaneshMedicals.displayMedicineNames();

boolean medicineDeleted = GaneshMedicals.deleteMedicineName("Hetrazan");
System.out.println("The medicine name is deleted:" + medicineDeleted);


GaneshMedicals.displayMedicineNames();
}
}