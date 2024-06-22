package main;

public class Interface {
    private Logic logic;

    public Interface(Logic logic) {
        this.logic = logic;
    }

    public int add(int a, int b) {
        return logic.add(a, b);
    }

    public int subtract(int a, int b) {
        return logic.subtract(a, b);
    }

    public int multiply(int a, int b) {
        return logic.multiply(a, b);
    }

    public int divide(int a, int b) {
        return logic.divide(a, b);
    }
}


