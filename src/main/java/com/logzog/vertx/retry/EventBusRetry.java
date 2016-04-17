package com.logzog.vertx.retry;

import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.Message;
import io.vertx.core.eventbus.impl.EventBusImpl;
import io.vertx.core.impl.VertxInternal;
import rx.Observable;

/**
 * Created by Ravi Luthra on 4/16/16.
 */
public class EventBusRetry {
    private final EventBus eventBus;

    /**
     * Create a new instance of EventBusRetry
     * @param eventBus
     */
    public EventBusRetry(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    /**
     * Send a Vert.x event bus message with retry support. Note that you should only use
     * this if your service is able to handle idempotent calls (repeats or redundant calls).
     * @param address The eventbus address to send the payload to.
     * @param payload The actual payload to send.
     * @param retryTimeout
     * @param retryMax
     * @param retryFailures
     * @param <T>
     * @return
     */
    public <T> Observable<io.vertx.rxjava.core.eventbus.Message<T>> send(
            final String address,
            final Message<T> payload,

            final long retryTimeout,
            final int retryMax,
            final boolean retryFailures) {

eventBus.s
        return null;
    }

}
