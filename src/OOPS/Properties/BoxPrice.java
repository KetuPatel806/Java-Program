package OOPS.Properties;

public class BoxPrice extends BoxWeight {
    int price;
    BoxPrice(){
        price = -1;
    }
    BoxPrice(int l,int w,int h,int weight,int price){
        super(l,w,h,weight);
        this.price = price;
        System.out.println("We are in BoxPrice");
    }
}
