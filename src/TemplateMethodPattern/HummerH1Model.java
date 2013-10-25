package TemplateMethodPattern;

class HummerH1Model extends HummerModel
{

    @Override
    public void start()
    {
        System.out.println("H1" + "start");
    }

    @Override
    public void stop()
    {
        System.out.println("H1" + "stop");
    }

    @Override
    public void alarm()
    {
        System.out.println("H1" + "alarm");
    }

    @Override
    public void engineBoom()
    {
        System.out.println("H1" + "engineBoom");
    }

    @Override
    public void setAlarm()
    {
        isAlarm = false;
    }

}