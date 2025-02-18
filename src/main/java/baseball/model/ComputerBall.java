package baseball.model;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ComputerBall {
    private List<Integer> ballNumbers;

    public ComputerBall(){
       ballNumbers = new ArrayList<>();
       generateRandomNumbers();
    }


    public void generateRandomNumbers() {
        while (ballNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1,9);
            if (!ballNumbers.contains(randomNumber)) {
                ballNumbers.add(randomNumber);
            }
        }
    }

    public List<Integer> getBallNumbers() {
        return ballNumbers;
    }
}
