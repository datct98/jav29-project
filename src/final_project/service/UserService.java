package final_project.service;

public class UserService {
    private static UserService instance;
    private UserService() {
    }

    public static synchronized UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }
}
