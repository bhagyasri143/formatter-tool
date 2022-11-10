package com.formatter.tool.alignmentTests;

import com.formatter.tool.aligments.RightAlignment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class RightAlignmentTest {
    @Test
    public void outputWidth10() {
         RightAlignment alignment = new RightAlignment(10);
         String output = alignment.format("This text should be right aligned ");
        assertEquals(" This text\n should be\n     right\n   aligned", output);
    }

    @Test
    public void outputWidth20() {
         RightAlignment alignment = new RightAlignment(20);
         String output = alignment.format("This text should be right aligned ");
        assertEquals(" This text should be\n       right aligned", output);
    }

    @Test
    public void emptyInput() {
         RightAlignment alignment = new RightAlignment(2);
         String output = alignment.format("");
        assertEquals("  ", output);
    }

    @Test
    public void outputWidthSmallerThanWordLength() {
         RightAlignment alignment = new RightAlignment(1);
        try {
            alignment.format("is");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Word is is longer than the output-width 1", e.getMessage());
        }
    }
}
