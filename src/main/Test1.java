//自动售货机
package main;

import java.util.Scanner;
public class Test1 {
    int price = 80;
    int balance; //未初始化成员变量时，给成员变量默认0值
    int total;
    Test1()//构造函数
    {
        total = 0;
    }
    Test1(int price)
    {
        this.price = price; //重载
    }
    void showPrompt()//
    {
        System.out.println("Welcome");
    }
    void insertMoney(int amount)
    {
        balance = balance + amount;
    }
    void showBalance()
    {
        System.out.println(balance);
    }
    void getFood()
    {
        if ( balance >= price){
            System.out.println("Here you are");
            balance  = balance - price ;
            total = total + price;
        }
    }
    public static void main(String[] args){
        Test1 vm = new Test1(); //用new的方式制造对象
                                //设计了一个类Test1，用这个类制造出对象vm
        vm.showPrompt();
        vm.showBalance();
        vm.insertMoney(100);
        vm.getFood();
        Test1 vm1 = new Test1(); //vm和vm1管理的是不同的对象
        vm1.insertMoney(200);
        vm.showBalance();
        vm1.showBalance();




    }
}
