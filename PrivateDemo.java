class Superclass {
    private int privateVar =120;

    
    public int getPrivateVar() {
        return privateVar;
    }
}

class Subclass extends Superclass {
    public void display() {

        System.out.println("Accessing Private Variable using Getter: " + getPrivateVar());
    }
}

public class PrivateDemo {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.display();
    }
}

