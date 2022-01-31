public class ClockAndNumberDisplayTest {
    public static void main(String[] args) {
        ClockDisplay reloj = new ClockDisplay(11,0,0);

        reloj.timeTick();
        reloj.timeTick();

        System.out.println(reloj.getTime());
        for (int i = 0; i < 36063; i++) {
            reloj.timeTick();
        }
        System.out.println(reloj.getTime());
    }
}    