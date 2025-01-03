import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstTest {

    @Test
    void t1() {
        int rst = 1;
        assertThat(rst).isEqualTo(1);
    }

    @Test
    void t2() {
//        TestApp app = new TestApp();
//        String result = app.run();
//
//        // aaa가 출력 되는가?
//        assertThat(result).isEqualTo("aaa");
    }

    @Test
    void t3() {
        // 테스트봇 선입력
        Scanner sc= new Scanner("종료\n");

        ByteArrayOutputStream out = new ByteArrayOutputStream();// 비어있는 스트림
        System.setOut(new PrintStream(out));

        App app =new App();
        app.run();

        assertThat(out.toString()).contains("명령앱을 종료합니다.");

        // 출력값 확인
    }

    @Test
    @DisplayName("앱 시작시 '==명언 앱==' 출력")
    void t4() {
        // 테스트봇 선입력
        Scanner sc= new Scanner("종료\n");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App app =new App();
        app.run();

        // 테스트 코드 작성이 어렵다.
        // assertJ 사용법을 잘 모른다.

        assertThat(out.toString())
                .containsSubsequence("== 명언 앱 ==","명령앱을 종료합니다.");
    }

    @Test
    @DisplayName("테스트 봇 동작 확인")
    void t5() {
        String out = TestBot.run("종료");

        assertThat(out)
                .containsSubsequence("== 명언 앱 ==","명령앱을 종료합니다.");
    }

    @Test
    @DisplayName("등록 - 명언 1개 입력")
    void t6() {
        // java 13버전 부터 """를 사용해서 줄나눔 가능
        String out = TestBot.run("""
        등록
        현재를 사랑하라.
        작자미상
        종료
        """);

        assertThat(out)
                .containsSubsequence("명언 : ","작가 : ");
    }

}
