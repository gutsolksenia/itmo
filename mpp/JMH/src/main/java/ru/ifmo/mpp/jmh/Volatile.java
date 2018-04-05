package ru.ifmo.mpp.jmh;

/**
 * Created by ksenia on 25.09.16.
 */
import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;


public class Volatile {
    @State(Scope.Thread)
    public static class StateBaselineThread {
        long sharedVar;
    }

    @Benchmark
    @Group("baselineThread")
    public long reader(StateBaselineThread s) { return s.sharedVar;}

    @Benchmark
    @Group("baselineThread")
    public void writer(StateBaselineThread s) { s.sharedVar++;}


    @State(Scope.Thread)
    public static class StateVolatileThread {
        volatile long sharedVar;
    }

    @Benchmark
    @Group("volatileThread")
    public long reader(StateVolatileThread s) { return s.sharedVar;}

    @Benchmark
    @Group("volatileThread")
    public void writer(StateVolatileThread s) { s.sharedVar++;}


   @State(Scope.Benchmark)
    public static class StateBaselineBenchmark {
        long sharedVar;
    }

    @Benchmark
    @Group("baselineBenchmark")
    public long reader(StateBaselineBenchmark s) { return s.sharedVar;}

    @Benchmark
    @Group("baselineBenchmark")
    public void writer(StateBaselineBenchmark s) { s.sharedVar++;}

    @State(Scope.Benchmark)
    public static class StateVolatileBenchmark {
        long sharedVar;
    }

    @Benchmark
    @Group("volatileBenchmark")
    public long reader(StateVolatileBenchmark s) { return s.sharedVar;}

    @Benchmark
    @Group("volatileBenchmark")
    public void writer(StateVolatileBenchmark s) { s.sharedVar++;}
}
