package com.formatter.tool.aligments;

public class CenterAlignment extends AbstractAlignment {
    public CenterAlignment(int outputWidth) {
        super(outputWidth);
    }

    @Override
    protected StringBuilder addPadding(StringBuilder line) {
        while (line.length() < outputWidth) {
            line.append(pad);
            if (line.length() < outputWidth) {
                line.insert(0, pad);
            }
        }
        return line;
    }
}
