package ENTITY;

public enum Order {
    STANDARD(1), FAST(2), EXPRESS(3);

    private Integer n;

    Order(Integer n) {
        this.n = n;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }
}
