package com.kodilla.stream.beautifier;

public class Poem {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        int a = 5;
        poemBeautifier.beautify("lInk", String::toUpperCase);
        poemBeautifier.beautify("CLASS", String::toLowerCase);
        poemBeautifier.beautify("Next", String::toString);
        poemBeautifier.beautify("Run", myPoem -> "-" + myPoem + "=");
        poemBeautifier.beautify("Build", myPoem -> myPoem + 2 * a);






    }
}
