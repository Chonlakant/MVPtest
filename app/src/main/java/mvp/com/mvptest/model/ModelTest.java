package mvp.com.mvptest.model;

import java.util.List;

/**
 * Created by root1 on 2/18/16.
 */
public class ModelTest {

    /**
     * status : 1
     * page : 1
     * per_page : 20
     * pages : 1
     * total : 1
     * offset : 0
     * post_type :
     * sort : DEFAULT
     * user : {"id":3,"about":"พัฒนา","active":1,"avatar_id":435,"cover_id":0,"cover_position":0,"email":"anyarimpanus@gmail.com","email_verification_key":"4698f890b3f02cb08369b17f5adbabd7","email_verified":0,"language":"","last_logged":1455182046,"last_fb_token":"","name":"Anya Rimpanus","password":"039a726ac0aeec3dde33e45387a7d4ac","time":1448944359,"timestamp":"2016-02-11 17:33:53","timezone":"","type":"user","username":"anya","phone_code":"","phone":"","verified":0,"updated_at":"-0001-11-30 00:00:00","created_at":"0000-00-00 00:00:00","avatar":"photos/2016/02/VeTf5_435_ddb30680a691d157187ee1cf9e896d03_100x100.jpg","cover":"themes/grape/images/default-cover.png","birthday":"01/01/1990","gender":"male","online":false}
     * count : {"post":1,"follower":5,"following":2,"friend":2,"love":0,"group":0}
     * posts : [{"id":16,"active":1,"author":{"id":3,"about":"พัฒนา","active":1,"avatar_id":435,"cover_id":0,"cover_position":0,"email":"anyarimpanus@gmail.com","email_verification_key":"4698f890b3f02cb08369b17f5adbabd7","email_verified":0,"language":"","last_logged":1455182046,"last_fb_token":"","name":"Anya Rimpanus","password":"039a726ac0aeec3dde33e45387a7d4ac","time":1448944359,"timestamp":"2016-02-11 17:33:53","timezone":"","type":"user","username":"anya","phone_code":"","phone":"","verified":0,"updated_at":"-0001-11-30 00:00:00","created_at":"0000-00-00 00:00:00","avatar":"photos/2016/02/VeTf5_435_ddb30680a691d157187ee1cf9e896d03_100x100.jpg","cover":"themes/grape/images/default-cover.png"},"google_map_name":null,"hidden":[],"link_title":null,"post_id":16,"recipient_id":null,"seen":0,"text":null,"emoticonized":null,"emoticonized_iOS":null,"tattoo_url":null,"time":1448944543,"timeline_id":3,"timestamp":"2015-12-01 11:35:43","type1":"story","type2":"none","view":null,"follow_count":1,"follow":[{"id":2,"about":"บอกเลย","active":1,"avatar_id":439,"cover_id":0,"cover_position":0,"email":"manual@gmail.com","email_verification_key":"3cea59cdd74660ff55be53543cb1c1e8","email_verified":0,"language":"","last_logged":1455187628,"last_fb_token":"","name":"AAAA","password":"039a726ac0aeec3dde33e45387a7d4ac","time":1448944317,"timestamp":"2016-02-15 21:07:07","timezone":"Pacific/Midway","type":"user","username":"korrio","phone_code":"","phone":"","verified":0,"updated_at":"-0001-11-30 00:00:00","created_at":"0000-00-00 00:00:00","avatar":"photos/2016/02/dpG9b_439_eed5af6add95a9a6f1252739b1ad8c24_100x100.jpg","cover":"themes/grape/images/default-cover.png"}],"love_count":0,"love":null,"comment_count":2,"comment":[{"id":18,"text":"haha","emoticonized_iOS":"haha","emoticonized":"haha","time":1448944549,"timestamp":"2015-12-01 11:35:49","user":{"id":3,"name":"Anya Rimpanus","avatar_id":435,"avatar":"photos/2016/02/VeTf5_435_ddb30680a691d157187ee1cf9e896d03_100x100.jpg"},"love_count":0,"love":[]},{"id":31,"text":"à¸Ÿà¸Ÿà¸Ÿ","emoticonized_iOS":"à¸Ÿà¸Ÿà¸Ÿ","emoticonized":"à¸Ÿà¸Ÿà¸Ÿ","time":1452834785,"timestamp":"2016-01-15 12:13:05","user":{"id":2,"name":"AAAA","avatar_id":439,"avatar":"photos/2016/02/dpG9b_439_eed5af6add95a9a6f1252739b1ad8c24_100x100.jpg"},"love_count":1,"love":[{"id":2,"about":"บอกเลย","active":1,"avatar_id":439,"cover_id":0,"cover_position":0,"email":"manual@gmail.com","email_verification_key":"3cea59cdd74660ff55be53543cb1c1e8","email_verified":0,"language":"","last_logged":1455187628,"last_fb_token":"","name":"AAAA","password":"039a726ac0aeec3dde33e45387a7d4ac","time":1448944317,"timestamp":"2016-02-15 21:07:07","timezone":"Pacific/Midway","type":"user","username":"korrio","phone_code":"","phone":"","verified":0,"updated_at":"-0001-11-30 00:00:00","created_at":"0000-00-00 00:00:00","avatar":"photos/2016/02/dpG9b_439_eed5af6add95a9a6f1252739b1ad8c24_100x100.jpg","cover":"themes/grape/images/default-cover.png"}]}],"share_count":0,"share":null,"post_type":"photo","media":{"id":3,"active":1,"album_id":0,"descr":"","extension":"jpg","name":"11838874_1171294659554199_6575127050000480856_o.jpg","post_id":0,"temp":0,"timeline_id":0,"type":"photo","url":"photos/2015/11/IPUH1_3_eccbc87e4b5ce2fe28308fd9f2a7baf3.jpg","url_thumb":"imgd.php?src=photos/2015/11/IPUH1_3_eccbc87e4b5ce2fe28308fd9f2a7baf3.jpg&width=600","album_photos":[{"url_thumb":"imgd.php?src=photos/2015/11/IPUH1_3_eccbc87e4b5ce2fe28308fd9f2a7baf3.jpg.jpg&width=600","url":"photos/2015/11/IPUH1_3_eccbc87e4b5ce2fe28308fd9f2a7baf3.jpg"}]},"clip":null,"soundcloud":null,"youtube":null,"is_loved":false,"is_commented":true,"is_shared":false}]
     */

