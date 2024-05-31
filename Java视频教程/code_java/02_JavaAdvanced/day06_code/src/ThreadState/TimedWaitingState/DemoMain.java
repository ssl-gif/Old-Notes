package ThreadState.TimedWaitingState;

public class DemoMain {
    public static void main(String[] args) {

        new Thread(new RunnableImpl()).start();

    }
}
