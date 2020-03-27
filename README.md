# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)


### 1단계 - 문자열 덧셈 계산기 Todo List
- [x] 컴마(,) 또는 콜론 (:)을 가지는 문자열을 `구분자` 기준으로 분리한다.
    - [x] 숫자 두개를 컴마(,) `구분자`로 입력할 경우 두 숫자의 합을 반환한다.
    - [x] 숫자 두개를 콜론(,) `구분자`로 입력할 경우 두 숫자의 합을 반환한다.
- [x] “//”와 “\n” 사이에 위치하는 커스텀 `구분자`를 지정할 수 있다.
    - [x] 커스텀 `구분자`로 문자열을 분리한다.
- [x] 분리된 문자열을 덧셈한다.
- [x] 숫자 이외의 값 or 음수일경우 RuntimeException 을 발생한다.
- [x] 빈 문자열 또는 null 값을 입력할 경우 0을 반환한다.
- [x] 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.


### 2단계 - 로또 (자동) Todo List

1. `입력 창 (Input View)`
    - [x] `구입 금액 (Price)`을 입력 받는다.
    - [x] `구입 금액 (Price)`이 0원 이거나 음수일 경우 RuntimeException 을 발생한다.
    - [ ] 당첨 번호를 입력 받는다.
2. `로또 (Lotto)`
    - [x] 개당 천원으로 계산한다. ex) 14000 = 14개
    - [ ] `구입 금액 (Price)`에 해당하는 복권을 구매 한다.
    - [ ] 로또 숫자는 1~45 사이에 6개의 랜덤 숫자를 갖는다.
    - [ ] 6개의 숫자는 중복이 허용되지 않는다.
    - [ ] 6개의 숫자를 정렬 한다.
3. `당첨 (Jackpot)`
    - [ ] 로또 번호와 당첨 번호가 3개 이상부터 일치하는 갯수를 구한다.
    - [ ] 수익률을 계산한다. 당첨 금액 / 구매 금액 = 수익률 (소숫점 둘째자리까지)
4. `출력 (OutputView)`
    - [ ] 입력받은 구입 금액에 따른 구매 갯수를 출력한다.
    - [ ] 구매한 복권 갯수를 출력한다.
    - [ ] 당첨번호를 입력하라는 메시지를 출력한다.
    - [ ] 지난주 당첨 번호를 출력한다.
    - [ ] 일치하는 갯수 현황을 출력한다.
        - [ ] 3개 일치할 경우 5,000원
        - [ ] 4개 일치할 경우 50,000원
        - [ ] 5개 일치할 경우 1,500,000원
        - [ ] 6개 일치할 경우 2,000,000,000원
    - [ ] 수익률을 출력한다.