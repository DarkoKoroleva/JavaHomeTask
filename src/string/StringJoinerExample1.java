package string;


import java.util.StringJoiner;

public class StringJoinerExample1 {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");
        System.out.println("Fruits: " + joiner); // Fruits: Apple, Banana, Cherry

        StringJoiner joiner1 = new StringJoiner(", ", "[", "]");
        joiner1.add("Red");
        joiner1.add("Green");
        joiner1.add("Blue");
        System.out.println("Colors: " + joiner1); // Colors: [Red, Green, Blue]

        StringJoiner joiner21 = new StringJoiner(", ", "{", "}");
        joiner21.add("John").add("Jane");
        StringJoiner joiner22 = new StringJoiner(" - ");
        joiner22.add("Manager").add("Developer");
        joiner21.merge(joiner22);
        System.out.println("Merged StringJoiner: " + joiner21);
        // Merged StringJoiner: {John, Jane, Manager - Developer}
    }
}