    private String status;
    private int page;
    private int per_page;
    private int pages;
    private int total;
    private int offset;
    private String post_type;
    private String sort;
    /**
     * id : 3
     * about : พัฒนา
     * active : 1
     * avatar_id : 435
     * cover_id : 0
     * cover_position : 0
     * email : anyarimpanus@gmail.com
     * email_verification_key : 4698f890b3f02cb08369b17f5adbabd7
     * email_verified : 0
     * language :
     * last_logged : 1455182046
     * last_fb_token :
     * name : Anya Rimpanus
     * password : 039a726ac0aeec3dde33e45387a7d4ac
     * time : 1448944359
     * timestamp : 2016-02-11 17:33:53
     * timezone :
     * type : user
     * username : anya
     * phone_code :
     * phone :
     * verified : 0
     * updated_at : -0001-11-30 00:00:00
     * created_at : 0000-00-00 00:00:00
     * avatar : photos/2016/02/VeTf5_435_ddb30680a691d157187ee1cf9e896d03_100x100.jpg
     * cover : themes/grape/images/default-cover.png
     * birthday : 01/01/1990
     * gender : male
     * online : false
     */

    private UserEntity user;
    /**
     * post : 1
     * follower : 5
     * following : 2
     * friend : 2
     * love : 0
     * group : 0
     */

