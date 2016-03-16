package ua.com.juja.core;

/**
 * Created by FlyRoNik on 09.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline(10);

        airline.addDestination("��������� - ������",2);
        airline.addDestination("��������� - ���������",2);
        airline.addDestination("��������� - ������",2);
        airline.addDestination("��������� - ����",1);
        airline.addDestination("��������� - ������",2);
        airline.addDestination("��������� - �����",2);
        airline.addDestination("��������� - ������",2);

        //TODO ���� ������ � ������ �� ������ �����������
        PeopleGenerator peopleGen1 = new PeopleGenerator(100,airline.getAllFlight()[0]);
        PeopleGenerator peopleGen2 = new PeopleGenerator(78,airline.getAllFlight()[1]);

        People[] waybill = peopleGen1.getPeople();
        for (People aWaybill : waybill) {
            airline.addPassenger(aWaybill);
        }

        waybill = peopleGen2.getPeople();
        for (People aWaybill : waybill) {
            airline.addPassenger(aWaybill);
        }

    }
}
