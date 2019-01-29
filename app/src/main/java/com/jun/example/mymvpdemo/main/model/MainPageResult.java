package com.jun.example.mymvpdemo.main.model;

import java.io.Serializable;
import java.util.List;

public class MainPageResult implements Serializable {


    /**
     * msg : 操作成功！
     * anno : [{"base_order_string":"","dynamic_update_fileld":"","zsfdAnnouncementId":"e08243e6f2b246f999f2f9adad3d4cb9","zsfdAnnouncementOpTime":"2018-11-08 23:36:46","zsfdAnnouncementTitle":"","zsfdAnnouncementDetail":"在飞云之下在飞云之下在飞云之下在飞云之下在飞云之下在飞云之下在飞云之下在飞云之下在飞云之下在飞云之下"}]
     * code : 1
     * vedio : [[{"base_order_string":"","dynamic_update_fileld":"","vedioId":"db4738ac375941579b1785e2792bc5ae","vedioOpTime":"2018-12-08 16:58:28","vedioUrl":"http://192.168.1.192/index/upload/tq//1544259505848_b91bdb44d03a42828860c430ab0c07f3.mp4","vedioFirstPic":"http://192.168.1.192/index/upload/tq//1544259505852_c8abe2f7957e4883bbcad101485360da.jpg","vedioUserId":"demo","vedioType":"3","vedioStatus":"1","vedioTitle":"十东方","vedioDetail":"撒旦发射点发射点","vedilFailInfo":"","vedioCommentCount":"0","vedioLikeCount":"0","vedioSysType":"1","vedioCurLike":"","comList":"","likeList":"","type":""},{"base_order_string":"","dynamic_update_fileld":"","vedioId":"97cf15f238124868b86c27b1da614c53","vedioOpTime":"2018-12-08 16:47:51","vedioUrl":"http://192.168.1.192/index/upload/tq//1544258869215_8830e3807b404c8a959d0f7402426013.jpg","vedioFirstPic":"","vedioUserId":"demo","vedioType":"2","vedioStatus":"1","vedioTitle":"撒大声地撒大所多","vedioDetail":"啊是打算打算多","vedilFailInfo":"","vedioCommentCount":"0","vedioLikeCount":"0","vedioSysType":"2","vedioCurLike":"","comList":"","likeList":"","type":""}],[{"base_order_string":"","dynamic_update_fileld":"","vedioId":"db4738ac375941579b1785e2792bc5ae","vedioOpTime":"2018-12-08 16:58:28","vedioUrl":"http://192.168.1.192/index/upload/tq//1544259505848_b91bdb44d03a42828860c430ab0c07f3.mp4","vedioFirstPic":"http://192.168.1.192/index/upload/tq//1544259505852_c8abe2f7957e4883bbcad101485360da.jpg","vedioUserId":"demo","vedioType":"3","vedioStatus":"1","vedioTitle":"十东方","vedioDetail":"撒旦发射点发射点","vedilFailInfo":"","vedioCommentCount":"0","vedioLikeCount":"0","vedioSysType":"1","vedioCurLike":"","comList":"","likeList":"","type":""},{"base_order_string":"","dynamic_update_fileld":"","vedioId":"97cf15f238124868b86c27b1da614c53","vedioOpTime":"2018-12-08 16:47:51","vedioUrl":"http://192.168.1.192/index/upload/tq//1544258869215_8830e3807b404c8a959d0f7402426013.jpg","vedioFirstPic":"","vedioUserId":"demo","vedioType":"2","vedioStatus":"1","vedioTitle":"撒大声地撒大所多","vedioDetail":"啊是打算打算多","vedilFailInfo":"","vedioCommentCount":"0","vedioLikeCount":"0","vedioSysType":"2","vedioCurLike":"","comList":"","likeList":"","type":""}],[{"base_order_string":"","dynamic_update_fileld":"","vedioId":"db4738ac375941579b1785e2792bc5ae","vedioOpTime":"2018-12-08 16:58:28","vedioUrl":"http://192.168.1.192/index/upload/tq//1544259505848_b91bdb44d03a42828860c430ab0c07f3.mp4","vedioFirstPic":"http://192.168.1.192/index/upload/tq//1544259505852_c8abe2f7957e4883bbcad101485360da.jpg","vedioUserId":"demo","vedioType":"3","vedioStatus":"1","vedioTitle":"十东方","vedioDetail":"撒旦发射点发射点","vedilFailInfo":"","vedioCommentCount":"0","vedioLikeCount":"0","vedioSysType":"1","vedioCurLike":"","comList":"","likeList":"","type":""},{"base_order_string":"","dynamic_update_fileld":"","vedioId":"97cf15f238124868b86c27b1da614c53","vedioOpTime":"2018-12-08 16:47:51","vedioUrl":"http://192.168.1.192/index/upload/tq//1544258869215_8830e3807b404c8a959d0f7402426013.jpg","vedioFirstPic":"","vedioUserId":"demo","vedioType":"2","vedioStatus":"1","vedioTitle":"撒大声地撒大所多","vedioDetail":"啊是打算打算多","vedilFailInfo":"","vedioCommentCount":"0","vedioLikeCount":"0","vedioSysType":"2","vedioCurLike":"","comList":"","likeList":"","type":""}],[{"base_order_string":"","dynamic_update_fileld":"","vedioId":"db4738ac375941579b1785e2792bc5ae","vedioOpTime":"2018-12-08 16:58:28","vedioUrl":"http://192.168.1.192/index/upload/tq//1544259505848_b91bdb44d03a42828860c430ab0c07f3.mp4","vedioFirstPic":"http://192.168.1.192/index/upload/tq//1544259505852_c8abe2f7957e4883bbcad101485360da.jpg","vedioUserId":"demo","vedioType":"3","vedioStatus":"1","vedioTitle":"十东方","vedioDetail":"撒旦发射点发射点","vedilFailInfo":"","vedioCommentCount":"0","vedioLikeCount":"0","vedioSysType":"1","vedioCurLike":"","comList":"","likeList":"","type":""},{"base_order_string":"","dynamic_update_fileld":"","vedioId":"97cf15f238124868b86c27b1da614c53","vedioOpTime":"2018-12-08 16:47:51","vedioUrl":"http://192.168.1.192/index/upload/tq//1544258869215_8830e3807b404c8a959d0f7402426013.jpg","vedioFirstPic":"","vedioUserId":"demo","vedioType":"2","vedioStatus":"1","vedioTitle":"撒大声地撒大所多","vedioDetail":"啊是打算打算多","vedilFailInfo":"","vedioCommentCount":"0","vedioLikeCount":"0","vedioSysType":"2","vedioCurLike":"","comList":"","likeList":"","type":""}]]
     * mation : [[{"base_order_string":"","dynamic_update_fileld":"","infoId":"60a3e27b561549af81fa3858428f6550","infoOpTime":"2018-12-08 15:30:16","infoUserId":"demo","infoType":"","infoStatus":"1","infoTitle":"","infoDetail":"","infoCommentCount":"0","infoLikeCount":"0","curLike":"","picList":[{"base_order_string":"","dynamic_update_fileld":"","id":"f4e6b3fbefe84ae5a3d45b3219b30a20","infoId":"60a3e27b561549af81fa3858428f6550","infoPicUrl":"http://192.168.1.192/index/upload/tq//1544253290752_de6cd8896c0b455c98edba0253dd6f0d.MP4","infoPicOpTime":"2018-12-08 15:30:16"}],"commentList":"","likeList":"","firstPic":"","type":""},{"base_order_string":"","dynamic_update_fileld":"","infoId":"82e0d1cbb8fb436283bbe5e7d9faab5a","infoOpTime":"2018-11-27 16:16:59","infoUserId":"demo","infoType":"4","infoStatus":"1","infoTitle":"2","infoDetail":"拼多多app被苹果应用商店下架?官方回应来了! 今天上午，不少用户反映拼多多被苹果应用商店下架，在app store中搜索\u201c拼多多\u201d只能找到商家版，而官网扫码跳转后则显示App不可用，目前，此App在您所在的国家或地区尚未提供。\t1\t","infoCommentCount":"0","infoLikeCount":"0","curLike":"","picList":[{"base_order_string":"","dynamic_update_fileld":"","id":"46e51869dadb437597a0a1f00e9990e8","infoId":"82e0d1cbb8fb436283bbe5e7d9faab5a","infoPicUrl":"http://39.104.122.21/index/upload/tq//1543306617292_03c6a8f72f5f45e4b35de1fbd7bc823b.jpg","infoPicOpTime":"2018-11-27 16:16:59"}],"commentList":"","likeList":"","firstPic":"","type":""},{"base_order_string":"","dynamic_update_fileld":"","infoId":"2243fdcf0a0a445bac3f106dd78947c9","infoOpTime":"2018-11-27 16:16:43","infoUserId":"demo","infoType":"3","infoStatus":"1","infoTitle":"2","infoDetail":"拼多多app被苹果应用商店下架?官方回应来了! 今天上午，不少用户反映拼多多被苹果应用商店下架，在app store中搜索\u201c拼多多\u201d只能找到商家版，而官网扫码跳转后则显示App不可用，目前，此App在您所在的国家或地区尚未提供。\t1\t","infoCommentCount":"0","infoLikeCount":"0","curLike":"","picList":[{"base_order_string":"","dynamic_update_fileld":"","id":"7ad9c6409a584b0b8059238e2bd9f06a","infoId":"2243fdcf0a0a445bac3f106dd78947c9","infoPicUrl":"http://39.104.122.21/index/upload/tq//1543306601870_c2abded71a3442e49ffe3dc7f93fbce3.jpg","infoPicOpTime":"2018-11-27 16:16:43"}],"commentList":"","likeList":"","firstPic":"","type":""}],[{"base_order_string":"","dynamic_update_fileld":"","infoId":"60a3e27b561549af81fa3858428f6550","infoOpTime":"2018-12-08 15:30:16","infoUserId":"demo","infoType":"","infoStatus":"1","infoTitle":"","infoDetail":"","infoCommentCount":"0","infoLikeCount":"0","curLike":"","picList":[{"base_order_string":"","dynamic_update_fileld":"","id":"f4e6b3fbefe84ae5a3d45b3219b30a20","infoId":"60a3e27b561549af81fa3858428f6550","infoPicUrl":"http://192.168.1.192/index/upload/tq//1544253290752_de6cd8896c0b455c98edba0253dd6f0d.MP4","infoPicOpTime":"2018-12-08 15:30:16"}],"commentList":"","likeList":"","firstPic":"","type":""},{"base_order_string":"","dynamic_update_fileld":"","infoId":"82e0d1cbb8fb436283bbe5e7d9faab5a","infoOpTime":"2018-11-27 16:16:59","infoUserId":"demo","infoType":"4","infoStatus":"1","infoTitle":"2","infoDetail":"拼多多app被苹果应用商店下架?官方回应来了! 今天上午，不少用户反映拼多多被苹果应用商店下架，在app store中搜索\u201c拼多多\u201d只能找到商家版，而官网扫码跳转后则显示App不可用，目前，此App在您所在的国家或地区尚未提供。\t1\t","infoCommentCount":"0","infoLikeCount":"0","curLike":"","picList":[{"base_order_string":"","dynamic_update_fileld":"","id":"46e51869dadb437597a0a1f00e9990e8","infoId":"82e0d1cbb8fb436283bbe5e7d9faab5a","infoPicUrl":"http://39.104.122.21/index/upload/tq//1543306617292_03c6a8f72f5f45e4b35de1fbd7bc823b.jpg","infoPicOpTime":"2018-11-27 16:16:59"}],"commentList":"","likeList":"","firstPic":"","type":""},{"base_order_string":"","dynamic_update_fileld":"","infoId":"2243fdcf0a0a445bac3f106dd78947c9","infoOpTime":"2018-11-27 16:16:43","infoUserId":"demo","infoType":"3","infoStatus":"1","infoTitle":"2","infoDetail":"拼多多app被苹果应用商店下架?官方回应来了! 今天上午，不少用户反映拼多多被苹果应用商店下架，在app store中搜索\u201c拼多多\u201d只能找到商家版，而官网扫码跳转后则显示App不可用，目前，此App在您所在的国家或地区尚未提供。\t1\t","infoCommentCount":"0","infoLikeCount":"0","curLike":"","picList":[{"base_order_string":"","dynamic_update_fileld":"","id":"7ad9c6409a584b0b8059238e2bd9f06a","infoId":"2243fdcf0a0a445bac3f106dd78947c9","infoPicUrl":"http://39.104.122.21/index/upload/tq//1543306601870_c2abded71a3442e49ffe3dc7f93fbce3.jpg","infoPicOpTime":"2018-11-27 16:16:43"}],"commentList":"","likeList":"","firstPic":"","type":""}],[{"base_order_string":"","dynamic_update_fileld":"","infoId":"60a3e27b561549af81fa3858428f6550","infoOpTime":"2018-12-08 15:30:16","infoUserId":"demo","infoType":"","infoStatus":"1","infoTitle":"","infoDetail":"","infoCommentCount":"0","infoLikeCount":"0","curLike":"","picList":[{"base_order_string":"","dynamic_update_fileld":"","id":"f4e6b3fbefe84ae5a3d45b3219b30a20","infoId":"60a3e27b561549af81fa3858428f6550","infoPicUrl":"http://192.168.1.192/index/upload/tq//1544253290752_de6cd8896c0b455c98edba0253dd6f0d.MP4","infoPicOpTime":"2018-12-08 15:30:16"}],"commentList":"","likeList":"","firstPic":"","type":""},{"base_order_string":"","dynamic_update_fileld":"","infoId":"82e0d1cbb8fb436283bbe5e7d9faab5a","infoOpTime":"2018-11-27 16:16:59","infoUserId":"demo","infoType":"4","infoStatus":"1","infoTitle":"2","infoDetail":"拼多多app被苹果应用商店下架?官方回应来了! 今天上午，不少用户反映拼多多被苹果应用商店下架，在app store中搜索\u201c拼多多\u201d只能找到商家版，而官网扫码跳转后则显示App不可用，目前，此App在您所在的国家或地区尚未提供。\t1\t","infoCommentCount":"0","infoLikeCount":"0","curLike":"","picList":[{"base_order_string":"","dynamic_update_fileld":"","id":"46e51869dadb437597a0a1f00e9990e8","infoId":"82e0d1cbb8fb436283bbe5e7d9faab5a","infoPicUrl":"http://39.104.122.21/index/upload/tq//1543306617292_03c6a8f72f5f45e4b35de1fbd7bc823b.jpg","infoPicOpTime":"2018-11-27 16:16:59"}],"commentList":"","likeList":"","firstPic":"","type":""},{"base_order_string":"","dynamic_update_fileld":"","infoId":"2243fdcf0a0a445bac3f106dd78947c9","infoOpTime":"2018-11-27 16:16:43","infoUserId":"demo","infoType":"3","infoStatus":"1","infoTitle":"2","infoDetail":"拼多多app被苹果应用商店下架?官方回应来了! 今天上午，不少用户反映拼多多被苹果应用商店下架，在app store中搜索\u201c拼多多\u201d只能找到商家版，而官网扫码跳转后则显示App不可用，目前，此App在您所在的国家或地区尚未提供。\t1\t","infoCommentCount":"0","infoLikeCount":"0","curLike":"","picList":[{"base_order_string":"","dynamic_update_fileld":"","id":"7ad9c6409a584b0b8059238e2bd9f06a","infoId":"2243fdcf0a0a445bac3f106dd78947c9","infoPicUrl":"http://39.104.122.21/index/upload/tq//1543306601870_c2abded71a3442e49ffe3dc7f93fbce3.jpg","infoPicOpTime":"2018-11-27 16:16:43"}],"commentList":"","likeList":"","firstPic":"","type":""}],[{"base_order_string":"","dynamic_update_fileld":"","infoId":"60a3e27b561549af81fa3858428f6550","infoOpTime":"2018-12-08 15:30:16","infoUserId":"demo","infoType":"","infoStatus":"1","infoTitle":"","infoDetail":"","infoCommentCount":"0","infoLikeCount":"0","curLike":"","picList":[{"base_order_string":"","dynamic_update_fileld":"","id":"f4e6b3fbefe84ae5a3d45b3219b30a20","infoId":"60a3e27b561549af81fa3858428f6550","infoPicUrl":"http://192.168.1.192/index/upload/tq//1544253290752_de6cd8896c0b455c98edba0253dd6f0d.MP4","infoPicOpTime":"2018-12-08 15:30:16"}],"commentList":"","likeList":"","firstPic":"","type":""},{"base_order_string":"","dynamic_update_fileld":"","infoId":"82e0d1cbb8fb436283bbe5e7d9faab5a","infoOpTime":"2018-11-27 16:16:59","infoUserId":"demo","infoType":"4","infoStatus":"1","infoTitle":"2","infoDetail":"拼多多app被苹果应用商店下架?官方回应来了! 今天上午，不少用户反映拼多多被苹果应用商店下架，在app store中搜索\u201c拼多多\u201d只能找到商家版，而官网扫码跳转后则显示App不可用，目前，此App在您所在的国家或地区尚未提供。\t1\t","infoCommentCount":"0","infoLikeCount":"0","curLike":"","picList":[{"base_order_string":"","dynamic_update_fileld":"","id":"46e51869dadb437597a0a1f00e9990e8","infoId":"82e0d1cbb8fb436283bbe5e7d9faab5a","infoPicUrl":"http://39.104.122.21/index/upload/tq//1543306617292_03c6a8f72f5f45e4b35de1fbd7bc823b.jpg","infoPicOpTime":"2018-11-27 16:16:59"}],"commentList":"","likeList":"","firstPic":"","type":""},{"base_order_string":"","dynamic_update_fileld":"","infoId":"2243fdcf0a0a445bac3f106dd78947c9","infoOpTime":"2018-11-27 16:16:43","infoUserId":"demo","infoType":"3","infoStatus":"1","infoTitle":"2","infoDetail":"拼多多app被苹果应用商店下架?官方回应来了! 今天上午，不少用户反映拼多多被苹果应用商店下架，在app store中搜索\u201c拼多多\u201d只能找到商家版，而官网扫码跳转后则显示App不可用，目前，此App在您所在的国家或地区尚未提供。\t1\t","infoCommentCount":"0","infoLikeCount":"0","curLike":"","picList":[{"base_order_string":"","dynamic_update_fileld":"","id":"7ad9c6409a584b0b8059238e2bd9f06a","infoId":"2243fdcf0a0a445bac3f106dd78947c9","infoPicUrl":"http://39.104.122.21/index/upload/tq//1543306601870_c2abded71a3442e49ffe3dc7f93fbce3.jpg","infoPicOpTime":"2018-11-27 16:16:43"}],"commentList":"","likeList":"","firstPic":"","type":""}]]
     * pic : [{"base_order_string":"","dynamic_update_fileld":"","id":"7b33e189cd7746f289825c52d838312c","indexPicUrl":"http://39.104.122.21/index/upload/tq//1543306467620_76bf0e95057e432bbd149665877c31a5.jpg","indexPicHref":"","indexPicOpTime":"2018-11-27 16:14:29"},{"base_order_string":"","dynamic_update_fileld":"","id":"8f665ce912d144e89fe9490c584041e7","indexPicUrl":"http://39.104.122.21/index/upload/tq//1543306448605_801851028b03483491a9c119fa30b4d9.jpg","indexPicHref":"","indexPicOpTime":"2018-11-27 16:14:10"}]
     * mon : ["4","9655","9411"]
     */

