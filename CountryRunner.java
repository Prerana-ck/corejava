class CountryRunner{

public static void main(String args[]){
System.out.println("main started");

Country country1 = new Country();
System.out.println("first country");
country1.countryId = 121;
country1.countryName="India";
country1.noOfStates= 28;
country1.primeMinister="Narendra Modi";
country1.populationInCrores=141.72;
System.out.println("Country id is "+ country1.countryId);
System.out.println("Country name is: "+country1.countryName);
System.out.println("Country id is "+ country1.noOfStates);
System.out.println("Country id is "+ country1.primeMinister);
System.out.println("Country id is "+ country1.populationInCrores);


Country country2 = new Country();
System.out.println("second country");
country2.countryId = 187;
country2.countryName="Bangladesh";
country2.noOfStates= 8;
country2.primeMinister="Sheikh Hassena";
country2.populationInCrores=17.32;
System.out.println("Country id is "+ country2.countryId);
System.out.println("Country name is: "+country2.countryName);
System.out.println("Country id is "+ country2.noOfStates);
System.out.println("Country id is "+ country2.primeMinister);
System.out.println("Country id is "+ country2.populationInCrores);

Country country3 = new Country();
System.out.println("third country");
country3.countryId = 165;
country3.countryName="Sri Lanka";
country3.noOfStates= 6;
country3.primeMinister="Dinesh Gunawardena";
country3.populationInCrores=2.22;
System.out.println("Country id is "+ country3.countryId);
System.out.println("Country name is: "+country3.countryName);
System.out.println("Country id is "+ country3.noOfStates);
System.out.println("Country id is "+ country3.primeMinister);
System.out.println("Country id is "+ country3.populationInCrores);

Country country4 = new Country();
System.out.println("fourth country");
country4.countryId = 132;
country4.countryName="Nepal";
country4.noOfStates= 5;
country4.primeMinister="KP Sharma Oli";
country4.populationInCrores=3.05;
System.out.println("Country id is "+ country4.countryId);
System.out.println("Country name is: "+country4.countryName);
System.out.println("Country id is "+ country4.noOfStates);
System.out.println("Country id is "+ country4.primeMinister);
System.out.println("Country id is "+ country4.populationInCrores);

Country country5 = new Country(178,"New Zealand",8,"Christopher Luxon",0.51);
System.out.println("fifth country");
/*country5.countryId = 178;
country5.countryName="New Zealand";
country5.noOfStates= 8;
country5.primeMinister="Christopher Luxon";
country5.populationInCrores=0.51;*/
System.out.println("Country id is "+ country5.countryId);
System.out.println("Country name is: "+country5.countryName);
System.out.println("Country id is "+ country5.noOfStates);
System.out.println("Country id is "+ country5.primeMinister);
System.out.println("Country id is "+ country5.populationInCrores);

Country country6 = new Country(143,"Australia",8,"Anthony Albanese",2.2);
System.out.println("sixth country");
/*country6.countryId = 143;
country6.countryName="Australia";
country6.noOfStates= 8;
country6.primeMinister="Anthony Albanese";
country6.populationInCrores=2.2;*/
System.out.println("Country id is "+ country6.countryId);
System.out.println("Country name is: "+country6.countryName);
System.out.println("Country id is "+ country6.noOfStates);
System.out.println("Country id is "+ country6.primeMinister);
System.out.println("Country id is "+ country6.populationInCrores);

Country country7 = new Country(198,"France",5,"Gabriel Attal",6.8);
System.out.println("seventh country");
/*country7.countryId = 198;
country7.countryName="France";
country7.noOfStates= 5;
country7.primeMinister="Gabriel Attal";
country7.populationInCrores=6.8;*/
System.out.println("Country id is "+ country7.countryId);
System.out.println("Country name is: "+country7.countryName);
System.out.println("Country id is "+ country7.noOfStates);
System.out.println("Country id is "+ country7.primeMinister);
System.out.println("Country id is "+ country7.populationInCrores);

Country country8 = new Country(156,"Russia",10,"Mikhail Mishustin",14.42);
System.out.println("eigth country");
/*country8.countryId = 156;
country8.countryName="Russia";
country8.noOfStates= 10;
country8.primeMinister="Mikhail Mishustin";
country8.populationInCrores=14.42;*/
System.out.println("Country id is "+ country8.countryId);
System.out.println("Country name is: "+country8.countryName);
System.out.println("Country id is "+ country8.noOfStates);
System.out.println("Country id is "+ country8.primeMinister);
System.out.println("Country id is "+ country8.populationInCrores);

System.out.println("main ended");
}


}