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

            int[] result = GameService.countStrikeBall(userBall.getBallNumbers(), computerBall.getBallNumbers());
            int strike = result[0];
            int ball = result[1];

            if (strike == 3) {
                OutputView.allStrike(strike);
                OutputView.restart();
                boolean restart = GameService.restartGame();

                if (!restart) {
                    return;
                } else {
                    startGame();
                }
            }

            if (strike > 0 && strike <3) {
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