    private CountEntity count;
    /**
     * id : 16
     * active : 1
     * author : {"id":3,"about":"พัฒนา","active":1,"avatar_id":435,"cover_id":0,"cover_position":0,"email":"anyarimpanus@gmail.com","email_verification_key":"4698f890b3f02cb08369b17f5adbabd7","email_verified":0,"language":"","last_logged":1455182046,"last_fb_token":"","name":"Anya Rimpanus","password":"039a726ac0aeec3dde33e45387a7d4ac","time":1448944359,"timestamp":"2016-02-11 17:33:53","timezone":"","type":"user","username":"anya","phone_code":"","phone":"","verified":0,"updated_at":"-0001-11-30 00:00:00","created_at":"0000-00-00 00:00:00","avatar":"photos/2016/02/VeTf5_435_ddb30680a691d157187ee1cf9e896d03_100x100.jpg","cover":"themes/grape/images/default-cover.png"}
     * google_map_name : null
     * hidden : []
     * link_title : null
     * post_id : 16
     * recipient_id : null
     * seen : 0
     * text : null
     * emoticonized : null
     * emoticonized_iOS : null
     * tattoo_url : null
     * time : 1448944543
     * timeline_id : 3
     * timestamp : 2015-12-01 11:35:43
     * type1 : story
     * type2 : none
     * view : null
     * follow_count : 1
     * follow : [{"id":2,"about":"บอกเลย","active":1,"avatar_id":439,"cover_id":0,"cover_position":0,"email":"manual@gmail.com","email_verification_key":"3cea59cdd74660ff55be53543cb1c1e8","email_verified":0,"language":"","last_logged":1455187628,"last_fb_token":"","name":"AAAA","password":"039a726ac0aeec3dde33e45387a7d4ac","time":1448944317,"timestamp":"2016-02-15 21:07:07","timezone":"Pacific/Midway","type":"user","username":"korrio","phone_code":"","phone":"","verified":0,"updated_at":"-0001-11-30 00:00:00","created_at":"0000-00-00 00:00:00","avatar":"photos/2016/02/dpG9b_439_eed5af6add95a9a6f1252739b1ad8c24_100x100.jpg","cover":"themes/grape/images/default-cover.png"}]
     * love_count : 0
     * love : null
     * comment_count : 2
     * comment : [{"id":18,"text":"haha","emoticonized_iOS":"haha","emoticonized":"haha","time":1448944549,"timestamp":"2015-12-01 11:35:49","user":{"id":3,"name":"Anya Rimpanus","avatar_id":435,"avatar":"photos/2016/02/VeTf5_435_ddb30680a691d157187ee1cf9e896d03_100x100.jpg"},"love_count":0,"love":[]},{"id":31,"text":"à¸Ÿà¸Ÿà¸Ÿ","emoticonized_iOS":"à¸Ÿà¸Ÿà¸Ÿ","emoticonized":"à¸Ÿà¸Ÿà¸Ÿ","time":1452834785,"timestamp":"2016-01-15 12:13:05","user":{"id":2,"name":"AAAA","avatar_id":439,"avatar":"photos/2016/02/dpG9b_439_eed5af6add95a9a6f1252739b1ad8c24_100x100.jpg"},"love_count":1,"love":[{"id":2,"about":"บอกเลย","active":1,"avatar_id":439,"cover_id":0,"cover_position":0,"email":"manual@gmail.com","email_verification_key":"3cea59cdd74660ff55be53543cb1c1e8","email_verified":0,"language":"","last_logged":1455187628,"last_fb_token":"","name":"AAAA","password":"039a726ac0aeec3dde33e45387a7d4ac","time":1448944317,"timestamp":"2016-02-15 21:07:07","timezone":"Pacific/Midway","type":"user","username":"korrio","phone_code":"","phone":"","verified":0,"updated_at":"-0001-11-30 00:00:00","created_at":"0000-00-00 00:00:00","avatar":"photos/2016/02/dpG9b_439_eed5af6add95a9a6f1252739b1ad8c24_100x100.jpg","cover":"themes/grape/images/default-cover.png"}]}]
     * share_count : 0
     * share : null
     * post_type : photo
     * media : {"id":3,"active":1,"album_id":0,"descr":"","extension":"jpg","name":"11838874_1171294659554199_6575127050000480856_o.jpg","post_id":0,"temp":0,"timeline_id":0,"type":"photo","url":"photos/2015/11/IPUH1_3_eccbc87e4b5ce2fe28308fd9f2a7baf3.jpg","url_thumb":"imgd.php?src=photos/2015/11/IPUH1_3_eccbc87e4b5ce2fe28308fd9f2a7baf3.jpg&width=600","album_photos":[{"url_thumb":"imgd.php?src=photos/2015/11/IPUH1_3_eccbc87e4b5ce2fe28308fd9f2a7baf3.jpg.jpg&width=600","url":"photos/2015/11/IPUH1_3_eccbc87e4b5ce2fe28308fd9f2a7baf3.jpg"}]}
     * clip : null
     * soundcloud : null
     * youtube : null
     * is_loved : false
     * is_commented : true
     * is_shared : false
     */

