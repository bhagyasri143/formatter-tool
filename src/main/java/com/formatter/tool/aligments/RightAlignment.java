package com.formatter.tool.aligments;

public class RightAlignment extends AbstractAlignment {
    public RightAlignment(int outputWidth) {
        super(outputWidth);
    }

    @Override
    protected StringBuilder addPadding(StringBuilder line) {
        while (line.length() < outputWidth) {
            line.insert(0, pad);
        }
        return line;
    }
}
