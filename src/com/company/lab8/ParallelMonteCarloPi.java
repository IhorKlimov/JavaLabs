package com.company.lab8;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class ParallelMonteCarloPi {
    private static final int NUM_OF_ITERATIONS = 1_000_000_000;
    private final Random random = new Random();
    private final int threadCount;
    private final AtomicLong iterationsRun = new AtomicLong(0);
    private final AtomicLong foundNeededPoints = new AtomicLong(0);
    private final ExecutorService threadPool;

    public ParallelMonteCarloPi(int threadCount) {
        this.threadCount = threadCount;
        threadPool = Executors.newFixedThreadPool(threadCount);
    }

    public void execute() {
        long start = System.currentTimeMillis();

        Runnable task = () -> {
            while (true) {
                if (isNeededPoint(random.nextDouble(), random.nextDouble())) {
                    foundNeededPoints.incrementAndGet();
                }
                long iterations = iterationsRun.incrementAndGet();
                if (iterations == NUM_OF_ITERATIONS) {
                    double pi = ((double) foundNeededPoints.get() / NUM_OF_ITERATIONS) * 4;
                    long end = System.currentTimeMillis();

                    System.out.println("PI is " + pi);
                    System.out.println("THREADS " + threadCount);
                    System.out.println("ITERATIONS " + NUM_OF_ITERATIONS);
                    System.out.println("TIME " + (end - start) + "ms");
                    return;
                } else if (iterations > NUM_OF_ITERATIONS) {
                    return;
                }
            }
        };

        for (int i = 0; i <= threadCount; i++) {
            threadPool.execute(task);
        }

        threadPool.shutdown();
    }

    private boolean isNeededPoint(double x, double y) {
        return calculateDistanceToOrigin(x, y) <= 1d;
    }

    private double calculateDistanceToOrigin(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }
}
