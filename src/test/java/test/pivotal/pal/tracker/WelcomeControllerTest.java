package test.pivotal.pal.tracker;

import io.pivotal.pal.tracker.ApplicationController;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WelcomeControllerTest {

    @Test
    public void itSaysHello() throws Exception {
        ApplicationController controller = new ApplicationController("A welcome message");

        assertThat(controller.sayHello()).isEqualTo("A welcome message");
    }
}