    private String msg;
    private String code;
    private List<AnnoBean> anno;
    private List<List<VedioBean>> vedio;
    private List<List<MationBean>> mation;
    private List<PicBean> pic;
    private List<String> mon;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<AnnoBean> getAnno() {
        return anno;
    }

    public void setAnno(List<AnnoBean> anno) {
        this.anno = anno;
    }

    public List<List<VedioBean>> getVedio() {
        return vedio;
    }

    public void setVedio(List<List<VedioBean>> vedio) {
        this.vedio = vedio;
    }

    public List<List<MationBean>> getMation() {
        return mation;
    }

    public void setMation(List<List<MationBean>> mation) {
        this.mation = mation;
    }

    public List<PicBean> getPic() {
        return pic;
    }

    public void setPic(List<PicBean> pic) {
        this.pic = pic;
    }

    public List<String> getMon() {
        return mon;
    }

    public void setMon(List<String> mon) {
        this.mon = mon;
    }

    public static class AnnoBean implements  Serializable {
        /**
         * base_order_string :
         * dynamic_update_fileld :
         * zsfdAnnouncementId : e08243e6f2b246f999f2f9adad3d4cb9
         * zsfdAnnouncementOpTime : 2018-11-08 23:36:46
         * zsfdAnnouncementTitle :
         * zsfdAnnouncementDetail : 在飞云之下在飞云之下在飞云之下在飞云之下在飞云之下在飞云之下在飞云之下在飞云之下在飞云之下在飞云之下
         */

