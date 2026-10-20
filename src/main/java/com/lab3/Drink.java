package com.lab3;

/**
 * Класс представляет собой напиток в меню.
 * Наследует базовые свойства и поведение класса {@link Dish}.
 */
class Drink extends Dish 
{
    /**
     * Конструктор для создания объекта напитка. Передает все параметры родительскому классу.
     * 
     * @param name     название напитка
     * @param cost     цена напитка
     * @param calories количество калорий в напитке
     * @param ret      флаг веганского продукта
     */
    Drink(String name, double cost, int calories, boolean ret) 
    {
        super(name, cost, calories, ret);
    }
}