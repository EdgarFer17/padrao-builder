package Builder;

public class Main {
    public static void main(String[] args) {
        Computador gamer = new ComputadorGamer().criar();
        Computador normal = new ComputadorNormal().criar();

        System.out.println("Computador gamer");
        System.out.println(gamer);

        System.out.println("\n computador normal");
        System.out.println(normal);
    }
}