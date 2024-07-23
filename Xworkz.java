class Xworkz{

static String fullname;
static int contactnumber;
static int whatsappnumber;
static String eMail;
static String uSN;
static String qualiftion;
static String branch;;
static String clg;

public static boolean createUserAccount(String fullName, int contactNumber, int whatsappNumber, String email,
                                String usn ,  String qualification , String stream , String college){
boolean isAccountCreated= false;
boolean isValidated = validateUserDetails(fullName,contactNumber,whatsappNumber,email,usn,qualification,stream,college);

if(isValidated==true){
isAccountCreated=true;
System.out.println("The account is created: " + isAccountCreated);
}
else
System.out.println("The account is created : " +  isAccountCreated);

return isAccountCreated;
}

public static boolean validateUserDetails(String fullName, int contactNumber, int whatsappNumber, String email,
                                String usn , String qualification , String stream , String college){

boolean isValidateAccount = false;
boolean isFullName = false;
boolean isContactNumber = false;
boolean isWhatsappNumber = false;
boolean isEmail = false;
boolean isUsn = false;
boolean isQualification = false;
boolean isStream = false;
boolean isCollege = false;

if(fullName!=null){
   fullname=fullName;
   isFullName=true;
}
else
System.out.println("Invalid full name");

if(contactNumber>=0){
contactnumber=contactNumber;
isContactNumber=true;
}
else
System.out.println("Invalid contactNumber");

if(whatsappNumber>=0){
whatsappnumber=whatsappNumber;
isWhatsappNumber=true;
}
else
System.out.println("Invalid whatsappNumber");

if(email!=null){
eMail=email;
isEmail=true;
}
else
System.out.println("Invalid email id");

if(usn!=null){
uSN=usn;
isUsn=true;
}
else
System.out.println("Invalid usn");

if(qualification!=null){
qualiftion=qualification;
isQualification=true;
}
else
System.out.println("Invalid qualification");

if(stream!=null){
branch=stream;
isStream=true;
}
else
System.out.println("Invalid stream");

if(college!=null){
clg=college;
isCollege=true;
}
else
System.out.println("Invalid college name");

if(isFullName==true && isContactNumber==true && isWhatsappNumber==true && isEmail==true
     && isQualification==true && isStream==true && isCollege==true && isUsn==true){
	 isValidateAccount=true;
	 System.out.println("The account is validated: " + isValidateAccount);
	 }

return isValidateAccount;
}


public static void readUserDetails(){
System.out.println("The full name is : " + fullname);
System.out.println("The contact number is : " + contactnumber);
System.out.println("The whatsappNumber is : " + whatsappnumber);
System.out.println("The usn is : " +uSN);
System.out.println("The qualification is : " + qualiftion);
System.out.println("The college name is : " + clg);
System.out.println("The stream is: " + branch);
System.out.println("The email is : " + eMail);


return;
}



}