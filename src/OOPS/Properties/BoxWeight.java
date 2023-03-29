package OOPS.Properties;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }
    public BoxWeight(int l,int w,int h,double weight){
        super(l,w,h);
        this.weight = weight;

    }
}
