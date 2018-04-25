package com.norris.believer.Bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by android on 2017/7/10.
 */

@Entity
public class DDAudioBean {

    @Property(nameInDb = "POSITION")
    private Long position;

    @Id(autoincrement = true)
    private Long id = null;

    @Property(nameInDb = "AUDIOURL")
    private String audioUrl;

    @Property(nameInDb = "TYPE")
    private String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Generated(hash = 1273356114)
    public DDAudioBean(Long position, Long id, String audioUrl, String type) {
        this.position = position;
        this.id = id;
        this.audioUrl = audioUrl;
        this.type = type;
    }

    @Generated(hash = 684426240)
    public DDAudioBean() {
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
        return audioUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.audioUrl = videoUrl;
    }

    public String getAudioUrl() {
        return this.audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }
}
