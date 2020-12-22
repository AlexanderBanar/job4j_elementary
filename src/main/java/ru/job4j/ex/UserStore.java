package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User userForCheck = null;
        for (int i = 0; i < users.length; i++) {
            userForCheck = users[i];
            if (userForCheck.getUsername().equals(login)) {
                break;
            }
        }
        if (userForCheck == null) {
            throw new UserNotFoundException("User not found");
        }
        return userForCheck;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean validity = user.isValid() && user.getUsername().length() > 3;
        if (!validity) {
            throw new UserInvalidException("Invalid user or username is less than 3 symbols");
        }
        return validity;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException i) {
            i.printStackTrace();
        } catch (UserNotFoundException n) {
            n.printStackTrace();
        }
    }
}
