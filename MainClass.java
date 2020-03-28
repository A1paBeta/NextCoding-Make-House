import java.util.Scanner;

public class MainClass {

    private static void mShowMenu(){
        System.out.println("1. 도어락 열기");
        System.out.println("2. 도어락 비밀번호 초기화");
        System.out.println("3. 집 너비 구하기");
        System.out.println("4. 집 부피 구하기");
    }

    public static void main(String[] args) {
        PersonalHouse mYongHyunHouse = new PersonalHouse(15, 10, "YongHyunHouse", "1234");

        Scanner scan = new Scanner(System.in);
        int command;
        do{
            mShowMenu();
            command = scan.nextInt();

            switch(command){
                case 1 :
                    // TODO 도어락 열기
                    scan.nextLine();
                    String password = scan.nextLine();
                    System.out.println(password);
                    mYongHyunHouse.mDoorLock(password);

                    break;
                case 2 :
                    // TODO 도어락 비밀번호 초기화
                    String nowPassword, newPassword;
                    scan.nextLine();
                    nowPassword = scan.nextLine();


                    newPassword = scan.nextLine();

                    mYongHyunHouse.mPasswordFormat(nowPassword, newPassword);
                    break;
                case 3:
                    // TODO 집 너비 구하기
                    System.out.println(String.valueOf(mYongHyunHouse.getWidth()));
                    break;

                case 4 :
                    // TODO 집 부피 구하기

                    break;
                default:
                    System.out.println("해당 커맨드가 존재하지 않습니다. 프로그램을 종료합니다.");
                    break;
            }

        }while(1<=command && command<=4);


    }
}
