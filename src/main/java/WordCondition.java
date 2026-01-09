
public enum WordCondition {
    입력_제한(5);

    private final int value;

    public int getValue() {
        return value;
    }

    WordCondition(int length) {
        this.value = length;
    }
}
