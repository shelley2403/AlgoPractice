package com.xyz.app.StringHR;

import static java.lang.Math.max;

public class QueueBribeChaos {

    /*
    2               -> Min Bribes
    5               -> People In Line
    2 1 5 3 4       -> Arrangement at T(0)
    5               -> People In Line
    2 5 1 3 4       -> Arrangement at T(1)
    */
//    public static void minimunBribes(int[] q){
//        if(q.length <3) {
//            System.out.println("Too Chaotic");
//        } else {
//            int bribes = q[0];
//            int passes = 0;
//            int i=1;
//            while(i < q.length) {
//                int queueLength = q[i];
//                int[] currQueue = new int[queueLength];
//                int j =0;
//                while(j < queueLength){
//                    currQueue[j] = q[i+j+1];
//                    j++;
//                }
//                for(int k=currQueue.length-1; k>=0; k--) {
//                    if(passes > bribes) {
//                        System.out.println("Too Chaotic");
//                        break;
//                    }
//                    if (currQueue[k] != k+1) {
//                        for(int l = currQueue.length-1; l>=0; l--){
//                            if(k+1 == currQueue[l]) {
//                               swap(currQueue, l, k);
//                                passes+=1 ;
//                            }
//                        }
//                    }
//                }
//                 if(passes <= bribes){
//                     System.out.println(passes);
//                 }
//                i++;
//            }
//        }
//    }

    /*
     # From here on out, we don't care if P has moved
        # forwards, it is better to count how many times
        # P has RECEIVED a bribe, by looking at who is
        # ahead of P.  P's original position is the value
        # of P.
        # Anyone who bribed P cannot get to higher than
        # one position in front if P's original position,
        # so we need to look from one position in front
        # of P's original position to one in front of P's
        # current position, and see how many of those
        # positions in Q contain a number large than P.
        # In other words we will look from P-1 to i-1,
        # which in Python is range(P-1,i-1+1), or simply
        # range(P-1,i).  To make sure we don't try an
        # index less than zero, replace P-1 with
        # max(P-1,0)
        for j in range(max(P-1,0),i):
            if Q[j] > P:
                moves += 1
    * */

    public static void minimunBribes(int[] q) {
        if (q.length < 3) {
            System.out.println("Too Chaotic");
        }

        int bribes = q[0];
        int ans = 0;
        int i = 1;
        while (i < q.length) {
            int queueLength = q[i];
            int[] currQueue = new int[queueLength];
            int j = 0;
            while (j < queueLength) {
                currQueue[j] = q[i + j + 1];
                j++;
            }

            for (int k = currQueue.length - 1; k >= 0; k--) {
                if(currQueue[k] - (k+1) > 2) {
                    System.out.println("too chaotic");
                    return;
                }

                for (int l = max(0, currQueue[k] - 2); l < k; l++)
                    if (currQueue[l] > currQueue[k]) ans++;
            }

            System.out.println("Min bribes: "+ans);
            i++;
        }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
