package com.dario.aoc2021.day1;

import com.dario.aoc2021.utils.FileUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

public class Problem1 {
    public static void main(String[] args) throws IOException, URISyntaxException {
        final List<Integer> ints = FileUtils.read("day1/input.txt").stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int cont = 0;
        int prev = Integer.MAX_VALUE;

        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) > prev) {
                cont++;
            }
            prev = ints.get(i);
        }
        System.out.println(cont);
    }
}