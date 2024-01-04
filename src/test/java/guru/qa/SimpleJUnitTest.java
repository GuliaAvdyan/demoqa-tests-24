package guru.qa;

import org.junit.jupiter.api.*;

public class SimpleJUnitTest {

    @BeforeAll
    static void beforeAll() {
        //до всех тестов 1 раз
        System.out.println("###  BeforeAll");

    }

    @AfterAll
    static void afterAll() {
        //после всех тестов 1 раз
        System.out.println("###  AfterAll");

    }

    @BeforeEach
    void beforeEach() {
        //перед каждым тестом
        System.out.println("### BeforeEach");
    }

    @AfterEach
    void afterEach() {
        //перед каждым тестом
        System.out.println("### AfterEach");
    }

    @Test
    void firstTest() {
        System.out.println("### first");
        Assertions.assertTrue(2*2 == 4);
    }

    @Test
    void secondTest() {
        System.out.println("### second");
        Assertions.assertTrue(2+3 == 5);
    }
}
