package outerpackage;

import accessmodifierdemo.AccessModifier;

public class OuterClass extends AccessModifier  {
    public static void main(String[] args) {
        OuterClass object = new OuterClass();
        object.outerMethod();
    }
    public void outerMethod(){
        System.out.println("Hi! I am in OuterMethod");

        System.out.println(this.age);
         System.out.println(this.phone);

    }
}
