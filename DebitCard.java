class DebitCard{


    int cardId ;
   String 	cardHolderName ;
   long  cardNo ;
   String  expDate ;
   int  cvv;


public DebitCard(){
	System.out.println("Debit card Object is created");
}

public DebitCard(int cardId,String cardHolderName,long cardNo,String expDate,int cvv){
	System.out.println("Debit card Object is created and initialized");
	
	this.cardId=cardId;
	this.cardHolderName=cardHolderName;
	this.cardNo=cardNo;
	this.expDate=expDate;
	this.cvv=cvv;
}

}