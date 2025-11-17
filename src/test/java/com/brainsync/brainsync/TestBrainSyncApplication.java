package com.brainsync.brainsync;

import org.springframework.boot.SpringApplication;

public class TestBrainSyncApplication {

    public static void main(String[] args) {
        SpringApplication.from(BrainSyncApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
