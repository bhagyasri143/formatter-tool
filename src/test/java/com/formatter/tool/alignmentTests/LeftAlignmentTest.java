package com.formatter.tool.alignmentTests;

import com.formatter.tool.aligments.LeftAlignment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class LeftAlignmentTest {
    @Test
    public void outputWidth10() {
         LeftAlignment alignment = new LeftAlignment(10);
         String output = alignment.format("This text should be left aligned ");
        assertEquals("This text \nshould be \nleft      \naligned   ", output);
    }

    @Test
    public void outputWidth20() {
         LeftAlignment alignment = new LeftAlignment(20);
         String output = alignment.format("This text should be left aligned ");
        assertEquals("This text should be \nleft aligned        ", output);
    }

    @Test
    public void emptyInput() {
         LeftAlignment alignment = new LeftAlignment(2);
         String output = alignment.format("");
        assertEquals("  ", output);
    }

    @Test
    public void outputWidthSmallerThanWordLength() {
         LeftAlignment alignment = new LeftAlignment(1);
        try {
             alignment.format("is");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Word is is longer than the output-width 1", e.getMessage());
        }
    }

}
