package writer_reader;

import java.util.List;
import java.util.UUID;

public class Tanks {
	private int id;
	private String name;
	private String country;
	private int speed;
	private int ammunition;

	public Tanks() {
	}

	public Tanks(int id, String name, String country, int speed, int ammunition) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.speed = speed;
		this.ammunition = ammunition;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAmmunition() {
		return ammunition;
	}

	public void setAmmunition(int ammunition) {
		this.ammunition = ammunition;
	}

	@Override
	public String toString() {
		return "Tanks [id=" + id + ", name=" + name + ", country=" + country
				+ ", speed=" + speed + ", ammunition=" + ammunition + "]";
	}

	public void createTank(List<Tanks> beforeAdd){
		Tanks tanks = new Tanks(1 + (int) (Math.random() * (11 - 1)), UUID
				.randomUUID().toString().replaceAll("[^a-zA-Z]", "")
				.toUpperCase().substring(0, 3), UUID.randomUUID().toString()
				.replaceAll("[^a-zA-Z]", "").toUpperCase().substring(0, 3),
				20 + (int) (Math.random() * (80 - 20)),
				20 + (int) (Math.random() * (50 - 20)));
		       beforeAdd.add(tanks);
	}
}
