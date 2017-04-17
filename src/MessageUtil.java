public class MessageUtil {
   private String message;
   //Constructor
   //@param message to be printed
   public MessageUtil(String message){
      this.message = message; 
   }
   // prints the message
   public String printMessage(){
      System.out.println(message);
      return message;
   }
   // add "Hi!" to the message
   public String salutationMessage(){
      message = "Hi!12" + message;
      System.out.println(message);
      return message;
   }   
}