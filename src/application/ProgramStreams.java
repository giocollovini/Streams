package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramStreams {

	public static void main(String[] args) {

		System.out.println();
		System.out.println("===========STREAMS===============================================");
		System.out.println();
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>Monta uma Lista de Inteiros>>>>>>>>>>>>>>>>>>>");
		System.out.println();
		//Monta uma Lista de Inteiros
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		Stream<Integer> st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray()));
		
		System.out.println();
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>Monta uma Lista de String>>>>>>>>>>>>>>>>>>>");
		System.out.println();
		//Monta uma Lista de String
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		System.out.println();
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>Monta Lista com números de 2 em 2>>>>>>>>>>>>>>>>>>>");
		System.out.println();
		//Monta Lista com números de 2 em 2
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		System.out.println();
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>Gera sequencia de FIBONACCI>>>>>>>>>>>>>>>>>>>");
		System.out.println();
		//Gera sequencia de FIBONACCI
		Stream<Long> st4 = Stream.iterate(new long[] { 0L, 1L }, p -> new long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));

		System.out.println();
		System.out.println();
		System.out.println(">>>>>>>>>>>Pega a lista e multiplica cada elemento por 10>>>>>>>>>>>>>>>");
		System.out.println();
		//Pega a lista e multiplica cada elemento por 10
		Stream<Integer> st5 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st5.toArray()));
	
		System.out.println();
		System.out.println();
		System.out.println(">>>>>>>>>>>Pega a lista e faz um somatorio de seus valores>>>>>>>>>>>>>>>");
		System.out.println();
		//Pega a lista e faz um somatorio de seus valores
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum = " + sum);
	
		System.out.println();
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>Pipiline na Lista>>>>>>>>>>>>>>>>>>>");
		System.out.println();
		//Pipiline na Lista
		List<Integer> newList = list.stream()
		.filter(x -> x % 2 == 0) //separa somente os valores pares
		.map(x -> x * 10) //multiplica os valores por 10
		.collect(Collectors.toList()); //transforma o Stream em lista novamente
		System.out.println(Arrays.toString(newList.toArray()));
		
	}

}
