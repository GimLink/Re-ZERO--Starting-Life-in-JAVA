package ch14;

import java.util.function.*;
import java.util.*;

public class LambdaEx6 {

	public static void main(String[] args) {
		IntSupplier s = ()->(int)(Math.random()*100)+1; //매개변수 없고 반환값
		IntConsumer c = i->System.out.print(i +", "); //매개변수만 있고 반환값 없
		IntPredicate p = i->i%2==0; //매개변수 하나 반환은 boolean
		IntUnaryOperator op = i->i/10*10; //i일의 자리 없애기
		
		int[] arr = new int[10];
		
		makeRandomList(s, arr);
		System.out.println(Arrays.toString(arr));
		printEvenNum(p, c, arr);
		int[] newArr = doSomething(op, arr);
		System.out.println(Arrays.toString(newArr));
		
		
	}
	
	static void makeRandomList(IntSupplier s, int[] arr) {
		for(int i=0; i<10; i++) {
			arr[i] = s.getAsInt();
		}
	}
	
	static void printEvenNum(IntPredicate p, IntConsumer c, int[] arr) {
		System.out.print("[");
		for(int i: arr) {
			if(p.test(i))
			c.accept(i);
		}
		System.out.println("]");
	}
	
	static int[] doSomething(IntUnaryOperator op, int[] arr) {
		int[] newArr = new int[arr.length];
		
		for(int i=0; i<newArr.length; i++) {
			newArr[i] = op.applyAsInt(arr[i]);
		}
		
		return newArr;
	}

}
