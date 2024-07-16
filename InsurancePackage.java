class InsurancePackage{

public static double find(String insuranceName){
if(insuranceName=="Icici Insurance"){
	
  return 10000.50;
}
if(insuranceName=="Sbi Insurance"){

return 15000.70;
}
if(insuranceName=="LIC"){
	return 6000;
}
if(insuranceName=="Lincoln Financial insurance"){
	return 7000.90;
}
if(insuranceName=="DecreasingInsurance"){
	return 4562.98;
}
if(insuranceName=="Increase Term Insurance"){
	return 6000.78;
}
if(insuranceName=="Convertible Term insurance"){
	return 34646.89;
}
if(insurance=="Level Term Insurance"){
	return 67687.90;
}
if(insuranceName=="Hsbc"){
	return 43255.90;
}
if(insuranceName=="Kotak Insurance"){
	return 6798.90;
}
if(insuranceName=="Hdfc Insurance"){
	return 78708.90;
}
if(insuranceName=="Syndetic Insurance"){
	return 89658.90;
}
if(insuranceName=="Canara Insurance"){
	return 9876.90;
}

else{
System.out.println(insuranceName +"not present/found");
}
return 0.00;
}

}