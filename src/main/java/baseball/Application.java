package baseball;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        int firstNumber = Randoms.pickNumberInRange(1, 9);
        int secondNumber = Randoms.pickNumberInRange(1, 9);
        while (secondNumber == firstNumber) {
            secondNumber = Randoms.pickNumberInRange(1, 9);
        }
        int thirdNumber = Randoms.pickNumberInRange(1, 9);
        while (thirdNumber == firstNumber || thirdNumber == secondNumber) {
            thirdNumber = Randoms.pickNumberInRange(1, 9);
        }
        playGame(firstNumber, secondNumber, thirdNumber);
    }

    public static void playGame(int firstNumber, int secondNumber, int thirdNumber) {

        int strike = 0;
        int ball = 0;

        System.out.println("세자리 숫자를 입력하세요 : ");
        String input = Console.readLine();

        if (input.length() != 3) {
            throw new IllegalArgumentException("숫자 오류! 세 자리 숫자를 입력하세요.");
        }

        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자 오류!!!!!!!!");
        }

        if (input.charAt(0) - '0' == firstNumber && input.charAt(1) - '0' == secondNumber && input.charAt(2) - '0' == thirdNumber) {
            strike += 3;
            System.out.println(strike + "스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다.");
            System.out.println("게임 종료");
            restart(firstNumber, secondNumber, thirdNumber);
        } else if (input.charAt(0) - '0' == firstNumber) {
            strike++;
            if (input.charAt(1) - '0' == secondNumber) {
                strike++;
                if (input.charAt(2) - '0' != thirdNumber) {
                    System.out.println(ball + "볼 " + strike + "스트라이크 ");
                }
            } else if (input.charAt(1) - '0' != secondNumber) {
                if (input.charAt(1) - '0' == thirdNumber) {
                    ball++;
                    if (input.charAt(2) - '0' == secondNumber) {
                        ball++;
                        System.out.println(ball + "볼 " + strike + "스트라이크 ");
                    } else if (input.charAt(2) - '0' != secondNumber) {
                        System.out.println(ball + "볼 " + strike + "스트라이크 ");
                    }
                }

            }
        } else if (input.charAt(0) - '0' == secondNumber) {
            ball++;
            if (input.charAt(1) - '0' == firstNumber) {
                ball++;
                if (input.charAt(2) - '0' == thirdNumber) {
                    strike++;
                    System.out.println(ball + "볼 " + strike + "스트라이크 ");
                }
            } else if (input.charAt(1) - '0' != firstNumber) {
                if (input.charAt(2) - '0' == thirdNumber) {
                    strike++;
                    System.out.println(ball + "볼 " + strike + "스트라이크 ");
                }
            }
        } else if (input.charAt(0) - '0' == thirdNumber) {
            ball++;
            if (input.charAt(1) - '0' == firstNumber) {
                ball++;
                if (input.charAt(1) - '0' == thirdNumber) {
                    ball++;
                    System.out.println(ball + "볼 " + strike + "스트라이크 ");
                }
            } else if (input.charAt(1) - '0' != firstNumber) {
                if (input.charAt(1) - '0' == thirdNumber) {
                    ball++;
                    System.out.println(ball + "볼 " + strike + "스트라이크 ");
                }
            }
        } else if (input.charAt(0) - '0' != firstNumber && input.charAt(1) - '0' != secondNumber && input.charAt(2) - '0' != thirdNumber) {
            System.out.println("낫싱");
            startGame();
        }
    }

    public static void restart(int firstNumber, int secondNumber, int thirdNumber) {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        String input = Console.readLine();

        try {
            int choice = Integer.parseInt(input);

            if (choice == 1) {
                playGame(firstNumber, secondNumber, thirdNumber);
            } else if (choice == 2) {
                System.out.println("게임 종료");
            } else {
                throw new IllegalArgumentException();
                }
        }catch(NumberFormatException e) {
            throw new IllegalArgumentException("숫자 입력 안함!!!!!!!!");
        }
    }}

