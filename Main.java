public class Main {
    public static void main(String[] args) {
      float payment = 1000.50F;
      int totalBonus;
      if (payment > 1000) {totalBonus = (int)(payment/100F);}
              else {totalBonus = 0;}
        System.out.println (totalBonus);
    }
}
