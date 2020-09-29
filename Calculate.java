package com.example.myapplication;

public class Calculate {
    static double result = 0;
    static double sc_result = 0;

    public static double calculate(String string) {
        char[] calculateChar = string.toCharArray();
        int count = 0;
        int countSymbol = -1;
        boolean bucket = false;

        for (int i = 0; i < calculateChar.length; i++) {
            //不是数字且不是小数点(计算符号数,不算等于号)
            if (Character.isDigit(calculateChar[i]) == false && calculateChar[i] != '.' && calculateChar[i] != 'Π' && calculateChar[i] != 'e') {
                //待计算数个数
                //countNum++;
                //符号数
                countSymbol++;
                if (calculateChar[i] == '(')
                    bucket = true;

            }

        }
        //System.out.println("countNum:" + countNum);
        System.out.println("countSymbol:" + countSymbol);

        //合成表达式expression
        String[] expression = new String[(countSymbol + 1) * 2];
        String number = "";
        int k = 0;

        //合成计算数
        for (int i = 0; i < calculateChar.length; i++) {
            if (Character.isDigit(calculateChar[i]) == true || calculateChar[i] == '.' || calculateChar[i] == 'Π' || calculateChar[i] == 'e') {
                if (calculateChar[i] == 'Π') {
                    number = "" + Math.PI;
                } else if (calculateChar[i] == 'e') {
                    number = "" + Math.E;
                } else
                    number = number + calculateChar[i];
            } else {
//            	System.out.println(i + "step");
//            	System.out.println("number：" + number);
//            	System.out.println("operation：" + calculateChar[i]);
                if (number != "") {
                    expression[k++] = number;
                }
                number = "";
                expression[k++] = "" + calculateChar[i];
            }
        }

    }

}