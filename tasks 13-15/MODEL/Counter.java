package MODEL;

public class Counter extends Exception {

    public int id = 0;

    public void incrementIt() throws RuntimeException {
        id++;
    }

}