        private String base_order_string;
        private String dynamic_update_fileld;
        private String zsfdAnnouncementId;
        private String zsfdAnnouncementOpTime;
        private String zsfdAnnouncementTitle;
        private String zsfdAnnouncementDetail;

        public String getBase_order_string() {
            return base_order_string;
        }

        public void setBase_order_string(String base_order_string) {
            this.base_order_string = base_order_string;
        }

        public String getDynamic_update_fileld() {
            return dynamic_update_fileld;
        }

        public void setDynamic_update_fileld(String dynamic_update_fileld) {
            this.dynamic_update_fileld = dynamic_update_fileld;
        }

        public String getZsfdAnnouncementId() {
            return zsfdAnnouncementId;
        }

        public void setZsfdAnnouncementId(String zsfdAnnouncementId) {
            this.zsfdAnnouncementId = zsfdAnnouncementId;
        }

        public String getZsfdAnnouncementOpTime() {
            return zsfdAnnouncementOpTime;
        }

        public void setZsfdAnnouncementOpTime(String zsfdAnnouncementOpTime) {
            this.zsfdAnnouncementOpTime = zsfdAnnouncementOpTime;
        }

        public String getZsfdAnnouncementTitle() {
            return zsfdAnnouncementTitle;
        }

        public void setZsfdAnnouncementTitle(String zsfdAnnouncementTitle) {
            this.zsfdAnnouncementTitle = zsfdAnnouncementTitle;
        }

