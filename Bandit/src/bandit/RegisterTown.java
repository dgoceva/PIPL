package bandit;

import java.util.ArrayList;

/*
 * През 1890 г. в САЩ решили да въведат адресни регистрации. 
 * За целта в градовете започнали да се пазят подробни списъци със жителите и точно кой е шерифа. 
 * Шерифът получил право да се дуелира с бандитите.
 * Задача 5. Моделирайте класовете “RegisterTown” и “Sheriff”. 
 * Добрата подготовка на шерифите им позволява да имат модифициран метод Shoot, връщащ число от 20 до 100.
 */

public class RegisterTown  extends WesternTown{
	private ArrayList<Villager> list;
	private Sheriff name;
}
