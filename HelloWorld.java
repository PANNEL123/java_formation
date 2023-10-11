// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    akwaba(22);
    compare(50,143);
    racinecarree(144);
    }
   public static void akwaba(int args){
       System.out.println("AKWABA YAMOUSSOUKRO  "+args);
   }
      public static void compare(int x, int y){
          int monmax=Math.max(x,y);
      // System.out.println("le maximum en x et y est : " +Math.max(x,y));
       System.out.println("le maximum en x et y est : " +monmax);
   }
       public static void racinecarree(int x){
       System.out.println("la racine carree de x est : " +Math.sqrt(x));
   }
}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class EXO1 {
//METHODE MAIN
    public static void main (String [] args){
   EXO1.maboucleSimple();
    EXO1.maboucleavecTableau();
    
    }
    //METHODE 2
    public static void maboucleSimple(){
        
        for (int i = 0; i < 10); i++){
                if (i == 5){
                    continue;
                //TODO
                } 
                System.out.println("LA BOUCLE" + i);
        }
        
    } //FIN DE LA METHODE 2
    
    public static void maboucleavecTableau(){
        int [] numbers={1,2,3,4,5);
        //AFFICHAGE DU CONTENU DU TABLEAU
        for (int number : numbers ) {
            System.out.println("Les elements du tableau sont :" +number);
            
        }
    }
        
} //FIN DE LA CLASSE

