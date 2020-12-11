import java.util.ArrayList;

public class ClinicaVeterinaria {
  ArrayList<Animal> rebanho;

  public ClinicaVeterinaria() {
    rebanho = new ArrayList<Animal>();
  }

  public static void main(String[] args) {
    ClinicaVeterinaria petz = new ClinicaVeterinaria();
    Veterinario jose = new Veterinario();

    Animal pet = new Animal();
    Mamifero mani = new Mamifero();
    Cao thor = new Cao();
    Gato garfield - new Gato();
    Cavalo spirit = new Cavalo();

    petz.rebanho.add(pet);
    petz.rebanho.add(mani);
    petz.rebanho.add(thor);
    petz.rebanho.add(garfield);
    petz.rebanho.add(spirit);

    for (Animal a: petz.rebanho) {
      jose.examinarAniamal(a);
    }

    jose.examinarAnimal(mani);    
    jose.examinarAnimal(thor);    
    jose.examinarAnimal(garfield);    
    jose.examinarAnimal(spirit);

    System.out.println("-----------");
    for (Animal a: petz.rebanho) {
      jose.
    }
  }
}
