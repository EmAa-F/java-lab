class Box{
    double width;
    double height;
    double depth;
    double volume;
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    Box(){
        width=0;
        height=0;
        depth=0;
    }
    Box(double len){
        width=height=depth=len;
    }
    double volume(Box b)
    {
           return b.width*b.height*b.depth;
    }
}

public class exp2{
    public static void main(String[] args){
       Box b1=new Box(10,20,15);
       Box b2=new Box();
       Box b3=new Box(7);
       b1.volume=b1.volume(b1);  
       b2.volume=b2.volume(b2);
       b3.volume=b3.volume(b3);
       System.out.println("Volume of box 1 :"+ b1.volume +"\n");
       System.out.println("Volume of box 2 :"+ b2.volume +"\n");
       System.out.println("Volume of box 3 :"+ b3.volume +"\n");


    }
}
