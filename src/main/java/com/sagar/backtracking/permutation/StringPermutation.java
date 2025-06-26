package com.sagar.backtracking.permutation;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

    public static void main(String[] args) {
        String str="abc";
        List<String> ans=new ArrayList<>();
        solve(str.toCharArray(),ans,"",0);
        System.out.println(ans);
    }
    private static void solve(char[] ch,List<String> ans,String output,int index){

        if(index==ch.length){
            ans.add(output);
            return;
        }

        for(int j=index;j<ch.length;j++){
            swap(ch,index,j);
            solve(ch,ans,output+ch[index],index+1);
            swap(ch,index,j);
        }

    }
    static void swap(char[] arr, int i, int j) {
        if(i!=j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }
}
