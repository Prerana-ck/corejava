class AmazonProducts{

static String productNames[]={null,null,null,null,null,null,null,null,null,null};
static int start=0;

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

}