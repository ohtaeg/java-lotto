package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LottoNumberGeneratorTest {

    @DisplayName("무작위 6개의 로또 번호를 생성한다.")
    @Test
    void generateAuto() {
        Lotteries lotteries = LottoNumberGenerator.generateAutomatically(1);

        assertThat(lotteries).isNotNull();
        assertThat(lotteries.count()).isOne();
    }
}