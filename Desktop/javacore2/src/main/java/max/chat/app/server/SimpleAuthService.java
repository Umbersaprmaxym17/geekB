package max.chat.app.server;

import java.util.ArrayList;
import java.util.List;

public class SimpleAuthService implements AuthService {

    private List<UserData> users;

    private static class UserData {
        private final String login;
        private final String password;
        private final String nickName;


        public UserData(String login, String password, String nickName) {
            this.login = login;
            this.password = password;
            this.nickName = nickName;
        }


    }


    public SimpleAuthService() {
        users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            users.add(new UserData(
                    "login" + i,
                    "pass" + i,
                    "nickname" + i
                    ));
        }
    }




    @Override
    public String getNickNameBYLoginAndPassword(String login, String password) {
        for (UserData user : users) {
            if (login.equals(user.login) && password.equals(user.password)) {
                return user.nickName;
            }
        }
        return null;
    }


}
