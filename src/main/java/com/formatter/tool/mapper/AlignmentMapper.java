package com.formatter.tool.mapper;

import com.formatter.tool.FormatterTool;
import com.formatter.tool.aligments.CenterAlignment;
import com.formatter.tool.aligments.LeftAlignment;
import com.formatter.tool.aligments.RightAlignment;

public class AlignmentMapper {
    private FormatterTool.Alignment currentAlignment;

    private int outputWidth;

    public AlignmentMapper(FormatterTool.Alignment currentAlignment, int outputWidth) {
        this.currentAlignment = currentAlignment;
        this.outputWidth = outputWidth;
    }

    public String getAlign(String input) {
        if (currentAlignment == FormatterTool.Alignment.LEFT) {
            LeftAlignment leftAligned = new LeftAlignment(outputWidth);
            System.out.println(leftAligned.format(input));
        }
        if (currentAlignment == FormatterTool.Alignment.RIGHT) {
            RightAlignment rightAligned = new RightAlignment(outputWidth);
            System.out.println(rightAligned.format(input));
        }
        if (currentAlignment == FormatterTool.Alignment.CENTER) {
            CenterAlignment centerAligned = new CenterAlignment(outputWidth);
            System.out.println(centerAligned.format(input));
        }
        return null;
    }

}
