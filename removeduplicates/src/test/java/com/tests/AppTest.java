package com.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertEquals("abc", App.remduplicates("aaabcc"));
    }
    @Test
    public void shouldreturnEmptywhennull()
    {
        assertEquals("", App.remduplicates(null));
    }

    @Test
    public void shouldreturnEmptywhenEmpty()
    {
        assertEquals("", App.remduplicates(""));
    }
    @Test
    public void shouldreturnOkqithOnlynumbers()
    {
        assertEquals("12345", App.remduplicates("1112233445"));
    }
    @Test
    public void shouldreturnOkqithlargeString()
    {
        assertEquals("abcde", App.remduplicates("aaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbcccccccccccccccccccccccccccccccdddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeee"));
    }
}
