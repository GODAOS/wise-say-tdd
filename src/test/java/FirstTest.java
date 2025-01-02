import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstTest {

    @Test
    void t1() {
        int rst = 1;
        assertThat(rst).isEqualTo(1);
    }

    @Test
    void t2() {
        TestApp app = new TestApp();
        String result = app.run();

        // aaa가 출력 되는가?
        assertThat(result).isEqualTo("aaa");
    }
}
