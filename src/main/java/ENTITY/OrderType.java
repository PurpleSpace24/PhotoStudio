package ENTITY;

public enum OrderType {
    STANDARD(1), FAST(2), EXPRESS(3);

    private Integer n;

    OrderType(Integer n) {
        this.n = n;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }
}
