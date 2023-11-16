package com.sparta.cw;

public class App {
    public static final int[] arabic = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    public  static final String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};


    public static void main(String[] args) {
        System.out.println(getNumerals(3999));


    }

    public static String getNumerals(int number){
        StringBuilder romanNumerals = new StringBuilder();
        for (int i = 0;i<arabic.length ; i++){
            while (number >= arabic[i]){
                number = number-arabic[i];
                romanNumerals.append(roman[i]);
            }
        }
        return romanNumerals.toString();
    }


}
