package com.web.springmvc.video;

import java.net.URL;
import java.util.List;

import com.web.springmvc.video.YouTubeInfo.Container;
import com.web.springmvc.video.YouTubeInfo.StreamInfo;
import com.web.springmvc.video.YouTubeParser.VideoDownload;

public class YouTubeMPGParser extends YouTubeParser {

    public YouTubeMPGParser() {
    }

    public void filter(List<VideoDownload> sNextVideoURL, String itag, URL url) {
        Integer i = Integer.decode(itag);
        StreamInfo vd = itagMap.get(i);

        // get rid of webm
        if (vd.c == Container.WEBM)
            return;

        super.filter(sNextVideoURL, itag, url);
    }
}
