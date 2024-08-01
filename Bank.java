class Bank{

int id ;
String name ;
String  branchName ;
String ifscCode;
String  swiftCode ;
int noOfWorker;
 String branchManager;
 
 //default constructor
 public Bank(){
	 System.out.println("Bank object is created");
 }
 
 //parameterized constructor
 public Bank(int id,String name, String branchName, String ifscCode, String swiftCode, int noOfWorker, String branchManager){
	 System.out.println("Bank object is created and initialized");
	 this.id=id;
	 this.name=name;
	 this.branchName=branchName;
	 this.ifscCode=ifscCode;
	 this.swiftCode=swiftCode;
	 this.noOfWorker=noOfWorker;
	 this.branchManager=branchManager;
	 
 }
 

}