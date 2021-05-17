package homework13.task2;

public class PriorityRunner {
    public static void main(String[] args) {
        Thread max = new Thread(new PriorityThread(), "MAX");
        Thread min = new Thread(new PriorityThread(), "MIN");
        Thread norm = new Thread(new PriorityThread(), "NORM");

        max.setPriority(Thread.MAX_PRIORITY);
        min.setPriority(Thread.MIN_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);


        min.start();
        norm.start();
        max.start();
    }
}
