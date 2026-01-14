package HouseExample;

public class HouseMain {
    static void main() {
        House myHouse = new House();

        myHouse.setDoors(2);
        myHouse.setWindows(4);
        myHouse.setSize(10);

        House myHouse2 = new House(2, 4, 10);

        System.out.println("La cantidad de puerta de la casa es: " + myHouse.getDoors());

        myHouse2.openDoor();

        double area = myHouse.calculateArea();
        System.out.println("El área de la casa es: " + area);
    }
}
