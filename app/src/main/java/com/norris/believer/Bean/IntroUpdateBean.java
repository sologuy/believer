package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by android on 2017/7/13.
 */

public class IntroUpdateBean {

    /**
     * error_code : 200
     * error_info : 成功
     * data : {"key":"7db9b04999d5454566ea077149c53ccb","images":["http://wx.laohoulundao.com/uploads/add-ad/727d33d5c255d3bbbc162e66ff58247b.png","http://wx.laohoulundao.com/uploads/add-ad/ddbffc2541e5dfc533cea24ddaafc314.png","http://wx.laohoulundao.com/uploads/add-ad/b87403dfdb191b8a235a970f48f4f657.png","http://wx.laohoulundao.com/uploads/add-ad/64d3140dbd7eecfb1913835af488eb84.png"]}
     */

    private int error_code;
    private String error_info;
    private DataBean data;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getError_info() {
        return error_info;
    }

    public void setError_info(String error_info) {
        this.error_info = error_info;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * key : 7db9b04999d5454566ea077149c53ccb
         * images : ["http://wx.laohoulundao.com/uploads/add-ad/727d33d5c255d3bbbc162e66ff58247b.png","http://wx.laohoulundao.com/uploads/add-ad/ddbffc2541e5dfc533cea24ddaafc314.png","http://wx.laohoulundao.com/uploads/add-ad/b87403dfdb191b8a235a970f48f4f657.png","http://wx.laohoulundao.com/uploads/add-ad/64d3140dbd7eecfb1913835af488eb84.png"]
         */

        private String key;
        private List<String> images;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    @Override
    public String toString() {
        return "IntroUpdateBean{" +
                "error_code=" + error_code +
                ", error_info='" + error_info + '\'' +
                ", data=" + data +
                '}';
    }
}
