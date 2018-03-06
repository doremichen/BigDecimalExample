# BigDecimalExample
This is BigDecimal example that for round mode

1.	ROUND_UP: 離0遠去,不留痕跡.
public class Example1 {

        public static void main(String[] args) {
                
                double a = 3.13552;
                double b = new BigDecimal(String.valueOf(a))
                                                .setScale(1, BigDecimal.ROUND_UP)
                                                .doubleValue();
                
                System.out.println("正浮點數遠離0到小數點第一位: " + b);
                double c = -3.14552;
                double d = new BigDecimal(String.valueOf(c))
                                                .setScale(1, BigDecimal.ROUND_UP)
                                                .doubleValue();
                
                System.out.println("負浮點數遠離0到小數點第一位: " + d);

        }

}
輸出結果
正浮點數遠離0到小數點第一位: 3.2
負浮點數遠離0到小數點第一位: -3.2
由上面的結果可以看到正浮點數3.13552是落在3.1和3.2之間, 而3.2是離0最遠的值, 所以輸出就會是3.2
負浮點數-3.14552是落在-3.1和-3.2之間, 而-3.2是離0最遠的值, 所以輸出就是-3.2

2.	ROUND_DOWN: 向0靠近,不離不棄.
public class Example2 {

        public static void main(String[] args) {
                
                double a = 3.16552;
                double b = new BigDecimal(String.valueOf(a))
                                                .setScale(1, BigDecimal.ROUND_DOWN)
                                                .doubleValue();
                
                System.out.println("正浮點數靠近0到小數點第一位: " + b);
                double c = -3.18552;
                double d = new BigDecimal(String.valueOf(c))
                                                .setScale(1, BigDecimal.ROUND_DOWN)
                                                .doubleValue();
                
                System.out.println("負浮點數靠近0到小數點第一位: " + d);
        }

}
輸出結果
正浮點數靠近0到小數點第一位: 3.1
負浮點數靠近0到小數點第一位: -3.1
由上面的結果可以看到正浮點數3.16552是落在3.1和3.2之間, 而3.1是離0最接近的值,所以輸出就會是3.1
負浮點數-3.18552是落在-3.1和-3.2之間, 而-3.1是離0最接近的值, 所以輸出就會是-3.1

3.	ROUND_CEILING: 向正無限發展,一去不返.
public class Example3 {

        public static void main(String[] args) {

                double a = 3.12552;
                double b = new BigDecimal(String.valueOf(a))
                                                .setScale(1, BigDecimal.ROUND_CEILING)
                                                .doubleValue();
                
                System.out.println("正浮點數向正無限大到小數點第一位: " + b);
                double c = -3.19552;
                double d = new BigDecimal(String.valueOf(c))
                                                .setScale(1, BigDecimal.ROUND_CEILING)
                                                .doubleValue();
                
                System.out.println("負浮點數向正無限大到小數點第一位: " + d);
                
        }

}
輸出結果
正浮點數向正無限大到小數點第一位: 3.2
負浮點數向正無限大到小數點第一位: -3.1
由上面的結果可以看到正浮點數3.12552是落在3.1和3.2之間, 往正無限大的方向來看就是3.2, 所以輸出就會是3.2
負浮點數-3.19552是落在-3.1和-3.2之間, 往正無限大的方向來看就是-3.1, 所以輸出就會是-3.1

4.	ROUND_FLOOR: 向負無限發展,一去不返.
public class Example4 {

        public static void main(String[] args) {

                double a = 3.19552;
                double b = new BigDecimal(String.valueOf(a))
                                                .setScale(1, BigDecimal.ROUND_FLOOR)
                                                .doubleValue();
                
                System.out.println("正浮點數向負無限大到小數點第一位: " + b);
                double c = -3.11552;
                double d = new BigDecimal(String.valueOf(c))
                                                .setScale(1, BigDecimal.ROUND_FLOOR)
                                                .doubleValue();
                
                System.out.println("負浮點數向負無限大到小數點第一位: " + d);
        }

}
輸出結果
正浮點數向負無限大到小數點第一位: 3.1
負浮點數向負無限大到小數點第一位: -3.2
由上面的結果可以看到正浮點數3.19552是落在3.1和3.2之間, 往負無限大方向看就是3.1, 所以輸出的值就會是3.1
負浮點數-3.11552是落在-3.1和-3.2之間, 往負無限大方向看就是-3.2, 所以輸出的值就會是-3.2

5.	ROUND_HALF_UP: 小五捨去其餘進位,無須多言 (四捨五入)
public class Example5 {

        public static void main(String[] args) {

                double a = 3.15552;
                double b = new BigDecimal(String.valueOf(a))
                                                .setScale(1, BigDecimal.ROUND_HALF_UP)
                                                .doubleValue();
                
                System.out.println("正浮點數四捨五入到小數點第一位: " + b);
                double c = -3.14552;
                double d = new BigDecimal(String.valueOf(c))
                                                .setScale(1, BigDecimal.ROUND_HALF_UP)
                                                .doubleValue();
                
                System.out.println("負浮點數四捨五入到小數點第一位: " + d);
        }

}
輸出結果
正浮點數四捨五入到小數點第一位: 3.2
負浮點數四捨五入到小數點第一位: -3.1
由上面的結果可以看到正浮點數3.15552的小數第二位是5, 因為5不小於5則進位, 所以輸出的值就會是3.2
負浮點數-3.14552的小數第二位是4, 因為4小於5則捨去, 所以輸出的值就是-3.1

6.	ROUND_HALF_DOWN: 大五進位其餘捨棄,真是奇妙 (四捨五考慮)
public class Example6 {

