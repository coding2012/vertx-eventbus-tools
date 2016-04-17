# vertx-idempotent-retry

Vert.x Idempotent Retry library is a simple Vert.x Event Bus enhancement that wraps the standard Event
Bus API with a small set of additional parameters or methods that provide enhanced retry semantics.

This is useful only for eventbus services that can safely be retried, in other words the eventbus
services that can be used with this library.

From the Vert.x manual:

> Best-effort delivery
>
> Vert.x does it’s best to deliver messages and won’t consciously throw them away. This is called best-effort delivery.
>
> However, in case of failure of all or parts of the event bus, there is a possibility messages will be lost.
>
> If your application cares about lost messages, you should code your handlers to be idempotent, and your senders to retry after recovery.

This library is designed to fill that small niche spot when sending eventbus messages to have an additional
API to support retry logic. The actual implementation of this library is supported only on the sending side.

