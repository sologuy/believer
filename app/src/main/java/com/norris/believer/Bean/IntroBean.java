package com.norris.believer.Bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;


/**
 * Created by android on 2017/7/13.
 */

@Entity
public class IntroBean {
    /**
     * key : 7db9b04999d5454566ea077149c53ccb
     * images : 图片的存储路径
     */

    @Id(autoincrement = true)
    private Long id = null;
    @Property(nameInDb = "KEY")
    private String key;
    @Property(nameInDb = "IMAGES")
    private String images;
    @Generated(hash = 2107174322)
    public IntroBean(Long id, String key, String images) {
        this.id = id;
        this.key = key;
        this.images = images;
    }
    @Generated(hash = 836535482)
    public IntroBean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getKey() {
        return this.key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getImages() {
        return this.images;
    }
    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "IntroBean{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", images='" + images + '\'' +
                '}';
    }
}
