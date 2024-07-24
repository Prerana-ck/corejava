class AmazonProductsRunner{

public static void main(String products[]){
System.out.println("main started");

boolean productAdded = AmazonProducts.addProductName("Mobile Phones");
System.out.println("The product is added:" + productAdded);

productAdded=AmazonProducts.addProductName("Fan");
System.out.println("The product is added:" + productAdded);

productAdded=AmazonProducts.addProductName("Mixer");
System.out.println("The product is added:" + productAdded);

productAdded=AmazonProducts.addProductName("Bags");
System.out.println("The product is added:" + productAdded);

productAdded=AmazonProducts.addProductName("Grocery");
System.out.println("The product is added:" + productAdded);

productAdded=AmazonProducts.addProductName("Dress");
System.out.println("The product is added:" + productAdded);

productAdded=AmazonProducts.addProductName("Sunglasses");
System.out.println("The product is added:" + productAdded);

productAdded=AmazonProducts.addProductName("Refrigerator");
System.out.println("The product is added:" + productAdded);

productAdded=AmazonProducts.addProductName("Washing machine");
System.out.println("The product is added:" + productAdded);

productAdded=AmazonProducts.addProductName("Shoes");
System.out.println("The product is added:" + productAdded);

productAdded=AmazonProducts.addProductName("Lamp");
System.out.println("The product is added:" + productAdded);



AmazonProducts.displayProductNames();
}
}