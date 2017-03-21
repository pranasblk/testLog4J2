Error produced by ```./gradlew testLog*:```

```
ERROR StatusLogger Unable to create custom ContextSelector. Falling back to default.
 java.lang.InstantiationException: org.apache.logging.log4j.core.async.AsyncLoggerContext
        at java.lang.Class.newInstance(Class.java:427)
        at org.apache.logging.log4j.util.LoaderUtil.newInstanceOf(LoaderUtil.java:161)
        at org.apache.logging.log4j.util.LoaderUtil.newInstanceOf(LoaderUtil.java:180)
        at org.apache.logging.log4j.util.LoaderUtil.newCheckedInstanceOf(LoaderUtil.java:201)
        at org.apache.logging.log4j.util.LoaderUtil.newCheckedInstanceOfProperty(LoaderUtil.java:226)
        at org.apache.logging.log4j.core.impl.Log4jContextFactory.createContextSelector(Log4jContextFactory.java:97)
        at org.apache.logging.log4j.core.impl.Log4jContextFactory.<init>(Log4jContextFactory.java:58)
        at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
        at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
        at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
        at java.lang.reflect.Constructor.newInstance(Constructor.java:422)
        at java.lang.Class.newInstance(Class.java:442)
        at org.apache.logging.log4j.LogManager.<clinit>(LogManager.java:94)
        at org.apache.logging.log4j.spi.AbstractLoggerAdapter.getContext(AbstractLoggerAdapter.java:122)
        at org.apache.logging.slf4j.Log4jLoggerFactory.getContext(Log4jLoggerFactory.java:43)
        at org.apache.logging.log4j.spi.AbstractLoggerAdapter.getLogger(AbstractLoggerAdapter.java:46)
        at org.apache.logging.slf4j.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:29)
        at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:358)
        at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:383)
        at net.orangecap.TestLog.log(TestLog.java:8)
        at net.orangecap.TestLog.main(TestLog.java:15)
Caused by: java.lang.NoSuchMethodException: org.apache.logging.log4j.core.async.AsyncLoggerContext.<init>()
        at java.lang.Class.getConstructor0(Class.java:3082)
        at java.lang.Class.newInstance(Class.java:412)
        ... 20 more
15:25:21.383 2526387676059343 [main] INFO  n.o.TestLog - Hello log4j Async
:testLog (Thread[Daemon worker Thread 3,5,main]) completed. Took 0.475 secs.
```
