package lotto.vo;

import lotto.domain.Lotto;
import lotto.enums.LottoRank;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoWinResultTest {
    @Test
    public void 당첨번호와_비교한_결과를_통해_로또당첨결과_생성() {
        // given
        long[] matchCounts = new long[Lotto.TOTAL_LOTTO_NUMBERS + 1];
        matchCounts[LottoRank.FIRST.getMatchCount()] = 1;
        matchCounts[LottoRank.THIRD.getMatchCount()] = 3;

        // when
        LottoWinResult lottoWinResult = new LottoWinResult(matchCounts);

        // then
        assertThat(lottoWinResult.getFirst()).isEqualTo(1);
        assertThat(lottoWinResult.getSecond()).isEqualTo(0);
        assertThat(lottoWinResult.getThird()).isEqualTo(3);
        assertThat(lottoWinResult.getFourth()).isEqualTo(0);
    }
}