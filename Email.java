public class Email extends Message{
    String Sender;
    String Receiver;
    String Subject;

    Email(String text, String Sender, String Receiver, String Subject){
        super(text);
        this.Sender = Sender;
        this.Receiver = Receiver;
        this.Subject = Subject;
    }

    void Display() {
        System.out.println(super.text);
        System.out.println(this.Sender);
        System.out.println(this.Receiver);
        System.out.println(this.Subject);
    }
    @Override
    public String toString(){
        return "Text" + text + ", Sender: " + Sender + ", Receiver: " + Receiver + ", Subject: " + Subject;
    }
}

