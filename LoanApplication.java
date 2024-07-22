class  LoanApplication{

static String bankname;
static String loanAppName;
static String laontype;
static int creditscore;
static int rateofinterest;
static int yearsofloan;

public static boolean createUserAccount(String bankName , String loanApplicationName , String laonType , int creditScore 
                                            , int rateOfInterest, int yearsOfLoan){
   boolean isAccountCreated = false;
   boolean isBankName=true;
   boolean isLaonAppName = false;
   boolean isLoantype = false;
   boolean isCreditScore = false;
   boolean isRateOfInterest = false;
   boolean isYearsOfInterest = false;
   
   if(bankName!=null){
   bankname=bankName;
   isBankName = true;
   }
   else
   System.out.println("Invalid bank name");

   if(loanApplicationName!=null){
   loanAppName=loanApplicationName;
   isLaonAppName=true;
   }
   else
   System.out.println("Invalid loan application type");

   if(laonType!=null){
   laontype=laonType;
   isLoantype=true;
   }
   else
   System.out.println("Invalid loan type");

   if(creditScore>=0){
   creditscore=creditScore;
   isCreditScore=true;
   }
   else
   System.out.println("Invalid creditscore");

   if(rateOfInterest>=0){
   rateofinterest=rateOfInterest;
   isRateOfInterest=true;
   }
   else
   System.out.println("Invalid rateOfInterest ");

   if(yearsOfLoan>=0){
   yearsofloan=yearsOfLoan;
   isYearsOfInterest=true;
   }
   else
   System.out.println("Invalid yearsofloan ");
   

if(isBankName==true && isLaonAppName==true && isLoantype==true && isCreditScore==true && isRateOfInterest==true && isYearsOfInterest==true){
 isAccountCreated=true;
}
return isAccountCreated;
																					
	}
	
	public static void readUserDetails(){
	System.out.println("The bank name is : " +bankname);
	System.out.println("The loan application type is : " +  laontype);
	System.out.println("The loan application name is : " + loanAppName);
	System.out.println("The credit score is : " + creditscore);
	System.out.println("The rateOfInterest is : " + rateofinterest);
	System.out.println("The yearsOfLoan is : " + yearsofloan);
	return;
	
	}

}