    private List<PostsEntity> posts;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public void setPost_type(String post_type) {
        this.post_type = post_type;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public void setCount(CountEntity count) {
        this.count = count;
    }

    public void setPosts(List<PostsEntity> posts) {
        this.posts = posts;
    }

    public String getStatus() {
        return status;
    }

    public int getPage() {
        return page;
    }

    public int getPer_page() {
        return per_page;
    }

    public int getPages() {
        return pages;
    }

    public int getTotal() {
        return total;
    }

    public int getOffset() {
        return offset;
    }

    public String getPost_type() {
        return post_type;
    }

    public String getSort() {
        return sort;
    }

    public UserEntity getUser() {
        return user;
    }

    public CountEntity getCount() {
        return count;
    }

    public List<PostsEntity> getPosts() {
        return posts;
    }

    public static class UserEntity {
        private int id;
        private String about;
        private int active;
        private int avatar_id;
        private int cover_id;
        private int cover_position;
        private String email;
        private String email_verification_key;
        private int email_verified;
        private String language;
        private int last_logged;
        private String last_fb_token;
        private String name;
        private String password;
        private int time;
        private String timestamp;
        private String timezone;
        private String type;
        private String username;
        private String phone_code;
        private String phone;
        private int verified;
        private String updated_at;
        private String created_at;
        private String avatar;
        private String cover;
        private String birthday;
        private String gender;
        private boolean online;

        public void setId(int id) {
            this.id = id;
        }

        public void setAbout(String about) {
            this.about = about;
        }

        public void setActive(int active) {
            this.active = active;
        }

        public void setAvatar_id(int avatar_id) {
            this.avatar_id = avatar_id;
        }

        public void setCover_id(int cover_id) {
            this.cover_id = cover_id;
        }

        public void setCover_position(int cover_position) {
            this.cover_position = cover_position;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setEmail_verification_key(String email_verification_key) {
            this.email_verification_key = email_verification_key;
        }

        public void setEmail_verified(int email_verified) {
            this.email_verified = email_verified;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public void setLast_logged(int last_logged) {
            this.last_logged = last_logged;
        }

        public void setLast_fb_token(String last_fb_token) {
            this.last_fb_token = last_fb_token;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setPhone_code(String phone_code) {
            this.phone_code = phone_code;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setVerified(int verified) {
            this.verified = verified;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setOnline(boolean online) {
            this.online = online;
        }

        public int getId() {
            return id;
        }

        public String getAbout() {
            return about;
        }

        public int getActive() {
            return active;
        }

        public int getAvatar_id() {
            return avatar_id;
        }

        public int getCover_id() {
            return cover_id;
        }

        public int getCover_position() {
            return cover_position;
        }

        public String getEmail() {
            return email;
        }

        public String getEmail_verification_key() {
            return email_verification_key;
        }

        public int getEmail_verified() {
            return email_verified;
        }

        public String getLanguage() {
            return language;
        }

        public int getLast_logged() {
            return last_logged;
        }

        public String getLast_fb_token() {
            return last_fb_token;
        }

        public String getName() {
            return name;
        }

        public String getPassword() {
            return password;
        }

        public int getTime() {
            return time;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public String getTimezone() {
            return timezone;
        }

        public String getType() {
            return type;
        }

        public String getUsername() {
            return username;
        }

        public String getPhone_code() {
            return phone_code;
        }

        public String getPhone() {
            return phone;
        }

        public int getVerified() {
            return verified;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public String getCreated_at() {
            return created_at;
        }

        public String getAvatar() {
            return avatar;
        }

        public String getCover() {
            return cover;
        }

        public String getBirthday() {
            return birthday;
        }

        public String getGender() {
            return gender;
        }

        public boolean isOnline() {
            return online;
        }
    }

    public static class CountEntity {
        private int post;
        private int follower;
        private int following;
        private int friend;
        private int love;
        private int group;

        public void setPost(int post) {
            this.post = post;
        }

        public void setFollower(int follower) {
            this.follower = follower;
        }

        public void setFollowing(int following) {
            this.following = following;
        }

        public void setFriend(int friend) {
            this.friend = friend;
        }

        public void setLove(int love) {
            this.love = love;
        }

        public void setGroup(int group) {
            this.group = group;
        }

        public int getPost() {
            return post;
        }

        public int getFollower() {
            return follower;
        }

        public int getFollowing() {
            return following;
        }

        public int getFriend() {
            return friend;
        }

        public int getLove() {
            return love;
        }

        public int getGroup() {
            return group;
        }
    }

    public static class PostsEntity {
        private int id;
        private int active;
        /**
         * id : 3
         * about : พัฒนา
         * active : 1
         * avatar_id : 435
         * cover_id : 0
         * cover_position : 0
         * email : anyarimpanus@gmail.com
         * email_verification_key : 4698f890b3f02cb08369b17f5adbabd7
         * email_verified : 0
         * language :
         * last_logged : 1455182046
         * last_fb_token :
         * name : Anya Rimpanus
         * password : 039a726ac0aeec3dde33e45387a7d4ac
         * time : 1448944359
         * timestamp : 2016-02-11 17:33:53
         * timezone :
         * type : user
         * username : anya
         * phone_code :
         * phone :
         * verified : 0
         * updated_at : -0001-11-30 00:00:00
         * created_at : 0000-00-00 00:00:00
         * avatar : photos/2016/02/VeTf5_435_ddb30680a691d157187ee1cf9e896d03_100x100.jpg
         * cover : themes/grape/images/default-cover.png
         */

        private AuthorEntity author;
        private Object google_map_name;
        private Object link_title;
        private int post_id;
        private Object recipient_id;
        private int seen;
        private Object text;
        private Object emoticonized;
        private Object emoticonized_iOS;
        private Object tattoo_url;
        private int time;
        private int timeline_id;
        private String timestamp;
        private String type1;
        private String type2;
        private Object view;
        private int follow_count;
        private int love_count;
        private Object love;
        private int comment_count;
        private int share_count;
        private Object share;
        private String post_type;
        /**
         * id : 3
         * active : 1
         * album_id : 0
         * descr :
         * extension : jpg
         * name : 11838874_1171294659554199_6575127050000480856_o.jpg
         * post_id : 0
         * temp : 0
         * timeline_id : 0
         * type : photo
         * url : photos/2015/11/IPUH1_3_eccbc87e4b5ce2fe28308fd9f2a7baf3.jpg
         * url_thumb : imgd.php?src=photos/2015/11/IPUH1_3_eccbc87e4b5ce2fe28308fd9f2a7baf3.jpg&width=600
         * album_photos : [{"url_thumb":"imgd.php?src=photos/2015/11/IPUH1_3_eccbc87e4b5ce2fe28308fd9f2a7baf3.jpg.jpg&width=600","url":"photos/2015/11/IPUH1_3_eccbc87e4b5ce2fe28308fd9f2a7baf3.jpg"}]
         */

        private MediaEntity media;
        private Object clip;
        private Object soundcloud;
        private Object youtube;
        private boolean is_loved;
        private boolean is_commented;
        private boolean is_shared;
        private List<?> hidden;
        /**
         * id : 2
         * about : บอกเลย
         * active : 1
         * avatar_id : 439
         * cover_id : 0
         * cover_position : 0
         * email : manual@gmail.com
         * email_verification_key : 3cea59cdd74660ff55be53543cb1c1e8
         * email_verified : 0
         * language :
         * last_logged : 1455187628
         * last_fb_token :
         * name : AAAA
         * password : 039a726ac0aeec3dde33e45387a7d4ac
         * time : 1448944317
         * timestamp : 2016-02-15 21:07:07
         * timezone : Pacific/Midway
         * type : user
         * username : korrio
         * phone_code :
         * phone :
         * verified : 0
         * updated_at : -0001-11-30 00:00:00
         * created_at : 0000-00-00 00:00:00
         * avatar : photos/2016/02/dpG9b_439_eed5af6add95a9a6f1252739b1ad8c24_100x100.jpg
         * cover : themes/grape/images/default-cover.png
         */

        private List<FollowEntity> follow;
        /**
         * id : 18
         * text : haha
         * emoticonized_iOS : haha
         * emoticonized : haha
         * time : 1448944549
         * timestamp : 2015-12-01 11:35:49
         * user : {"id":3,"name":"Anya Rimpanus","avatar_id":435,"avatar":"photos/2016/02/VeTf5_435_ddb30680a691d157187ee1cf9e896d03_100x100.jpg"}
         * love_count : 0
         * love : []
         */

        private List<CommentEntity> comment;

        public void setId(int id) {
            this.id = id;
        }

        public void setActive(int active) {
            this.active = active;
        }

        public void setAuthor(AuthorEntity author) {
            this.author = author;
        }

        public void setGoogle_map_name(Object google_map_name) {
            this.google_map_name = google_map_name;
        }

        public void setLink_title(Object link_title) {
            this.link_title = link_title;
        }

        public void setPost_id(int post_id) {
            this.post_id = post_id;
        }

        public void setRecipient_id(Object recipient_id) {
            this.recipient_id = recipient_id;
        }

        public void setSeen(int seen) {
            this.seen = seen;
        }

        public void setText(Object text) {
            this.text = text;
        }

        public void setEmoticonized(Object emoticonized) {
            this.emoticonized = emoticonized;
        }

        public void setEmoticonized_iOS(Object emoticonized_iOS) {
            this.emoticonized_iOS = emoticonized_iOS;
        }

        public void setTattoo_url(Object tattoo_url) {
            this.tattoo_url = tattoo_url;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public void setTimeline_id(int timeline_id) {
            this.timeline_id = timeline_id;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public void setType1(String type1) {
            this.type1 = type1;
        }

        public void setType2(String type2) {
            this.type2 = type2;
        }

        public void setView(Object view) {
            this.view = view;
        }

        public void setFollow_count(int follow_count) {
            this.follow_count = follow_count;
        }

        public void setLove_count(int love_count) {
            this.love_count = love_count;
        }

        public void setLove(Object love) {
            this.love = love;
        }

        public void setComment_count(int comment_count) {
            this.comment_count = comment_count;
        }

        public void setShare_count(int share_count) {
            this.share_count = share_count;
        }

        public void setShare(Object share) {
            this.share = share;
        }

        public void setPost_type(String post_type) {
            this.post_type = post_type;
        }

        public void setMedia(MediaEntity media) {
            this.media = media;
        }

        public void setClip(Object clip) {
            this.clip = clip;
        }

        public void setSoundcloud(Object soundcloud) {
            this.soundcloud = soundcloud;
        }

        public void setYoutube(Object youtube) {
            this.youtube = youtube;
        }

        public void setIs_loved(boolean is_loved) {
            this.is_loved = is_loved;
        }

        public void setIs_commented(boolean is_commented) {
            this.is_commented = is_commented;
        }

        public void setIs_shared(boolean is_shared) {
            this.is_shared = is_shared;
        }

        public void setHidden(List<?> hidden) {
            this.hidden = hidden;
        }

        public void setFollow(List<FollowEntity> follow) {
            this.follow = follow;
        }

        public void setComment(List<CommentEntity> comment) {
            this.comment = comment;
        }

        public int getId() {
            return id;
        }

        public int getActive() {
            return active;
        }

        public AuthorEntity getAuthor() {
            return author;
        }

        public Object getGoogle_map_name() {
            return google_map_name;
        }

        public Object getLink_title() {
            return link_title;
        }

        public int getPost_id() {
            return post_id;
        }

        public Object getRecipient_id() {
            return recipient_id;
        }

        public int getSeen() {
            return seen;
        }

        public Object getText() {
            return text;
        }

        public Object getEmoticonized() {
            return emoticonized;
        }

        public Object getEmoticonized_iOS() {
            return emoticonized_iOS;
        }

        public Object getTattoo_url() {
            return tattoo_url;
        }

        public int getTime() {
            return time;
        }

        public int getTimeline_id() {
            return timeline_id;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public String getType1() {
            return type1;
        }

        public String getType2() {
            return type2;
        }

        public Object getView() {
            return view;
        }

        public int getFollow_count() {
            return follow_count;
        }

        public int getLove_count() {
            return love_count;
        }

        public Object getLove() {
            return love;
        }

        public int getComment_count() {
            return comment_count;
        }

        public int getShare_count() {
            return share_count;
        }

        public Object getShare() {
            return share;
        }

        public String getPost_type() {
            return post_type;
        }

        public MediaEntity getMedia() {
            return media;
        }

        public Object getClip() {
            return clip;
        }

        public Object getSoundcloud() {
            return soundcloud;
        }

        public Object getYoutube() {
            return youtube;
        }

        public boolean isIs_loved() {
            return is_loved;
        }

        public boolean isIs_commented() {
            return is_commented;
        }

        public boolean isIs_shared() {
            return is_shared;
        }

        public List<?> getHidden() {
            return hidden;
        }

        public List<FollowEntity> getFollow() {
            return follow;
        }

        public List<CommentEntity> getComment() {
            return comment;
        }

        public static class AuthorEntity {
            private int id;
            private String about;
            private int active;
            private int avatar_id;
            private int cover_id;
            private int cover_position;
            private String email;
            private String email_verification_key;
            private int email_verified;
            private String language;
            private int last_logged;
            private String last_fb_token;
            private String name;
            private String password;
            private int time;
            private String timestamp;
            private String timezone;
            private String type;
            private String username;
            private String phone_code;
            private String phone;
            private int verified;
            private String updated_at;
            private String created_at;
            private String avatar;
            private String cover;

            public void setId(int id) {
                this.id = id;
            }

            public void setAbout(String about) {
                this.about = about;
            }

            public void setActive(int active) {
                this.active = active;
            }

            public void setAvatar_id(int avatar_id) {
                this.avatar_id = avatar_id;
            }

            public void setCover_id(int cover_id) {
                this.cover_id = cover_id;
            }

            public void setCover_position(int cover_position) {
                this.cover_position = cover_position;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public void setEmail_verification_key(String email_verification_key) {
                this.email_verification_key = email_verification_key;
            }

            public void setEmail_verified(int email_verified) {
                this.email_verified = email_verified;
            }

            public void setLanguage(String language) {
                this.language = language;
            }

            public void setLast_logged(int last_logged) {
                this.last_logged = last_logged;
            }

            public void setLast_fb_token(String last_fb_token) {
                this.last_fb_token = last_fb_token;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public void setTime(int time) {
                this.time = time;
            }

            public void setTimestamp(String timestamp) {
                this.timestamp = timestamp;
            }

            public void setTimezone(String timezone) {
                this.timezone = timezone;
            }

            public void setType(String type) {
                this.type = type;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public void setPhone_code(String phone_code) {
                this.phone_code = phone_code;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public void setVerified(int verified) {
                this.verified = verified;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public int getId() {
                return id;
            }

            public String getAbout() {
                return about;
            }

            public int getActive() {
                return active;
            }

            public int getAvatar_id() {
                return avatar_id;
            }

            public int getCover_id() {
                return cover_id;
            }

            public int getCover_position() {
                return cover_position;
            }

            public String getEmail() {
                return email;
            }

            public String getEmail_verification_key() {
                return email_verification_key;
            }

            public int getEmail_verified() {
                return email_verified;
            }

            public String getLanguage() {
                return language;
            }

            public int getLast_logged() {
                return last_logged;
            }

            public String getLast_fb_token() {
                return last_fb_token;
            }

            public String getName() {
                return name;
            }

            public String getPassword() {
                return password;
            }

            public int getTime() {
                return time;
            }

            public String getTimestamp() {
                return timestamp;
            }

            public String getTimezone() {
                return timezone;
            }

            public String getType() {
                return type;
            }

            public String getUsername() {
                return username;
            }

            public String getPhone_code() {
                return phone_code;
            }

            public String getPhone() {
                return phone;
            }

            public int getVerified() {
                return verified;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public String getCreated_at() {
                return created_at;
            }

            public String getAvatar() {
                return avatar;
            }

            public String getCover() {
                return cover;
            }
        }

        public static class MediaEntity {
            private int id;
            private int active;
            private int album_id;
            private String descr;
            private String extension;
            private String name;
            private int post_id;
            private int temp;
            private int timeline_id;
            private String type;
            private String url;
            private String url_thumb;
            /**
             * url_thumb : imgd.php?src=photos/2015/11/IPUH1_3_eccbc87e4b5ce2fe28308fd9f2a7baf3.jpg.jpg&width=600
             * url : photos/2015/11/IPUH1_3_eccbc87e4b5ce2fe28308fd9f2a7baf3.jpg
             */

            private List<AlbumPhotosEntity> album_photos;

            public void setId(int id) {
                this.id = id;
            }

            public void setActive(int active) {
                this.active = active;
            }

            public void setAlbum_id(int album_id) {
                this.album_id = album_id;
            }

            public void setDescr(String descr) {
                this.descr = descr;
            }

            public void setExtension(String extension) {
                this.extension = extension;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setPost_id(int post_id) {
                this.post_id = post_id;
            }

            public void setTemp(int temp) {
                this.temp = temp;
            }

            public void setTimeline_id(int timeline_id) {
                this.timeline_id = timeline_id;
            }

            public void setType(String type) {
                this.type = type;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public void setUrl_thumb(String url_thumb) {
                this.url_thumb = url_thumb;
            }

            public void setAlbum_photos(List<AlbumPhotosEntity> album_photos) {
                this.album_photos = album_photos;
            }

            public int getId() {
                return id;
            }

            public int getActive() {
                return active;
            }

            public int getAlbum_id() {
                return album_id;
            }

            public String getDescr() {
                return descr;
            }

            public String getExtension() {
                return extension;
            }

            public String getName() {
                return name;
            }

            public int getPost_id() {
                return post_id;
            }

            public int getTemp() {
                return temp;
            }

            public int getTimeline_id() {
                return timeline_id;
            }

            public String getType() {
                return type;
            }

            public String getUrl() {
                return url;
            }

            public String getUrl_thumb() {
                return url_thumb;
            }

            public List<AlbumPhotosEntity> getAlbum_photos() {
                return album_photos;
            }

            public static class AlbumPhotosEntity {
                private String url_thumb;
                private String url;

                public void setUrl_thumb(String url_thumb) {
                    this.url_thumb = url_thumb;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getUrl_thumb() {
                    return url_thumb;
                }

                public String getUrl() {
                    return url;
                }
            }
        }

        public static class FollowEntity {
            private int id;
            private String about;
            private int active;
            private int avatar_id;
            private int cover_id;
            private int cover_position;
            private String email;
            private String email_verification_key;
            private int email_verified;
            private String language;
            private int last_logged;
            private String last_fb_token;
            private String name;
            private String password;
            private int time;
            private String timestamp;
            private String timezone;
            private String type;
            private String username;
            private String phone_code;
            private String phone;
            private int verified;
            private String updated_at;
            private String created_at;
            private String avatar;
            private String cover;

            public void setId(int id) {
                this.id = id;
            }

            public void setAbout(String about) {
                this.about = about;
            }

            public void setActive(int active) {
                this.active = active;
            }

            public void setAvatar_id(int avatar_id) {
                this.avatar_id = avatar_id;
            }

            public void setCover_id(int cover_id) {
                this.cover_id = cover_id;
            }

            public void setCover_position(int cover_position) {
                this.cover_position = cover_position;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public void setEmail_verification_key(String email_verification_key) {
                this.email_verification_key = email_verification_key;
            }

            public void setEmail_verified(int email_verified) {
                this.email_verified = email_verified;
            }

            public void setLanguage(String language) {
                this.language = language;
            }

            public void setLast_logged(int last_logged) {
                this.last_logged = last_logged;
            }

            public void setLast_fb_token(String last_fb_token) {
                this.last_fb_token = last_fb_token;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public void setTime(int time) {
                this.time = time;
            }

            public void setTimestamp(String timestamp) {
                this.timestamp = timestamp;
            }

            public void setTimezone(String timezone) {
                this.timezone = timezone;
            }

            public void setType(String type) {
                this.type = type;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public void setPhone_code(String phone_code) {
                this.phone_code = phone_code;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public void setVerified(int verified) {
                this.verified = verified;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public int getId() {
                return id;
            }

            public String getAbout() {
                return about;
            }

            public int getActive() {
                return active;
            }

            public int getAvatar_id() {
                return avatar_id;
            }

            public int getCover_id() {
                return cover_id;
            }

            public int getCover_position() {
                return cover_position;
            }

            public String getEmail() {
                return email;
            }

            public String getEmail_verification_key() {
                return email_verification_key;
            }

            public int getEmail_verified() {
                return email_verified;
            }

            public String getLanguage() {
                return language;
            }

            public int getLast_logged() {
                return last_logged;
            }

            public String getLast_fb_token() {
                return last_fb_token;
            }

            public String getName() {
                return name;
            }

            public String getPassword() {
                return password;
            }

            public int getTime() {
                return time;
            }

            public String getTimestamp() {
                return timestamp;
            }

            public String getTimezone() {
                return timezone;
            }

            public String getType() {
                return type;
            }

            public String getUsername() {
                return username;
            }

            public String getPhone_code() {
                return phone_code;
            }

            public String getPhone() {
                return phone;
            }

            public int getVerified() {
                return verified;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public String getCreated_at() {
                return created_at;
            }

            public String getAvatar() {
                return avatar;
            }

            public String getCover() {
                return cover;
            }
        }

        public static class CommentEntity {
            private int id;
            private String text;
            private String emoticonized_iOS;
            private String emoticonized;
            private int time;
            private String timestamp;
            /**
             * id : 3
             * name : Anya Rimpanus
             * avatar_id : 435
             * avatar : photos/2016/02/VeTf5_435_ddb30680a691d157187ee1cf9e896d03_100x100.jpg
             */

            private UserEntity user;
            private int love_count;
            private List<?> love;

            public void setId(int id) {
                this.id = id;
            }

            public void setText(String text) {
                this.text = text;
            }

            public void setEmoticonized_iOS(String emoticonized_iOS) {
                this.emoticonized_iOS = emoticonized_iOS;
            }

            public void setEmoticonized(String emoticonized) {
                this.emoticonized = emoticonized;
            }

            public void setTime(int time) {
                this.time = time;
            }

            public void setTimestamp(String timestamp) {
                this.timestamp = timestamp;
            }

            public void setUser(UserEntity user) {
                this.user = user;
            }

            public void setLove_count(int love_count) {
                this.love_count = love_count;
            }

            public void setLove(List<?> love) {
                this.love = love;
            }

            public int getId() {
                return id;
            }

            public String getText() {
                return text;
            }

            public String getEmoticonized_iOS() {
                return emoticonized_iOS;
            }

            public String getEmoticonized() {
                return emoticonized;
            }

            public int getTime() {
                return time;
            }

            public String getTimestamp() {
                return timestamp;
            }

            public UserEntity getUser() {
                return user;
            }

            public int getLove_count() {
                return love_count;
            }

            public List<?> getLove() {
                return love;
            }

            public static class UserEntity {
                private int id;
                private String name;
                private int avatar_id;
                private String avatar;

                public void setId(int id) {
                    this.id = id;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public void setAvatar_id(int avatar_id) {
                    this.avatar_id = avatar_id;
                }

                public void setAvatar(String avatar) {
                    this.avatar = avatar;
                }

                public int getId() {
                    return id;
                }

                public String getName() {
                    return name;
                }

                public int getAvatar_id() {
                    return avatar_id;
                }

                public String getAvatar() {
                    return avatar;
                }
            }
        }
    }
}
