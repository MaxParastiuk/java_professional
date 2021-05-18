package homework14.task3;

public class Main {
    public static void main(String[] args) {
        Daemon daemon = new Daemon();
        Daemon usual = new Daemon();

        daemon.setDaemon(true);

        daemon.start();
        usual.start();
    }
}
