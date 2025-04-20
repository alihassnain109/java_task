public class Message {
    String text ;

    Message(String text) {
        this.text = text;
    }
    void setMessage(String text){
        this.text=text;
    }
    void Display (){
        System.out.println(text);
    }

    public String toString(){
        return text;
    }
}