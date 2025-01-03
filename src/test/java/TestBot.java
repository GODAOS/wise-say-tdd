import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TestBot {

    // 객체는
    public static String run(String input) {

        // 테스트봇 선입력
        Scanner sc= new Scanner(input+"\n");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        TestApp app =new TestApp();
        app.run();

        return out.toString();
    }
}
