package picture;

import java.util.*;

/*
 * Задача 2: Създайте клас „Картини”, който съдържа списък от обекти от клас „Картина”. 
 * Напишете необходимите конструктори (инициализират празен списък), get и set методи. 
 * Напишете метод за добавяне на картина към списъка (подава се обект „Картина” като входен параметър). 
 * Направете проверка за дублиране – ако такава картина вече има в списъка, то да се върне изключение 
 * или да се отпечата текст в конзолата. 
 * Напишете метод, който изтрива картина по подаден уникален номер.
 */

public class Pictures {
	private ArrayList<Picture> pict;

	public Pictures() {
		pict = new ArrayList<Picture>();
	}

	public ArrayList<Picture> getPict() {
		return pict;
	}

	public void setPict(ArrayList<Picture> pict) {
		this.pict = pict;
	}
	
	public void add(Picture p) throws PictureException {
		if (pict.contains(p)) {
			throw new PictureException("The picture exists!");
		} else {
			pict.add(p);
		}
	}
	
	public void delete(int id) {
		for (Picture p:pict) {
			if (p.getId()==id) {
				pict.remove(p);
				return;
			}
		}
	}
	
	/*
	 * Задача 3: Напишете метод за отпечатване на информацията за картините на даден автор 
	 * (името му се подава като параметър, а ако се подаде празен низ да се отпечатва информацията за всички картини).
	 */
	
	public void print(String aName) {
		if (aName.isEmpty()) {
			printAll();
		} else {
			for (Picture p:pict) {
				if (p.getAuthor().equals(aName)) {
					p.print();
				}
			}
		}
	}
	
	private void printAll() {
		for (Picture p:pict) {
			p.print();
		}
	}
	
	/*
	 * Задача 4: В клас „Картини” напишете метод, който намира най-скъпата или най-скъпите картини 
	 * (ако са повече от една с равни цени) и отпечатва информация за тях на екрана. 
	 * Напишете метод, който връща средната цена на картините от даден автор (името на автора се подава като параметър, 
	 * като ако се подаде празен String, то да се върне средната цена на картините на всички автори).
	 */
	
	public void ExpensivePicture() {
		float mPrice = getMaxPrice();
		
		for(Picture p:pict) {
			if (p.getPrice() == mPrice) {
				p.print();
			}
		}
	}
	
	private float getMaxPrice()	{
		float mPrice = pict.get(0).getPrice();
		for (int i=1; i<pict.size(); ++i) {
			if (mPrice < pict.get(i).getPrice()) {
				mPrice = pict.get(i).getPrice();
			}
		}
		return mPrice;
	}
	
	public float AveragePrice(String aName) {
		boolean cond = !aName.isEmpty();
		float avPrice = 0;
		int cnt = 0;
		
		for (Picture p:pict) {
			if (cond || p.getAuthor().equals(aName)) {
				avPrice += p.getPrice();
				cnt++;
			}
		}
		return (cnt==0) ? 0 : (avPrice/cnt);
	}
}
