package in.jk.behavioral.dessignpatterns.template;

public class TemplateDessignPatternsApplication {

	public static void main(String[] args) {

		Game chase = new Chase();
        chase.play();
        
        System.out.println();
        Game soccar = new Soccar();
        soccar.play();

	}

}
