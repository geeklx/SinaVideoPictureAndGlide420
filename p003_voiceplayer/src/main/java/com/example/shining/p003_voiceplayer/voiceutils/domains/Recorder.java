package com.example.shining.p003_voiceplayer.voiceutils.domains;


public class Recorder {
    private Long id;
    public float time;
    public String filePath;
    public String getFilePath() {
        return this.filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    public float getTime() {
        return this.time;
    }
    public void setTime(float time) {
        this.time = time;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Recorder(Long id, float time, String filePath) {
        this.id = id;
        this.time = time;
        this.filePath = filePath;
    }
    public Recorder() {
    }


}
