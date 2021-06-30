interface figure{
    void draw();
}

class Round implements figure{
    public void draw(){
        System.out.println("Shape : Circle");
    }
}

class Parallel implements figure{
    public void draw(){
        System.out.println("Shape : Parallelogram ");
    }
}

abstract class FigureDecorator implements figure{

    protected figure decoratedFigure;

    public FigureDecorator(figure decoratedFigure){
        this.decoratedFigure = decoratedFigure;
    }


    /* public void draw(){
        decoratedFigure.draw();
    }*/
}

class RedFigureDecorator extends FigureDecorator{

    public RedFigureDecorator(figure decoratedFigure){
        super(decoratedFigure);
    }

    public void draw(){
        decoratedFigure.draw();
        setRedBorder(decoratedFigure);
    }

    private void setRedBorder(figure decoratedFigure){
        System.out.println("Border Color : Red ");
    }

}

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        figure round = new Round();

        figure redCircle = new RedFigureDecorator(new Round());

        System.out.println("Circle with normal border");
        round.draw();

        System.out.println("Circle with red border ");
        redCircle.draw();

    }

}
