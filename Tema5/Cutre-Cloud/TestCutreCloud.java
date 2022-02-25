public class TestCutreCloud {
    
    public static void main(String[] args) {
        Usuario u1 = new Usuario("danirot@cutrecloud.com", "123");
        Usuario u2 = new Usuario("juanratkid@cutrecloud.com", "456");
        Usuario u3 = new Usuario("juanratkid@cutrecloud.com", "456");
        Usuario u4 = new Usuario("raul@cutreclou.com", "sdlfkj");

        Media m1 = new Media(3, "song.mp3", "trukutruku", MediaType.audio, u1);
        System.out.println(u1.getEmail());
    }
}   