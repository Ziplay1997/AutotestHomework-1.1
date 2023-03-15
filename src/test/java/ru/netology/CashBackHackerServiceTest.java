package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerServiceTest {

    @Test
    public void test1() {
        CashBackHackerService service = new CashBackHackerService();

        int amount = 555;

        int expected = 445;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        CashBackHackerService service = new CashBackHackerService();

        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void test3() {
        CashBackHackerService service = new CashBackHackerService();

        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void test4() {
        CashBackHackerService service = new CashBackHackerService();

        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void test5() {
        CashBackHackerService service = new CashBackHackerService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void test6() {
        CashBackHackerService service = new CashBackHackerService();

        int amount = 1005;

        int expected = 995;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }


}