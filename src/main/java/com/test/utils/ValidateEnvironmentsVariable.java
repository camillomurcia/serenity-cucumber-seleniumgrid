package com.test.utils;

import java.util.Objects;

public class ValidateEnvironmentsVariable {

    public static void validateEnvironmentVariable() throws Exception {
        String environment = System.getProperty("environment");
        if (
                !(
                        Objects.equals(environment, "run_local") ||
                        Objects.equals(environment, "run_action_size_mobile") ||
                        Objects.equals(environment, "run_action")
                )
        ) {
            throw new Exception(
                    "No environment variable is defined, you can use the following values: run_local, " +
                            "run_action_size_mobile, run_action"
            );
        }
    }
}
