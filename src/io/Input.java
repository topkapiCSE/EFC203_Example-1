package io;

import java.util.Scanner;

public class Input {

    private Scanner scanner;
    public Input(){
        scanner = new Scanner(System.in);
    }

    public int getInt(){
        try {
            return scanner.nextInt();
        }catch (Exception e){
            return -1;
        }
    }

    public int getPositiveInt(){
        try {
            int input =  scanner.nextInt();
            return input > 0 ? input : input * -1;
        }catch (Exception e){
            return -1;
        }
    }

    public int getInt(int begin, int end){
        try {
            int input = scanner.nextInt();
            if(input>=begin && input<=end){
                return input;
            }else {
                return -1;
            }
        }catch (Exception e){
            return -1;
        }
    }

    public String getStringWithInfo(String info){
        System.out.println(info);
        String input =  scanner.nextLine();
        input = input.trim();
        if(input.isEmpty()){
            return "undefined";
        }
        input = info.substring(0,1).toUpperCase() + info.substring(1).toLowerCase();
        return input;
    }
}
