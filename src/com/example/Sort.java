package com.example;

import java.util.Arrays;

//비교할꺼면 Product.java 가서 클래스를 implement해줘야한다 
public class Sort {
   private Product[] array;
   
   public Sort(Product[] array) {
      this.array=array;
   }
   
   public void sort() {
      Arrays.sort(this.array);
   }
      
}