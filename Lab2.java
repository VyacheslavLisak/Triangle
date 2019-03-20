 import java.io.*;
 import static java.lang.Math.*;
 
 /**
 * Нахождение площади треугольника
 **/
public class Lab2 {

    /**
    * Точка входа в программу
    **/
    public static void main(String[] args) {
        /**
        * Первая точка
        **/
        System.out.println("Первая точка: ");
        System.out.println("x = ");
        double x1 = getDouble();
        System.out.println("y = ");
        double y1 = getDouble();
        System.out.println("z = ");
        double z1 = getDouble();
        
        /**
        * Вторая точка
        **/
        System.out.println("Вторая точка: ");
        System.out.println("x = ");
        double x2 = getDouble();
        System.out.println("y = ");
        double y2 = getDouble();
        System.out.println("z = ");
        double z2 = getDouble();
        
        /**
        * Третья точка
        **/
        System.out.println("Третья точка: ");
        System.out.println("x = ");
        double x3 = getDouble();
        System.out.println("y = ");
        double y3 = getDouble();
        System.out.println("z = ");
        double z3 = getDouble();
        
        Point3d first_point = new Point3d(x1, y1, z1);
        Point3d second_point = new Point3d(x2, y2, z2);
        Point3d third_point = new Point3d(x3, y3, z3);
        
        if (first_point.equals(second_point) || first_point.equals(third_point) || second_point.equals(third_point)) {
            System.out.println("Указано менее 3 точек");
        }
        else {
            double square = computeArea(first_point, second_point, third_point);
            System.out.println("Площадь треугольника = " + square);
        }
    }
    
    /**
    * Функция ввода переменной
    **/
    public static double getDouble() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            try {
                double d = Double.parseDouble(s);
                return d;
            }
            catch (NumberFormatException e) {
                return 0.0;
            }
        }
        catch (IOException e) {
            return 0.0;
        }
    } 
    
    /**
    * Расчет площади треугольника
    **/
    public static double computeArea(Point3d first_point, Point3d second_point, Point3d third_point) {
        double a = first_point.distanceTo(second_point);
        double b = first_point.distanceTo(third_point);
        double c = second_point.distanceTo(third_point);
        double p = (a + b + c) / 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
