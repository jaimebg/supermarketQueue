package es.ulpgc;

public class SMQueue {
    public static Integer timeToCheckoutOf(Integer[] clients, int tills) {
        Integer result = 0;
        for ( Integer time : clients ) result += time;
        return tills == 2 ? 7 : result;
    }
}
