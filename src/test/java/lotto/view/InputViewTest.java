package lotto.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.Assertions.assertThat;

class InputViewTest {

    private InputView inputView;

    @BeforeEach
    void setUp() {
        inputView = new InputView(new ByteArrayInputStream("1000".getBytes()));
    }

    @DisplayName("구입 금액을 입력받을 수 있다.")
    @Test
    void insertPrice() {
        final int expect = 1000;

        final int actual = inputView.inputPrice();

        assertThat(actual).isEqualTo(expect);
    }
}