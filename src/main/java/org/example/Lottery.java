package org.example;

import java.util.Scanner;

import static org.example.Util.*;

public class Lottery {
    public static void startLottery() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество игроков: ");
        int playerCounter = sc.nextInt();

        Integer[] winNums = createWinData();
        Integer[] winArrey;

        for (int i = 0; i < playerCounter; i++) {
            Integer[] userNums = inputUserData();
            winArrey = winNums;
            printResult(userNums, winArrey);
        }
    }
}
