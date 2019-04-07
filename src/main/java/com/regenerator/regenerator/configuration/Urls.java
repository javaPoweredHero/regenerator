package com.regenerator.regenerator.configuration;



public interface Urls {
    String ROOT = "api/" + ApiVersion.VALUE;

    interface FileInputController {
        String PART = "input";
        String FULL = ROOT + "/" + PART;

        interface CreateTask {
            String PART = "create";
        }
    }
}
