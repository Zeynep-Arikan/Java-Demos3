package abstarctclasses;
public abstract class GameCalculator {
    // hesaplayı kim extends ediyorsa hesaplayı içermek zorunda 
    // fakat kendi hesaplamasını yapmak zorunda yani override yapacak
    public abstract void hesapla();
 
    
    // bu gameover hiçbir zaman değişmez herkes olduğu gibi kullanır
    public final void gameOver(){
        System.out.println("Oyun Bitti");
    }
}
