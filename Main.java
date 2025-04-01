//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Car mustang =new Car("ford","swift",1995,21000.34);
    mustang.isRunning=true;
    System.out.println(mustang.isRunning + " " + mustang.model + " " + mustang.year + " " + mustang.price+ " "+ mustang.make);
    mustang.brake();
    }
}