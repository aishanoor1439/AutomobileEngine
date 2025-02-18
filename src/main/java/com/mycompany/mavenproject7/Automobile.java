package com.mycompany.mavenproject7;

import java.util.Scanner;

//Class Definition of Automobile
public class Automobile {

    Scanner input = new Scanner(System.in);

    //  Attributes
    String fuelLevel = "65%";
    String batteryVoltage = "12.6V";
    String engineTemperature = "90°C ";
    String tirePressure = "Front Left: 32 PSI, Front Right: 32 PSI, Rear Left: 30 PSI, Rear Right: 30 PSI";
    String odometerReading = "45,320 km";
    boolean start = true;

//  Methods
    void start() {
        if (start) {
            showStatus();
        } else {
            System.out.println("Do you want to start the Engine?");
            char response = input.next().charAt(0);
            if (response == 'y') {
                showStatus();
            }
        }
    }

    void showStatus() {
        System.out.println("Fuel Level:" + fuelLevel);
        System.out.println("Battery Voltage:" + batteryVoltage);
        System.out.println("Engine Temperature:" + engineTemperature);
        System.out.println("Tire Pressure:" + tirePressure);
        System.out.println("Odometer Reading:" + odometerReading);
    }

    void update() {
        System.out.println("What do you want to update?");
        char response = input.next().charAt(0);
        input.nextLine();
        switch (response) {
            case 'f':
                System.out.println("Enter the updated value:");
                fuelLevel = input.nextLine();
                break;
            case 'b':
                System.out.println("Enter the updated value:");
                batteryVoltage = input.nextLine();
                break;
            case 'e':
                System.out.println("Enter the updated value:");
                engineTemperature = input.nextLine();
                break;
            case 't':
                System.out.println("Enter the updated value:");
                tirePressure = input.nextLine();
                break;
            case 'o':
                System.out.println("Enter the updated value:");
                odometerReading = input.nextLine();
                break;
            default:
                System.out.println("Invalid input!");
        }
        showStatus();
    }

}
