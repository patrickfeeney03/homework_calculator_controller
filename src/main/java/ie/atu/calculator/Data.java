package ie.atu.calculator;

public class Data {
    private String operation;
    private float total;

    public Data(String operation, float total) {
        this.operation = operation;
        this.total = total;
    }

    public String getOperation() {
        return operation;
    }

    public float getTotal() {
        return total;
    }
}
