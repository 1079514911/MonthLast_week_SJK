package com.example.anadministrator.monthlast;

import java.util.List;

/**
 * Created by 张祺钒
 * on2017/8/24.
 */

public class Bean {

    /**
     * code : 200
     * data : {"topics":[{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170707/6r2pzk9pu.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170707/slcyrhmrg.webp-w640","description":"超级怕鬼却要当阎王是什么悲伤的感受？使徒子老师超火爆力作第二季正式回归，胆小的阎王丫头不光变帅了，打怪姿势还更加酷炫了~东西方神魔齐上阵，给你超搞逗的欢乐体验！每周五晚八点第一时间独家更新，周六热推一整天！可爱阎王和你不见不散~【独家/每周五晚8点更新 责编：大树】\r\n","created_at":1465703869,"is_favourite":false,"title":"阎王不高兴","likes_count":24964063,"updated_at":1465703869,"special_offer":{},"user_id":6,"comments_count":659697,"is_free":true,"id":848,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/150421/i26y7dz2t.jpg-w180","grade":1,"nickname":"使徒子","reg_type":"weibo","id":6},"label_id":5,"order":400,"comics_count":55,"status":"published"},{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170622/sa725m1y4.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170622/866bjp30v.webp-w640","description":"上帝跑路了？世界混乱了？米迦勒跑来人间找老相好，顺便一起拯救格世界，但转世后的路西法却不记得他了\u2026\u2026而原因却是自己封印了他的记忆和力量！现在还要让他觉醒\u2026\u2026只能#%￥#\u2026\u2026算了，自己挖的坑，哭着跪着也要埋完！【独家/每周六更新  责编：M】","created_at":1498104597,"is_favourite":false,"title":"天神没节操","likes_count":1475957,"updated_at":1498104597,"special_offer":{},"user_id":81896370,"comments_count":31159,"is_free":true,"id":1157,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/170624/2i6pm2ylo.webp-w180","grade":1,"nickname":"菲斯娜feisna+南梵（野生组）","reg_type":"author","id":81896370},"label_id":25,"order":0,"comics_count":9,"status":"published"},{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170704/4qbllqtdv.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170703/3c0w96gm4.webp-w640","description":"这是一个贩卖回忆的旧物杂货店，每一个物品都有其主人的独家记忆。圆滑大叔带领纯洁少女，给你讲述那些被人遗忘的回忆。【独家/每周五更新 责编：听雨】","created_at":1496642287,"is_favourite":false,"title":"肆拾杂货店","likes_count":1167202,"updated_at":1496642287,"special_offer":{},"user_id":82248124,"comments_count":27917,"is_free":true,"id":1121,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/default_avatar_image.jpg-w180","grade":1,"nickname":"所长别开枪是我+wuli爸爸爸爸","reg_type":"author","id":82248124},"label_id":23,"order":0,"comics_count":11,"status":"published"}],"surface_image":"http://f2.kkmh.com/"}
     * message : ok
     */

    public int code;
    public DataBean data;
    public String message;

