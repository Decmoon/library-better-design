package storage.configuration;

/**
 * 软件
 *
 * @author decmoon
 */
public enum Software implements Enumeration {

    QQ("QQ", "腾讯QQ"),
    NET_E_MUSIC("NetEMusic", "网易云音乐"),
    WE_CHAT("WeChat", "微信"),
    ALI_PAY("AliPay", "支付宝");

    private String englishName;
    private String chineseName;

    Software(String englishName, String chineseName) {
        this.englishName = englishName;
        this.chineseName = chineseName;
    }

    @Override
    public String getEnglishName() {
        return englishName;
    }

    @Override
    public String getChineseName() {
        return chineseName;
    }

}
