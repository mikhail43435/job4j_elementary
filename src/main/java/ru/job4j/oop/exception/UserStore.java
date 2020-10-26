package test.java.main.oop.exception;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUsername().equals(login)) {
                user = users[index];
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("User not found!");
        }
        return user;
    }

        public static boolean validate(User user) throws UserInvalidException {
            if (user.isValid() && (user.getUsername().length() >= 3)) {
                return true;
            } else {
                throw new UserInvalidException("This user is no valid");
            }
        }

        public static void main(String[] args) throws UserNotFoundException, UserInvalidException {
            User[] users = {
                    new User("Petr Arsentev", true),
                    new User("Alex Dentev", false)
            };

            try {
                User user = findUser(users, "Alex Dentev");
                if (validate(user)) {
                    System.out.println("This user has an access");
                }
            } catch (UserInvalidException ie) {
                ie.printStackTrace();
            } catch (UserNotFoundException unf) {
                unf.printStackTrace();
            } catch (NullPointerException npe) {
                npe.printStackTrace();
            }
        }

}
