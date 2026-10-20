package com.lab3;

/**
 * Главный класс приложения.
 * Служит точкой входа в программу, демонстрирует создание меню,
 * его наполнение тостами и напитками, а также выполнение расчетных методов.
 */
public class Main {
    
    /**
     * Главный метод программы (точка входа).
     */
    public static void main(String[] args) 
    {
        Menu menu = new Menu();
        
        // Наполнение меню демонстрационными объектами тостов
        menu.add(new Tost("Рыба под соусом жульен", 200, 325, false));
        menu.add(new Tost("Салат крабовый", 200, 250, true));
        menu.add(new Tost("Стейк рибай", 500, 400, false));
        menu.add(new Tost("Пицца пеперони", 450, 700, false));
        menu.add(new Tost("Рататуй", 200, 200, true));
        menu.add(new Tost("Крем-суп",250,400,true));
        
        // Наполнение меню демонстрационными объектами напитков
        menu.add(new Drink("Вода с лимоном", 50, 5, true)); 
        menu.add(new Drink("Эспрессо", 120, 10, true));
        menu.add(new Drink("Апельсиновый фреш", 250, 110, true));
        menu.add(new Drink("Капучино на овсяном", 220, 140, true));
        menu.add(new Drink("Кокосовый Раф", 310, 360, true));
        menu.add(new Drink("Арахисовый милкшейк", 380, 490, true));
        
        // Демонстрация работы методов вывода и расчетов
        menu.PrintAllMenu();
        menu.PrintAllVegan();
        
        System.out.println("--- Средняя стоимость блюд с калорийностью больше чем 300 ---");
        System.out.println(menu.MoreThan300());
    }
}