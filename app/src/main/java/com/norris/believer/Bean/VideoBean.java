package com.norris.believer.Bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by android on 2017/7/10.
 */

@Entity
public class VideoBean {

    @Property(nameInDb = "POSITION")
    private Long position;

    @Id(autoincrement = true)
    private Long id = null;

    @Property(nameInDb = "VIDEOURL")
    private String videoUrl;

    @Property(nameInDb = "TYPE")
    private String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Generated(hash = 238708824)
    public VideoBean(Long position, Long id, String videoUrl, String type) {
        this.position = position;
        this.id = id;
        this.videoUrl = videoUrl;
        this.type = type;
    }

    @Generated(hash = 2024490299)
    public VideoBean() {
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
