package io.pubmed.dto;

public class article {
    /**
     * The article's pmid.
     */
    private long pmid;

    /**
     * The article's title.
     */
    private String title;

    /**
     * The article's title.
     */
    private String pub_model;

    /**
     * The article's keyword_list。
     */
    private String[] keyword_list;

    /**
     * language of this article.
     */
    private String language;

    /**
     * journal_id of this article.
     */
    private long journal_id;

    /**
     * pub_model of this article.
     */
    private enum pub_model {
        Print,
        Print_Electronic,
        Electronic,
        Electronic_Print,
        Electronic_eCollection
    }

    /**
     * data_created and data_completed
     */
    private int data_created_year;
    private int data_created_month;
    private int data_created_day;

    private int data_completed_year;
    private int data_completed_month;
    private int data_completed_day;
}
