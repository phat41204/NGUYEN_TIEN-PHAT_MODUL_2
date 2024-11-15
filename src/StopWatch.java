public class StopWatch {
    private long startime, endtime;

    public StopWatch() {
        startime = System.currentTimeMillis();
    }

    public void start() {
        startime = System.currentTimeMillis();
    }

    public void stop() {
        endtime = System.currentTimeMillis();
    }

    public long getEslapestime() {
        return endtime - startime;
    }

    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        sw.start();
        for (int i = 0; i < 1000000; i++) {
            System.out.println(" ");
        }
        sw.stop();
        System.out.println("elapsed time: " + sw.getEslapestime() + "milliseconds");
    }
}
