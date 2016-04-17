package com.logzog.vertx.retry;

import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.Message;
import rx.Observable;

/**
 * The RetryingEventBus is a wrapper around the eventbus providing the send operation only. See the send method
 * javadoc for details on how the retry works.
 */
public class RetryingEventBus {
    private final EventBus eventBus;

    /**
     * Create a new instance of RetryingEventBus
     * @param eventBus
     */
    public RetryingEventBus(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    /**
     *
     * Send a Vert.x event bus message with retry support. Note that you should only use
     * this if your service is able to handle idempotent calls (repeats or redundant calls).
     *
     * @param address The eventbus address to send the payload to.
     * @param payload The actual payload to send.
     * @param retryTimeout The timeout period before a retry is performed. As soon as a retry is attempted, if any
     *                     async response comes back from the last attempt, it will be ignored.
     *
     * @param retryMax The maximum number of retries to attempt. The minimum number is 0 (anything less than 0
     *                 will mean 0 retries). The maximum number of retries is 5.
     * @param timeoutAfterLastRetry After the last retry, the process can wait a different length of time.
     * @param retryFailures This flag determines what is retry-able. If set to true, then the service will be retried
     *                      even after a failure is returned. If this is set to false, then no retry will occur if the
     *                      result is a failure.
     * @param <T> The eventbus compatible message payload type.
     * @return An observable that will either receive the response or error.
     */
    public <T> Observable<Message<T>> send(
            final String address,
            final Message<T> payload,
            final long retryTimeout,
            final int retryMax,
            final long timeoutAfterLastRetry,
            final boolean retryFailures) {



        return null;
    }

    /**
     * This method is equivalent to the following:
     * <pre>return send(address, payload, retryTimeout, 2, retryTimeout, false);</pre>
     * @see #send(String, Message, long, int, long, boolean)
     * @param address The eventbus address to send the payload to.
     * @param payload The actual payload to send.
     * @param retryTimeout The timeout period before a retry is performed. As soon as a retry is attempted, if any
     *                     async response comes back from the last attempt, it will be ignored.
     * @param <T> The eventbus compatible message payload type.
     * @return An observable that will either receive the response or error.
     */
    public <T> Observable<Message<T>> send2(
            final String address,
            final Message<T> payload,
            final long retryTimeout) {
        return send(address, payload, retryTimeout, 2, retryTimeout, false);
    }
}
