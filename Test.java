/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import static sun.util.calendar.CalendarUtils.mod;


public class Test{
    
    public static void main(String[] args) {
        int start = 100;
        int quantity = 0;
        start = mod(102, 10);
        for (int i = 100; i<999; i++)
        {
            int[] mas = metodMod(i); // Выделяем цифры из числа
            int[] mas2 = bubbleSorter(mas); // располагаем их в порядке возрастания
            if (mas2[0] + 3 <= mas2[1] && mas2[1] + 3 <= mas2[2]) // Проверяем что бы следущее числа в массиве было больше на 3
            {
                quantity++;
                System.out.println(i);
            }
        }            
    }
    
    private static int[] metodMod(int count)
    {
        int[] mas = new int[3];
        mas[0] = mod(count, 10);
        count = count / 10;
        mas[1] = mod(count, 10);
        count = count / 10;
        mas[2] = mod(count, 10);
        return mas;
    }
    
    private static int[] bubbleSorter(int [] mas)
    {
        for (int out = mas.length-1; out >=1; out--)
        {
            for (int in = 0; in < out; in++)
            {
                if (mas[in] > mas[in +1])
                {
                    int dummy = mas[in];
                    mas[in] = mas[in + 1];
                    mas [in + 1] = dummy;
                }
            }
        }
        return mas;
    }
    
}
