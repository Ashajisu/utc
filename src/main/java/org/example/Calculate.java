package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Calculate extends ListUp{

    Scanner scanner;
    TimeZone timeZone = TimeZone.getTimeZone("Asia/Seoul");
    String timezoneString = "Asia/Seoul";
    SimpleDateFormat koreaFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public Calculate(Scanner scanner){
        this.scanner = scanner;
    }

    public String manu1(){
        System.out.print("UTC 값을 입력하세요 (예: 1669342002L): ");
        long utcTimestamp = scanner.nextLong(); // UTC 시간값

        koreaFormat.setTimeZone(timeZone);
        String koreaTime = koreaFormat.format(utcTimestamp* 1000L);
        setArray(String.valueOf(utcTimestamp),koreaTime);
        return koreaTime;
    }

    public void oneLineUtcTimestamp(long utcTimestamp){
        koreaFormat.setTimeZone(timeZone);
        String koreaTime = koreaFormat.format(utcTimestamp * 1000L);
        setArray(String.valueOf(utcTimestamp),koreaTime);
    }

    public String manu1While(){
        System.out.println("작업을 계속하려면 엔터를 누르세요. 종료하려면 'exit'를 입력하세요.");
        int count = 0;
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("exit")) {
                break; // 종료 신호를 받으면 반복문 종료
            }
            if(line.length()>1){
                count++; // 줄 카운트 증가
                oneLineUtcTimestamp(Long.parseLong(line));
            }

        }
        setArray("result", String.valueOf(count));
        return printListOfArrays();
    }

    public String manu2() throws ParseException {
        System.out.print("날짜를 입력하세요 (예: yyyy-MM-dd HH:mm:ss): ");
        String dateTimestamp = scanner.nextLine(); // date 값

        koreaFormat.setTimeZone(timeZone);
        Date date = koreaFormat.parse(dateTimestamp);
        long utcTime = date.getTime()/1000;
        setArray(dateTimestamp,String.valueOf(utcTime));
        return "" + utcTime;
    }

    public String setTimezone(){
        System.out.print("원하는 시간대를 입력하세요 (예: Asia/Seoul): ");
        String newTimezoneString = scanner.nextLine();
        timeZone = TimeZone.getTimeZone(newTimezoneString);
        setArray(this.timezoneString,newTimezoneString);
        timezoneString = newTimezoneString;
        return "change to " + newTimezoneString;
    }

    public String manuNow(){
        Date now = new Date();
        koreaFormat.setTimeZone(timeZone);
        String koreaTime = koreaFormat.format(now);
        Long utc = now.getTime()/1000;
        setArray(koreaTime, utc.toString());
        return koreaTime +"\n" +  utc;

    }

}
