interface AdvertisementPracticeAnswer {
    void showAdvertisement();
    String getCompanyName();
}

class CampusAdvertisementPracticeAnswer implements AdvertisementPracticeAnswer {
    @Override
    public void showAdvertisement() {
        System.out.println("Learn Java, build the future!");
    }

    @Override
    public String getCompanyName() {
        return "Campus Tech";
    }
}

public class AdvertisementInterfacePracticeAnswer {
    public static void main(String[] args) {
        AdvertisementPracticeAnswer advertisement = new CampusAdvertisementPracticeAnswer();
        advertisement.showAdvertisement();
        System.out.println(advertisement.getCompanyName());
    }
}
