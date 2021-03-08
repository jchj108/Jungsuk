package oop.run;

import oop.model.SutdaCard;

public class Q6_2Run {

	public static void main(String[] args) {
		
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}
