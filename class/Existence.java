class species{
	String category = "mammal";
	void speDis(){
		System.out.println("you are category of " + category);
	}
	}
	class animal extends species{
		String animal = "fish";
		void aniDis(){
			System.out.println("i am " + category + " having properties of "+ animal);
		}
	}
	class human extends species {
		String gender = "male";
		void humDis(){
			System.out.println("my category is " + category + " coming from " + gender);
			}
	}
public class Existence {
	public static void main(String[] args) {
		species sp = new species();
			animal an = new animal();
			human hu = new human();
		sp.speDis();
		an.aniDis();
		hu.humDis();
	}
}

