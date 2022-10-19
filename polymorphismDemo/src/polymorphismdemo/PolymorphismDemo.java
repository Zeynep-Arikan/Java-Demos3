package polymorphismdemo;

public class PolymorphismDemo {

    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{
//            new FileLogger(),
//            new DatabaseLogger(),
//            new EmailLogger(),
//            new ConsoleLogger()
//
//        };
//        for(BaseLogger logger: loggers)
//            logger.Log("Log mesajı");

          CustomerManager cutomermanager = new CustomerManager(new DatabaseLogger());
          cutomermanager.add();

    
    }
}