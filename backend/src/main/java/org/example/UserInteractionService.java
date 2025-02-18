package org.example;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Service;

@Service
public class UserInteractionService {
//    private final MeterRegistry meterRegistry;

    private final Counter enrollCounter;
    private final Counter payCounter;

//    public UserInteractionService(MeterRegistry meterRegistry) {
//        this.meterRegistry = meterRegistry;
//    }

    public UserInteractionService(MeterRegistry meterRegistry) {
        this.enrollCounter = Counter.builder("user_events_total")
                .description("Total number of enroll events")
                .tag("event", "enroll")
                .register(meterRegistry);

        this.payCounter = Counter.builder("user_events_total")
                .description("Total number of pay events")
                .tag("event", "pay")
                .register(meterRegistry);
    }



    public void enrollNowClicked() {
        // Increment the custom enroll event counter
       // meterRegistry.counter("app.user.enroll.click").increment();

        enrollCounter.increment();
    }

    public void payNowClicked() {
        // Increment the custom pay event counter
//        meterRegistry.counter("app.user.pay.click").increment();

        payCounter.increment();
    }
}