    public static class DataBean {
        /**
         * topics : [{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170707/6r2pzk9pu.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170707/slcyrhmrg.webp-w640","description":"超级怕鬼却要当阎王是什么悲伤的感受？使徒子老师超火爆力作第二季正式回归，胆小的阎王丫头不光变帅了，打怪姿势还更加酷炫了~东西方神魔齐上阵，给你超搞逗的欢乐体验！每周五晚八点第一时间独家更新，周六热推一整天！可爱阎王和你不见不散~【独家/每周五晚8点更新 责编：大树】\r\n","created_at":1465703869,"is_favourite":false,"title":"阎王不高兴","likes_count":24964063,"updated_at":1465703869,"special_offer":{},"user_id":6,"comments_count":659697,"is_free":true,"id":848,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/150421/i26y7dz2t.jpg-w180","grade":1,"nickname":"使徒子","reg_type":"weibo","id":6},"label_id":5,"order":400,"comics_count":55,"status":"published"},{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170622/sa725m1y4.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170622/866bjp30v.webp-w640","description":"上帝跑路了？世界混乱了？米迦勒跑来人间找老相好，顺便一起拯救格世界，但转世后的路西法却不记得他了\u2026\u2026而原因却是自己封印了他的记忆和力量！现在还要让他觉醒\u2026\u2026只能#%￥#\u2026\u2026算了，自己挖的坑，哭着跪着也要埋完！【独家/每周六更新  责编：M】","created_at":1498104597,"is_favourite":false,"title":"天神没节操","likes_count":1475957,"updated_at":1498104597,"special_offer":{},"user_id":81896370,"comments_count":31159,"is_free":true,"id":1157,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/170624/2i6pm2ylo.webp-w180","grade":1,"nickname":"菲斯娜feisna+南梵（野生组）","reg_type":"author","id":81896370},"label_id":25,"order":0,"comics_count":9,"status":"published"},{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170704/4qbllqtdv.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170703/3c0w96gm4.webp-w640","description":"这是一个贩卖回忆的旧物杂货店，每一个物品都有其主人的独家记忆。圆滑大叔带领纯洁少女，给你讲述那些被人遗忘的回忆。【独家/每周五更新 责编：听雨】","created_at":1496642287,"is_favourite":false,"title":"肆拾杂货店","likes_count":1167202,"updated_at":1496642287,"special_offer":{},"user_id":82248124,"comments_count":27917,"is_free":true,"id":1121,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/default_avatar_image.jpg-w180","grade":1,"nickname":"所长别开枪是我+wuli爸爸爸爸","reg_type":"author","id":82248124},"label_id":23,"order":0,"comics_count":11,"status":"published"}]
         * surface_image : http://f2.kkmh.com/
         */

        public String surface_image;
        public List<TopicsBean> topics;

        public static class TopicsBean {
            /**
             * discover_image_url :
             * vertical_image_url : http://f2.kkmh.com/image/170707/6r2pzk9pu.webp-w320
             * cover_image_url : http://f2.kkmh.com/image/170707/slcyrhmrg.webp-w640
             * description : 超级怕鬼却要当阎王是什么悲伤的感受？使徒子老师超火爆力作第二季正式回归，胆小的阎王丫头不光变帅了，打怪姿势还更加酷炫了~东西方神魔齐上阵，给你超搞逗的欢乐体验！每周五晚八点第一时间独家更新，周六热推一整天！可爱阎王和你不见不散~【独家/每周五晚8点更新 责编：大树】

             * created_at : 1465703869
             * is_favourite : false
             * title : 阎王不高兴
             * likes_count : 24964063
             * updated_at : 1465703869
             * special_offer : {}
             * user_id : 6
             * comments_count : 659697
             * is_free : true
             * id : 848
             * user : {"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/150421/i26y7dz2t.jpg-w180","grade":1,"nickname":"使徒子","reg_type":"weibo","id":6}
             * label_id : 5
             * order : 400
             * comics_count : 55
             * status : published
             */

            public String discover_image_url;
            public String vertical_image_url;
            public String cover_image_url;
            public String description;
            public int created_at;
            public boolean is_favourite;
            public String title;
            public int likes_count;
            public int updated_at;
            public SpecialOfferBean special_offer;
            public int user_id;
            public int comments_count;
            public boolean is_free;
            public int id;
            public UserBean user;
            public int label_id;
            public int order;
            public int comics_count;
            public String status;

            public static class SpecialOfferBean {
            }

            public static class UserBean {
                /**
                 * pub_feed : 1
                 * avatar_url : http://f2.kkmh.com/image/150421/i26y7dz2t.jpg-w180
                 * grade : 1
                 * nickname : 使徒子
                 * reg_type : weibo
                 * id : 6
                 */

                public int pub_feed;
                public String avatar_url;
                public int grade;
                public String nickname;
                public String reg_type;
                public int id;
            }
        }
    }
}
