package com.lab3;

/**
 * Абстрактное представление блюда в меню.
 * Является базовым классом для всех типов блюд.
 */
public class Dish 
{
    /** Название блюда. */
    public String name;
    
    /** Энергетическая ценность блюда в калориях (ккал). */
    public int calories;
    
    /** Флаг, указывающий, является ли блюдо подходящим для веганов. */
    public boolean IsVegan;
    
    /** Стоимость блюда в денежных единицах. */
    public double cost;

    /**
     * Конструктор для создания нового объекта блюда с базовыми параметрами.
     * 
     * @param name     название блюда
     * @param cost     стоимость блюда
     * @param calories калорийность блюда
     * @param IsVegan  метка веганского блюда
     */
    Dish(String name, double cost, int calories, boolean IsVegan)
    {
        this.name = name;
        this.cost = cost;
        this.calories = calories;
        this.IsVegan = IsVegan;
    }

    /**
     * Выводит базовую информацию (название) блюда в консоль.
     */
    void Print()
    {
        System.out.println(name);
    }

    /**
     * Выводит название блюда в консоль, только если переданный флаг равен true.
     * Используется для выборочной печати (например, веганских блюд).
     * 
     * @param f логический флаг-условие для вывода на экран
     */
    void Print(boolean f)
    {
        if(f == true)
        {
            System.out.println(name);
        }
    }
}