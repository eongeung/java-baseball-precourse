package baseball;
import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        int firstNumber = Randoms.pickNumberInRange(1, 9);
        int secondNumber = Randoms.pickNumberInRange(1,9);
        while (secondNumber == firstNumber) {
            secondNumber = Randoms.pickNumberInRange(1,9);
        }
        int thirdNumber = Randoms.pickNumberInRange(1,9);
        while (thirdNumber == firstNumber || thirdNumber == secondNumber) {
            thirdNumber = Randoms.pickNumberInRange(1, 9);
        }

        int strike = 0;
        int ball = 0;

        System.out.println("세자리 숫자를 입력하세요 : ");
        String input = Console.readLine();

        try{
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자 오류!!!!!!!!");
        }

        if(input.equals(firstNumber + "" + secondNumber + "" + thirdNumber)){
            System.out.println("3스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다. 게임 종료");
            goto newgame;
        }else if(firstNumber == firstNumber){
            strike++;
            if(secondNumber)
            //System.out.println("2스트라이크 / 위치 맞으면 스트라이크, 아니면 ball");
        }else if (firstNumber == secondNumber || firstNumber == thirdNumber){
            ball++;
            System.out.println("1스트라이크")위치맞으면 스트라이크 숫자만 같으면 볼;
        }else if(firstNumber != secondNumber || firstNumber != thirdNumber || secondNumber !=thirdNumber){
            System.out.println("낫싱");
            goto newgame;
        }

    }
}

