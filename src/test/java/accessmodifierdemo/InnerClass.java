package accessmodifierdemo;

public class InnerClass extends AccessModifier {
    public static void main(String[] args) {
       InnerClass inner = new InnerClass();
        System.out.println("Hi, I am in InnerClass");
        System.out.println(inner.age);
        System.out.println(inner.name);
        System.out.println(inner.phone);
    }
}
