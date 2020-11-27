package com.example.shoppingcart.bean;

import com.example.shoppingcart.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "Apple iPhone 11", "小米10", "p40pro", "Galaxy Note20 Ultra", "oppo", "Galaxy Z Fold2",
            "Apple iPhone 12 mini ","Apple iPhone 12 Pro Max"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "Apple iPhone 11 (A2223) 128GB 黑色 移动联通电信4G手机 双卡双待",
            "小米10 至尊纪念版 双模5G  骁龙865 120HZ高刷新率 120倍长焦镜头 120W快充 12GB+256GB  陶瓷黑  游戏手机",
            "华为 HUAWEI P40 Pro 麒麟990 5G SoC芯片 5000万超感知徕卡四摄 50倍数字变焦 8GB+128GB亮黑色全网通5G手机",
            "三星Galaxy Note20 Ultra 5G(SM-N9860)S Pen&三星笔记 120Hz自适应屏幕 5G手机游戏手机 12GB+256GB 迷雾金",
            "OPPO Find X2 Pro  60倍数码变焦 120Hz超感屏 3K分辨率 65w闪充 骁龙865 12GB+256GB茶橘 双模5G旗舰手机",
            "三星Galaxy Z Fold2 5G(SM-F9160)折叠屏 双模5G手机 骁龙865+内外双屏12GB+512GB松烟墨",
            "Apple iPhone 12 mini (A2400) 64GB 蓝色 手机 支持移动联通电信5G",
            "Apple iPhone 12 Pro Max (A2412) 128GB 海蓝色 支持移动联通电信5G 双卡双待手机"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {4999,5999,4988,9199,5999,16999,5499,9299};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.apple_s, R.drawable.xiaomi_s, R.drawable.huawei_s,
            R.drawable.sanxing_s, R.drawable.oppo_s, R.drawable.fold_s,
            R.drawable.iphone_s,R.drawable.pingguo_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.apple, R.drawable.xiaomi, R.drawable.huawei,
            R.drawable.sanxing, R.drawable.oppo, R.drawable.fold,
            R.drawable.iphone,R.drawable.iphone
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
