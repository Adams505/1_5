import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int liczba;
    System.out.println("wybierz numer od 0-50");
    Scanner wpis = new Scanner(System.in);
    liczba = wpis.nextInt();
    for(int i=0;i<liczba+1;i++){
      if(i%2==0)
        System.out.println(i+" to liczba parzysta");
      else
                System.out.println(i+" to liczba nieparzysta");
    }
  }
}