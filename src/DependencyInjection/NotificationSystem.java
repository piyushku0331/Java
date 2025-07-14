package DependencyInjection;

interface MessageService{
    String sendMessage(String message);
}

class EmailService implements MessageService{
    public String sendMessage(String message){
        return "Email Sent "+message;
    }
}

class MessageSent implements MessageService{
    public String sendMessage(String message){
        return "Message Sent "+message;
    }
}

class NotificationManager{
    private final MessageService messageService;

    public NotificationManager(MessageService messageService){
        this.messageService = messageService;
    }

    public void notifyUser(String message){
        String result = messageService.sendMessage(message);
        System.out.println(result);
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        EmailService obj = new EmailService();
        MessageSent objt = new MessageSent();
        NotificationManager object = new NotificationManager(obj);
        NotificationManager object2 = new NotificationManager(objt);
        object.notifyUser("Welcome piyushku0331@gmail.com");
        object2.notifyUser("Welcome Piyush");
    }
}