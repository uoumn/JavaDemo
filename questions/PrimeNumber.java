/*
题目：判断101-200之间有多少个素数，并输出所有素数。

素数又叫质数，就是除了1和它本身之外，再也没有整数能被它整除的数。也就是素数只有两个因子。

*/
public class PrimeNumber{
  public static void main (String [] args){
    int x = 0,y = 0,c = 0;
    for (int a = 101; a <= 200; a ++){
      for (int b = 1; b <= a; b ++){
          c = a % b;
          if (c == 0){
             x = x + 1 ;
            }
         }
         if (x == 2) {
            System.out.print(a + " ");
            y ++;
      }
      x = 0;
    }
    System.out.println();
    System.out.println("质数个数：" + y);
  }
}