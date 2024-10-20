package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemainValue() {
        CashbackHackService service = new CashbackHackService();
        int amount = -1;
        int actual = service.remain(amount);
        int expected = 1001;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldReturnRemainValue0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldReturnRemainValue1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldReturnRemainValue999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldReturnRemainValue1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldReturnRemainValue1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual,expected);
    }
}