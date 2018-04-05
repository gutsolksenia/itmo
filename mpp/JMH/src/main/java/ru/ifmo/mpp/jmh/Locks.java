package ru.ifmo.mpp.jmh;

/**
 * Created by ksenia on 27.09.16.
 */
import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks {
    @State(Scope.Benchmark)
    public static class StateSyncronizedBenchmark {
        long sharedVar;
    }

    @Benchmark
    @Group("syncronizedBenchmark")
    public void writer(StateSyncronizedBenchmark s) {
        synchronized (s) {
            s.sharedVar++;
        }
    }

    @State(Scope.Benchmark)
    public static class StateVolatileBenchmark {
        volatile long sharedVar;
    }

    @Benchmark
    @Group("volatileBenchmark")
    public void writer (Volatile.StateVolatileBenchmark s) {
        s.sharedVar++;
    }

    @State(Scope.Benchmark)
    public static class StateLockBenchmark {
        public long sharedVar;
        public Lock lock = new ReentrantLock();
    }

    @Benchmark
    @Group("lockBenchmark")
    public void writer(StateLockBenchmark s) {
        s.lock.lock();
        s.sharedVar++;
        s.lock.unlock();
    }

    @State(Scope.Thread)
    public static class StateSyncronizedThread {
        long sharedVar;
    }

    @Benchmark
    @Group("syncronizedThread")
    public void writer(StateSyncronizedThread s) {
        synchronized (s) {
            s.sharedVar++;
        }
    }

    @State(Scope.Thread)
    public static class StateVolatileThread {
        volatile long sharedVar;
    }

    @Benchmark
    @Group("volatileThread")
    public void writer (StateVolatileThread s) {
        s.sharedVar++;
    }

    @State(Scope.Thread)
    public static class StateLockThread {
        public long sharedVar;
        public Lock lock = new ReentrantLock();
    }

    @Benchmark
    @Group("lockThreads")
    public void writer(StateLockThread s) {
        s.lock.lock();
        s.sharedVar++;
        s.lock.unlock();
    }
}
