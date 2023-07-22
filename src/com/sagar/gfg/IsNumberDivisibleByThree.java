package com.sagar.gfg;

public class IsNumberDivisibleByThree {


    public static void main(String[] args) {
        String s="10111110111111011001010111111001101111111101100111011111011111111111111100111111010111011111010111110111011101101111110111111111101011101110111111001111011110110111111101010101100011101111110011111011011111101101011110111011101111111101101111111111010111101111111010110010111101111011111111101111111111100111";
        System.out.println(s.length());
        int res=binaryToDecimal(s);
        System.out.println(res);
    }

    private static int binaryToDecimal(String s) {


        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++)
        {
            //System.out.println(s.charAt(i));
            //System.out.println(Character.getNumericValue(s.charAt(i)) * (int)Math.pow(2,n-i));
            //res+=Character.getNumericValue(s.charAt(i)) * (int)Math.pow(2,n-i);
            if(s.charAt(i)=='1')
            {
                if(i%2==0)
                {
                    res+=1;
                }
                else{
                    res+=2;
                }
            }


        }
        return res%3==0?1:0;
    }
}
