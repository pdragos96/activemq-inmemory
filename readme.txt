To run the app, just build it and run the 'ActivemqInmemoryApplication' class.

For now, the application sends messages by using a queue system, which means that once received by a consumer,
the message dissapears from the queue and after the first consumer receives a timestamp, the second one receives another timestamp
set one second later and then the first consumer receives a timestamp which is set another second later and so on.

For the next commit, I will change the application to use topics instead of queues, where as many consumers as possible can subscribe
to receive the same message emmited by the sender.
