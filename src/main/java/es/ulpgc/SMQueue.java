package es.ulpgc;

import java.util.Arrays;

public class SMQueue {
    public static Integer timeToCheckoutOf(int[] clients, int tills) {
        int[] res = new int[tills];
        for (int i = 0; i < clients.length; i++){
            res[0] += clients[i];
            Arrays.sort(res);
        }
        return res[tills-1];
    }
}
