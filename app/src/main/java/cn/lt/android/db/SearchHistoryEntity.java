package cn.lt.android.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "SEARCH_HISTORY_ENTITY".
 */
public class SearchHistoryEntity {

    private Long id;
    private String title;

    public SearchHistoryEntity() {
    }

    public SearchHistoryEntity(Long id) {
        this.id = id;
    }

    public SearchHistoryEntity(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
