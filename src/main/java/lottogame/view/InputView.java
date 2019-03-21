package lottogame.view;

import lottogame.domain.LottoNumberPackage;
import lottogame.domain.PurchaseAmount;
import lottogame.domain.WinningInfo;
import lottogame.util.StringUtils;

import java.util.Scanner;

public class InputView {
    static final String NUMBER_DELIMETER = ",";

    private static Scanner scanner = new Scanner(System.in);

    public InputView(Scanner scanner) {
        InputView.scanner = scanner;
    }

    public static PurchaseAmount getPurchaseAmount() {
        showPurchaseAmountInputMessage();
        return new PurchaseAmount(Long.parseLong(getInputLine()));
    }

    private static void showPurchaseAmountInputMessage() {
        System.out.println("구입금액을 입력해 주세요.");
    }

    public static WinningInfo getWinningNumbers() {
        showWinningNumbersInputMessage();
        return new WinningInfo(getLottoGame());
    }

    private static void showWinningNumbersInputMessage() {
        System.out.println("\n지난 주 당첨 번호를 입력해 주세요.");
    }

    private static LottoNumberPackage getLottoGame() {
        return new LottoNumberPackage(StringUtils.parseIntegerList(getInputLine().split(NUMBER_DELIMETER)));
    }

    private static String getInputLine() {
        return StringUtils.removeWhitespace(scanner.nextLine());
    }
}