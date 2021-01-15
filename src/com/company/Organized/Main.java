package com.company.Organized;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        NumberComparison nc = new NumberComparison();
        nc.multiple();

        Basket basket = new Basket("dress", "colour od the dress is white", 30);
        Basket basket1 = new Basket("Shoe", " the colour od the shoe is black", 50);
        Basket basket2 = new Basket("bag", " the size of the bag is medium", 120);
        Basket basket3 = new Basket("bottle", "will use it to fill water", 8);
        System.out.println(basket.toString() + basket1.toString() + basket2.toString() + basket3.toString());


        int sum = basket.productCost + basket1.productCost + basket2.productCost + basket3.productCost;
        System.out.println("Total Cost is  £" + sum);

        Wallet amount = new Wallet(500);
        System.out.println("Total amount in my Wallet is: " + amount.getWalletMoney());
        int remainingBalanceInWallet = amount.walletMoney - sum;
        System.out.println("Reamining balance £" + remainingBalanceInWallet);

        Scanner multiplication = new Scanner(System.in);
        System.out.println("Enter a number:");
        MultiplicationTable table = new MultiplicationTable(10);
        int number = multiplication.nextInt();
        for (int i = 1; i <= table.num; i++) {
            System.out.println(number + "X" + i + "=" + number * i);
        }

                }
    }





