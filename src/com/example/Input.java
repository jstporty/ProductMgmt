package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
   private Product [] array;
   private File file;
   private Scanner sc;
   
   public Input(Product [] array) {  //constructor : 멤버변수 초기화
      this.array = array;
      this.file = new File("./productdata.txt");
      try {
         this.sc = new Scanner(this.file);
      } catch (FileNotFoundException e) {
         System.out.println("File Not Found");
         return;
      
      }
   }
   public void fileInput() {
      int count =0;
      while(this.sc.hasNextLine()) {
         String line = this.sc.nextLine();  //한줄로 읽기
         //System.out.println(line); //NOTEBOOK 36000   5000  4700   2000
         /*
          * String class split
          * Scanner class
          * StringTokenizer class
          */
         Scanner myscan = new Scanner(line).useDelimiter("\\s+"); //스페이스 기준으로 자르기
         String name = myscan.next(); //상품명
         int su = myscan.nextInt(); // 수량
         int selprice = myscan.nextInt(); //판매단가
         int buyprice = myscan.nextInt(); //매입단가
         int transport = myscan.nextInt(); //운송료
         System.out.println(transport);
         Product p = new Product(name, su, selprice, buyprice, transport);
         this.array[count] =p;
         count++;
         
      }
   }
}