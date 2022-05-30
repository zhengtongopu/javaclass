package interface_;



public interface TestInter {

    public void start();

    public void stop();
}

//默认修饰符的接口
interface TestInter2 {

    public void watch();

    public void game();
}

//一个类可以实现多个接口
class phone implements TestInter, TestInter2 {

    @Override
    public void start() {
        System.out.println("手机开机");
    }

    @Override
    public void stop() {
        System.out.println("手机关机");
    }

    @Override
    public void watch() {
        System.out.println("拿手机看视频");
    }

    @Override
    public void game() {
        System.out.println("拿手机玩游戏");

    }
}

abstract class TestAbstract implements TestInter {
//    未实现方法也不报错
}


