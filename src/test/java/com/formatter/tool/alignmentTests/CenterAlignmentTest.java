package com.formatter.tool.alignmentTests;

import com.formatter.tool.aligments.CenterAlignment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CenterAlignmentTest {
    @Test
    public void outputWidth10() {
        CenterAlignment alignment = new CenterAlignment(10);
        String output = alignment.format("This text should be center aligned ");
        assertEquals("This text \nshould be \n  center  \n aligned  ", output);
    }

    @Test
    public void outputWidth20() {
        CenterAlignment alignment = new CenterAlignment(20);
        String output = alignment.format("This text should be center aligned ");
        assertEquals("This text should be \n   center aligned   ", output);
    }

    @Test
    public void emptyInput() {
        CenterAlignment alignment = new CenterAlignment(2);
        String output = alignment.format("");
        assertEquals("  ", output);
    }

    @Test
    public void outputWidthSmallerThanWordLength() {
        CenterAlignment alignment = new CenterAlignment(1);
        try {
            alignment.format("is");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Word is is longer than the output-width 1", e.getMessage());
        }
    }
    }
