package com.java._12streams;

// To process the objects of the collection , Streams concept introduced.

// What is the difference between util.streams and io.streams ?
// util.streams meant for processing objects from the collection i.e it represents a stream of objects from the collection, but io.streams meant for processing binary data 
// with respect to file  i.e it represents a stream of binary data from the file.

// What is the difference between collection and streams ?
// 1) If we want to represent group of individual objects as a single entity then we should go for collection.
// 2) If we want to process group of objects from collection then we should go for streams.
// 3) We can create stream object to the collection by using stream() method of collection interface.
// Stream s = collection.strream();

// We can process the objects in the following 2 phases
// 1) Configuration 2) Processing

// 1) Configuration : We can configure either by using filter mechanism or by using map mechanism.

// Filtering : To filter elements from the collection based on some boolean conditions by using filter() of stream interface.
// public Stream filter(Predicate<T> t)
// example : Stream s = c.stream;
// 			 Stream s1 = s.filter(i-> i%2==0);

// Mapping : If we want to create a separate new object, for every object present in the collection based on our requirement then we should go for map() of Stream interface.
// public Stream map(Function<R,T> f)
// example : Stream s = c.stream;
//			 Stream s1 = s.map(i-> i+10);

// 2) Processing : We can process objects by using several methods.
//                 collect(), count(), sorted(), min(), max(), forEach(), toArray(), Stream.of()

public class _00Introduction {

}
