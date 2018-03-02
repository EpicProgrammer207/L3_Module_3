package abstract_classes.farm;

import java.util.ArrayList;

public class AnimalFarm {
static Duck Stanley = new Duck();
static Chicken Alex = new Chicken();
static Dog Charlie = new Dog();
static Cat Olivia = new Cat();
static Duck Alice = new Duck();
static Chicken Bobby = new Chicken();
	public static void main(String[] args) {
	ArrayList<Animal> foorm = new ArrayList<>();
	foorm.add(Stanley);
	foorm.add(Alex);
	foorm.add(Charlie);
	foorm.add(Olivia);
	foorm.add(Alice);
	foorm.add(Bobby);
	for(int i = 0; i<foorm.size(); i++) {
		foorm.get(i).makeNoise();
		foorm.get(i).sleep();
	}
}
}
