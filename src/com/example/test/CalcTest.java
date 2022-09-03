package com.example.test;

import org.junit.Before;
import org.junit.Test;

import com.example.Calc;
import com.example.Input;
import com.example.Product;

public class CalcTest {

	@Before
	public void init(){
		
		
	}
	@Test
	public void test() {
		Product[] array= new Product[7];
		Input input = new Input(array);
		input.fileInput(); //7개의 제품 모두 배열처리 끝
		Calc calc = new Calc(array);
		calc.calc();
	}

}
