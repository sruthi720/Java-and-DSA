package com.oops.Properties.inheritance;

public class BoxPrice extends BoxWeight {
     double cost;


     BoxPrice(){
         super();
         this.cost =-1;
     }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);//BoxWeight should have a constructor takes 2 arguments
        this.cost = cost;
        System.out.println(side+"--side "+weight+"--weight "+cost+"--cost ");
    }
     public BoxPrice(double l,double h,double w,double weight ,double cost) {
         super(l, h, w, weight);
         this.cost = cost;
     }
     BoxPrice(BoxPrice other){
         super(other);
         this.cost = other.cost;
     }


}
