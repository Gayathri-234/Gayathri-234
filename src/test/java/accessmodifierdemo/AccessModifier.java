package accessmodifierdemo;

import org.junit.Test;

public class AccessModifier {
    String name = "Rithvik";
    public String phone ="1234";
    private String email ="abc@gmail.com";
    protected String age ="4";
    @Test

    public void PersonalInfo() {
        System.out.println("Hi ! I am in PersonalInfo");
        String name = "Chanak";
        System.out.println(name);
        AccessModifier identity = new AccessModifier();
        System.out.println(identity.name);
         identity.sibling();
    }
    @Test
    public void sibling() {
        String name = "Saatvik";
        String phone = "91827";
        System.out.println("Hi! I am in Sibling");
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(this.phone);
        System.out.println(this.age);
        System.out.println(this.email);

    }
}
