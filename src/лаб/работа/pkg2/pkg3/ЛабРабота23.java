/*
 * Эта прога выводит прямоугольный треугольник из 8-к с катетами i,j.
 */
package лаб.работа.pkg2.pkg3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ЛабРабота23 {


    public static void main(String[] args) {
        int m, n;
        String abcd="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNMйцукенгшщзхъфывапролджэячсмитьбюЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЧСМИТЬБЮ";
        
        
        
        String s;

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = null;

        System.out.print("Введите 1-ю сторону: ");
        
        try {
            name = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException ex) {
            System.out.println("\nОшибка считывания.");
        }


        String sAge = null;

        System.out.print("\nВведите 2-ю сторону: \n");

        try {
            sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException ex) {
            System.out.println("\nОшибка считывания.");
        }

        for (int i=0; i<abcd.length(); i++) {
                if ((name.contains(""+abcd.charAt(i))) || (sAge.contains(""+abcd.charAt(i)))) {
                System.out.print("Неправильные числа");
                return;
            }
        }
        
        n = Integer.parseInt(name); //преобразовываем строку в число
        m = Integer.parseInt(sAge);
        System.out.println(m + " " + n);
        
        
        for (int i = 1; i<=m; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("8");
            }
        System.out.print("\n");
        }
    }
    
}
