package application;

import java.util.Random;
import java.util.Scanner;

public class App {
	public static Scanner scan = new Scanner(System.in);
	public static Random rand = new Random();
	static boolean run = true;

	public static void main(String[] args) {
		System.out.println("Guten Tag!\n\n");
		chooseApplication();
	}

	public static void chooseApplication() {
		System.out.println(
				"Wollen Sie eine neue Abteilung anlegen, dann drücken Sie 3 \noder wollen Sie neue Mitarbeiter anlegen, dann drücken Sie 4");
		System.out.print("Auswahl: ");
		int x = scan.nextInt();
		if (x == 3) {
			aufgabe3();
		} else if (x == 4) {
			zusatz4();
		} else if (x != 3 || x != 4) {
			System.out.println("Bitte drücken Sie 3 oder 4 \n");
			chooseApplication();
		}
	}

	public static void aufgabe3() {

		System.out.println("\nBitte legen Sie eine Abteilung an:");
		Department newDept = new Department();
		System.out.print("Name: ");
		newDept.name = scan.next();
		final String deptName = newDept.name;
		newDept.id = randomID();
		final int deptID = newDept.id;
		System.out.print("ID: " + newDept.id + "\n");
		System.out.print("Land: ");
		newDept.country = scan.next();
		final String deptCountry = newDept.country;
		System.out.print("Stadt: ");
		newDept.city = scan.next();
		final String deptCity = newDept.city;

		neuerMitarbeiterAufgabe3(deptName, deptID, deptCountry, deptCity);

		while (run) {
			System.out
					.println("Möchten Sie einen weiteren Mitarbeiter anlegen?\n" + "j für ja und n für beenden\n" + "");
			String choose = scan.next();

			if (choose.equalsIgnoreCase("j")) {
				neuerMitarbeiterAufgabe3(deptName, deptID, deptCountry, deptCity);

			} else if (choose.equalsIgnoreCase("n")) {
				System.out.println("Auf Wiedersehen");
				run = false;
			}
		}

	}

	public static void neuerMitarbeiterAufgabe3(String deptName, int deptID, String deptCountry, String deptCity) {
		System.out.println("\n\nBitte legen Sie einen Mitarbeiter an:");
		Employee newEmp = new Employee();
		System.out.print("Vorname: ");
		newEmp.firstName = scan.next();
		System.out.print("Nachname: ");
		newEmp.lastName = scan.next();
		newEmp.id = rand.nextInt(100);
		System.out.print("ID: " + newEmp.id + "\n");

		System.out.println("\nDer Mitarbeiter " + newEmp.id + " " + newEmp.firstName + " " + newEmp.lastName
				+ " arbeitet in der Abteilung " + deptID + " " + deptName + " in " + deptCity + "\n");
	}

	public static void zusatz4() {
		System.out.println("\nWieviele Mitarbeiter wollen Sie anlegen?");
		System.out.print("Auswahl: ");
		int arrlength = scan.nextInt();

		Employee emp = new Employee();
		String[] names = new String[arrlength];
		for (int i = 0; i < names.length; i++) {
			names[i] = " ";
		}

		for (int i = 0; i < names.length; i++) {

			System.out.println("\nBitte legen Sie einen Mitarbeiter an:");
			System.out.print("Vorname: ");
			emp.firstName = scan.next();
			System.out.print("Nachname: ");
			emp.lastName = scan.next();
			emp.id = randomID();
			System.out.print("ID: " + emp.id + "\n");

			names[i] = (emp.firstName + " " + emp.lastName + " " + emp.id);

			System.out.println("\nIn Welcher Abteilung soll " + emp.firstName + " " + emp.lastName + " arbeiten?");
			System.out.println(
					"Für Development geben Sie d ein, für Management m ein, oder eine beliebige andere Taste für eine Test-Abteilung:\n");

			String chooseDev = scan.next();

			System.out.println("Sie haben den folgenden Mitarbeiter angelegt: \n");
			System.out.print("Der Mitarbeiter " + emp.id + " " + emp.firstName + " " + emp.lastName + " arbeitet im ");

			if (chooseDev.equals("d")) {
				System.out.println("Development " + randomID() + " in Innsbruck");
			} else if (chooseDev.equals("m")) {
				System.out.println("Management " + randomID() + " in Graz");
			} else {
				System.out.println("Test " + randomID() + " in Gotham");
			}

			if (i == arrlength - 1) {
				System.out.println("\nFolgende Mitarbeiter wurden angelegt");
				for (int j = 0; j < names.length; j++) {
					System.out.println(names[j]);
				}
				System.out.println("\nAuf Wiedersehen!");
				break;
			}

			System.out.println(
					"\nWollen Sie noch einen Mitarbeiter anlegen?\nx für beenden, beliebige Tasten für weiter");
			System.out.print("Auswahl: ");
			String chooseNew = scan.next();

			if (chooseNew.equals("x")) {
				System.out.println("\nFolgende Mitarbeiter wurden angelegt");
				for (int j = 0; j < names.length; j++) {
					System.out.println(names[j]);
				}
				System.out.println("\nAuf Wiedersehen!");
				break;
			}

		}
	}

	public static int randomID() {
		int randomID = rand.nextInt(100);
		return randomID;
	}

}
