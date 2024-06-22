package main;

public class Logic {
    private Data data;

    public Logic(Data data) {
        this.data = data;
    }

    public int add(int a, int b) {
        int result = a + b;
        data.save(result);
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        data.save(result);
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        data.save(result);
        return result;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        int result = a / b;
        data.save(result);
        return result;
    }
}

