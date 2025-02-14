package baseball;

import camp.nextstep.edu.missionutils.Console;

public class newgame {
    public static void main(String[] args) {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        String input = Console.readLine();
        if(choice == 1){
            main(args);
        }else if (choice == 2){
            System.out.println("게임 종료합니다");
            break;
        }
    }
}
