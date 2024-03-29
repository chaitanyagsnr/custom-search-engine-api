package search.dto;

public class SearchItem {
	private String title;
	private String htmlTitle;
	private String link;
	private String displayLink;
	private String snippet;
	private String htmlSnippet;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHtmlTitle() {
		return htmlTitle;
	}
	public void setHtmlTitle(String htmlTitle) {
		this.htmlTitle = htmlTitle;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDisplayLink() {
		return displayLink;
	}
	public void setDisplayLink(String displayLink) {
		this.displayLink = displayLink;
	}
	public String getSnippet() {
		return snippet;
	}
	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}
	public String getHtmlSnippet() {
		return htmlSnippet;
	}
	public void setHtmlSnippet(String htmlSnippet) {
		this.htmlSnippet = htmlSnippet;
	}
}
