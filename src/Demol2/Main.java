package Demol2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Input input = new Input();
        input.input("E:\\WorkSpace\\Java\\Idea\\KWIC\\Txt\\input.txt");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("E:\\WorkSpace\\Java\\Idea\\KWIC\\Txt\\output.txt");
    }
}