        public static void main(String[] args) {

                double a = 3.35111;
                String b = new BigDecimal(Double.toString(a))
                                                .setScale(1, BigDecimal.ROUND_HALF_DOWN)
                                                .toString();
                
                System.out.println("正浮點數四捨五考慮到小數點第一位: " + b);
                double c = -3.45000;
                String d = new BigDecimal(String.valueOf(c))
                                                .setScale(1, BigDecimal.ROUND_HALF_DOWN)
                                                .toString();
                
                System.out.println("負浮點數四捨五考慮到小數點第一位: " + d);
        }

}
輸出結果
正浮點數四捨五考慮到小數點第一位: 3.4
負浮點數四捨五考慮到小數點第一位: -3.4
由上面的結果可以看到正浮點數 3.35111的小數第二位5後面非零代表大於5則進位, 所以輸出的值就是3.4
負浮點數-3.45的小數第二位5後面為0代表等於5則捨去, 所以輸出的值就會是-3.4
這一道的模式可以這樣描述, 5後非零則進位, 5後為零則捨去, 所以稱之為四捨五考慮.

7.	ROUND_HALF_EVEN: 銀行模式, 多重考慮 (四捨六入五考慮)
public class Example7 {

        public static void main(String[] args) {

                double a = 3.25111;
                String b = new BigDecimal(Double.toString(a))
                                                .setScale(1, BigDecimal.ROUND_HALF_EVEN)
                                                .toString();
                
                System.out.println("正浮點數四捨六入五考慮到小數點第一位: " + b);
                double c = -3.25000;
                String d = new BigDecimal(String.valueOf(c))
                                                .setScale(1, BigDecimal.ROUND_HALF_EVEN)
                                                .toString();
                
                System.out.println("負浮點數四捨六入五考慮到小數點第一位: " + d);
        }

}
輸出結果
正浮點數四捨六入五考慮到小數點第一位: 3.3
負浮點數四捨六入五考慮到小數點第一位: -3.2
由上面的結果可以看到正浮點數 3.25111的小數第二位5後面還有非零的值則進位, 所以輸出的值就是3.3
負浮點數-3.25000的小數第二位5後面沒有非零的值則捨去, 所以輸出的值就會是-3.2. 疑..這個模式的範例不就跟上面
的模式一樣嗎? 請再看一下下面的簡單範例
double e = -3.35000;
String f = new BigDecimal(String.valueOf(e))
                .setScale(1, BigDecimal.ROUND_HALF_EVEN)
                .toString();
                
System.out.println("負浮點數四捨六入五考慮到小數點第一位: " + f);
輸出結果
負浮點數四捨六入五考慮到小數點第一位: -3.4
這次的負浮點數-3.35000的小數第二位5後面沒有非零的值,但是進位了, 輸出結果為-3.4
這一到模式可以這樣描述,5後非零就進位,五後為零就看奇偶,五前為奇就進位,五前為偶就捨去.四捨遇六即進位,故之稱為四捨六入五考慮

8.	ROUND_UNNECESSARY: 不準進位,一進就出異常
public class Example8 {

        public static void main(String[] args) {

                double a = 3.25111;
                String b = new BigDecimal(Double.toString(a))
                                                .setScale(5, BigDecimal.ROUND_UNNECESSARY)
                                                .toString();
                
                System.out.println("正浮點數無須捨入模式: " + b);
                System.out.println("===========================");
                double c = -3.2553;
                String d = new BigDecimal(String.valueOf(c))
                                                .setScale(2, BigDecimal.ROUND_UNNECESSARY)
                                                .toString();
                
                System.out.println("負浮點數無須捨入模式: " + d);
        }

}
輸出結果
正浮點數無須捨入模式: 3.25111
Exception in thread "main" ===========================
java.lang.ArithmeticException: Rounding necessary
        at java.math.BigDecimal.divideAndRound(Unknown Source)
        at java.math.BigDecimal.setScale(Unknown Source)
        at com.adam.app.Example8.main(Example8.java:18)

由上面的結果可以看到正浮點數 3.25111其有效小數位數是五位, 而這時利用setScale來指定要輸出小數點後五位數, 所以輸出的值為3.25111
負浮點數-3.2553其有效小數位數是四位, 而這時利用setScale來指定要輸出小數點後2位數, 指定的位數不輔合原本浮點數的有效位數. 所以丟出異常.
這一個模式通常是用來指定原本的數字就是精準的,不容許再做任何進位.

以上是八種的捨入模式範例.根據不同的場景,請慎用選擇不同的捨入模式,以免最後怎麼掛的都不知道.另外在Math class有一個round方法是用來將浮點數
近似為整數.相信各位也有用這個方法來將浮點數轉換為整數.這個round方法在正浮點數跟負浮點數求近似值是不一樣的.請看範例

public class MathExample {

        public static void main(String[] args) {

                System.out.println("3.4近似值: " + Math.round(3.4));
                System.out.println("3.5近似值: " + Math.round(3.5));
                System.out.println("3.6近似值: " + Math.round(3.6));
                System.out.println("-3.4近似值: " + Math.round(-3.4));
                System.out.println("-3.5近似值: " + Math.round(-3.5));
                System.out.println("-3.6近似值: " + Math.round(-3.6));
                
        }

}
輸出結果
3.4近似值: 3
3.5近似值: 4
3.6近似值: 4
-3.4近似值: -3
-3.5近似值: -3
-3.6近似值: -4

由上面的結果可以看到正浮點數是採取四捨五入的方式來求整數,而負浮點數則是採用五捨六入的方式來求整數.
