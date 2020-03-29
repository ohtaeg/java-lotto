package lotto.domain;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Lotteries {

    private List<LottoNumbers> lottoNumbers;

    public Lotteries(final List<LottoNumbers> lottoNumbers) {
        this.lottoNumbers = Collections.unmodifiableList(lottoNumbers);
    }

    public int count() {
        return lottoNumbers.size();
    }

    public List<LottoNumbers> getLottoNumbers() {
        return lottoNumbers;
    }

    public Map<LottoRank, Integer> analyzeWin(final LottoNumbers winningLotteNumbers) {
        LottoResult lottoResult = new LottoResult();
        LottoRank lottoRank;
        for (LottoNumbers purchases : lottoNumbers) {
            lottoRank = LottoRank.findRank(purchases.match(winningLotteNumbers));
            lottoResult.increase(lottoRank);
        }
        return lottoResult.getChart();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Lotteries lotteries = (Lotteries) o;
        return Objects.equals(lottoNumbers, lotteries.lottoNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lottoNumbers);
    }
}
