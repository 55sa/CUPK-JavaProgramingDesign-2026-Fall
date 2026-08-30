interface AdvertisementPractice {
    void showAdvertisement();
    String getCompanyName();
}

class CampusAdvertisementPractice implements AdvertisementPractice {
    @Override
    public void showAdvertisement() {
        // TODO 1: 输出广告内容。
    }

    @Override
    public String getCompanyName() {
        // TODO 2: 返回公司名称。
        return "";
    }
}

public class AdvertisementInterfacePractice {
    public static void main(String[] args) {
        // TODO 3: 用接口引用调用广告内容和公司名称。
    }
}
