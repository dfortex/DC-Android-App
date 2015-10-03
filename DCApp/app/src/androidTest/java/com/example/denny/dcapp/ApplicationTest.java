package com.example.denny.dcapp;

import android.app.Activity;
import android.app.Application;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application>
{
    private ApplicationTest mApplicationTest;
    private TextView mApplicationTextView;
    private static final int result = 2;

    public ApplicationTest()
    {
        super(Application.class);
    }

    @Override
    protected void setUp() throws Exception
    {
        super.setUp();
    }
    public void testResult()
    {
        assertEquals(result, 1);
    }

}