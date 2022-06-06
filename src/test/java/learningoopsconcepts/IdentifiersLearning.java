package learningoopsconcepts;

public class IdentifiersLearning {
    String name = "Rithvik";

    public static void main(String[] args) {
        String name = "Chanak";
        System.out.println(name);
        IdentifiersLearning identity = new IdentifiersLearning();
        identity.sibling();
        System.out.println(identity.name);
    }

    public void sibling() {
        String name = "Saatvik";
        System.out.println(name);
        System.out.println(this.name);

    }
}
