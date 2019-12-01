import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import aoptest.AddNumStr;

public class MainClass {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();

		String outStr ="私はアウター";

		set.add("name");
		set.add("age");
		set.add("femal");
		if(!set.add("age")) {
			System.out.println("登録済み");
		}


		System.out.println(set);

		Iterator<String> ite = set.iterator();

		while(ite.hasNext()) {
			map.put(ite.next(),"己");
		}

		Queue queue = new LinkedList<String>();

		queue.offer("(a)");
		queue.offer("(b)");
		queue.offer("(c)");
		queue.offer("(d)");

		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}



		System.out.println(map.values());
		System.out.println(set.contains("name"));

		AddNumStr ans = new AddNumStr();
		ans.InnerExecute();


		//ラムダ式
		String stst = "feel";

		Function<String,String> aster = (s) -> {return "それは"+ stst; };
		System.out.println(aster.apply(stst));


		BiFunction<Integer,Integer,String> bi = (i,n) -> {return i + "から始まり" + n +"で終わる"; };
		System.out.println(bi.apply(1, 100));


		Consumer<String> cons = (goods) -> {System.out.println(goods+"を購入します"); };
		cons.accept(stst);


		Predicate<String> pre = (s) -> {return s.equals("Java"); };
		System.out.println(pre.test("Java"));


		Function<Integer,String> fun1 = (i) -> {return i +"は永遠"; };
		System.out.println(fun1.apply(3) );

		Consumer<String> cons2 = (s) -> {System.out.println(s+"だと!?"); };
		cons2.accept("形見");


		int[] numbers = {-1, 2, 0, -3, 8};

		List<Integer> numbersList = new ArrayList<>();

		for(int n : numbers) {
		  numbersList.add(n);
		}

		numbersList.stream().forEach((i) -> {System.out.println("number:"+i); });

		numbersList.stream().filter((i) -> {return i>0;} )
			.forEach((i) -> {System.out.println("filterNumber:"+i); });

		numbersList.stream().filter((i) -> {return i>0; } )
			.sorted((i1,i2) -> {return i1 - i2; })
			.map((i) ->{return i+"はいいぞ"; } )
			.forEach((s) -> {System.out.println(s); });



		Predicate<String> pre3 = (s) -> {return s.equals("timing"); };
		System.out.println( pre3.test("timing") );



	}






}
