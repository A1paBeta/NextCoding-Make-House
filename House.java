public class House {

    private int mWidth, mHeight;
    private boolean mLightStatus;
    private String mHouseName;

    //생성자 메소드
    public House(int width, int height, String name){
        this(width,height,name,false);
    }
    //생성자 메소드
    public House(int width, int height, String name, boolean lightStatus){
        this.mWidth = width;
        this.mHeight = height;
        this.mHouseName = name;
        this.mLightStatus = lightStatus;
    }

    //getter
    public int getWidth(){
        return this.mWidth;
    }

    //setter
    public void setWidth(int width){
        this.mWidth = width;
    }

    public void mWalkMethod(){
        System.out.println("뚜벅 뚜벅");
    }

    public void mOnOffLight(){
        if(this.mLightStatus == true){
            System.out.println("불을 끕니다.");
            this.mLightStatus = false;
        }else if(this.mLightStatus == false){
            System.out.println("불을 켭니다.");
            this.mLightStatus = true;
        }
    }

    public void mDropWater(){
        System.out.println("물을 내립니다.");
    }
}
