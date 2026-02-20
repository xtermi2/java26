[![Java CI](https://github.com/xtermi2/java25/actions/workflows/maven.yml/badge.svg)](https://github.com/xtermi2/java25/actions/workflows/maven.yml)

# Schedule

- 2026/02/19 Final Release Candidate
- 2026/03/17 General Availability

# JDK 26 Features

## [JEP 500: Prepare to Make Final Mean Final](https://openjdk.org/jeps/500)

- Issue warnings about uses of deep reflection to mutate final fields. These warnings aim to prepare developers for a future release that ensures integrity by default by restricting final field mutation, which will make Java programs safer and potentially faster.

## [JEP 504: Remove the Applet API](https://openjdk.org/jeps/504)

- Remove the Applet API, which was deprecated for removal in JDK 17 (2021). It is obsolete because neither recent JDK releases nor current web browsers support applets.

## [JEP 516: Ahead-of-Time Object Caching with Any GC](https://openjdk.org/jeps/516)

- Enhance the ahead-of-time cache, which enables the HotSpot Java Virtual Machine to improve startup and warmup time, so that it can be used with any garbage collector, including the low-latency Z Garbage Collector (ZGC). Achieve this by making it possible to load cached Java objects sequentially into memory from a neutral, GC-agnostic format, rather than map them directly into memory in a GC-specific format.

## [JEP 517: HTTP/3 for the HTTP Client API](https://openjdk.org/jeps/517)

- Update the HTTP Client API to support the HTTP/3 protocol, so that libraries and applications can interact with HTTP/3 servers with minimal code change.
- Update the HTTP Client API to send and receive HTTP/3 requests and responses.
- Require only minor changes to the HTTP Client API and to application code.
- Do not change the default protocol version from HTTP/2 to HTTP/3 but, rather, enable developers to opt-in to HTTP/3.
- see example `Http3Client.java`

## [JEP 522: G1 GC: Improve Throughput by Reducing Synchronization](https://openjdk.org/jeps/522)

- Increase application throughput when using the G1 garbage collector by reducing the amount of synchronization required between application threads and GC threads.

## [JEP 524: PEM Encodings of Cryptographic Objects (Second Preview)](https://openjdk.org/jeps/524)

- Introduce an API for encoding objects that represent cryptographic keys, certificates, and certificate revocation
  lists into the widely-used Privacy-Enhanced Mail (PEM) transport format, and for decoding from that format back into
  objects.
- Support standards — Support conversions between PEM text and cryptographic objects that have standard representations
  in the binary formats PKCS#8 (for private keys), X.509 (public keys, certificates, and certificate revocation lists),
  and PKCS#8 v2.0 (encrypted private keys and asymmetric keys).
- Changes since the first preview in JDK 25:
  - Better PKCS#8 support.
  - Small renamings and API cleanups.
- see example `PEMTest.java`

## [JEP 525: Structured Concurrency (Sixth Preview)](https://openjdk.org/jeps/525)

- Simplify concurrent programming by introducing an API for structured concurrency. Structured concurrency treats
  groups of related tasks running in different threads as a single unit of work, thereby streamlining error handling
  and cancellation, improving reliability, and enhancing observability.
- API changes since last preview in JDK 25:
  - A new method in the Joiner interface, onTimeout(), allows implementations of that interface return a result when a timeout expires.
  - Joiner::allSuccessfulOrThrow() now returns a list of results rather than a stream of subtasks.
  - Joiner::anySuccessfulResultOrThrow() is now named anySuccessfulOrThrow().
  - The static open method that takes a Joiner and a function to modify the default configuration now takes a UnaryOperator instead of a Function.
- see example `StructuredConcurrency.java`

## [JEP 526: Lazy Constants (Second Preview)](https://openjdk.org/jeps/526)

- Introduce an API for lazy constants, which are objects that hold unmodifiable data. Lazy constants are treated as true constants by the JVM, enabling the same performance optimizations that are enabled by declaring a field final. Compared to final fields, however, lazy constants offer greater flexibility as to the timing of their initialization.
- Changes since the first preview in JDK 25:
  - Re-orient the API to focus on high-level use cases, removing the low-level methods orElseSet, setOrThrow, and trySet, leaving only factory methods that take value-computing functions.
  - Rename the API from StableValue to LazyConstant.
  - Enhance discoverability by moving the factory methods for lazy lists and maps into the java.util.List and java.util.Map interfaces, respectively.
  - Further simplify the API by removing the function and intFunction factory methods, which provided only marginal benefits over lazy lists and maps.
  - Disallow null as a computed value in order to improve performance and better align lazy constants with constructs such as unmodifiable collections and ScopedValue.
- see example `LazyConstant.java`

## [JEP 529: Vector API (Eleventh Incubator)](https://openjdk.org/jeps/529)

- TODO

## [JEP 530: Primitive Types in Patterns, instanceof, and switch (Fourth Preview)](https://openjdk.org/jeps/530)

- TODO

----------------------

##### Other References

- https://openjdk.org/projects/jdk/26/ 
