package com.formatter.tool.aligments;

public class FullAlignment extends AbstractAlignment {
    public FullAlignment(int outputWidth) {
        super(outputWidth);
    }

    @Override
    protected StringBuilder addPadding(StringBuilder line) {
        while (line.length() < outputWidth) {
            for (int i =0; i<line.length();i++) {
                if(line.charAt(i)==' ' && line.length() < outputWidth){
                    line.insert(i,pad);
                }

            }
        }
//        String[] words = line.toString().split(" ");
//        for (int i = 0; i < words.length; i++) {
//            while (line.length() < outputWidth) {
//                line.insert(, pad);
//            }
//        }

        return line;
    }

}
