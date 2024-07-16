class Zomato{

static int price;
public static int getDrinksPrice(String drinksPrice){
if(drinksPrice=="Mocha Cookie Crumble Frappuccino"){
return price=599;
}
if(drinksPrice=="Mocha Cookie Crumble Cream Frappuccino"){
return price=499;
}
if(drinksPrice=="Stardust Macchiato Frappuccino"){
return price=499;
}
if(drinksPrice=="Mocha Cookie Crumble Latte"){
return price= 499;
}
if(drinksPrice=="Stardust Macchiato"){
return price=399;
}
if(drinksPrice=="Cold Brew with Ginger Ale"){
return price=499;
}
if(drinksPrice=="ced Mocha Cookie Crumble Latte"){
return price=299;
}
if(drinksPrice=="Iced Stardust Macchiato"){
return price=399;
}
if(drinksPrice=="Java Chip Frappuccino"){
return price= 499;
}
if(drinksPrice=="Vanilla Cream Frappuccino"){
return price=199;
}
if(drinksPrice=="Espresso Frappuccino"){
return price=399;
}
if(drinksPrice=="Caramel Frappuccino"){
return price=580;
}
if(drinksPrice=="Strawberries & Crème Frappuccino"){
return price=380;
}
if(drinksPrice=="White Mocha Frappuccino"){
return price=580;
}
if(drinksPrice=="Caramel Java Chip Frappuccino"){
return price=280;
}
if(drinksPrice=="Green Tea Cream Frappuccino"){
return price=580;
}
if(drinksPrice=="Double Chocolate Chip Frappuccino"){
return price=480;
}
if(drinksPrice=="Strawberry Acai Refresher"){
return price=580;
}
if(drinksPrice=="Mango Dragonfruit Refresher"){
return price=580;
}
return 0;
}

public static int getDrinksPrice(String drinksPrice, int quantity){
if(drinksPrice=="Mocha Cookie Crumble Frappuccino"){
return price=599*quantity;
}
if(drinksPrice=="Mocha Cookie Crumble Cream Frappuccino"){
return price=499*quantity;
}
if(drinksPrice=="Stardust Macchiato Frappuccino"){
return price=499*quantity;
}
if(drinksPrice=="Mocha Cookie Crumble Latte"){
return price= 499*quantity;
}
if(drinksPrice=="Stardust Macchiato"){
return price=399*quantity;
}
if(drinksPrice=="Cold Brew with Ginger Ale"){
return price=499*quantity;
}
if(drinksPrice=="ced Mocha Cookie Crumble Latte"){
return price=299*quantity;
}
if(drinksPrice=="Iced Stardust Macchiato"){
return price=399*quantity;
}
if(drinksPrice=="Java Chip Frappuccino"){
return price= 499*quantity;
}
if(drinksPrice=="Vanilla Cream Frappuccino"){
return price=199*quantity;
}
if(drinksPrice=="Espresso Frappuccino"){
return price=399*quantity;
}
if(drinksPrice=="Caramel Frappuccino"){
return price=580*quantity;
}
if(drinksPrice=="Strawberries & Crème Frappuccino"){
return price=380*quantity;
}
if(drinksPrice=="White Mocha Frappuccino"){
return price=580*quantity;
}
if(drinksPrice=="Caramel Java Chip Frappuccino"){
return price=280*quantity;
}
if(drinksPrice=="Green Tea Cream Frappuccino"){
return price=580*quantity;
}
if(drinksPrice=="Double Chocolate Chip Frappuccino"){
return price=480*quantity;
}
if(drinksPrice=="Strawberry Acai Refresher"){
return price=580*quantity;
}
if(drinksPrice=="Mango Dragonfruit Refresher"){
return price=580*quantity;
}
return 0;
}

}