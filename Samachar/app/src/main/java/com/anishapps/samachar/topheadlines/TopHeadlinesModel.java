package com.anishapps.samachar.topheadlines;

public class TopHeadlinesModel {
    String title,desc,source;

    public TopHeadlinesModel(String title, String desc, String source) {
        this.title = title;
        this.desc = desc;
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getSource() {
        return source;
    }
}
