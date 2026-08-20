package Access_modifires.private_;

class UserProfile {
    private String status = "offline";

    public void login(){
        status = "online";
        System.out.println("user is loged in");
    }
    public void logout(){
        status = "offline";
        System.out.println("user is loged out");
    }
    public void showStatus(){
        System.out.println("current status : "+status);
    }
}

public class Social_media {
    public static void main(String[] args){
        UserProfile up = new UserProfile();
        up.login();
        up.logout();

        up.showStatus();
    }
}
