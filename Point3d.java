import static java.lang.Math.*;

/**
 * Точка в трехмерном пространстве.
 **/
public class Point3d {

    /** Координата X точки **/
    private double xCoord;

    /** координата Y точки **/
    private double yCoord;
    
    /** координата Z точки **/
    private double zCoord;

    /** Конструктор инициализирующий начальное значение координат точки (x, y, z). **/
    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
 
    /** конструктор без аргументов:  по умолчанию точка ставится в начало координат. **/
    public Point3d() {
        this(0.0, 0.0, 0.0);
    }

    /** Возвращает координату X точки. **/
    public double getX() {
        return xCoord;
    }

    /** Возвращает координату Y точки. **/
    public double getY() {
        return yCoord;
    }
    
    /** Возвращает координату Z точки. **/
    public double getZ() {
        return zCoord;
    }

    /** Изменяет координату X точки. **/
    public void setX(double val) {
        xCoord = val;
    }

    /** Изменяет координату Y точки. **/
    public void setY(double val) {
        yCoord = val;
    }
    
    /** Изменяет координату Z точки. **/
    public void setZ(double val) {
        zCoord = val;
    }
    
    /** Сравнивает 2 точки. **/
    public boolean equals(Point3d target) {
        if ((target.xCoord == xCoord) && (target.yCoord == yCoord) && (target.zCoord == zCoord)) {
            return true;
        }
        return false;
    }
    
    /** Возвращает расстояние до объекта. **/
    public double distanceTo(Point3d target) {
        return sqrt(pow((target.xCoord - xCoord),2) + pow((target.yCoord - yCoord),2) + pow((target.zCoord - zCoord),2));
    }
} 
