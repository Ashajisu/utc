package org.example;

import java.text.ParseException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Calculate calculate = new Calculate(scanner);
        ListUp listUp = new ListUp();
        String result ="start";

        StringBuilder builder = new StringBuilder();
        builder.append("### UTC 시간계산기 ###\n");
        builder.append("1. UTC를 날짜로 변환\n");
        builder.append("2. UTC를 날짜로 다중 변환\n");
        builder.append("3. 날짜를 UTC로 변환\n");
        builder.append("4. 기준 시간대 변경\n");
        builder.append("5. 현재시간의 날짜와 UTC를 출력\n");
        builder.append("6. 리스트 출력\n");
        builder.append("0. 종료\n");
        builder.append("메뉴를 입력하세요");

        while (result.length() > 0){
            System.out.print(builder);
            System.out.print("(기준 시간대 "+calculate.timezoneString+") : ");

            int input = scanner.nextInt();
            /**
             * 버퍼에 개행 문자가 남아있어서 그 다음에 호출되는 nextLine()에서는 개행 문자를 입력으로 받아들여서 바로 넘어가게 됩니다.
             * 이런 문제를 방지하기 위해 nextInt()를 호출한 후에는 nextLine()을 호출하여 개행 문자를 소비해주는 것이 좋습니다.
             * **/
            scanner.nextLine(); //개행문자 소비

            result = switch (input){
                case 1 -> calculate.manu1();
                case 2 -> calculate.manu1While();
                case 3 -> calculate.manu2();
                case 4 -> calculate.setTimezone();
                case 5 -> calculate.manuNow();
                case 6 -> listUp.printListOfArrays();
                case 0 -> "";
                    default -> "잘못된 입력값입니다, 메뉴로 돌아갑니다.\n";
            };

            System.out.println(result +"\n");

        }

    }



}