
package com.mycompany.mavenproject7;

import java.util.Scanner;

public class Mavenproject7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//      First object of Automobile
        Automobile a1 = new Automobile();
        a1.start();
        System.out.println("Do you want to update the current status?");
        char response = input.next().charAt(0);
        if (response == 'y') {
            a1.update();
        } else {
            System.out.println("Enjoy your journey!");
        }
    }
}
