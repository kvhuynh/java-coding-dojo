import java.text.SimpleDateFormat;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Hello, " + name + ". Lovely to see you.";
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") != -1) {
            return "At your service. As you wish naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    public String guestGreeting() {
        SimpleDateFormat formatter = new SimpleDateFormat("H");
        Date date = new Date();
        int timeOfDay = Integer.parseInt(formatter.format(date));
        if (timeOfDay >= 12 && timeOfDay < 18) {
            return "Good afternoon";
        } else if (timeOfDay >= 18 && timeOfDay <= 20) {
            return "Good evening";
        } else if (timeOfDay > 21) {
            return "Good night";
        } else {
            return "Good morning";
        }
    }
}

