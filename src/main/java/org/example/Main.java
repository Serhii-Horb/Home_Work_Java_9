package org.example;

public class Main {
      /*Реализовать простую лотерею, используя конструкцию if-else-if:
Создать класс для лотереи
В методе main() реализовать лотерею
Добавить переменные для выигрышных номеров (5 номеров)
Добавить переменные для номеров пользователя
Получить от пользователя 5 номеров, используем Сканер
Ограничить игровые номера от 1 до 50
Рандомально присвоить в переменные выигрышные номера
Распечатать на консоль номера лотереи и номера введенные пользователем */


    /*Увеличьте одновременное количество игроков до трех.
Три игрока вводят номера для игры.
Лотерея играет один раз.*/

    public static void main(String[] args) {
        Lottery.startLottery();
    }
}