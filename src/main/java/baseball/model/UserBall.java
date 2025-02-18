package baseball.model;
import camp.nextstep.edu.missionutils.Console;

public class UserBall {
    public void validateInput(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException("세 자리 숫자만 입력해주세요!");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (input.charAt(i) == input.charAt(j)) { // 같은 숫자가 있으면 중복!
                    throw new IllegalArgumentException("중복되지 않는 숫자를 입력해주세요!");
                }
            }
        }
    }
}
