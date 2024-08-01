class Country{

 int countryId ;
 String countryName;
int noOfStates ;
String primeMinister;
 double populationInCrores;
 
 public Country(){
	 System.out.println("Country object is created");
 }

public Country(int countryId, String countryName, int noOfStates , String primeMinister, double populationInCrores){
	System.out.println("country object is created and initilaized");
	this.countryId=countryId;
	this.countryName=countryName;
	this.noOfStates=noOfStates;
	this.primeMinister=primeMinister;
	this.populationInCrores=populationInCrores;
	
}

}