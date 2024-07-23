class LinkedIn{

static int phnumber;
static String eMail;
static String frstName;
static String lstName;
static String cuntry;
static int pstalcode;
static String add;
static String jobtitle;
static String jobtype;
static String cmpnyname;
static String passwrd;
static String reEnterPasskey;

public static boolean createUserDetails(int phonenumber , String email , String firstName , String lastName ,
                  String country , int postalCode , String adddress ,String jobTitle , String jobType , String companyName,
				  String password, String reEnterPswrd){
				  
				  boolean isAccountCreated = false;
				boolean isValidated = validateUserDetails(phonenumber,email,firstName,lastName,country,postalCode,adddress,
				                                            jobTitle,jobType,companyName,password,reEnterPswrd);
															
				if(isValidated==true){
					isAccountCreated=true;
					System.out.println("The account is created: " + isAccountCreated);
				}
				else
					System.out.println("The account is created: " + isAccountCreated);
		
				  
				  return isAccountCreated;
				  }
				  
				  
				  public static boolean validateUserDetails(int phonenumber , String email , String firstName , String lastName ,
                  String country , int postalCode , String adddress ,String jobTitle , String jobType , String companyName,
				  String password, String reEnterPswrd){
					  
					  boolean isAccountValidate=false;
		   boolean isPhonenumber = false;
				  boolean isEmail = false;
				  boolean isFirstName = false;
				  boolean isLastName = false;
				  boolean isCountry = false;
				  boolean isPostalCode = false;
				  boolean isAddress = false;
				  boolean isJobTiitle = false;
				  boolean isJobType = false;
				  boolean isCompanyName = false;
				  boolean isPassword = false;
				  boolean isReenterPasskey = false;
				  
				   if(phonenumber>= 0){
				  phnumber=phonenumber;
				  isPhonenumber = true;
				  }
				  else
				  System.out.println("Invalid phone number");
				  
				  if(email!=null){
				  eMail=email;
				  isEmail=true;
				  }
				  else
				  System.out.println("Invalid email");
			  
			       if(email!=firstName){
				  frstName=firstName;
				  isFirstName=true;
				  }
				  else
				  System.out.println("Invalid First name");
				  
				  		  if(lastName!=null){
				  lstName=lastName;
				  isLastName=true;
				  }
				  else
				  System.out.println("Invalid lastName");
			  
			       if(country!=null){
				  cuntry=country;
				  isCountry=true;
				  }
				  else
				  System.out.println("Invalid country");
				  
				  		  if(postalCode>0){
				  pstalcode=postalCode;
				  isPostalCode=true;
				  }
				  else
				  System.out.println("Invalid postalCode");
			  
			     	  if(adddress!=null){
				  add=adddress;
	
				  isAddress=true;
				  }
				  else
				  System.out.println("Invalid adddress");
				  
				  		  if(jobTitle!=null){
				  jobtitle=jobTitle;
				  isJobTiitle=true;
				  }
				  else
				  System.out.println("Invalid jobTitle");
			  
			  
				  
				 	  if(jobType!=null){
				  jobtype=jobType;
				  isJobType=true;
				  }
				  else
				  System.out.println("Invalid jobType");
				  
				  	  if(companyName!=null){
				  cmpnyname=companyName;
				  isCompanyName=true;
				  }
				  else
				  System.out.println("Invalid companyName");
			  
			      if(password!=null){
				  passwrd=password;
				  isPassword=true;
				  }
				  else
				  System.out.println("Invalid Password");
				  
				  	if(
					reEnterPswrd!=null){
						reEnterPswrd=reEnterPasskey;
				  isReenterPasskey=true;
				  }
				  else
				  System.out.println("Invalid reentered passkey");
			  
			     if(isPhonenumber==true && isEmail==true && isFirstName==true && isLastName==true && isCompanyName==true && isPostalCode==true && isAddress==true && isJobTiitle==true && isJobType==true && isCompanyName==true 
				  && isPassword==true && isReenterPasskey==true){
				  isAccountValidate=false;
				  System.out.println("The account is validated:" + isAccountValidate);
				  }
			  
					  
					  return isAccountValidate;
				  }
				  
				  
				  public static void readUserDetails(){
				  System.out.println("The phone number is :" + phnumber);
				  	  System.out.println("The email is :" + eMail);
					  	  System.out.println("The firstName is :" + frstName);
						  	  System.out.println("The lastName is :" + lstName);
							  	  System.out.println("The country is :" + cuntry);
								  System.out.println("The postalCode is :" + pstalcode);
								  System.out.println("The adddress is :" + add);
								  System.out.println("The jobTitle is :" + jobtitle);
								  System.out.println("The jobtype is :" + jobtype);
								  System.out.println("The companyName is :" + cmpnyname);
								  System.out.println("The passkey is :" + passwrd);
								  System.out.println("The reentered  passkey  is :" + reEnterPasskey);
								  return;			  
				  
				  }

}