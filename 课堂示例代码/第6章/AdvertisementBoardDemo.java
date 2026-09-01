interface BoardAdvertisement {
    String companyName();
    String advertisement();
}

class BlackLandCompany implements BoardAdvertisement {
    @Override
    public String companyName() {
        return "黑土集团";
    }

    @Override
    public String advertisement() {
        return "黑土地，健康的选择";
    }
}

class WhiteCloudCompany implements BoardAdvertisement {
    @Override
    public String companyName() {
        return "白云有限公司";
    }

    @Override
    public String advertisement() {
        return "白云服务，轻松生活";
    }
}

class DemoAdvertisementBoard {
    private BoardAdvertisement advertisement;

    void setAdvertisement(BoardAdvertisement advertisement) {
        this.advertisement = advertisement;
    }

    void show() {
        if (advertisement == null) {
            System.out.println("广告招商中");
        } else {
            System.out.println(advertisement.companyName());
            System.out.println(advertisement.advertisement());
        }
    }
}

public class AdvertisementBoardDemo {
    public static void main(String[] args) {
        DemoAdvertisementBoard board = new DemoAdvertisementBoard();
        board.show();
        board.setAdvertisement(new BlackLandCompany());
        board.show();
        board.setAdvertisement(new WhiteCloudCompany());
        board.show();
    }
}
