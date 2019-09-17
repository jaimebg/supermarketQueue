package es.ulpgc;

public class SMQueue {
    public static Integer timeToCheckoutOf(Integer[] clients, int tills) {
        Integer result = 0;
        if (tills == 2) {
            Integer currentTime = 0;
            for (Integer time : clients) {
                if (currentTime == 0) {
                    result+=time;
                    currentTime = time;
                } else {
                    if (currentTime < time) {
                        result+=time-currentTime;
                    } else {
                        currentTime-= time;
                    }
                }
            }
        } else for ( Integer time : clients ) result += time;
        return result;
    }
}
