import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TestBot {

    // 객체는
    public static String run(String input) {

        // 테스트봇 선입력
        Scanner sc= new Scanner(input+"종료\n");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App app =new App();
        app.run();

        return out.toString();
    }
}
