interface Shape{
    void draw();
}

class Rectangle implements Shape{
    public void draw(){
        System.out.println("Rectange Draw Method");
    }
}

class Square implements Shape{
    public void draw(){
        System.out.println("Square draw method ");
    }
}

class Circle implements Shape{
    public void draw(){
        System.out.println("Circle draw method");
    }
}

class ShapeFactory{

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }

}

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("Circle");

        shape1.draw();

        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();

    }
}
