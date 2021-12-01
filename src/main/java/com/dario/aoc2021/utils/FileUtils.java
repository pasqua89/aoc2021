package com.dario.aoc2021.utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileUtils {
    public static List<String> read(String path) throws URISyntaxException, IOException {
        final URL resource = FileUtils.class.getClassLoader().getResource(path);
        return Files.readAllLines(Paths.get(resource.toURI()));
    }
}
