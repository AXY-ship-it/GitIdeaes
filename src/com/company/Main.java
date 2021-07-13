package com.company;

import java.util.Scanner;

public class Main {
//    public static int result(int n){
//        int i=0,j=0,t=0;
//        for(i=1;i<n;i++){
//            for(j=1;j<n;j++){
//                 t=i*i+j*j;
//                if(n*n==t&j>i){
//                    System.out.println("n="+n+",i="+i+",j="+j);
//                }
//            }
//        }
//        return 1;
//    }
    public static void main(String[] args) {
	// write your code here
        //实现勾股定理
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
////       result(n);
//       Result r=new Result(n);
//       r.result();
        char grade = 'B';
        switch(grade)
        {
            case 'A' :
                System.out.println("优秀");
                break;
            case 'B' :
            case 'C' :
                System.out.println("良好");
                break;
            case 'D' :
                System.out.println("及格");
                break;
            case 'F' :
                System.out.println("你需要再努力努力");
                break;
            default :
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);
    }

    }

class Result{
    public int n;
    Result(){}
    Result(int n){
        this.n=n;
    }
    public int result(){
        int i=0,j=0,t=0;
        for(i=1;i<n;i++){
            for(j=1;j<n;j++){
                t=i*i+j*j;
                if(n*n==t&&j>i){
                    System.out.println("直角三角形的三条边分别为n="+n+",i="+i+",j="+j);
                }

            }
        }
        return 1;
    }

}