        public String getZsfdAnnouncementDetail() {
            return zsfdAnnouncementDetail;
        }

        public void setZsfdAnnouncementDetail(String zsfdAnnouncementDetail) {
            this.zsfdAnnouncementDetail = zsfdAnnouncementDetail;
        }
    }

    public static class VedioBean implements Serializable {
        /**
         * base_order_string :
         * dynamic_update_fileld :
         * vedioId : db4738ac375941579b1785e2792bc5ae
         * vedioOpTime : 2018-12-08 16:58:28
         * vedioUrl : http://192.168.1.192/index/upload/tq//1544259505848_b91bdb44d03a42828860c430ab0c07f3.mp4
         * vedioFirstPic : http://192.168.1.192/index/upload/tq//1544259505852_c8abe2f7957e4883bbcad101485360da.jpg
         * vedioUserId : demo
         * vedioType : 3
         * vedioStatus : 1
         * vedioTitle : 十东方
         * vedioDetail : 撒旦发射点发射点
         * vedilFailInfo :
         * vedioCommentCount : 0
         * vedioLikeCount : 0
         * vedioSysType : 1
         * vedioCurLike :
         * comList :
         * likeList :
         * type :
         */

        private String base_order_string;
        private String dynamic_update_fileld;
        private String vedioId;
        private String vedioOpTime;
        private String vedioUrl;
        private String vedioFirstPic;
        private String vedioUserId;
        private String vedioType;
        private String vedioStatus;
        private String vedioTitle;
        private String vedioDetail;
        private String vedilFailInfo;
        private String vedioCommentCount;
        private String vedioLikeCount;
        private String vedioSysType;
        private String vedioCurLike;
        private String comList;
        private String likeList;
        private String type;

