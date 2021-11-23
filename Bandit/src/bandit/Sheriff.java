package bandit;

/*
 * Шерифът получил право да се дуелира с бандитите.
 * Задача 5. Моделирайте класовете “RegisterTown” и “Sheriff”. 
 * Добрата подготовка на шерифите им позволява да имат модифициран метод Shoot, връщащ число от 20 до 100.
 */

public class Sheriff extends Villain{
	@Override
	public int shoot() {
		int cart = super.shoot()+20;
		return Math.min(cart, 100);
	}
}
