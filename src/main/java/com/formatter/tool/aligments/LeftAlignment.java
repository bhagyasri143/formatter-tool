package com.formatter.tool.aligments;

public class LeftAlignment extends AbstractAlignment {
    public LeftAlignment(int outputWidth) {
        super(outputWidth);
    }

    @Override
    protected StringBuilder addPadding(StringBuilder line) {
        while (line.length() < outputWidth) {
            line.append(pad);
        }
        return line;
    }
}
