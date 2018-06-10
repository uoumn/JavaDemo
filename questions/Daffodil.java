public class Daffodil{
  public static void main (String [] args){
    int a,b,c,d, e;
    for (a = 1; a < 10; a++){
      for (b = 0; b < 10; b++){
        for (c = 0; c <10; c ++){
          d = a*a*a + b*b*b + c*c*c;
          e = 100*a + 10*b + c;
          if (d == e){
            System.out.print(e + " ");
          }
        }
      }
    }
  }
}

/*
题目：
打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：
153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
*/


// git added text.
// ahahaha
