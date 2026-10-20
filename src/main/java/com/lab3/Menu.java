package com.lab3;
import java.util.List;
import java.util.ArrayList;

/**
 * Класс представляет собой меню ресторана, управляющее коллекцией блюд.
 * Обеспечивает функции добавления, фильтрации и расчета статистических данных.
 */
public class Menu 
{
    /** Список всех блюд, содержащихся в меню. */
    List<Dish> point = new ArrayList<>();

    /**
     * Добавляет новое блюдо в меню.
     * 
     * @param d объект блюда (напиток или тост) для добавления
     */
    public void add(Dish d)
    {
        point.add(d);
    }

    /**
     * Выводит в консоль названия абсолютно всех блюд, присутствующих в меню.
     */
    public void PrintAllMenu()
    {
        System.out.println("--- Меню ---");
        for(Dish s:point)
        {
            s.Print();
        }
    }

    /**
     * Фильтрует меню и выводит в консоль названия только тех блюд,
     * у которых установлена метка вегетарианской кухни (IsVegan = true).
     */
    public void PrintAllVegan()
    {
        System.out.println("--- Веганские блюда ---");
        for(Dish s:point)
        {
            s.Print(s.IsVegan);
        }
    }

    /**
     * Подсчитывает среднюю стоимость среди всех блюд, 
     * калорийность которых строго превышает 300 ккал.
     * 
     * @return средняя стоимость высококалорийных блюд
     */
    public double MoreThan300()
    {
        double averagecost = 0;
        int k = 0;
        for(Dish s:point)
        {
            if(s.calories > 300)
            {
                averagecost += s.cost;
                k++;
            }
        }
        return Math.round(averagecost/k);
    }
}
