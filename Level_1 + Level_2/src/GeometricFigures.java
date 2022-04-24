public class GeometricFigures {

      //Task2
//    Реализовать формулы вычисляющие(вывести результат в консоль):
//    объем параллелепипеда (по 3ем сторонам)
//    длину окружности (по радиусу)
//    площадь круга (по радиусу)
//    объем шара (по радиусу)
//    объем цилиндра (по высоте и радиусу)

    public void getVolumeParallelepiped(double length, double width, double height) {
        System.out.println("Объем параллелепипеда: " + length * width *  height);
    }

    public void getCircumference(double radius) {
        double circumference = 2.0 * Math.PI * radius;
        System.out.println("Длина окружности: " + circumference);
    }

    public void getAreaCircle(double radius) {
        double areaCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь круга: " + areaCircle);
    }

    public void getVolumeSphere(double radius) {
        double volumeSphere = 4.0/3.0 * Math.PI * Math.pow(radius, 3);
        System.out.println("Объём шара: " + volumeSphere);
    }

    public void getVolumeCylinder(double height, double radius) {
        double volumeCylinder = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Объем цилиндра: " + volumeCylinder);
    }
}
