package com.formatter.tool.aligments;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractAlignment {

    protected final String pad = " ";

    protected final int outputWidth;

    public AbstractAlignment(int outputWidth) {
        this.outputWidth = outputWidth;
    }

    public String format(String input) {
        List<String> output = new LinkedList<>();
        String[] words = input.split("\\s+");
        for (int i = 0; i < words.length; ) {
            String word = words[i];
            if (word.length() > outputWidth) {
                throw new IllegalArgumentException(String.format("Word %s is longer than the output-width %d", word, outputWidth));
            }
            StringBuilder line = new StringBuilder(word);
            i++;
            while (i < words.length && (line.length() + pad.length() + words[i].length())  <= outputWidth) {
                line.append(pad + words[i]);
                i++;
            }
            output.add(addPadding(line).toString());
        }
        return String.join("\n", output);
    }

    protected abstract StringBuilder addPadding(StringBuilder line);
}
