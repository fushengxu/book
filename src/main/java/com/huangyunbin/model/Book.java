package com.huangyunbin.model;

public class Book {
	private String  id;
	private String name;
    private String download;

	

    @Override
	public String toString() {
		return "id:"+id+"  name"+name+"  download:"+download;
	}


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download;
    }
}
