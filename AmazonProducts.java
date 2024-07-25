import java.util.Arrays;
class AmazonProducts{

static String productNames[]={null,null,null,null,null,null,null,null,null,null};
static int start;

public static boolean addProductName(String productName){
boolean isProductAdded = false;

if(start>=productNames.length)
System.out.println("Array index is out of bound");

  else if(productName!=null){
  productNames[start++]=productName;
  isProductAdded=true;
}
else
  System.out.println("Invalid product name");


return isProductAdded;
}

public static void displayProductNames(){
for(String productName :productNames)
System.out.println(productName);
return;
}

public static boolean updateProductName(String newProductName , String oldProductName){
	 boolean isProductNameUpdated = false;
	 
	 for(int position=0 ; position<productNames.length; position++){
		 if(productNames[position]==oldProductName){
			 productNames[position]=newProductName;
		
			 isProductNameUpdated=true;
			 	 
		 }
	 }
	 if(isProductNameUpdated==false){
		 System.out.println(oldProductName + "not found");
	 }
	
	return isProductNameUpdated;
}

public static boolean deleteProductName(String productName){
	boolean isProductNameDeleted = false;
	
	int position , newposition ;
	for(position=0 , newposition=0; position<productNames.length ; position++ ){
		if(productNames[position]!=productName){
			productNames[newposition]=productNames[position];
			newposition++;
		}
		else
			isProductNameDeleted=true;
	}
	 
	 int newlength = newposition;
	 productNames = Arrays.copyOf(productNames,newlength);

 if(isProductNameDeleted==false){
	 System.out.println(productName + "not found");
 }
 return isProductNameDeleted;
}


}