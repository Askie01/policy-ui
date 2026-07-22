package org.askiesolutions.policyui;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PolicyUiApplication {
    static void main(String[] args) {
        SpringApplication.run(PolicyUiApplication.class, args);
    }
}
