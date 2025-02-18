package baseball.controller;

import baseball.model.UserBall;
import baseball.model.ComputerBall;
import baseball.service.GameService;
import baseball.view.InputView;
import baseball.view.OutputView;


public class GameController {
    public void startGame(){
        ComputerBall computerBall = new ComputerBall();

        while (true) {
            OutputView.enter();
            String userInput = InputView.getUserInput();
            UserBall userBall = new UserBall(userInput);
            //InputView.getUserInput();
            GameService.countStrikeBall(userBall.getBallNumbers(), computerBall.getBallNumbers());

            int[] result = GameService.countStrikeBall(userBall.getBallNumbers(), computerBall.getBallNumbers());
            int strike = result[0];
            int ball = result[1];

            if (strike == 3) {
                OutputView.allStrike(strike);
                OutputView.restart();
                InputView.getRestartInput();
            }

            if (strike > 0) {
                OutputView.checkStrike(strike);
            }

            if (ball > 0) {
                OutputView.checkBall(ball);
            }

            if (strike == 0 && ball == 0) {
                OutputView.nothing();
            }
        }
    }
}
