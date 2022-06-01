package stringclass;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: StringBuilder_ </p>
 * <p>Description: StringBuilder类 </p>
 * <p>
 * 1. 一个可变的字符序列，此类提供一个与StringBuffer兼容的API，但不保证同步（StringBuilder不是线程安全）。该类被设计用作StringBuffer
 * 的一个建议替换，用在字符串缓冲区被单个线程使用的时候。如果可能，建议优先才有该类，因为在大多数实现中，他比StringBuffer要快。
 * 2. 在StringBuilder上的主要操作时append和insert方法，可重载这些方法，以接收任意类型的数据。
 * <p>
 * StringBuilder和StringBuffer均代表可变的字符序列，方法是一样的，所以使用和StringBuffer一样。
 * <p>
 * 1. StringBuilder同样继承了AbstractStringBuilder类，同时也实现了Serializable接口。
 * 2. StringBuilder同样也是final类
 * 3. StringBuilder的数据同样是保存在父类AbstractStringBuilder中的char[] value数组中，不是final
 * 4. StringBuilder的方法，没有做互斥的处理，即没有synchronized关键字，因此在单线程的情况下使用
 * <p>
 * String, StringBuffer, StringBuilder的比较：
 * 1. StringBuilder和StringBuffer非常相似，均代表可变的字符序列，而且方法也一样。
 * 2. String： 不可变字符序列，效率低，但是复用率高。
 * 3. StringBuffer: 可变字符序列，效率较高（增删），线程安全（看源码见下方）
 * 4. StringBuilder: 可变字符序列，效率最高，线程不安全
 * 5. String使用注意说明：
 *      String s = "a"; //创建了一个类
 *      s += "b"; //实际上原来的"a"字符串对象已经被丢弃了，现在又产生了一个字符串 s + "b"(即"ab")。
 *      如果多次执行这些改变串内容的操作，会导致大量副本字符串对象存留在内存中，降低效率。如果这样的操作放到循环中，会极大地影响程序的性能 ==》 ※结论：如果我们对String做大量修改，不要使用String
 * <p>
 * String, StringBuffer, StringBuilder的使用原则:
 * 1. 如果字符串存在大量修改操作，一般使用StringBuilder或StringBuilder;
 * 2. 如果字符串存在大量的修改操作，且在单线程的情况下，使用StringBuilder;
 * 3. 如果字符串存在大量的修改操作，且在多线程的情况下，使用StringBuffer;
 * 4. 如果字符串很少被修改，被多个对象引用，使用String。比如说配置信息等
 *
 * <p>Date: 2022-06-01  23:35 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

/*
   StringBuffer类的length方法
        @Override
        public synchronized int length() {
            return count;
        }
 */

public class StringBuilder_ {
    public static void main(String[] args) {
//        StringBuilder stringBuilder = new StringBuilder();
        long startTime = 0L;
        long endTime = 0L;
        StringBuffer buffer = new StringBuffer("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//StringBuffer 拼接 20000 次
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer 的执行时间：" + (endTime - startTime));
        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//StringBuilder 拼接 20000 次
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder 的执行时间：" + (endTime - startTime));
        String text = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {//String 拼接 20000
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String 的执行时间：" + (endTime - startTime));

//          StringBuffer 的执行时间：13
//          StringBuilder 的执行时间：5
//          String 的执行时间：2172
    }
}