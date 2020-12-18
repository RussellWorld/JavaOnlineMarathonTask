package Day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String userName;
    private final List<User> subscriptions;

    public User(String userName) {
        this.userName = userName;
        this.subscriptions = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public boolean isSubscrubed(User user) {
        for (User currentUser : subscriptions)
            if (currentUser.getUserName().equals(user.getUserName()))
                return true;
        return false;
    }

    public boolean isFriend(User user) {
        return this.isSubscrubed(user) && user.isSubscrubed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    public String toString() {
        return userName;
    }
}



