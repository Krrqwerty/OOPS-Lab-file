public class Player {
    String name;
    int age;
    String position;

    public Player(String n, int a, String p) {
        name = n;
        age = a;
        position = p;
    }

    void play() {
        System.out.println(name + " is playing in position: " + position);
    }

    void train() {
        System.out.println(name + " is training hard.");
    }
}

class Cricket_Player extends Player {
    public Cricket_Player(String n, int a, String p) {
        super(n, a, p);
    }

    void play() {
        System.out.println(name + " is batting in cricket.");
    }
}

class Football_Player extends Player {
    public Football_Player(String n, int a, String p) {
        super(n, a, p);
    }

    void play() {
        System.out.println(name + " is playing football as " + position);
    }
}

class Hockey_Player extends Player {
    public Hockey_Player(String n, int a, String p) {
        super(n, a, p);
    }

    void play() {
        System.out.println(name + " is playing hockey as " + position);
    }
}

class PlayerDemo {
    public static void main(String args[]) {
        Cricket_Player c = new Cricket_Player("Virat", 34, "Batsman");
        Football_Player f = new Football_Player("Messi", 36, "Forward");
        Hockey_Player h = new Hockey_Player("Dhyan", 30, "Midfielder");

        c.play();
        c.train();
        
        f.play();
        f.train();
        
        h.play();
        h.train();
    }
}


