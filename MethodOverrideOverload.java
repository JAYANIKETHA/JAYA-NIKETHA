package nov21;
public class MethodOverrideOverload{
    public static void main(String[]args){
        System.out.println(" Method Overriding");
        son s=new son();
        s.RE();
        System.out.println("\n Method Overloading");
        calculators c=new calculators();
        c.add(15.5,10);
        c.add(5.5f,2);
        c.add(10,20.5);
    }
}
class grandfather{
    void RE(){
        System.out.println("Old model");
    }
}
class father extends grandfather{
    void RE(){
        System.out.println("Model");
    }
}
class son extends father{
    void RE(){
        System.out.println("New model");
    }
}
class calculators{
    void add(int a,double b){
        System.out.println("First one = "+(a+b));
    }
    void add(double a,int b){
        System.out.println("Second one = "+(a+b));
    }
    void add(float a,int b){
        System.out.println("Third one = "+(a+b));
    }
}