        public String getBase_order_string() {
            return base_order_string;
        }

        public void setBase_order_string(String base_order_string) {
            this.base_order_string = base_order_string;
        }

        public String getDynamic_update_fileld() {
            return dynamic_update_fileld;
        }

        public void setDynamic_update_fileld(String dynamic_update_fileld) {
            this.dynamic_update_fileld = dynamic_update_fileld;
        }

        public String getVedioId() {
            return vedioId;
        }

        public void setVedioId(String vedioId) {
            this.vedioId = vedioId;
        }

        public String getVedioOpTime() {
            return vedioOpTime;
        }

        public void setVedioOpTime(String vedioOpTime) {
            this.vedioOpTime = vedioOpTime;
        }

        public String getVedioUrl() {
            return vedioUrl;
        }

        public void setVedioUrl(String vedioUrl) {
            this.vedioUrl = vedioUrl;
        }

        public String getVedioFirstPic() {
            return vedioFirstPic;
        }

        public void setVedioFirstPic(String vedioFirstPic) {
            this.vedioFirstPic = vedioFirstPic;
        }

        public String getVedioUserId() {
            return vedioUserId;
        }

        public void setVedioUserId(String vedioUserId) {
            this.vedioUserId = vedioUserId;
        }

        public String getVedioType() {
            return vedioType;
        }

