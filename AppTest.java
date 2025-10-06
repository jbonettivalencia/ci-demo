package com.example.ci;

import com.example.ci.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void testMessage() {
        assertEquals("CI working!", App.getMessage());
    }
}
