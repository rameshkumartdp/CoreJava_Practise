package exceptions;

import java.util.Date;

public class ChainedExceptions {
    public void getAssetExpirationDate() {
        try {
            int assetId = getAssetId();
            System.out.println(100/assetId);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public int getAssetId() {
        int assetId = 0;
        try {
            Asset asset = null;
            assetId = asset.getAssetId();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return assetId;
    }
    public static void main(String[] args) {
        new ChainedExceptions().getAssetExpirationDate();
    }
}

class Asset {
    private int assetId;
    private Date expireDate;

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
}
