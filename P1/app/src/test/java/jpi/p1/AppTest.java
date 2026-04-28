package jpi.p1;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test 
    void appRuns() {
        App app = new App();
        assertNotNull(app);
    }
}
