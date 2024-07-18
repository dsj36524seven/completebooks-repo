package modern.challenge;

import java.util.Objects;

public class Function {

    private static final int N_UPPER_BOUND = 101;

    private final int n;

    public Function(int n) {
        this.n = Objects.checkIndex(n, N_UPPER_BOUND);
    }

    public int yMinusX(int x, int y) {
        Objects.checkFromToIndex(x, y, n);

        return y - x;
    }

    public int checkIndexSize(int start, int size) {
        Objects.checkFromIndexSize(start, size ,152);
        return start + size;
    }
}
