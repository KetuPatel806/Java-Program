package OOPS.Properties;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }
    Box(int side){
        this.l = side;
        this.w = side;
        this.h = side;
    }
    Box(int len,int wid,int hei){
        this.l = len;
        this.w = wid;
        this.h = hei;
    }
    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
}
