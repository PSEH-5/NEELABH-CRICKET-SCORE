package com.sapient.interview.cricket.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"source",
		"url",
		"pubDate"
})
public class Provider {

	@JsonProperty("source")
	private String source;
	@JsonProperty("url")
	private String url;
	@JsonProperty("pubDate")
	private String pubDate;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Provider() {
	}

	@Override
	public String toString() {
		return "Provider{" +
				"source='" + source + '\'' +
				", url='" + url + '\'' +
				", pubDate='" + pubDate + '\'' +
				", additionalProperties=" + additionalProperties +
				'}';
	}

	/**
	 *
	 * @param source
	 * @param pubDate
	 * @param url
	 */
	public Provider(String source, String url, String pubDate) {
		super();
		this.source = source;
		this.url = url;
		this.pubDate = pubDate;
	}

	@JsonProperty("source")
	public String getSource() {
		return source;
	}

	@JsonProperty("source")
	public void setSource(String source) {
		this.source = source;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	@JsonProperty("pubDate")
	public String getPubDate() {
		return pubDate;
	}

	@JsonProperty("pubDate")
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}


