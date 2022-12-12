package com.driver;

public class Main {
   public static class Product
   {
       public int product (int x,int y)
       {return x*y;}


       public int product(int x,int y,int z){
           return x*y*z;
       }

       public double product(double x,double y){
           return x*y;
       }
   }
   public static void main(String[] args){
       Product p=new Product();
       System.out.print(p.product(1,2));
       System.out.print(p.product(1,2,3));
       System.out.print(p.product(1.1,2.2));
   }
}