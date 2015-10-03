package com.example.denny.dcapp.Test;

import com.example.denny.dcapp.Hero;
import junit.framework.TestCase;

/**
 * Created by Denny on 9/30/2015.
 */

public class ApplicationTest extends TestCase
{
    private static final int expected = 2;
    Hero hero = new Hero();

    @Override
    protected void setUp() throws Exception
    {
        super.setUp();
    }

    public int add(int x, int y)
    {
        return x + y;
    }

    public void testAdd()
    {
        assertEquals(expected, add(1, 1));
    }

    public void testSomething()
    {
        assertEquals(expected, 2);
    }

    public void testHero()
    {
        hero.setName("Superman");
        hero.setSet("Original");
        hero.setVp(1);
        hero.setCost(5);
        hero.setAbility("Flight");

        assertEquals("Superman", hero.getName());
        assertEquals("Original", hero.getSet());
    }
}
