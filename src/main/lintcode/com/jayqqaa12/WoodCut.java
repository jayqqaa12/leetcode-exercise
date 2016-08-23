package com.jayqqaa12;

import java.util.Arrays;

/**
 * 有一些原木，现在想把这些木头切割成一些长度相同的小段木头，
 * 需要得到的小段的数目至少为 k。当然，我们希望得到的小段越长越好，你需要计算能够得到的小段木头的最大长度。
 */
public class WoodCut {

    public int woodCut(int[] woods, int k) {
      if (woods == null || woods.length == 0 || k < 0)   return 0;
         
     if (woods.length == 1) return woods[0] / (woods[0] / k);
        
      Arrays.sort(woods);
      
      int min=0,max = woods[woods.length-1];
      
      int rst =0;
      while(min+1<max)
      {
          int len = min+(max-min)/2;
          
          if(cutNum(woods,len)<k){
              max=len;
          }
          else {
              rst =len;
              min=len;
          }
      }
      
      return rst;
              
        
        
    }


    
    
    private int cutNum(int []woods ,int len){
        
        int c =0;
        for(int i=0;i<woods.length;i++){
            c+= woods[i]/len;
        }
        return c;
        
    }
}