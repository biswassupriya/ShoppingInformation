package com.company.Organized;

public class NumberComparison {
    int num1;


    public void multiple(){
        for(int a =1; a<= 100; a++){
            if(a % 3 ==0 && a % 7 == 0){
                System.out.println("#*");
            }
            else if( a % 3 == 0){
                System.out.println("*");
            }
            else if(a % 7==0){
                System.out.println("#");
            }
            else{
                System.out.println(a);
            }
        }
    }
}
