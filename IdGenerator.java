public class IdGenerator {
    private static long next = 1;

    public static synchronized long nextId() {
        long id = next;
        next++;
        return id;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(IdGenerator.nextId()); 
        System.out.println(IdGenerator.nextId()); 
        System.out.println(IdGenerator.nextId()); 
    }
}
