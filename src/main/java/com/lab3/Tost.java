package com.lab3;

/**
 * Класс представляет собой блюдо в меню.
 * Наследует базовые свойства и поведение класса {@link Dish}.
 */
class Tost extends Dish 
{
    /**
     * Конструктор для создания объекта тоста. Передает все параметры родительскому классу.
     * 
     * @param name     название тоста
     * @param cost     цена тоста
     * @param calories количество калорий в тосте
     * @param ret      флаг веганского продукта
     */
    Tost(String name, double cost, int calories, boolean ret)
    {
        super(name, cost, calories, ret);
    }
}