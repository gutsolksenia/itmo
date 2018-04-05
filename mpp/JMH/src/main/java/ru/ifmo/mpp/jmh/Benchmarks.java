package ru.ifmo.mpp.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

/**
 * Created by ksenia on 02.10.16.
 */
public class Benchmarks {
    @State(Scope.Thread)
    public static class Threads {
        public int threadCount = 1;
    }

    @Benchmark
    public static int incThreadCount(Threads t) {
        return t.threadCount++;
    }

    public static void main(String[] args) throws RunnerException, IOException {
        for (int i = 7; i < 11; i++) {
            Options options = new OptionsBuilder().
                                  warmupIterations(5).
                                  measurementIterations(5).
                                  threads(i).
                                  resultFormat(ResultFormatType.CSV).
                                  timeUnit(TimeUnit.NANOSECONDS).
                                  build();
            new Runner(options).run();
            Path source = Paths.get("jmh-result.csv");
            Path target = Paths.get(String.format("result%d.csv", i));
            Files.move(source, target);
        }
    }
}
