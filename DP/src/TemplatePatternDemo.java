
abstract class Game{
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}

class Cricket extends Game{
    void startPlay(){
        System.out.println("Cricket has started");
    }
    void initialize(){
        System.out.println("Cricket has initialized");
    }
    void endPlay(){
        System.out.println("Cricket has ended");
    }
}

class Football extends Game{
    void startPlay(){
        System.out.println("Football has started");
    }
    void initialize(){
        System.out.println("Football has initialized");
    }
    void endPlay(){
        System.out.println("Football has ended");
    }

}

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        game = new Football();
        game.play();
    }
}
