package com.dario.aoc2021.day2;

import com.dario.aoc2021.utils.FileUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

public class Problem1 {
    public static void main(String[] args) throws IOException, URISyntaxException {
        final List<String> ints = FileUtils.read("day2/input.txt");

        int hor = 0;
        int depth = 0;

        for (String input: ints) {
            String direction = input.split(" ")[0];
            int amount = Integer.parseInt(input.split(" ")[1]);
            switch (direction) {
                case "forward":
                    hor+= amount;
                    break;
                case "up":
                    depth-=amount;
                    break;
                case "down":
                    depth+=amount;
                    break;
            }
        }
        System.out.println(depth * hor);
    }
}
