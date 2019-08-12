package com.xyz.app.DP;

public class EggDropRec {

    public static int getDrops(int eggs, int floors){
        //System.out.println("floors: "+floors+" eggs: "+eggs);
        if(floors == 0 || floors == 1) return floors;
        if(eggs == 1) return floors;

        int minimumDrops=Integer.MAX_VALUE, tempResult;
        for(int i=1; i<=floors; i++){
            tempResult = Math.max(getDrops(eggs-1,i-1), getDrops(eggs, floors-i));
            minimumDrops = Math.min(tempResult,minimumDrops);
        }
        return minimumDrops+1;
    }

    public static int getDropsDP(int eggs, int floors) {
        int[][] results = new int[floors+1][eggs+1];

        for(int i=1; i<=eggs; i++){
            results[1][i] = 1;
            results[0][i] = 1;
        }

        for (int i=2; i<=floors; i++){
            results[i][1] =  i;
        }

        for(int i =2; i<=eggs; i++){
            for(int j = 2; j<=floors; j++){
                int minDrop = Integer.MAX_VALUE;
                for(int k=1; k<=j; k++){
                   int tempResult = 1 + Math.max(results[k-1][i-1], results[j-k][i]);
                   minDrop = Math.min(tempResult, minDrop);
                }
                results[j][i] = minDrop;
            }
        }
        return results[floors][eggs];
    }
}
