public class Veterinario {
  void examinarMamifero(Mamifero mani) {
    mani.soar();
  }  

  void examinarAnimal(Animal pet) {
    if (pet instanceof cao) {
      Cao rex = (cast)pet;
      rex.latir();
    } else if (pet instanceof Cavalo) {
      Cavalo silver = (Cavalo)pet;
      silver.relinchar();
    } else if (pet instanceof Cavalo) {
      Gato garry = (Gato)pet;
      garry.miar();
    } else {
      System.out.println("Não conheço esse animal");
    }
  }  
}
