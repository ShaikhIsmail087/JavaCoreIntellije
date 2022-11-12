package com.basic;

enum Month
{
	Jan,Feb,March,April,May,June,July,August,sept,Oct,Nov,Dec;
	Month()
	{
		System.out.println("Month Constructer");
	}
}
public class Hello {
	enum Weeks
	{
		Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
	}
	public static void main(String[] args) {
		Month[] m=Month.values();
		int cnt=1;
		for (Month month : m) {
			System.out.println(month+"->>>"+month.ordinal());
		}
		System.out.println();
		Weeks[] w=Weeks.values();
		int c=1;
		for (Weeks weeks : w) {
			System.out.println(weeks+"->>>"+weeks.ordinal());
		}
		Weeks w1=Weeks.Sunday;
		switch (w1) {
		case Sunday:System.out.println("It is vacation day...");
		break;
		case Monday:System.out.println("It is Working day...");
		break;
		case Tuesday:System.out.println("It is Boring day with work...");
		break;
		case Wednesday:System.out.println("It is a day with hard work....");
		break;
		case Thursday:System.out.println("It is day to pray...");
		break;
		case Friday:System.out.println("It is small eid day or holy day to pray...");
		break;
		case Saturday:System.out.println("It is weekend....");
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + w1);
		}
	}
}
