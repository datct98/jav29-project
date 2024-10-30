package lesson13;

import lesson13.demo_interface.IFly;
import lesson13.news.INews;
import lesson13.news.News;

public class Main {
    public static void main(String[] args) {
        // Cách khởi tạo 1
        News news = new News("Bài giảng về interface", "Datct", "2024-10-30");
        INews iNews = new News("Bài giảng interface số 2", "Datct", "2024-10-30");

        news.display();
        System.out.println();
        iNews.display();

    }
}
