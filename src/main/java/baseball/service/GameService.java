package baseball.service;

import baseball.view.InputView;

import java.util.List;

public class GameService {
    public static int[] countStrikeBall(List<Integer> userBall, List<Integer> computerBall) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < 3; i++) {
            if (userBall.get(i).equals(computerBall.get(i))){
                strike++;
            } else if (computerBall.contains(userBall.get(i))) {
                ball++;
            }
        }
        return new int[] {strike,ball};
    }
    public static boolean restartGame(){
        String restartInput = InputView.getRestartInput();

        if(restartInput.equals("1")){
            return true;
        }else if(restartInput.equals("2")){
            return false;
        } else throw new IllegalArgumentException("1 또는 2만 입력해주세요!");
    }
}
