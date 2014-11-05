package BuilderPattern;

class BenzModel extends CarModel {

    @Override
    public void start() {
        System.out.println("Benz" + "start");
    }

    @Override
    public void stop() {
        System.out.println("Benz" + "stop");
    }

    @Override
    public void alarm() {
        System.out.println("Benz" + "alarm");
    }

    @Override
    public void engineBoom() {
        System.out.println("Benz" + "engineBoom");
    }

}
