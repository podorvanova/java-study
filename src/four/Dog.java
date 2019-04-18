package four;

public class Dog {
    int size;
    String name;
    void bark(int numOfBarks) {
        while (numOfBarks > 0) {
            System.out.println("Гав");
            numOfBarks = numOfBarks - 1;
        }
    }
}
