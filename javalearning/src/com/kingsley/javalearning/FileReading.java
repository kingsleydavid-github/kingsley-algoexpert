package com.kingsley.javalearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FileReading {

    public static void main(String[] args) {
        String filepath = "F://Career//Coding//kingsley-algoexpert//javalearning//abc.csv";
        Map<String, Long> values;
        try(BufferedReader br = Files.newBufferedReader(Path.of(filepath))) {
            String firstLine = br.readLine();
            System.out.println(firstLine);
            values = br.lines().map(line -> line.split(",")[3])
                            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            System.out.println(values);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
