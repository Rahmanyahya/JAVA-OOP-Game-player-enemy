package Game;
public class Game {
    public static void main(String[] args) {

        Player Adi = new Player("ADI", 200, 0, 100, 100, 100);
        Player Yanto = new Player("Yanto", 50, 0, 100, 100, 100);

        Adi.attack(Yanto);
        Adi.run();
    }
}