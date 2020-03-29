package lotto.domain;

import java.util.HashMap;
import java.util.Map;

public class LottoResult {
    private static final int DEFAULT_MATCH_COUNT = 0;
    private static final int ONE_HUNDRED_PERCENT = 100;

    private final Map<LottoRank, Integer> chart;

    public LottoResult() {
        this(initChart());
    }

    public LottoResult(final Map<LottoRank, Integer> chart) {
        this.chart = chart;
    }

    private static Map<LottoRank, Integer> initChart() {
        Map<LottoRank, Integer> chart = new HashMap<>();
        chart.put(LottoRank.BLANK, DEFAULT_MATCH_COUNT);
        chart.put(LottoRank.FOURTH, DEFAULT_MATCH_COUNT);
        chart.put(LottoRank.THIRD, DEFAULT_MATCH_COUNT);
        chart.put(LottoRank.SECOND, DEFAULT_MATCH_COUNT);
        chart.put(LottoRank.FIRST, DEFAULT_MATCH_COUNT);
        return chart;
    }

    public void increase(LottoRank lottoRank) {
        chart.put(lottoRank, chart.get(lottoRank) + 1);
    }

    public int wihCount(LottoRank lottoRank) {
        return chart.get(lottoRank);
    }

    public double ratio(Price price) {
        Price total = new Price(Price.MIN_PRICE);
        for( Map.Entry<LottoRank, Integer> lottoResult : chart.entrySet()) {
            int matchCount = lottoResult.getValue();
            Price rankPrice = lottoResult.getKey()
                                         .getRankPrice();
            Price winPrice = rankPrice.calculateWinPrice(matchCount);
            total = total.sum(winPrice);
        }

        return Math.floor(total.divide(price) * ONE_HUNDRED_PERCENT) / (double) ONE_HUNDRED_PERCENT;
    }
}
