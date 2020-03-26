package calculator;

import java.util.Objects;

public class Number {
    private int value;

    private Number(final int number) {
        this.value = number;
    }

    public static Number valueOf(final String letter) {
        return new Number(Integer.parseInt(letter));
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Number number = (Number) o;
        return value == number.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
