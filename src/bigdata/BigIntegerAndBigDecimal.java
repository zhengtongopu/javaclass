package bigdata;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * <p>ProjectName: javaclass </p>
 * <p>FileName: BigIntegerAndBigDecimal </p>
 * <p>Description: BigInteger类和BigDecimal类 </p>
 *
 * 基本说明：
 * 1. BigInteger：可以声明更大的整数
 * 2. BigDecimal: 精度更高的浮点数
 *
 * 对BigInteger进行数学计算时要用对应的方法（BidDecimal同理）：
 * 1. add
 * 2. subtract
 * 3. multiply
 * 4. divide（注意！！BigDecimal调用divide方法时有可能出现异常，需要事先指定精度），例子见下方
 * <p>Date: 2022-06-09  00:04 </p>
 * <p>@author: <a href="https://github.com/zhengtongopu" rel="nofollow">Zheng Tong</a> </p>
 * <p>@version: 1.0.0 </p>
 */

public class BigIntegerAndBigDecimal {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1312321413213124212455213");
        System.out.println(bigInteger); //1312321413213124212455213
        BigInteger bigInteger1 = new BigInteger("1313111112265432341221315352432");
        System.out.println(bigInteger.add(bigInteger1)); //1313112424586845554345527807645
        System.out.println(bigInteger.subtract(bigInteger1)); //-1313109799944019128097102897219
        System.out.println(bigInteger.multiply(bigInteger1)); //1723223830554029572755213760331947430850950909110628016
        System.out.println(bigInteger.divide(bigInteger1)); //0

        BigDecimal bigDecimal = new BigDecimal("123145151.51232134215125123");
        BigDecimal bigDecimal1 = new BigDecimal("1231256765865.12321421");
        System.out.println(bigDecimal.add(bigDecimal1)); //1231379911016.63553555215125123
        System.out.println(bigDecimal.subtract(bigDecimal1)); //-1231133620713.61089286784874877
        System.out.println(bigDecimal.multiply(bigDecimal1)); //151623300983031362668.3246120923425700708159783
//        BigDecimal调用divide方法时有可能出现异常（主要是因为有可能出现无限循环小数）
        System.out.println(bigDecimal.divide(bigDecimal1, BigDecimal.ROUND_CEILING)); //0.00010001581711171
    }
}