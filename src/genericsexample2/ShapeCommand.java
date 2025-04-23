package genericsexample2;

public class ShapeCommand<T extends Shape> {

    public void printShape(T shape) {
        System.out.println(shape.shapeName);
    }

    public <K extends Number> void addToNumberAndPrint(K num) {
        System.out.println(num.intValue());
    }
}

// Break for 6 minutes: 8:24 -> 8:30
