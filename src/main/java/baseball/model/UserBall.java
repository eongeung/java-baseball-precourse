package baseball.model;
import java.util.ArrayList;
import java.util.List;

public class UserBall {
    private List<Integer> ballNumbers;

    public UserBall(String input) {
        validateInput(input);
        ballNumbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int num = input.charAt(i) - '0';
            ballNumbers.add(num);
        }
    }

    public void validateInput(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException("세 자리 숫자만 입력해주세요!");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    throw new IllegalArgumentException("중복되지 않는 숫자를 입력해주세요!");
                }
            }
        }
    }
    public List<Integer> getBallNumbers() {
        return ballNumbers;
    }
}
