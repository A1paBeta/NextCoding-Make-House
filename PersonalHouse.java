public class PersonalHouse extends House{

    private String mPassword;

    public PersonalHouse(int width, int height, String name, String password){
        super(width,height,name);

        this.mPassword = password;
    }

    public boolean mDoorLock(String password){
        if(this.mPassword.equals(password) == true){
            System.out.println("비밀번호가 일치합니다.");
            return true;
        }else{
            System.out.println("비밀번호가 일치하지 않습니다.");
            return false;
        }
    }

    public boolean mPasswordFormat(String nowPassword, String newPassword){
        if(mPassword.equals(nowPassword) == true){
            System.out.println("비밀번호가 일치하여 새로운 비밀번호로 변경되었습니다.");
            mPassword = newPassword;

            return true;
        }else {
            System.out.println("비밀번호가 틀립니다.");
            return false;
        }
    }
}
