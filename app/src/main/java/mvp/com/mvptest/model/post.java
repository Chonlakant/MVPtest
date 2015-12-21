package mvp.com.mvptest.model;

import java.util.List;

/**
 * Created by root1 on 12/20/15.
 */
public class post {


    /**
     * status : ok
     * count : 12
     * count_total : 2124
     * pages : 177
     * posts : [{"id":25767,"url":"http://blog.teamtreehouse.com/matthew-built-career-by-learning-treehouse","title":"Matthew Built a New Career in Tech by Learning with Treehouse","date":"2015-12-17 14:17:14","author":"Faye Bridge","thumbnail":"http://blog.teamtreehouse.com/wp-content/uploads/2015/12/Matthew-Krey-150x150.jpg"},{"id":25756,"url":"http://blog.teamtreehouse.com/new-course-roundup-python-wordpress","title":"New Course Roundup: Python &#038; WordPress","date":"2015-12-14 09:37:34","author":"Mary McPherson","thumbnail":null},{"id":25750,"url":"http://blog.teamtreehouse.com/melanie-went-from-owning-a-bakery-to-traveling-the-world-with-her-family-as-a-freelance-web-designer","title":"Melanie Went From Owning a Bakery to Traveling The World With Her Family as a Freelance Web Designer","date":"2015-12-10 10:41:18","author":"Faye Bridge","thumbnail":"http://blog.teamtreehouse.com/wp-content/uploads/2015/12/Melanie-150x150.jpeg"},{"id":25357,"url":"http://blog.teamtreehouse.com/understanding-normal-maps","title":"Understanding Normal Maps","date":"2015-12-08 06:00:53","author":"Nick Pettit","thumbnail":"http://blog.teamtreehouse.com/wp-content/uploads/2015/08/flat-shaded-150x150.png"},{"id":25748,"url":"http://blog.teamtreehouse.com/new-course-roundup-swift-gradle","title":"New Course Roundup: Swift, Gradle","date":"2015-12-07 09:22:18","author":"Mary McPherson","thumbnail":null},{"id":25746,"url":"http://blog.teamtreehouse.com/nejc-transitioned-from-electrical-engineer-to-front-end-developer","title":"Nejc Transitioned from Electrical Engineer to Front End Developer","date":"2015-12-02 06:00:33","author":"Mary McPherson","thumbnail":"http://blog.teamtreehouse.com/wp-content/uploads/2015/12/Screen-Shot-2015-12-01-at-11.27.17-AM-150x150.png"},{"id":25744,"url":"http://blog.teamtreehouse.com/new-course-roundup-css-flexbox-github-wordpress","title":"New Course Roundup: CSS Flexbox, GitHub, WordPress","date":"2015-11-30 08:51:56","author":"Mary McPherson","thumbnail":null},{"id":25732,"url":"http://blog.teamtreehouse.com/with-treehouse-jonathan-built-the-skills-needed-to-launch-his-web-business","title":"With Treehouse, Jonathan Built the Skills Needed to Launch His Web Business","date":"2015-11-25 06:00:30","author":"Faye Bridge","thumbnail":"http://blog.teamtreehouse.com/wp-content/uploads/2015/11/Jonathan-150x150.png"},{"id":25735,"url":"http://blog.teamtreehouse.com/new-course-roundup-c-angular","title":"New Course Roundup: C# and Angular","date":"2015-11-23 08:00:10","author":"Mary McPherson","thumbnail":null},{"id":25729,"url":"http://blog.teamtreehouse.com/treehouse-gave-lansana-a-jump-start-to-excel-as-a-self-taught-software-engineer","title":"Treehouse Gave Lansana a Jump-Start to Excel as a Self-Taught Software Engineer","date":"2015-11-20 06:00:20","author":"Faye Bridge","thumbnail":"http://blog.teamtreehouse.com/wp-content/uploads/2015/11/Lansana-150x150.jpg"},{"id":25723,"url":"http://blog.teamtreehouse.com/rj-learned-to-code-and-made-the-switch-from-accountant-to-skilled-front-end-developer","title":"RJ Learned to Code and Made the Switch From Accountant to Skilled Front End Developer","date":"2015-11-18 09:07:03","author":"Faye Bridge","thumbnail":"http://blog.teamtreehouse.com/wp-content/uploads/2015/11/rj-150x150.jpg"},{"id":25295,"url":"http://blog.teamtreehouse.com/beginners-guide-physically-based-rendering-unity","title":"The Beginner&#8217;s Guide to Physically Based Rendering in Unity","date":"2015-11-17 08:00:53","author":"Nick Pettit","thumbnail":"http://blog.teamtreehouse.com/wp-content/uploads/2015/08/radio-lighting-150x150.jpg"}]
     */

    private String status;
    private int count;
    private int count_total;
    private int pages;
    /**
     * id : 25767
     * url : http://blog.teamtreehouse.com/matthew-built-career-by-learning-treehouse
     * title : Matthew Built a New Career in Tech by Learning with Treehouse
     * date : 2015-12-17 14:17:14
     * author : Faye Bridge
     * thumbnail : http://blog.teamtreehouse.com/wp-content/uploads/2015/12/Matthew-Krey-150x150.jpg
     */

    private List<PostsEntity> posts;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCount_total(int count_total) {
        this.count_total = count_total;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPosts(List<PostsEntity> posts) {
        this.posts = posts;
    }

    public String getStatus() {
        return status;
    }

    public int getCount() {
        return count;
    }

    public int getCount_total() {
        return count_total;
    }

    public int getPages() {
        return pages;
    }

    public List<PostsEntity> getPosts() {
        return posts;
    }

    public static class PostsEntity {
        private int id;
        private String url;
        private String title;
        private String date;
        private String author;
        private String thumbnail;

        public void setId(int id) {
            this.id = id;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public int getId() {
            return id;
        }

        public String getUrl() {
            return url;
        }

        public String getTitle() {
            return title;
        }

        public String getDate() {
            return date;
        }

        public String getAuthor() {
            return author;
        }

        public String getThumbnail() {
            return thumbnail;
        }
    }
}
