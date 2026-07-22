package jpi.p6t1;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test void appHasAGreeting() {
        App app = new App();
        assertNotNull(app);
    }
}
