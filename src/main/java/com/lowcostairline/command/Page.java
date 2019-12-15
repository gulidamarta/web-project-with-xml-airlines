package com.lowcostairline.command;


public class Page {

    /**
     * Common pages.
     */
    // public static final String LOGIN_PAGE_PATH = "/jsp/common/login.jsp";


    private final String pageUrl;
    private final boolean isRedirect;
    private final String messageKey;

    public Page(String pageUrl, boolean isRedirect) {
        this.pageUrl = pageUrl;
        this.isRedirect = isRedirect;
        this.messageKey = "got it";
    }

    /**
     * Instantiates a new Page.
     */

    public Page(String pageUrl, boolean isRedirect, String messageKey) {
        this.pageUrl = pageUrl;
        this.isRedirect = isRedirect;
        this.messageKey = messageKey;
    }

    public String getPageUrl() {
        return pageUrl;
    }


    public boolean isRedirect() {
        return isRedirect;
    }

    public String getMessageKey() {
        return messageKey;
    }

}