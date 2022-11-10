package com.formatter.tool;

import com.formatter.tool.mapper.AlignmentMapper;

import java.util.Scanner;

public class FormatterTool {
    public enum Alignment {
        LEFT, CENTER, RIGHT,
    }

    private static Alignment currentAlignment;

    public static void main(String[] args) {
        if (args.length < 2 || args.length >= 3) {
            throw new IllegalArgumentException("please provide alignment and output width");
        }
        String alignment;
        int outputWidth;
        try {
            alignment = args[0];
            outputWidth = Integer.parseInt(args[1]);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("please provide valid alignment and output width");
        }
        getInput(alignment, outputWidth, createScanner());
    }

    public static Scanner createScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    private static void getInput(String alignment, int outputWidth, Scanner scanner) {
        currentAlignment = Alignment.valueOf(alignment.toUpperCase());
        System.out.println("Please enter the input string to format :");
        String input = scanner.nextLine();
        inputValidations(currentAlignment, outputWidth, input);
        AlignmentMapper ac = new AlignmentMapper(currentAlignment, outputWidth);
        ac.getAlign(input);
    }

    public static void inputValidations(Alignment alignment, int outputWidth, String input) {
        switch (alignment) {
            case LEFT:
            case CENTER:
            case RIGHT:
                break;
            default:
                throw new IllegalArgumentException("invalid alignment formatter");
        }
        if (outputWidth < 0) {
            throw new IllegalArgumentException("output width must be positive.");
        }
        if (input.length() <= 0) {
            throw new IllegalArgumentException("input length should have at least one character");
        }
    }
}