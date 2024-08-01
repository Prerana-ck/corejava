class DebitCardRunner{


public static void main(String card[]){
System.out.println("main started");

DebitCard card1= new DebitCard();
System.out.println("first card details...");
card1.cardId=1121;
card1.cardHolderName="Raghav";
card1.cardNo= 4461321243438970L;
card1.expDate="07/25";
card1.cvv = 355;
System.out.println("card id is: "+card1.cardId);
System.out.println("card holder name is: "+card1.cardHolderName);
System.out.println("card number is: " +card1.cardNo);
System.out.println("card expiration date " + card1.expDate);
System.out.println("card cvv is "+card1.cvv);




DebitCard card2= new DebitCard();
System.out.println("second card details...");
card2.cardId=1212;
card2.cardHolderName="Raaj";
card2.cardNo= 4432676789704546L;
card2.expDate="10/25";
card2.cvv = 233;
System.out.println("card id is: "+card2.cardId);
System.out.println("card holder name is: "+card2.cardHolderName);
System.out.println("card number is: " +card2.cardNo);
System.out.println("card expiration date " + card2.expDate);
System.out.println("card cvv is "+card2.cvv);


DebitCard card3= new DebitCard();
System.out.println("Third  card details...");
card3.cardId=2121;
card3.cardHolderName="Raam";
card3.cardNo= 4556676789706543L;
card3.expDate="12/25";
card3.cvv = 433;
System.out.println("card id is: "+card3.cardId);
System.out.println("card holder name is: "+card3.cardHolderName);
System.out.println("card number is: " +card3.cardNo);
System.out.println("card expiration date " + card3.expDate);
System.out.println("card cvv is "+card3.cvv);


DebitCard card4= new DebitCard();
System.out.println("Fourth card details...");
card4.cardId=4332;
card4.cardHolderName="Rakesh";
card4.cardNo= 46657878453456753L;
card4.expDate="02/26";
card4.cvv = 564;
System.out.println("card id is: "+card4.cardId);
System.out.println("card holder name is: "+card4.cardHolderName);
System.out.println("card number is: " +card4.cardNo);
System.out.println("card expiration date " + card4.expDate);
System.out.println("card cvv is "+card4.cvv);

DebitCard card5= new DebitCard(2132,"Raman",4467896789704546L,"05/25", 312);
System.out.println("Fifth card details...");
/*card5.cardId=2132;
card5.cardHolderName="Raman";
card5.cardNo= 4467896789704546L;
card5.expDate="05/25";
card5.cvv = 312;*/
System.out.println("card id is: "+card5.cardId);
System.out.println("card holder name is: "+card5.cardHolderName);
System.out.println("card number is: " +card5.cardNo);
System.out.println("card expiration date " + card5.expDate);
System.out.println("card cvv is "+card5.cvv);

DebitCard card6= new DebitCard(1212,"Ramya",4432676789704546L,"06/25",676);
System.out.println("Sixth card details...");
/*card6.cardId=1212;
card6.cardHolderName="Ramya";
card6.cardNo= 4432676789704546L;
card6.expDate="06/25";
card6.cvv = 676;*/
System.out.println("card id is: "+card6.cardId);
System.out.println("card holder name is: "+card6.cardHolderName);
System.out.println("card number is: " +card6.cardNo);
System.out.println("card expiration date " + card6.expDate);
System.out.println("card cvv is "+card6.cvv);

DebitCard card7= new DebitCard(3425,"Rajesh",4564678389704546L,"06/25",549);
System.out.println("Seventh card details...");
/*card7.cardId=3425;
card7.cardHolderName="Rajesh";
card7.cardNo= 4564678389704546L;
card7.expDate="06/25";
card7.cvv = 549;*/
System.out.println("card id is: "+card7.cardId);
System.out.println("card holder name is: "+card7.cardHolderName);
System.out.println("card number is: " +card7.cardNo);
System.out.println("card expiration date " + card7.expDate);
System.out.println("card cvv is "+card7.cvv);


DebitCard card8= new DebitCard(3422,"Ramesh",3464678389704546L,"09/25",379);
System.out.println("Eight card details...");
/*card8.cardId=3422;
card8.cardHolderName="Ramesh";
card8.cardNo= 3464678389704546L;
card8.expDate="09/25";
card8.cvv = 379;*/
System.out.println("card id is: "+card8.cardId);
System.out.println("card holder name is: "+card8.cardHolderName);
System.out.println("card number is: " +card8.cardNo);
System.out.println("card expiration date " + card8.expDate);
System.out.println("card cvv is "+card8.cvv);

System.out.println("main ended");
}

}