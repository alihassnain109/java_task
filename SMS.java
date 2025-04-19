public class SMS extends Message{
    String rec_contact;

    SMS(String text, String rec_contact){
        super(text);
        this.rec_contact = rec_contact;
    }

    void Display(){
        System.out.println(super.text);
        System.out.println(this.rec_contact);
    }
    @Override
    public String toString() {
        return "Text : " + text + ", Recipient:" + rec_contact;
    }
}