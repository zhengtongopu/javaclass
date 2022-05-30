package interface_;


/**
 * 接口的多态：
 * ①多态参数：类似于多态的向上传递，接口引用可以指向实现了接口的类的对象
 * ②多态数组
 * ③接口存在多态传递
 */


public interface TestPoly1 {
    public void start();
    public void stop();
}

interface TestPoly2 extends TestPoly1 {
    public void watch();

    public void game();
}

class PolyInter1 implements TestPoly2{
    @Override
    public void start() {
        System.out.println("PolyInter1 start");
    }

    @Override
    public void stop() {
        System.out.println("PolyInter1 stop");
    }

    @Override
    public void watch() {
        System.out.println("PolyInter1 watch");
    }

    @Override
    public void game() {
        System.out.println("PolyInter1 game");
    }
}

class PolyInter2 implements TestPoly2{
    @Override
    public void start() {
        System.out.println("PolyInter2 start start");
    }

    @Override
    public void stop() {
        System.out.println("PolyInter2 stop stop");
    }

    @Override
    public void watch() {
        System.out.println("PolyInter2 watch watch");
    }

    @Override
    public void game() {
        System.out.println("PolyInter2 game game");
    }
}

class PolyMain {
    public static void main(String[] args) {
        PolyInter1 polyInter1 = new PolyInter1();
        PolyInter2 polyInter2 = new PolyInter2();
        work1(polyInter1);
        work2(polyInter2);
//        PolyInter1 start
//        PolyInter1 stop
//        PolyInter2 watch watch
//        PolyInter2 game game

//        多态数组
        TestPoly2[] tps = new TestPoly2[2];
        tps[0] = new PolyInter1();
        tps[1] = new PolyInter2();
        tps[0].game();
        tps[1].game();
//        PolyInter1 game
//        PolyInter2 game game

//        多态传递
//        PolyInter1类虽然没有直接实现TestPoly1接口，但是因为TestPoly2接口继承了TestPoly1接口，而PolyInter1类实现了TestPoly2，因此可以看做是PolyInter1
//        类实现了TestPoly1
//        因此 TestPoly1 tp = new PolyInter1();是不报错的，这就是多态传递
        TestPoly1 tp = new PolyInter1();


    }

//    多态参数
    public static void work1(TestPoly1 tp1) {
        tp1.start();
        tp1.stop();

    }

    public static void work2(TestPoly2 tp2) {
        tp2.watch();
        tp2.game();

    }
}