package com.web.springmvc.video;

import java.io.File;

public class YouTubeTest extends AppManagedDownload {
    public static void main(String[] args) {
        AppManagedDownload.main(new String[] { "http://www.youtube.com/watch?v=fcriZ9PECf0", "resources/core/video/" });
    	//System.out.println(new File("").getAbsolutePath());
    }}