
interface State{
    public void doAction(Context1 context1);
}

class StartState implements State{

    public void doAction(Context1 context1){
        System.out.println("Player is in start state");
        context1.setState(this);
    }

    public String toString(){
        return "start state";
    }
}

class StopState implements State{
    public void doAction(Context1 context1){
        System.out.println("Player is in stop state");
        context1.setState(this);
    }

    public String toString(){
        return "stop state";
    }
}
class Context1{

    private State state;

    public Context1(){

        state = null;
    }

    public void setState(State state){

        this.state = state;
    }

    public State getState(){
        return state;
    }
}

public class StatePatternDemo {
    public static void main(String[] args) {
        Context1 context1 = new Context1();

        StartState startState = new StartState();
        startState.doAction(context1);
        System.out.println(context1.getState().toString());


        StopState stopState = new StopState();
        stopState.doAction(context1);
        System.out.println(context1.getState().toString());

    }
}
