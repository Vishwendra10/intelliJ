package com.training.jdk8assg11;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Item> l1=new ArrayList<>();
		Item i1= new Item(01, "pen", LocalDateTime.of(2017,01,13,11,11), LocalDateTime.of(2017,02,13,11,11), 100);
		Item i2= new Item(01, "pen", LocalDateTime.of(2018,01,13,11,11), LocalDateTime.of(2018,02,13,11,11), 200);
		Item i3= new Item(01, "pen", LocalDateTime.of(2019,01,13,11,11), LocalDateTime.of(2019,02,13,11,11), 200);
		Item i4= new Item(01, "pen", LocalDateTime.of(2020,01,13,11,11), LocalDateTime.of(2020,02,13,11,11), 300);
		
		l1.add(i1);
		l1.add(i2);
		l1.add(i3);
		l1.add(i4);
		
		double avg= l1.stream().mapToInt(a->(int)a.getPrice()).average().orElse(0);
		System.out.println(avg);
		
		Optional<Item> max1=l1.stream().max(Comparator.comparing(Item::getPrice));
		System.out.println(max1);
		
		Optional<Item> min1=l1.stream().min(Comparator.comparing(Item::getPrice));
		System.out.println(min1);
		
		System.out.println();
		List<Item> list2=l1.stream().filter(distinctByKey(p->p.getPrice())).collect(Collectors.toList());
		System.out.println(list2);
	}

	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
		// TODO Auto-generated method stub
		Map<Object, Boolean> map = new ConcurrentHashMap<>();
		  return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}

}
