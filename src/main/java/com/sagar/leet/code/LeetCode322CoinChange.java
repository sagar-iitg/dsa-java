package com.sagar.leet.code;

public class LeetCode322CoinChange {

    public static int coinChange(int[] coins, int amount) {
        int ans=usingRecursion(coins,amount);
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;

    }

    private static int usingRecursion(int[] coins, int amount) {
        if(amount==0) return 0;
        if(amount<0) return  Integer.MAX_VALUE;
        int minimumNoofCoins=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++)
        {
            int res=usingRecursion(coins,amount-coins[i]);
            if(res!=Integer.MAX_VALUE) minimumNoofCoins=Math.min(res+1,minimumNoofCoins);
        }
        return minimumNoofCoins;
    }

    public static void main(String[] args) {
        int[] arr={1,2,5};
        int amount=11;
        System.out.println(coinChange(arr,amount));
    }
}
