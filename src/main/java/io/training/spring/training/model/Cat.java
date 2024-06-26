package io.training.spring.training.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
// // import jakarta.persistence.GenerationType;
// // import jakarta.persistence.GeneratedValue;

@Entity
public class Cat {
    public enum FurLength {
        SHORT,
        MEDIUM,
        LONG
    }
    public enum FurColor {
        WHITE,
        BLACK,
        GREY,
        ORANGE
    }
    public enum Gender {
        MALE,
        FEMALE
    }

    @Id
    private long id;
    private String name;
    private int age;
    private String description;
    private String favoriteDinner;
    private FurLength furLength;
    private FurColor furColor;
    private Gender gender;

    public Cat() {}
  
    public Cat(long id, String name, int age, String description, String favoriteDinner, FurLength furLength, FurColor furColor, Gender gender) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.description = description;
        this.favoriteDinner = favoriteDinner;
        this.furLength = furLength;
        this.furColor = furColor;
        this.gender = gender;
    }


	
    // Getters and setters*
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }

	public String getName() {
		return this.name;
	}
    
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFavoriteDinner() {
		return this.favoriteDinner;
	}

	public void setFavoriteDinner(String favoriteDinner) {
		this.favoriteDinner = favoriteDinner;
	}

    public FurLength getFurLength() {
		return this.furLength;
	}

	public void setFurLength(FurLength furLength) {
		this.furLength = furLength;
	}

	public FurColor getFurColor() {
		return this.furColor;
	}

	public void setFurColor(FurColor furColor) {
		this.furColor = furColor;
	}
    
    public Gender getGender() {
        return this.gender;
    };

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
