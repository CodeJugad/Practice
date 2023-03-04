package com.company;

import java.util.Scanner;

public class Main {

    public static String name(int num){
        String stArr[] = {"zero","one", "two", "three", "four", "five", "six", "seven","eight","nine","ten","eleven","twelve",
                "thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};

        String stArr2[] = {"thirty","forty","fifty","sixty","seventy","eighty","ninety"};

        String name = "y";
        int x = num;
        if(x<=20){
            name = stArr[x];
        }else if(x>20 && x<=99){
            if(x%10 != 0){
                int ones = x%10;
                x/=10;
                name=stArr2[x-3] + " " + stArr[ones];
            }else{
                x/=10;
                name= stArr2[x-3];
            }
        }
     return name;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String stArr[] = {"zero","one", "two", "three", "four", "five", "six", "seven","eight","nine","ten","eleven","twelve",
                "thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};


        if(x>=0 && x<100){
            System.out.println(Main.name(x));
        }else if(x>=100 && x<999){


        }
    }
}
