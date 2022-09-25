package by.ihnat.mikhalkovich.challenge.task1;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

public class Benchmarking {

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void doExecution() {
        final String solution = Solution.solution(10000);
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }
}