        public void setVedioType(String vedioType) {
            this.vedioType = vedioType;
        }

        public String getVedioStatus() {
            return vedioStatus;
        }

        public void setVedioStatus(String vedioStatus) {
            this.vedioStatus = vedioStatus;
        }

        public String getVedioTitle() {
            return vedioTitle;
        }

        public void setVedioTitle(String vedioTitle) {
            this.vedioTitle = vedioTitle;
        }

        public String getVedioDetail() {
            return vedioDetail;
        }

        public void setVedioDetail(String vedioDetail) {
            this.vedioDetail = vedioDetail;
        }

        public String getVedilFailInfo() {
            return vedilFailInfo;
        }

        public void setVedilFailInfo(String vedilFailInfo) {
            this.vedilFailInfo = vedilFailInfo;
        }

        public String getVedioCommentCount() {
            return vedioCommentCount;
        }

        public void setVedioCommentCount(String vedioCommentCount) {
            this.vedioCommentCount = vedioCommentCount;
        }

        public String getVedioLikeCount() {
            return vedioLikeCount;
        }

        public void setVedioLikeCount(String vedioLikeCount) {
            this.vedioLikeCount = vedioLikeCount;
        }

        public String getVedioSysType() {
            return vedioSysType;
        }

        public void setVedioSysType(String vedioSysType) {
            this.vedioSysType = vedioSysType;
        }

