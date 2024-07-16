class  NandhiniParlour{
static int price;
public static int getProductPrice(String productName){
if(productName=="Ghee"){
return price=200;
}
if(productName=="Butter Salted"){
return price=200;
}
if(productName=="Butter Unsalted"){
return price=400;
}
if(productName=="Flavoured milk badam"){
return price=350;
}
if(productName=="Plain Lassi"){
return price=200;
}
if(productName=="Badam Milk Spiced"){
return price=250;
}
if(productName=="Slim Milk"){
return price= 200;
}
if(productName=="Mango Lassi"){
return price=250;
}
if(productName=="Nandhini Cream"){
return price=200;
}
if(productName=="Nandhini chocolate MilkShake"){
return price=250;
}

return price=0;

}

public static int getProductPrice(String productName, int quantity){
if(productName=="Ghee"){
return price= 200*quantity;
}
if(productName=="Butter Salted"){
return  price= 200*quantity;
}
if(productName=="Butter Unsalted"){
return  price= 200*quantity;
}
if(productName=="Flavoured milk badam"){
return  price= 200*quantity;
}
if(productName=="Plain Lassi"){
return  price= 200*quantity;
}
if(productName=="Badam Milk Spiced"){
return  price= 200*quantity;
}
if(productName=="Slim Milk"){
return  price= 300*quantity;
}
if(productName=="Mango Lassi"){
return  price= 250*quantity;
}
if(productName=="Nandhini Cream"){
return  price= 200*quantity;
}
if(productName=="Nandhini chocolate MilkShake"){
return  price= 200*quantity;
}

return  price= 200*quantity;

}

}