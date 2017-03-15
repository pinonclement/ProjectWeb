package com.web.springmvc.video;


import java.io.File;
import java.net.URL;

public class DirectDownload {

    public static void main(String[] args) {
        try {
            // ex: http://www.youtube.com/watch?v=Nj6PFaDmp6c
            String url = "https://www.youtube.com/watch?v=kRNmQmNSD90";
            // ex: "/Users/axet/Downloads"
            String path = "/Users/clemp/";

            VGet v = new VGet(new URL(url), new File(path));

            v.download();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