        public String getVedioCurLike() {
            return vedioCurLike;
        }

        public void setVedioCurLike(String vedioCurLike) {
            this.vedioCurLike = vedioCurLike;
        }

        public String getComList() {
            return comList;
        }

        public void setComList(String comList) {
            this.comList = comList;
        }

        public String getLikeList() {
            return likeList;
        }

        public void setLikeList(String likeList) {
            this.likeList = likeList;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class MationBean implements Serializable {
        /**
         * base_order_string :
         * dynamic_update_fileld :
         * infoId : 60a3e27b561549af81fa3858428f6550
         * infoOpTime : 2018-12-08 15:30:16
         * infoUserId : demo
         * infoType :
         * infoStatus : 1
         * infoTitle :
         * infoDetail :
         * infoCommentCount : 0
         * infoLikeCount : 0
         * curLike :
         * picList : [{"base_order_string":"","dynamic_update_fileld":"","id":"f4e6b3fbefe84ae5a3d45b3219b30a20","infoId":"60a3e27b561549af81fa3858428f6550","infoPicUrl":"http://192.168.1.192/index/upload/tq//1544253290752_de6cd8896c0b455c98edba0253dd6f0d.MP4","infoPicOpTime":"2018-12-08 15:30:16"}]
         * commentList :
         * likeList :
         * firstPic :
         * type :
         */

        private String base_order_string;
        private String dynamic_update_fileld;
        private String infoId;
        private String infoOpTime;
        private String infoUserId;
        private String infoType;
        private String infoStatus;
        private String infoTitle;
        private String infoDetail;
        private String infoCommentCount;
        private String infoLikeCount;
        private String curLike;
        private String commentList;
        private String likeList;
        private String firstPic;
        private String type;
        private List<PicListBean> picList;

        public String getBase_order_string() {
            return base_order_string;
        }

        public void setBase_order_string(String base_order_string) {
            this.base_order_string = base_order_string;
        }

        public String getDynamic_update_fileld() {
            return dynamic_update_fileld;
        }

        public void setDynamic_update_fileld(String dynamic_update_fileld) {
            this.dynamic_update_fileld = dynamic_update_fileld;
        }

        public String getInfoId() {
            return infoId;
        }

        public void setInfoId(String infoId) {
            this.infoId = infoId;
        }

        public String getInfoOpTime() {
            return infoOpTime;
        }

        public void setInfoOpTime(String infoOpTime) {
            this.infoOpTime = infoOpTime;
        }

        public String getInfoUserId() {
            return infoUserId;
        }

        public void setInfoUserId(String infoUserId) {
            this.infoUserId = infoUserId;
        }

        public String getInfoType() {
            return infoType;
        }

        public void setInfoType(String infoType) {
            this.infoType = infoType;
        }

        public String getInfoStatus() {
            return infoStatus;
        }

        public void setInfoStatus(String infoStatus) {
            this.infoStatus = infoStatus;
        }

        public String getInfoTitle() {
            return infoTitle;
        }

        public void setInfoTitle(String infoTitle) {
            this.infoTitle = infoTitle;
        }

        public String getInfoDetail() {
            return infoDetail;
        }

        public void setInfoDetail(String infoDetail) {
            this.infoDetail = infoDetail;
        }

        public String getInfoCommentCount() {
            return infoCommentCount;
        }

        public void setInfoCommentCount(String infoCommentCount) {
            this.infoCommentCount = infoCommentCount;
        }

        public String getInfoLikeCount() {
            return infoLikeCount;
        }

        public void setInfoLikeCount(String infoLikeCount) {
            this.infoLikeCount = infoLikeCount;
        }

        public String getCurLike() {
            return curLike;
        }

        public void setCurLike(String curLike) {
            this.curLike = curLike;
        }

        public String getCommentList() {
            return commentList;
        }

        public void setCommentList(String commentList) {
            this.commentList = commentList;
        }

        public String getLikeList() {
            return likeList;
        }

        public void setLikeList(String likeList) {
            this.likeList = likeList;
        }

        public String getFirstPic() {
            return firstPic;
        }

        public void setFirstPic(String firstPic) {
            this.firstPic = firstPic;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<PicListBean> getPicList() {
            return picList;
        }

        public void setPicList(List<PicListBean> picList) {
            this.picList = picList;
        }

        public static class PicListBean implements Serializable {
            /**
             * base_order_string :
             * dynamic_update_fileld :
             * id : f4e6b3fbefe84ae5a3d45b3219b30a20
             * infoId : 60a3e27b561549af81fa3858428f6550
             * infoPicUrl : http://192.168.1.192/index/upload/tq//1544253290752_de6cd8896c0b455c98edba0253dd6f0d.MP4
             * infoPicOpTime : 2018-12-08 15:30:16
             */

            private String base_order_string;
            private String dynamic_update_fileld;
            private String id;
            private String infoId;
            private String infoPicUrl;
            private String infoPicOpTime;

            public String getBase_order_string() {
                return base_order_string;
            }

            public void setBase_order_string(String base_order_string) {
                this.base_order_string = base_order_string;
            }

            public String getDynamic_update_fileld() {
                return dynamic_update_fileld;
            }

            public void setDynamic_update_fileld(String dynamic_update_fileld) {
                this.dynamic_update_fileld = dynamic_update_fileld;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getInfoId() {
                return infoId;
            }

            public void setInfoId(String infoId) {
                this.infoId = infoId;
            }

            public String getInfoPicUrl() {
                return infoPicUrl;
            }

            public void setInfoPicUrl(String infoPicUrl) {
                this.infoPicUrl = infoPicUrl;
            }

            public String getInfoPicOpTime() {
                return infoPicOpTime;
            }

            public void setInfoPicOpTime(String infoPicOpTime) {
                this.infoPicOpTime = infoPicOpTime;
            }
        }
    }

    public static class PicBean  implements Serializable{
        /**
         * base_order_string :
         * dynamic_update_fileld :
         * id : 7b33e189cd7746f289825c52d838312c
         * indexPicUrl : http://39.104.122.21/index/upload/tq//1543306467620_76bf0e95057e432bbd149665877c31a5.jpg
         * indexPicHref :
         * indexPicOpTime : 2018-11-27 16:14:29
         */

        private String base_order_string;
        private String dynamic_update_fileld;
        private String id;
        private String indexPicUrl;
        private String indexPicHref;
        private String indexPicOpTime;

        public String getBase_order_string() {
            return base_order_string;
        }

        public void setBase_order_string(String base_order_string) {
            this.base_order_string = base_order_string;
        }

        public String getDynamic_update_fileld() {
            return dynamic_update_fileld;
        }

        public void setDynamic_update_fileld(String dynamic_update_fileld) {
            this.dynamic_update_fileld = dynamic_update_fileld;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIndexPicUrl() {
            return indexPicUrl;
        }

        public void setIndexPicUrl(String indexPicUrl) {
            this.indexPicUrl = indexPicUrl;
        }

        public String getIndexPicHref() {
            return indexPicHref;
        }

        public void setIndexPicHref(String indexPicHref) {
            this.indexPicHref = indexPicHref;
        }

        public String getIndexPicOpTime() {
            return indexPicOpTime;
        }

        public void setIndexPicOpTime(String indexPicOpTime) {
            this.indexPicOpTime = indexPicOpTime;
        }
    }
}
